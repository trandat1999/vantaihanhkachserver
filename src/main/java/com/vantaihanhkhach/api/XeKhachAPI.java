package com.vantaihanhkhach.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vantaihanhkhach.model.XeKhach;
import com.vantaihanhkhach.repository.IXeKhachRepository;

@RestController
@RequestMapping(path = "/api/xekhach", produces = "application/json")
@CrossOrigin(origins = "*")
public class XeKhachAPI {
	@Autowired
	private IXeKhachRepository xeKhachRepo;

	@GetMapping
	public List<XeKhach> getAll() {
		return xeKhachRepo.findAll();
	}

	@GetMapping("/{id}")
	public Optional<XeKhach> getById(@PathVariable("id") long id) {
		return this.xeKhachRepo.findById(id);
	}

	@PostMapping
	public XeKhach post(@RequestBody XeKhach xekhach) {
		try {
			return xeKhachRepo.save(xekhach);
		} catch (DataIntegrityViolationException e) {
			return null;
		}

	}

	@PutMapping()
	public XeKhach put(@RequestBody XeKhach xekhach) {
		try {
			return xeKhachRepo.save(xekhach);
		} catch (DataIntegrityViolationException e) {
			return null;
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		this.xeKhachRepo.deleteById(id);
	}

}

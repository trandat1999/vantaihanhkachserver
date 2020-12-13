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

import com.vantaihanhkhach.model.TaiXe;
import com.vantaihanhkhach.repository.ITaiXeRepository;

@RestController
@RequestMapping(path = "/api/taixe", produces = "application/json")
@CrossOrigin(origins = "*")
public class TaiXeAPI {
	@Autowired
	private ITaiXeRepository xeKhachRepo;

	@GetMapping
	public List<TaiXe> getAll() {
		return xeKhachRepo.findAll();
	}

	@GetMapping("/{id}")
	public Optional<TaiXe> getById(@PathVariable("id") long id) {
		return xeKhachRepo.findById(id);
	}

	@PostMapping
	public TaiXe post(@RequestBody TaiXe xekhach) {
		try {
			return xeKhachRepo.save(xekhach);
		} catch (DataIntegrityViolationException e) {
			return null;
		}
	}

	@PutMapping()
	public TaiXe put(@RequestBody TaiXe xekhach) {
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

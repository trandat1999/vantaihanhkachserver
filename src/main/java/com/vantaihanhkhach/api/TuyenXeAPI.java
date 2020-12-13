package com.vantaihanhkhach.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vantaihanhkhach.model.TuyenXe;
import com.vantaihanhkhach.repository.ITuyenXeRepository;

@RestController
@RequestMapping(path = "/api/tuyenxe", produces = "application/json")
@CrossOrigin(origins = "*")
public class TuyenXeAPI {
	@Autowired
	private ITuyenXeRepository xeKhachRepo;

	@GetMapping
	public List<TuyenXe> getAll() {
		return xeKhachRepo.findAll();
	}

	@GetMapping("/{id}")
	public Optional<TuyenXe> getById(@PathVariable("id") long id) {
		return this.xeKhachRepo.findById(id);
	}

	@PostMapping
	// @ResponseStatus(HttpStatus.CREATED)
	public TuyenXe post(@RequestBody TuyenXe xekhach) {
		return xeKhachRepo.save(xekhach);
	}

	@PutMapping()
	public TuyenXe put(@RequestBody TuyenXe xekhach) {
		return xeKhachRepo.save(xekhach);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		this.xeKhachRepo.deleteById(id);
	}
}

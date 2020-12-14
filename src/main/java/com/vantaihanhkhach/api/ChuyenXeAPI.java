package com.vantaihanhkhach.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

import com.vantaihanhkhach.model.ChuyenXe;
import com.vantaihanhkhach.repository.IChuyenXeRepository;

@RestController
@RequestMapping(path = "/api/chuyenxe", produces = "application/json")
@CrossOrigin(origins = "*")
public class ChuyenXeAPI {
	
	
	
	@Autowired
	private IChuyenXeRepository xeKhachRepo;
	
	
	@GetMapping("/get")
	public List<ChuyenXe> getAllByMonth(){
		Date today= new Date();
		Date a= new Date();
		a.setDate(1);
		return xeKhachRepo.findByMonth(a, today);
		
	}
	
	@GetMapping("/{a}/{b}")
	public List<ChuyenXe> getAllBy(@PathVariable("a") String s, @PathVariable("b") String e){
		Date sdate;
		Date edate;
		try {
			sdate = new SimpleDateFormat("yyyy-MM-dd").parse(s);
			edate= new SimpleDateFormat("yyyy-MM-dd").parse(e);
			return xeKhachRepo.findByBetween(sdate,edate);
		} catch (ParseException e1) {
			return null;
		}
		
	}
	
	@GetMapping("/Greater/{date1}")
	public List<ChuyenXe> getAllByDate(@PathVariable("date1") String date){
		Date sdate;
		try {
			sdate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			return xeKhachRepo.findByDate(sdate);
		} catch (ParseException e1) {
			return null;
		}
		
	}

	@GetMapping
	public List<ChuyenXe> getAll() {
		return xeKhachRepo.findAll();
	}

	@GetMapping("/{id}")
	public Optional<ChuyenXe> getById(@PathVariable("id") long id) {
		return this.xeKhachRepo.findById(id);
	}

	@PostMapping(consumes = "application/json")
	// @ResponseStatus(HttpStatus.CREATED)
	public ChuyenXe post(@RequestBody ChuyenXe xekhach) {
		return xeKhachRepo.save(xekhach);
	}

	@PutMapping()
	public ChuyenXe put(@RequestBody ChuyenXe xekhach) {
		return xeKhachRepo.save(xekhach);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		this.xeKhachRepo.deleteById(id);
	}
}

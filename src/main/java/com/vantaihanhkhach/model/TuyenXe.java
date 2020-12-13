package com.vantaihanhkhach.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tuyenxe")
public class TuyenXe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="diem_dau")
	private String diemDau;
	
	@Column(name="diem_cuoi")
	private String diemCuoi;
	
	@Column(name="do_dai")
	private int doDai;
	
	@Column(name="do_phuc_tap")
	private int doPhucTap;
	
}

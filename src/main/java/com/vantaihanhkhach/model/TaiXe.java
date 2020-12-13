package com.vantaihanhkhach.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="taixe")
public class TaiXe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="ten")
	private String ten;
	
	@Column(name="cmnd", unique=true)
	private String CMND;
	
	@Column(name="ma_bang_lai")
	private String maBangLai;
	
	@Column(name="loai_bang_lai")
	private String loaiBangLai;
	
	@Column(name = "dia_chi")
	private String diaChi;
	
	@Column(name="ngay_sinh")
	private Date ngaySinh;
	
	@Column(name="tham_nien")
	private int thamNien;
	
}

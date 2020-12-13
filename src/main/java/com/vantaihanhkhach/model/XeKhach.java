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
@Table(name="xekhach")
public class XeKhach {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="bien_so", unique=true)
	private String bienSo;
	
	@Column(name="mau_xe")
	private String mauXe;
	
	@Column(name="hsx")
	private String hsx;
	
	@Column(name="kieu_xe")
	private String kieuXe;
	
	@Column(name="so_ghe")
	private int soGhe;
	
	@Column(name="so_nam_sd")
	private int soNamSD;
	
	@Column(name="ngay_bao_duong_cuoi")
	private Date ngayBaoDuongCuoi;

}

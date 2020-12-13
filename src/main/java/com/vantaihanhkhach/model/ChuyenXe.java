package com.vantaihanhkhach.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "chuyenxe")
public class ChuyenXe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="so_luong_khach")
	private int soLuongKhach;
	
	@Column(name="gia_ve")
	private double giaVe;
	
	@Column(name="ngay_chay")
	private Date ngayChay;
	
	@ManyToOne(targetEntity = XeKhach.class)
	@JoinColumn(name="xe_khach_id")
	private XeKhach xeKhach;
	
	@ManyToOne(targetEntity = TuyenXe.class)
	@JoinColumn(name="tuyen_xe_id")
	private TuyenXe tuyenxe;
	
	@ManyToOne(targetEntity = TaiXe.class)
	@JoinColumn(name="lai_xe_id")
	private TaiXe taixe;
	
	@ManyToOne(targetEntity = TaiXe.class)
	@JoinColumn(name="phu_xe_id")
	private TaiXe taixe1;
}

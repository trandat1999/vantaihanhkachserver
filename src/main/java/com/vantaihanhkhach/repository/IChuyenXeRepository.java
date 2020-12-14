package com.vantaihanhkhach.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vantaihanhkhach.model.ChuyenXe;

@Repository
public interface IChuyenXeRepository extends JpaRepository<ChuyenXe, Long> {


//	@Query("select a from ChuyenXe a where month(a.ngayChay) = month(?1) and year(a.ngayChay) = year(?2)")
//	List<ChuyenXe> findByMonth(Date date, Date date2);

	@Query("select a from ChuyenXe a where date_part('month',timestamp a.ngayChay)= date_part('month',timestamp ?1) and date_part('year',timestamp a.ngayChay)= date_part('year',timestamp ?2)")
	List<ChuyenXe> findByMonth(Date date, Date date2);

	@Query("select a from ChuyenXe a where a.ngayChay between ?1 and ?2")
	List<ChuyenXe> findByBetween(Date date, Date date2);

	@Query("select a from ChuyenXe a where a.ngayChay >= ?1")
	List<ChuyenXe> findByDate(Date date);
}

package com.vantaihanhkhach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vantaihanhkhach.model.TaiXe;
@Repository
public interface ITaiXeRepository extends JpaRepository<TaiXe, Long>{

}

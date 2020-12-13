package com.vantaihanhkhach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vantaihanhkhach.model.XeKhach;
@Repository
public interface IXeKhachRepository extends JpaRepository<XeKhach, Long>{

}

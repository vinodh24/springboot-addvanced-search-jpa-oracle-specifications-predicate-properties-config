package com.vinodh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.vinodh.model.Alarm;


public interface AlarmRepository extends JpaRepository<Alarm, Long> , JpaSpecificationExecutor<Alarm>,QuerydslPredicateExecutor<Alarm>{
	
	public Optional<Alarm> findById(Long id);
	
	public List<Alarm> findAll();
	
}

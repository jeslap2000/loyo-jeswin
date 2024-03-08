package com.jeswin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeswin.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}

package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.PhonePay;

@Repository
public interface PhonePayRepository extends JpaRepository<PhonePay, Integer>{

}

package com.springboot.HospitalManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.HospitalManagementSystem.Entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {

}

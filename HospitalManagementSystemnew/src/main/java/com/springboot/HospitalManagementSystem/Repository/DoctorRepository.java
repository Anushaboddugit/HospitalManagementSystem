package com.springboot.HospitalManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.HospitalManagementSystem.Entity.DoctorEntity;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer>{

}

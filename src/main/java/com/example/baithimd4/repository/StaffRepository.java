package com.example.baithimd4.repository;

import com.example.baithimd4.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository< Staff, Long> {


}

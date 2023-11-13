package com.example.baithimd4.service.impl;

import com.example.baithimd4.model.Department;
import com.example.baithimd4.model.Staff;
import com.example.baithimd4.repository.DepartmentRepository;
import com.example.baithimd4.repository.StaffRepository;
import com.example.baithimd4.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService implements IDepartmentService {
@Autowired
DepartmentRepository departmentRepository;
    @Override
    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public void save(Department department) {
            departmentRepository.save(department);
    }

    @Override
    public void delete(Long id) {
        departmentRepository.deleteById(id);
    }


}

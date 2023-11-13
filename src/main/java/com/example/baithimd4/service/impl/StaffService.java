package com.example.baithimd4.service.impl;

import com.example.baithimd4.model.Staff;
import com.example.baithimd4.repository.StaffRepository;
import com.example.baithimd4.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StaffService implements IStaffService  {
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Iterable<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public Optional<Staff> findById(Long id) {
        return staffRepository.findById(id);
    }

    @Override
    public void save(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void delete(Long id) {
        staffRepository.deleteById(id);
    }
}

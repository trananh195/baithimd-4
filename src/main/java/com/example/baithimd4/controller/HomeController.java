package com.example.baithimd4.controller;

import com.example.baithimd4.model.Staff;
import com.example.baithimd4.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/staff")
@CrossOrigin("*")
public class HomeController {
    @Autowired
    StaffRepository staffRepository;

    @GetMapping("")
    public ResponseEntity findAll() {
        staffRepository.findAll();
        return new ResponseEntity<>(staffRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity addProduct(@RequestBody Staff staff) {
        staffRepository.save(staff);
        return new ResponseEntity("Them thanh cong", HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Iterable<Staff>> update(@RequestBody Staff staff,@PathVariable Long id){
        Optional<Staff> staff1 = staffRepository.findById(id);
        if (staff1.isPresent()){
            staff.setId(staff1.get().getId());
            staffRepository.save(staff);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<Staff> staff = staffRepository.findById(id);
        if (staff.isPresent()){
            staffRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Staff> find = staffRepository.findById(id);
        return new ResponseEntity<>(find,HttpStatus.OK);
    }

}

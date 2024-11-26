package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.model.Employee;
import com.oocl.springbootemployee.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Optional<Employee> findById(Integer id) ;

    public List<Employee> findAllByGender(Gender gender);

    List<Employee> findAllByAgeAfterAndGender(Integer age, Gender gender);
}
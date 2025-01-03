package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
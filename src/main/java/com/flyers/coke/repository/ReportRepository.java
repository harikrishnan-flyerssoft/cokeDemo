package com.flyers.coke.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyers.coke.model.ReportModel;

@Repository
public interface ReportRepository extends JpaRepository<ReportModel, String> {

}

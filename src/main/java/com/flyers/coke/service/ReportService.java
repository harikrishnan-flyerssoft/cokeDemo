package com.flyers.coke.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyers.coke.model.ReportModel;
import com.flyers.coke.repository.ReportRepository;

@Service
public class ReportService {
	
	@Autowired
	ReportRepository reportRepo;

	public boolean saveReport(String reportJson) {
		ReportModel report = reportRepo.save(new ReportModel(reportJson));
		System.out.println("report ::: "+report.getReportJson());
		System.out.println("report ::: "+report.getId());
		if(Objects.isNull(report.getReportJson())) {
			return false;
		}else {
			return true;
		}
	}
	
}

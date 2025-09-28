package com.flyers.coke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyers.coke.service.ReportService;

@RestController
@RequestMapping("api/v1")
public class ReportController {
	
	@Autowired
	ReportService reportService;
	
	@PostMapping("/report")
	public ResponseEntity<String> saveScanReport(@RequestBody String reportJson){
		if(reportService.saveReport(reportJson)) {
			return new ResponseEntity<String>("Report Successfully saved",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Report save failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

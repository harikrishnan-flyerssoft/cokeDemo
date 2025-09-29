package com.flyers.coke.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="reports")
public class ReportModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Lob
    @Column(name="report_json")
    private String reportJson;
    
    public ReportModel() {}
    
    public ReportModel(String report) {
    	this.reportJson = report;
    }

	public ReportModel(String id, String reportJson) {
		super();
		this.id = id;
		this.reportJson = reportJson;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReportJson() {
		return reportJson;
	}

	public void setReportJson(String reportJson) {
		this.reportJson = reportJson;
	}
    
}


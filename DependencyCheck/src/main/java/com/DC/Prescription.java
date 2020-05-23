package com.DC;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	
	private int id;
	private String PatientName;
	private List<Integer>medicines;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public List<Integer> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<Integer> medicines) {
		this.medicines = medicines;
	}
	
	@Override
	public String toString() {
		return "Prescription id=" + id + ", PatientName=" + PatientName + ", medicines=" + medicines ;
	}
	

}

package com.yash.collectionassignment3.model;

import java.util.Objects;

public class Patient 
{
	String patient_Contact;
	String patient_Name;
	String patient_Blood_Group;
	
	
	
	public Patient() {
		super();
	}


	public Patient(String patient_Contact, String patient_Name, String patient_Blood_Group) {
		super();
		this.patient_Contact = patient_Contact;
		this.patient_Name = patient_Name;
		this.patient_Blood_Group = patient_Blood_Group;
	}


	@Override
	public int hashCode() {
		return Objects.hash(patient_Blood_Group, patient_Contact, patient_Name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(patient_Blood_Group, other.patient_Blood_Group) && patient_Contact == other.patient_Contact
				&& Objects.equals(patient_Name, other.patient_Name);
	}


	@Override
	public String toString() {
		return "\nPatient_Contact=" + patient_Contact + ", Patient_Name=" + patient_Name + ", Patient_Blood_Group="
				+ patient_Blood_Group ;
	}
	
	
}

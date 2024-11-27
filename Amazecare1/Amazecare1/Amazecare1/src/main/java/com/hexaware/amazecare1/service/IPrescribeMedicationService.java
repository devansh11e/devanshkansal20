package com.hexaware.amazecare1.service;
/*
 * Author=Devansh
 */
import java.util.List;

import com.hexaware.amazecare1.dto.PrescribeMedicationDTO;
import com.hexaware.amazecare1.entities.PrescribeMedication;
import com.hexaware.amazecare1.exceptions.DoctorNotFoundException;
import com.hexaware.amazecare1.exceptions.PatientNotFoundException;
import com.hexaware.amazecare1.exceptions.PrescriptionNotFoundException;

public interface IPrescribeMedicationService {
	
	//Prescribe Medication
	PrescribeMedication prescribeMedications(PrescribeMedicationDTO presDTO)throws PatientNotFoundException,DoctorNotFoundException;
    
	//Get Prescription By ID
	PrescribeMedication getPrescriptionById(int pid) throws PrescriptionNotFoundException;
	
	//View All Prescriptions
    List<PrescribeMedication> viewAllPrescriptions();
    
    //Find Prescription By Patient ID
    List<PrescribeMedication>  findPrescriptionByPatientId(Integer patientId) throws PatientNotFoundException;
}

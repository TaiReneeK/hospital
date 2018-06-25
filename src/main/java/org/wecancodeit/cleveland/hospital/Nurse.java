package org.wecancodeit.cleveland.hospital;

public class Nurse extends Employee implements MedicalDuties
{

	private int patientNum;

	public Nurse(String empNumber, String name, int patientNum) 
	{
		this.empNumber = empNumber;
		this.name = name;
		this.patientNum = patientNum;
	}

	public int getPatientNum() 
	{
		return patientNum;
	}

	@Override
	public void careForPatient(Patient anyPatient) 
	{
		anyPatient.receiveHealth(5);
	}

	@Override
	public void drawBlood(Patient anyPatient) 
	{
		anyPatient.drawBlood(5);
	}

	public int calculatePay() 
	{
		return 50000;
	}

}

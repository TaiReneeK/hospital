package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class NurseTest 
{
	Nurse anyNurse = new Nurse("2", "Jackie", 2);
	Patient anyPatient = new Patient();
	
	@Test
	public void shouldTenderProperNurseProperties()
	{
		String number = anyNurse.getNumber();
		String name = anyNurse.getName();
		int patientNum = anyNurse.getPatientNum();
		assertEquals("2", number);
		assertThat(name, is("Jackie"));
		assertEquals(2, patientNum);
	}
	
	@Test
	public void shouldIncreasePatientHealthFrom10To15()
	{
		anyNurse.careForPatient(anyPatient);
		int checkHealth = anyPatient.getHealth();
		assertEquals(15, checkHealth);
	}
	
	@Test
	public void shouldLowerBloodLevelsFrom10To5()
	{
		anyNurse.drawBlood(anyPatient);
		int checkBlood = anyPatient.getBlood();
		assertEquals(5, checkBlood);
	}
	
	@Test
	public void shouldHaveASalaryOf50000()
	{
		int salary = anyNurse.calculatePay();
		assertEquals(50000, salary);
	}
}

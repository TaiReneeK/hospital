package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DoctorTest 
{
	Doctor anyDoctor = new Doctor("1", "Phil", "brain");
	Patient anyPatient = new Patient();
	Patient verySickPatient = new Patient(1, 1);
	
	@Test
	public void shouldTenderProperDoctorProperties()
	{
		String number = anyDoctor.getNumber();
		String name = anyDoctor.getName();
		String specialty = anyDoctor.getSpecialty();
		assertEquals("1", number);
		assertThat(name, is("Phil"));
		assertEquals("brain", specialty);
	}
	
	@Test
	public void shouldIncreasePatientHealthFrom10To20()
	{
		anyDoctor.careForPatient(anyPatient);
		int checkHealth = anyPatient.getHealth();
		assertEquals(20, checkHealth);
	}
	
	@Test
	public void shouldLowerBloodLevelsFrom10To5()
	{
		anyDoctor.drawBlood(anyPatient);
		int checkBlood = anyPatient.getBlood();
		assertEquals(5, checkBlood);
	}
	
	@Test
	public void shouldHaveASalaryOf90000()
	{
		int salary = anyDoctor.calculatePay();
		assertEquals(90000, salary);
	}
	
	
}

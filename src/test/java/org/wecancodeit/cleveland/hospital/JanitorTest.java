package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JanitorTest 
{
	Janitor anyJanitor = new Janitor("3", "Rosie", true);
	
	@Test
	public void shouldTenderProperJanitorProperties()
	{
		String empNumber = anyJanitor.getNumber();
		String name = anyJanitor.getName();
		boolean isSweeping = anyJanitor.isSweeping();
		assertEquals("3", empNumber);
		assertThat(name, is("Rosie"));
		assertTrue(isSweeping);
	}
	
	@Test
	public void shouldHaveASalaryOf40000()
	{
		int salary = anyJanitor.calculatePay();
		assertEquals(40000, salary);
	}
}

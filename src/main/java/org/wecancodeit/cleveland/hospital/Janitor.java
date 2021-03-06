package org.wecancodeit.cleveland.hospital;

public class Janitor extends Employee 
{

	private boolean isSweeping;

	public Janitor(String empNumber, String name, boolean isSweeping) 
	{
		this.empNumber = empNumber;
		this.name = name;
		this.isSweeping = isSweeping;
	}

	@Override
	public int calculatePay() 
	{
		return 40000;
	}

	public boolean isSweeping() 
	{
		return isSweeping;
	}

}

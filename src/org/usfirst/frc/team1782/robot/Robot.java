package org.usfirst.frc.team1782.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends IterativeRobot
{
	private static CANTalon motor;
	private static XboxController driver;
	
	@Override
	public void robotInit()
	{
		motor = new CANTalon(5);
		driver = new XboxController(0);
	}

	@Override
	public void autonomousInit()
	{

	}

	@Override
	public void autonomousPeriodic()
	{

	}

	@Override
	public void teleopPeriodic()
	{
		motor.set(driver.getX(Hand.kLeft));
	}

	@Override
	public void testPeriodic()
	{
		
	}
}


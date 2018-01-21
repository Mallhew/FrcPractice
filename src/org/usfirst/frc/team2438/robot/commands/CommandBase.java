package org.usfirst.frc.team2438.robot.commands;

import org.usfirst.frc.team2438.robot.OI;
import org.usfirst.frc.team2438.robot.subsystems.Lift;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	public static OI oi;
	public static final Lift lift = new Lift();
	
	public static void init() {
		oi = new OI();
		
		lift.init();
	}
}

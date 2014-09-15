package com.dayellecraft.mrawellstein.skyler.schoolprojects.main;

import com.dayellecraft.mrawellstein.skyler.schoolprojects.projectmanager.ProjectHandler;
import com.dayellecraft.mrawellstein.skyler.schoolprojects.projectmanager.ProjectTerminal;


public class Main {

	public static ProjectHandler ph1;
	public static ProjectTerminal pt1;
	
	public static void main(String[] args){
		
		ph1 = new ProjectHandler();
		pt1 = new ProjectTerminal();
		pt1.run();
		
		
	}
	
	
	
	
}

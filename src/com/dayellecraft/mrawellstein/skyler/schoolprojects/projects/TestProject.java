package com.dayellecraft.mrawellstein.skyler.schoolprojects.projects;

import com.dayellecraft.mrawellstein.skyler.schoolprojects.projectmanager.SchoolProject;
import com.dayellecraft.mrawellstein.skyler.schoolprojects.util.Skyler;

public class TestProject implements SchoolProject{

	
	@Override
	public void run() {
		Skyler.Println("This is a testProject!");
	}
	
	@Override
	public String projectName() {
		// TODO Auto-generated method stub
		return "test-1";
	}

}

package com.dayellecraft.mrawellstein.skyler.schoolprojects.projectmanager;

import java.util.HashMap;

import com.dayellecraft.mrawellstein.skyler.schoolprojects.projects.TestProject;
import com.dayellecraft.mrawellstein.skyler.schoolprojects.util.Skyler;


public class ProjectHandler {

	public ProjectHandler(){
		addProject(new TestProject());
		
	}
	
	private HashMap<String, SchoolProject> schoolprojects = new HashMap<String, SchoolProject>();
	
	public SchoolProject getProject(String name){
		return schoolprojects.get(name);
	}
	
	public void addProject(SchoolProject sp){
		schoolprojects.put(sp.projectName(), sp);
	}
	public void removeProject(String name){
		schoolprojects.remove(name);
	}
	
	
	public void display(){
		Skyler.Println("====================\nSchool Projects\n====================");
		for(String s: schoolprojects.keySet()){
			Skyler.Println(s);
		}
		Skyler.Println("====================");
		
	}
	
	
	public void run(String pn){
		for(String s: schoolprojects.keySet()){
			if(s.toLowerCase().contains(pn)){
				schoolprojects.get(s).run();
				return;
			}
		}
		Skyler.Println("No Project Found!");
	}
	
	
	
}

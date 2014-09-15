package com.dayellecraft.mrawellstein.skyler.schoolprojects.projectmanager;

import java.util.HashMap;
import java.util.Scanner;

import com.dayellecraft.mrawellstein.skyler.schoolprojects.main.Main;
import com.dayellecraft.mrawellstein.skyler.schoolprojects.util.Skyler;

public class ProjectTerminal {

	
	public ProjectTerminal(){
		addCommand(new Display());
		addCommand(new Run());
	}
	
	private Scanner scan = new Scanner(System.in);

	public void run(){
		while(true){
			try{
				Skyler.Print("PT: ");
				String input = scan.nextLine();
				String[] cmd = input.split(" ");
				if(commandMap.containsKey(cmd[0].toLowerCase())){
					commandMap.get(cmd[0].toLowerCase()).Called(cmd[0], cmd);
				}else{
					Skyler.Println("InvalidCommand");
				}
				
			}catch(Exception e){e.printStackTrace();}
		}
	}

	public HashMap<String, Command> commandMap = new HashMap<String, Command>();
	
	public void addCommand(Command c){
		commandMap.put(c.cmd(), c);
	}
	
	public static class Run implements Command{

		@Override
		public String cmd() {
			// TODO Auto-generated method stub
			return "run";
		}

		@Override
		public void Called(String cmd, String[] args) {
			if(args != null){
				if(args.length > 1){
					Main.ph1.run(args[1]);
				}else{
					Skyler.Println("You Must Have Arguments!");
				}
			}
		}
		
	}
	
	public static class Display implements Command{

		@Override
		public String cmd() {
			return "display";
		}

		@Override
		public void Called(String cmd, String[] args) {
			Main.ph1.display();
		}
		
	}

	private static interface Command{
		public String cmd();
		public void Called(String cmd, String[] args);
	}


}

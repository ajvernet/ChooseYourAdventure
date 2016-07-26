package com.vernet_choose_your_adventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChooseAdventure {

	private File currentFile = new File("IntroOptions.txt");
	private File introFile = new File("IntroOptions.txt");
	private File choiceAFile;
	private File choiceBFile;
	
	public ChooseAdventure() 
	{
		
	}
	
	public void displayText() throws FileNotFoundException
	{
		Scanner sc = new Scanner(currentFile);
		while(sc.hasNext()) System.out.println(sc.nextLine());
		System.out.println();
	}
	
	public void promptUser() throws FileNotFoundException
	{
		Scanner choiceScanner = new Scanner(System.in);
		boolean finished = false;
		do
		{
			
			displayText();
			
			String choice = choiceScanner.next().toUpperCase();
			
			switch(choice)
			{
			case "A":
				currentFile = new File("BreakfastChoices.txt");
				displayText();
				
				setNextChoiceFile("GreenPill.txt", "PopTarts.txt");
				
				choice = choiceScanner.next().toUpperCase();
				
				switch(choice)
				{
				case "A":
					currentFile = choiceAFile;
					displayText();
					break;
					
				case "B":
					currentFile = choiceBFile;
					displayText();
					break;
				}
				break;
				
			case "B":
				currentFile = new File("pokemon.txt");
				displayText();
				
				setNextChoiceFile("rarePokemon.txt", "pokemonGym.txt");
				
				choice = choiceScanner.next().toUpperCase();
				
				switch(choice)
				{
				case "A":
					currentFile = choiceAFile;
					displayText();
					break;
					
				case "B":
					currentFile = choiceBFile;
					displayText();
					break;
				}
				break;
				
			case "C":
				currentFile = new File("extraPrepTime.txt");
				displayText();
				
				setNextChoiceFile("suitAndTie.txt", "GoOverPresentation.txt");
				
				choice = choiceScanner.next().toUpperCase();
				
				switch(choice)
				{
				case "A":
					currentFile = choiceAFile;
					displayText();
					break;
					
				case "B":
					currentFile = choiceBFile;
					displayText();
					break;
				}
				break;
			}
				
			currentFile = introFile;
			
			System.out.println();
				System.out.println("Enter X to exit the program, or anything"
						+ " else to start over.");
				choice = choiceScanner.next().toUpperCase();
				if (choice.equalsIgnoreCase("X")) finished = true;
				
		}while(!finished);
		
		System.exit(0);
	}
	
	public void setNextChoiceFile(String fileAName, String fileBName)
	{
		this.choiceAFile = new File(fileAName);
		this.choiceBFile = new File(fileBName);
	}
}


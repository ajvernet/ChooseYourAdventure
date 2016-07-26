package com.vernet_choose_your_adventure;

import java.io.FileNotFoundException;

public class TestAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChooseAdventure newStory = new ChooseAdventure();
		
		try {
			newStory.promptUser();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

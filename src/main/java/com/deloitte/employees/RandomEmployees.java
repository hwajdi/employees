package com.deloitte.employees;

import java.util.Random;

public class RandomEmployees {

	public String generateRandomArguments(){
		
		String [][] arguements = {{"Haider", "Kaz", "Fawzy", "Neil", "Ali", "Ernest", "Marco", "Prem", "Raj", "Josi", "Abeer", "Yao","Arthur", "Sunny", "Jody"},
									{"is awesome :-)", "is working hard", "is so busy", "cannot be reached", "keeps everyone busy", "dont waste my time", "is the best to work with", 
										"is DevOps Engineer", "will automate everything :-|", "is fun to work with"}};
		String firstArg = arguements[0][new Random().nextInt(arguements[0].length)];
		String secondArg = arguements[1][new Random().nextInt(arguements[1].length)];
		String fullSentince = firstArg + " "+ secondArg;
		
		return fullSentince;
	}
}

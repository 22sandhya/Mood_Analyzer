package com.bridgelabz;

public class MoodAnalyzer {

	public static void main(String[] args) {
		System.out.println("welcome to Mood Analyzer program..!");
	}

	private String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (this.message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}

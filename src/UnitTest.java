import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
import java.util.Collections;
public class UnitTest {
	//Variables
	private Scanner input;
	private ArrayList<String> answers;
	private double[] questionStats;
	//Constructors
	public UnitTest() {
		answers = new ArrayList<String>();
		try {
			Scanner input = new Scanner(new File("C:\\Users\\dsouz\\Documents\\csc330\\Lab2-Autograder\\src\\answers")).useDelimiter(" ");
			// reading in from full path.
			String ans = new String(); // using a string to add the entire line, without spaces
			while (input.hasNext()) {
				answers.add(input.next());
			} // now all answers are in the ArrayList<string>
			questionStats = new double[answers.size()]; // this is used later to display the percentage of students that got a question right
			input.close(); 
		} catch (Exception e) { // cant allow the program to continue if we cant find the file
			System.out.println("File Error. Ending UnitTest");
			e.printStackTrace();
			return;
		}
	}
	
	//Methods
	
	public double calculateGrade(ArrayList<String> student_answers) {
		// this function will take in a single students answer sheet, and then check each individual character for equals
		double correct  = 0;
		for (int i = 0; i < student_answers.size(); i++) {
			if (answers.get(i).equals(student_answers.get(i))) {
				correct++; // if equals, add it to a correct sum, which adds points.
				questionStats[i]++;// this is kept for our questionsRight function
			}
		}
		// after calculating correct:
		return ((correct / answers.size()) * 100);
		// simple math for calculating the percentage grade
	}
	public void questionsRight(ArrayList<Student> Class) {
		System.out.println("Below is the breakdown of what percent of students got a question right: ");
		for (int i = 0; i < answers.size(); i++) {
			System.out.printf("Question " + (i+1) + ": %.2f%% \n", questionStats[i] / Class.size() * 100);
			// this function references an array of doubles that has index 0-9, or the number of questions from the test.
			// the index's hold the number of correct answers from the entire class.
			// finally, we pass the "Class" of Student to get a total number of all students, and get the percentage
			// of students getting a question correct.
		}
	}
	
}

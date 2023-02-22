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
			//reading in from full path
			String ans = new String();
			while (input.hasNext()) {
				answers.add(input.next());
			}
			questionStats = new double[answers.size()];
			input.close();
		} catch (Exception e) { // cant allow the program to continue if we cant find the file
			System.out.println("File Error. Ending UnitTest");
			e.printStackTrace();
			return;
		}
	}
	
	//Methods
	
	public double calculateGrade(ArrayList<String> student_answers) {
		//using this function to read one index of grade, then return a double.
		//so student_answers is all answers from the students...
		double correct  = 0;
		for (int i = 0; i < student_answers.size(); i++) {
			if (answers.get(i).equals(student_answers.get(i))) {
				correct++;
				questionStats[i]++;
			}
		}
		//after calculating correct:
		return ((correct / answers.size()) * 100);
		
	}
	//to format a questions wrong, we can call this when an answer is correct. we can start with a hashmap from ranges 1 to answers.size()
	//in other words, the number of questions. Then, at the end of the function, call a function to print these results.
	public void questionsWrong(ArrayList<Student> Class) {
		System.out.println("Below is the breakdown of what percent of students got a question right: ");
		for (int i = 0; i < answers.size(); i++) {
			System.out.printf("Question " + (i+1) + ": %.2f \n", questionStats[i] / Class.size() * 100);
			//now, key tells us the question and average
		}
	}
	
}

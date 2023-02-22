import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
public class UnitTestRunner {
	public static void main(String args[])  {
		UnitTest test = new UnitTest();
		//automatically reads in from answers.txt
		
		ArrayList<Student> Class_Info = new ArrayList<Student>();
		//preparing ArrayList of Student for file input
		
		//prepare hashmap
		
		HashMap<String,ArrayList<String>> Map = new HashMap<String,ArrayList<String>>();
		int offset = 0;
		//reading in from allExams
		try {
			Scanner student_info = new Scanner(new File("C:\\Users\\dsouz\\Documents\\csc330\\Lab2-Autograder\\src\\allExams")).useDelimiter(" ");
			while (student_info.hasNext()) {
				//read entire line, and then we filter it now
				String[] full_info = student_info.nextLine().split("\\s");
				Class_Info.add(new Student(full_info[1],full_info[0]));
				//so here, we enter the first and last name into a string array, split by spaces.
				//then we declare a new student object to add into our student ArrayList
				//now we will grade, and input an average.
				// from 2 to end of LINE, we can read so any number of answers is allowed
				int i = 2;
				ArrayList<String> student_answers = new ArrayList<String>();
				String answers_temp = new String();
				while(i < full_info.length) {
					answers_temp = full_info[i];
					i++;
					student_answers.add(answers_temp);
				} // what this does, is from the read in full_info str array, we already extracted the first and last name on index's 1 and 0.
				// then, we know 2 is the next index, and the length returns us the index of the LAST value, which by our dataset, is the last
				// answers for the respective student. now all we do is insert this into our string arraylist

				Map.put((full_info[0] + full_info[1]).toLowerCase(),student_answers);
				//now we enter the answers into the hashmap.
				
				//time to calculategrade
				//so for calling calcgrade: setAverage with calling calcuateGrade on each object, using the Hashmap Key to reference the answers
				}
			student_info.close();
		} catch (Exception e){
			System.out.println("File Error. Ending Runner");
			e.printStackTrace();
			return;
		}
		
		for (int i = 0; i < Class_Info.size(); i++) {
			//System.out.println(test.calculateGrade(Map.get((Class_Info.get(i).getLastName() + Class_Info.get(i).getFirstName()).toLowerCase())));
			Class_Info.get(i).setAverage(test.calculateGrade(Map.get((Class_Info.get(i).getLastName() + Class_Info.get(i).getFirstName()).toLowerCase())));
			System.out.println("Student Name: " + Class_Info.get(i).getFirstName() +  " " + Class_Info.get(i).getLastName() + " | Average: " + Class_Info.get(i).getAverage());
		}
		test.questionsWrong(Class_Info);
	}
}

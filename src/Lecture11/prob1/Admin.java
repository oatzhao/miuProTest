package Lecture11.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> hashMap = new HashMap<>();
		for(Student s: students){
			hashMap.put(new Key(s.getFirstName(), s.getLastName()), s);
		}
		return hashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double totalScore = 0.0;
		for(Student student: maps.values()){
			double sorce = student.getGpa();
			totalScore += sorce;
		}
		return totalScore/maps.size();
	}
}

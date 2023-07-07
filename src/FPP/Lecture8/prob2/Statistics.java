package FPP.Lecture8.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> list) {
		double sumSalary = 0.0;
		for(EmployeeData e: list){
			sumSalary+=e.getSalary();
		}
		return sumSalary;
	}
}

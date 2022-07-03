package linecomparisonproblem;

import java.util.Scanner;

public class LineComparisionProblem {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x1 : ");
		int x1 = scanner.nextInt();
		System.out.println("Enter x : ");
		int x2 = scanner.nextInt();
		System.out.println("Enter y1 : ");
		int y1 = scanner.nextInt();
		System.out.println("Enter y2 : ");
		int y2 = scanner.nextInt();
		
		System.out.println("Enter x_axis1 : ");
		int x_axis1=scanner.nextInt();
		System.out.println("Enter x_axis2 : ");
		int x_axis2=scanner.nextInt();
		System.out.println("Enter y_axis1 : ");
		int y_axis1=scanner.nextInt();
		System.out.println("Enter y_axis2 : ");
		int y_axis2=scanner.nextInt();
		
		Double lineLength1 = Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2 - y1,2));
		
		Double lineLength2 = Math.sqrt(Math.pow(x_axis2 - x_axis1,2) + Math.pow(y_axis2 - y_axis1,2));
		
		System.out.println(" LINE 1 LENGTH : "+lineLength1);
		System.out.println(" LINE 2 LENGTH : "+lineLength2);
	
		//used equals method 
		if(lineLength1.equals(lineLength2))
			System.out.println(" Both Lines are equals ");
		else
			System.out.println(" Both Lines are not equals ");
		
		//used compareTo method		
		if(lineLength1.compareTo(lineLength2) == 1)
			System.out.println(" Length of Line1 is greater than Line2 ");
		else if(lineLength1.compareTo(lineLength2) == -1)	
			System.out.println(" Length of Line2 is greater than Line1 ");
		else
			System.out.println(" Length of line1 is equal to line 2 ");	
		
		scanner.close();
		
	}
}

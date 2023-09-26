package Assingment1;
import java.util.Scanner;
public class assigment4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.print( " plese enter your age :");
		age = input.nextInt();
		if (age>=18){
			System.out.println(" valid voter");
			
		}
		else {
			System.out.println("invalid voter");
		}

	}

}

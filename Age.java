
/*
This is a Java Program
This program detect the user age 
nonsogospel
*/
import java.io.*;
import java.util.Scanner;  // Library to fetch user's input
import javax.swing.JFrame; // Library for image
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Age {
	public static void main(String[] args) {
		// Code for the image
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("b.png");
  		JLabel label = new JLabel(icon);
  		frame.add(label);
  		frame.setDefaultCloseOperation
         		(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to my Java Age Detector Game");
		System.out.println("Choose a number between 2 and 10");
		int userNumber = keyboard.nextInt();
		if(userNumber == 2 || userNumber == 3 || userNumber == 4 || userNumber == 5 || userNumber == 6 || userNumber == 7 || userNumber == 8 || userNumber == 9) {
			System.out.println("Multiply your number by 2 by just pressing 2");
			int multi2 = keyboard.nextInt();
			int grabMulti2 = userNumber * 2;
			System.out.println("The result is " + grabMulti2);
			System.out.println("Now Add 5 to the result by just pressing 5");
			int addfive = keyboard.nextInt();
			int grabAddfive = grabMulti2 + 5;
			System.out.print("The Result is " + grabAddfive);
			System.out.println(" Now it's time to multiply 50 to that number");
			System.out.println();
			System.out.println("You should know what to do by now right?");
			System.out.println("Just multiply 50 to the number by just pressing 50");
			int multi50 = keyboard.nextInt();
			int grabMulti50 = grabAddfive * 50;
			System.out.println("The Result is " + grabMulti50);
			System.out.println("Wait, have you celebrated your birthday for this year already or is it on its way?");
			System.out.println();
			System.out.println("If you have celebrated already type YES or if you haven't celebrated yet type NO");
			String celebratedUser = keyboard.next();
			if (celebratedUser.equals("YES") || celebratedUser.equals("yes") || celebratedUser.equals("Yes") || celebratedUser.equals("Yeah") || celebratedUser.equals("Yeap") || celebratedUser.equals("yES") || celebratedUser.equals("YeS") || celebratedUser.equals("YEs") || celebratedUser.equals("Y") || celebratedUser.equals("y")) {
				System.out.println("OK you have celebrated your Birthday for this year already");
				System.out.println();
				System.out.println("Add 1771 to your result so far by just typing the number 1771 without any spaces please");
				int celebratedAdd = keyboard.nextInt();
				int celebrateAdd = grabMulti50 + 1771;
				System.out.println("The Result is " + celebrateAdd);
				System.out.println("We are going somewhere");
				System.out.println("What year where you born?: ");
				int yearBorn = keyboard.nextInt();
				System.out.println("Now subtract " + yearBorn + " from your result so far which is " + celebrateAdd + " by just typing the number " + celebrateAdd);
				int celebrateDBorn = keyboard.nextInt();
				int celebrateBorn = celebrateAdd - yearBorn;
				System.out.println("We are done!. Thanks for your patience.");
				System.out.println("Our Result so far is " + celebrateBorn);
				System.out.println("Now check properly your age is part of these number so as the first number you selected");
				int firstDigit = Integer.parseInt(Integer.toString(celebrateBorn).substring(0, 1));
				System.out.println("Well, the first number you selected is right in front of you which is " + firstDigit);
				int secondDigit = Integer.parseInt(Integer.toString(celebrateBorn).substring(1, 2));
				int thirdDigit = Integer.parseInt(Integer.toString(celebrateBorn).substring(2, 3));
				if (secondDigit == 0) {
					System.out.println("Therefore you are " + thirdDigit +  " years old");
				}
				else{
					System.out.println("Therefore you are " + secondDigit + + thirdDigit +  " years old");
				}
				
				

			}else if (celebratedUser.equals("NO") || celebratedUser.equals("no") || celebratedUser.equals("No") || celebratedUser.equals("nO") || celebratedUser.equals("Nope") || celebratedUser.equals("NOPE") || celebratedUser.equals("N") || celebratedUser.equals("n")) {
				System.out.println("OK, You have not celebrated for this Year Yet");
				System.out.println();
				System.out.println("Add 1770 to your result so far by just typing the number 1770 without any spaces please");
				int celebratedAdd = keyboard.nextInt();
				int celebrateAdd = grabMulti50 + 1770;
				System.out.println("The Result is " + celebrateAdd);
				System.out.println("We are going somewhere");
				System.out.println("What year where you born?: ");
				int yearBorn = keyboard.nextInt();
				System.out.println("Now subtract " + yearBorn + " from your result so far which is " + celebrateAdd + " by just typing the number " + celebrateAdd);
				int celebrateDBorn = keyboard.nextInt();
				int celebrateBorn = celebrateAdd - yearBorn;
				System.out.println("We are done!. Thanks for your patience.");
				System.out.println("Our Result so far is " + celebrateBorn);
				System.out.println("Now check properly your age is part of these number so as the first number you selected");
				int firstDigit = Integer.parseInt(Integer.toString(celebrateBorn).substring(0, 1));
				System.out.println("Well, the first number you selected is right in front of you which is " + firstDigit);
				int secondDigit = Integer.parseInt(Integer.toString(celebrateBorn).substring(1, 2));
				int thirdDigit = Integer.parseInt(Integer.toString(celebrateBorn).substring(2, 3));
				if (secondDigit == 0) {
					System.out.println("Therefore you are " + thirdDigit +  " years old");
				}
				else{
					System.out.println("Therefore you are " + secondDigit + + thirdDigit +  " years old");
				}
			}


		}else {
			System.out.println("You did not select a number beween 2 and 10");
		}


	}
}
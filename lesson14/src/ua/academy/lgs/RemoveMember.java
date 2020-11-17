package ua.academy.lgs;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveMember {
	public static void remove(ZooClub zc) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name of person to be removed");
			String name = sc.next();
			System.out.println("Enter person age");
			int age = sc.nextInt();
			Person p = new Person(name, age);

			zc.getMap().remove(p);

			
			System.out.println(zc);
		
	}
}

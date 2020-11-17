package ua.academy.lgs;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewMember {
	public static void add(ZooClub zc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person name");
		String name = sc.next();
		System.out.println("Enter person age");
		int age = sc.nextInt();
		Person p = new Person(name, age);

		zc.getMap().put(p, new ArrayList<Animal>());

		
		System.out.println(zc);
	}
}

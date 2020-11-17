package ua.academy.lgs;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class DeleteAnimal {
	public static void deleteAnimal(ZooClub zc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pet species");
		String species = sc.next();
		System.out.println("Enter per name");
		String name = sc.next();

		Animal pet = new Animal(species, name);

		System.out.println("Enter name of owner of this pet");

		String owName = sc.next();

		System.out.println("Enter his age");

		int owAge = sc.nextInt();

		Person owner = new Person(owName, owAge);

		Iterator<Entry<Person, List<Animal>>> iterator = zc.getMap().entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().equals(owner)) {
				List<Animal> value = next.getValue();
				value.remove(pet);
			}

		}
		System.out.println(zc);
	}
}

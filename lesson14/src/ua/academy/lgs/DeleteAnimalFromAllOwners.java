package ua.academy.lgs;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class DeleteAnimalFromAllOwners {
	public static void deleteFromAll(ZooClub zc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pet species");
		String species = sc.next();
	

		Iterator<Person> iterator = zc.getMap().keySet().iterator();
		while (iterator.hasNext()) {
			Person owner = iterator.next();
			Iterator<Entry<Person, List<Animal>>> iterator2 = zc.getMap().entrySet().iterator();
			while (iterator2.hasNext()) {
				Entry<Person, List<Animal>> next = iterator2.next();
				if (next.getKey().equals(owner)) {
					List<Animal> value = next.getValue();
					Iterator<Animal> iterator3 = value.iterator();
					if(iterator3.next().getSpecies().equals(species)) {
						iterator3.remove();
					}
					
				}

			}
		}

	}
}

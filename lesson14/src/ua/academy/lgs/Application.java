package ua.academy.lgs;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		ZooClub CatLovers = new ZooClub();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter number of action you want to perform");
			Menu.menu();
			int entry = sc.nextInt();
			
			switch (entry) {
			case 1: {
				AddNewMember.add(CatLovers);
				break;
			}
			case 2: {
				AddNewAnimal.addAnimal(CatLovers);
				break;
			}
			case 3: {
				DeleteAnimal.deleteAnimal(CatLovers);
				break;
			}
			case 4: {
				RemoveMember.remove(CatLovers);
				break;
			}
			case 5: {
				DeleteAnimalFromAllOwners.deleteFromAll(CatLovers);
				break;
			}
			case 6: {
				PrintZooClub.print(CatLovers);
				break;
			}
			case 7: {
				Exit.exit();
				break;
			}

			}

		}

	}
}

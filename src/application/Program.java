package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Champion champion1;
		Champion champion2;
		int nRounds;
		
		// First champion data
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name1 = sc.nextLine().strip();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int damage1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		
		champion1 = new Champion(name1, life1, damage1, armor1);
		
		// Second champion data
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String name2 = sc.nextLine().strip();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int damage2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		
		champion2 = new Champion(name2, life2, damage2, armor2);
		
		// Rounds to execute
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		nRounds = sc.nextInt();
		
		// Go until number of rounds are over or one of the champions is dead (life == 0)
		System.out.println();
		for (int i = 1; i < nRounds + 1; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.printf("Resultado do turno %d:%n", i);
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();
			if (champion1.getLife() == 0 || champion2.getLife() == 0) {
				break;
			}
		}
		System.out.print("FIM DO COMBATE");
		sc.close();
	}

}

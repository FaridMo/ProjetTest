package Test;


import java.util.Random;
import java.util.Scanner;

public class JeuSecret {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		long nbreSaisie,nbreSecret,nbreDeCoup=0;
		Random r = new Random(); //permet de générer des nombres aléatoires # Math.Random
		nbreSecret = r.nextInt(100);//génération d'un nombre [0;100]
		System.out.println("nombre secret ="+nbreSecret);
		
		do{
			
			System.out.println("Entrez un nombre secret : ");
			nbreSaisie = clavier.nextInt();
			nbreDeCoup++;
			if (nbreSaisie<0) {
				System.out.println("Saisissez un nombre positif compris entre 0 et 100");
			}
			if(nbreSaisie>100){
				System.out.println("Veuillez respecter l'intervale [0;100]");
			}
			if (nbreSaisie<nbreSecret && nbreSaisie>0) {
				System.out.println("le nombre saisi est inférieur au nombre secret !! ");
			}
			if(nbreSaisie>nbreSecret && nbreSaisie<100){
				System.out.println("Le nombre saisi est supérieur au nombre secret");
			}
			if(nbreSaisie == nbreSecret){
				System.out.printf("vous avez trouvé le nombre secret en "+nbreDeCoup+" coups bravo ! ");
			}

		}while(nbreSaisie!=0);
		
		
		
	}

}

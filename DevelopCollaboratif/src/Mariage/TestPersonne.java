package Mariage;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1,p2,p3,p4,p5;
		p1 = new Personne("Diallo","Alpha", "marie",1996,'M');
		p2 = new Personne("Thiam","nafissatou", "marie",1997,'F',p1);
//		p3 = new Personne("Diallo","con", "marie",1994,'M');
		p4 = new Personne("Sokhna","Sy","Célibataire",1991,'F');
		p5 = new Etudiant("Babacar","Mamadou","celibataire",1989,'M',191200921,2015);
		p1.marier(p2);
		System.out.println(p2.retournInfos());
		System.out.println(p5.retournInfos());
		
		
		
		

	}

}

package Mariage;

public class Etudiant extends Personne {
			static int noEtudiant,anneePremiereEntree;
	public Etudiant(String nom, String prenom, String situationMatrimoniale, int anneeNaissance, char sexe,int noEtudiant,int anneePremiereEntree) {
		super(nom, prenom, situationMatrimoniale, anneeNaissance, sexe);
		this.noEtudiant = noEtudiant;
		this.anneePremiereEntree = anneePremiereEntree;
	}
	
	public String toString(){
		return super.retournInfos()+", son cne est : "+this.noEtudiant+", Sa premi�re entr�e date de "+this.anneePremiereEntree;
	}
	
	
	
}

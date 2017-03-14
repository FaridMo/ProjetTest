package Mariage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Personne {
	String civilite,nom,prenom,situationMatrimoniale;
	int anneeNaissance;
	char sexe;
	Personne conjoint;
	Personne pere,mere;
	Personne etudiant;
	
	public Personne(String civilite, String nom, String prenom, String situationMatrimoniale, int anneeNaissance, Personne conjoint){
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.situationMatrimoniale = situationMatrimoniale;
		this.anneeNaissance = anneeNaissance;
		this.sexe = sexe;
		this.conjoint = conjoint;
	}
	
	GregorianCalendar a = new GregorianCalendar ();
	int annee = a.get(Calendar.YEAR) ;

	public Personne(String nom, String prenom, String situationMatrimoniale, int anneeNaissance,char sexe) {
		this.sexe = sexe;
		this.nom = nom;
		this.prenom = prenom;
		this.situationMatrimoniale = situationMatrimoniale;
		this.anneeNaissance = anneeNaissance;
		
	}
	
	public Personne(String nom, String prenom, String situationMatrimoniale, int anneeNaissance, char sexe,
			Personne conjoint) {
		this(nom,prenom,situationMatrimoniale,anneeNaissance,sexe);
		this.conjoint = conjoint;
	}

	public int Age(int annee){
		this.annee =annee;
		return annee - this.anneeNaissance;
	}
	
	
	public String retournInfos(){
		String res = null;
//		this.conjoint == null  === return par defaut
//		etc..
		
		if(sexe == 'M'){
			res ="M. "+this.nom.toUpperCase()+" "+this.prenom+" est né(e) en "+this.anneeNaissance+", il est "+this.situationMatrimoniale+" il a "+this.Age(annee)+" ans";
		}
		if(sexe == 'F'){
			if(situationMatrimoniale == "celibataire"){
				res ="Mlle. "+this.nom.toUpperCase()+" "+this.prenom+" est née en "+this.anneeNaissance+", elle est "+this.situationMatrimoniale;
			}
			if(situationMatrimoniale == "marie"){
				if(conjoint.situationMatrimoniale == "marie"){
				res ="Mme. "+conjoint.nom.toUpperCase()+" née "+this.nom.toUpperCase()+" "+this.prenom+" est née en "+this.anneeNaissance+", elle est "+this.situationMatrimoniale;
			}else{
				res ="Changez la situation matrimoniale du conjoint en 'marie' °<>° !!! ";
			}
		
			}
			
		}
		
		return res;
	}
	
	public void marier(Personne p){};
	
	public String toString(){
		return this.nom+" "+prenom+" "+ this.situationMatrimoniale+" "+this.anneeNaissance+" "+this.sexe;
	}

}

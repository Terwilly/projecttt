package ma.fstg.budget.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Budget implements Serializable {
	private static final long serialVersionUID = -1081738768322941780L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String description;
	private double montantInvestissement;
	private double montantFonctionnement;
	private double creditOuvert;
	private int annee;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMontantInvestissement() {
		return montantInvestissement;
	}
	public void setMontantInvestissement(double montantInvestissement) {
		this.montantInvestissement = montantInvestissement;
	}
	public double getMontantFonctionnement() {
		return montantFonctionnement;
	}
	public void setMontantFonctionnement(double montantFonctionnement) {
		this.montantFonctionnement = montantFonctionnement;
	}
	public double getCreditOuvert() {
		return creditOuvert;
	}
	public void setCreditOuvert(double creditOuvert) {
		this.creditOuvert = creditOuvert;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
}

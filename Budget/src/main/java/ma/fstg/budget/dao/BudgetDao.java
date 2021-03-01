package ma.fstg.budget.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fstg.budget.bean.Budget;

@Repository
public interface BudgetDao extends JpaRepository<Budget, Long> {
	
	Budget findByDescription(String description);
	Budget findByMontantInvestissement(double montantInvestissement);
	Budget findByMontantFonctionnement(double montantFonctionnement);
	List<Budget> findByCreditOuvert(double creditOuvert);
	Budget findByAnnee(int annee);
	
}

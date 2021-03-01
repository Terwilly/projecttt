package ma.fstg.budget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstg.budget.bean.Budget;
import ma.fstg.budget.dao.BudgetDao;

@Service
public class BudgetService {
	@Autowired
	BudgetDao budgetDao;

	public Budget findByAnnee(int annee) {
		return budgetDao.findByAnnee(annee);
	}

	public Budget findByMontantInvestissement(double montantInvestissement) {
		return budgetDao.findByMontantInvestissement(montantInvestissement);
	}

	public Budget findByMontantFonctionnement(double montantFonctionnement) {
		return budgetDao.findByMontantFonctionnement(montantFonctionnement);
	}

	public List<Budget> findByCreditOuvert(double creditOuvert) {
		return budgetDao.findByCreditOuvert(creditOuvert);
	}

	public List<Budget> findAll() {
		return budgetDao.findAll();
	}

	public int save(Budget budget) {
		budgetDao.save(budget);
		return 1;
	}

	public void deleteById(Long id) {
		budgetDao.deleteById(id);
	}

}

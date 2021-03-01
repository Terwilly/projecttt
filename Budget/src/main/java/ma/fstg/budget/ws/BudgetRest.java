package ma.fstg.budget.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstg.budget.bean.Budget;
import ma.fstg.budget.service.BudgetService;
@RestController
@RequestMapping("budget-api/budget")
public class BudgetRest {
	@Autowired
	BudgetService budgetService;


	@GetMapping("/montantInvestissement/{montantInvestissement}")
	public Budget findByMontantInvestissement(@PathVariable double montantInvestissement) {
		return budgetService.findByMontantInvestissement(montantInvestissement);
	}

	@GetMapping("/montantFonctionnement/{montantFonctionnement}")
	public Budget findByMontantFonctionnement( @PathVariable double montantFonctionnement) {
		return budgetService.findByMontantFonctionnement(montantFonctionnement);
	}

	@GetMapping("/creditOuvert/{creditOuvert}")
	public List<Budget> findByCreditOuvert( @PathVariable double creditOuvert) {
		return budgetService.findByCreditOuvert(creditOuvert);
	}
	
	@GetMapping("/")
	public List<Budget> findAll() {
		return budgetService.findAll();
	}

	@PostMapping("/")
	public int save(@RequestBody Budget budget) {
		return budgetService.save(budget);
	}
	@GetMapping("/annee/{annee}")
	public Budget findByAnnee(@PathVariable int annee) {
		return budgetService.findByAnnee(annee);
	}

	public void deleteById(Long id) {
		budgetService.deleteById(id);
	}
	
	


}

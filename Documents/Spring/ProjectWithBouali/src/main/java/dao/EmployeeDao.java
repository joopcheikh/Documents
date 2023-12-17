package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.project.models.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class EmployeeDao
{
	private final EntityManager em = null;
	
	public List<Employee> findAllBySimpleQuery(String firstname, String lastname, String email){
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		
		// Select * from Employee
		Root<Employee> root = criteriaQuery.from(Employee.class);
		
		// Clause Where
		// 1- WHERE firstname LIKE '%joop%'
		Predicate firstnamePredicate = criteriaBuilder
				.like(root.get("firstname"), "%" + firstname +"%");
		
		// 2- WHERE lasname LIKE '%joop%'
		Predicate lastnamePredicate = criteriaBuilder
				.like(root.get("lastname"), "%" + lastname +"%");
			
		// 2- WHERE lasname LIKE '%joop%'
		Predicate emailPredicate = criteriaBuilder
				.like(root.get("email"), "%" + email +"%");
			
		Predicate firstnameOrLastnamePredicate  = criteriaBuilder.or(
				firstnamePredicate,
				lastnamePredicate
		);
		
		// final query ==> select * from employee where firstname Like  .....
		// or lastname Like ... And email Like ....
		var andEmailPredicate = criteriaBuilder.and(firstnameOrLastnamePredicate, emailPredicate);
		criteriaQuery.where(andEmailPredicate);
		
		// C'est un objet du same packege
		TypedQuery<Employee> query = em.createQuery(criteriaQuery);
		
		
		return query.getResultList();
	}
	
	/*
	// Other function
	public List<Employee> findAllByCriteria(SearchRequest request)
	{
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		
		List<Predicate> predicates = new ArrayList<>();
		
		// select * from employee
		Root<Employee> root = criteriaQuery.from(Employee.class);
		
		if (request.ge)
		
		*/
		
	
}

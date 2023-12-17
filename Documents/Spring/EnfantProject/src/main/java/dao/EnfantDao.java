package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import my_projects.Enfant;


public class EnfantDao
{
	private final EntityManager em = null;
	
	public List<Enfant> findAllByQuery(String firstname, String lastname){
		
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Enfant> criteriaQuery = criteriaBuilder.createQuery(Enfant.class);
		
		Root<Enfant> root = criteriaQuery.from(Enfant.class);
		
		Predicate firstnamePredicate = criteriaBuilder
				.like(root.get("firstname"), "%" + firstname + "%");
		
		Predicate lastnamePredicate  = criteriaBuilder
				.like(root.get("firstname"), "%" + firstname + "%");
		
		Predicate firstnameOrLastname = criteriaBuilder.or(
				firstnamePredicate,
				lastnamePredicate
		);
		
		TypedQuery<Enfant> query = em.createQuery(criteriaQuery);
		
		return query.getResultList();
	}
}

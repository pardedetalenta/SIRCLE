package com.sirclo.test.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirclo.test.model.Berat;
import com.sirclo.test.service.BeratService;

@Service
public class BeratDao implements BeratService{

	private EntityManagerFactory emf;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf=emf;
	}
	
	@Override
	public List<Berat> listBerat() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Berat", Berat.class).getResultList();
	}

	@Override
	public Berat saveBerat(Berat berat) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Berat saved = em.merge(berat);
		em.getTransaction().commit();
		return saved;
	}
	

	@Override
	public Berat getIdBerat(Integer id) {
		EntityManager em =emf.createEntityManager();
		return em.find(Berat.class, id);
	}

	@Override
	public void hapus(Integer id) {
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Berat.class, id));
		em.getTransaction().commit();
	}

}

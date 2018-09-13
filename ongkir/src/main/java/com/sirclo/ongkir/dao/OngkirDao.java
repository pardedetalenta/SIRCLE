package com.sirclo.ongkir.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirclo.ongkir.model.Ongkir;
import com.sirclo.ongkir.service.OngkirService;

@Service
public class OngkirDao implements OngkirService{

	private EntityManagerFactory emf;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf=emf;
	}
	
	@Override
	public List<Ongkir> listOngkir() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Ongkir", Ongkir.class).getResultList();
		
	}

	@Override
	public Ongkir saveOngkir(Ongkir ongkir) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Ongkir saved = em.merge(ongkir);
		em.getTransaction().commit();
		return saved;
	}

	@Override
	public Ongkir getIdOngkir(Integer id) {
		EntityManager em =emf.createEntityManager();
		return em.find(Ongkir.class, id);
	}

	@Override
	public void hapus(Integer id) {
		EntityManager em =emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Ongkir.class, id));
		em.getTransaction().commit();

		
	}

}

package com.sirclo.ongkir.service;

import java.util.List;

import com.sirclo.ongkir.model.Ongkir;

public interface OngkirService {
	List <Ongkir> listOngkir();
	Ongkir saveOngkir(Ongkir ongkir);
	Ongkir getIdOngkir(Integer id);
	void hapus (Integer id);
}

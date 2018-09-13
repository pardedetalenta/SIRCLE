package com.sirclo.test.service;

import java.util.List;

import com.sirclo.test.model.Berat;


public interface BeratService {
	List <Berat> listBerat();
	Berat saveBerat(Berat berat);
	Berat getIdBerat(Integer id);
	void hapus (Integer id);
}

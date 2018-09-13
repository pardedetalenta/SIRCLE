package com.sirclo.ongkir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sirclo.ongkir.model.Ongkir;
import com.sirclo.ongkir.service.OngkirService;


@Controller
public class IndexController {

	private OngkirService oServ;
	
	@Autowired
	public void setbServ(OngkirService oServ) {
		this.oServ = oServ;
	}

	@RequestMapping(value="/",  method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("ongkir", new Ongkir());
		
		return "ongkirForm";
	}
	
//	
//	@RequestMapping(value="/ongkir-create", method=RequestMethod.GET)
//	public String form(Model model) {
//		model.addAttribute("ongkir", new Ongkir());
//		return "form";
//	}
//	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String create(Model model, Ongkir ongkir) {
		model.addAttribute("ongkir",oServ.saveOngkir(ongkir));
		return "resultForm";
	}
//	
//	@RequestMapping(value="/ongkir-edit/{id}", method=RequestMethod.GET)
//	public String edit(@PathVariable Integer id, Model model) {
//		model.addAttribute("ongkir",oServ.getIdOngkir(id));
//		return "form";
//	}
//	
//	@RequestMapping(value="/ongkir-delete/{id}")
//	public String delete(@PathVariable Integer id) {
//		oServ.hapus(id);
//		return "redirect:/ongkir";
//	}
//	
//	@RequestMapping(value="/ongkir-show/{id}", method=RequestMethod.GET)
//	public String show(@PathVariable Integer id, Model model) {
//		model.addAttribute("ongkir",oServ.getIdOngkir(id));
//		return "show";
//	}
}

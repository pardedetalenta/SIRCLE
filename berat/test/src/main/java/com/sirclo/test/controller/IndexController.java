package com.sirclo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sirclo.test.model.Berat;
import com.sirclo.test.service.BeratService;

@Controller
public class IndexController {

	private BeratService bServ;
	
	@Autowired
	public void setbServ(BeratService bServ) {
		this.bServ = bServ;
	}

	@RequestMapping("/berat")
	public String beratList(Model model) {
		model.addAttribute("berat", bServ.listBerat());
		return "index";
	}
	
	@RequestMapping(value="/berat-create", method=RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("berat", new Berat());
		return "form";
	}
	
	@RequestMapping(value="/berat-create", method=RequestMethod.POST)
	public String create(Model model, Berat berat) {
		model.addAttribute("berat",bServ.saveBerat(berat));
		return "redirect:/berat";
	}
	
	@RequestMapping(value="/berat-edit/{id}", method=RequestMethod.GET)
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("berat",bServ.getIdBerat(id));
		return "form";
	}
	
	@RequestMapping(value="/berat-delete/{id}")
	public String delete(@PathVariable Integer id) {
		bServ.hapus(id);
		return "redirect:/berat";
	}
	
	@RequestMapping(value="/berat-show/{id}", method=RequestMethod.GET)
	public String show(@PathVariable Integer id, Model model) {
		model.addAttribute("berat",bServ.getIdBerat(id));
		return "show";
	}
}

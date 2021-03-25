package com.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agenda.dataBase.PessoaRepository;
import com.agenda.model.Pessoa;

/*
 * Segue comentários do professor sobre o desenvolvimento da aplicação
 * */

@Controller
public class ListarController {
	
	@Autowired
	private PessoaRepository pr;
	
	@GetMapping("/listar-clientes")
	public ModelAndView listarPessoas() {
		List<Pessoa> pessoas= pr.findAll();
		ModelAndView mv= new ModelAndView("listar");
		mv.addObject("pessoas", pessoas);
		return mv;
		
	}

}

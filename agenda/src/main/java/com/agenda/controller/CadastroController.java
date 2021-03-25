package com.agenda.controller;
import com.agenda.dataBase.PessoaRepository;
import com.agenda.model.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * Segue comentários do professor sobre o desenvolvimento da aplicação
 * */

@Controller
public class CadastroController {
	
	@Autowired
	private PessoaRepository pr;
	
	@GetMapping("/cadastro")
	public String cadastro(){
		return"cadastro";
	}
	
	@PostMapping("/cadastro")
	public String cadastro(Pessoa p){
		pr.save(p);
		return"listar";
	}
}

package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.modal.Funcionario;
import com.example.service.FuncionarioSevice;

@RestController
public class FuncionarioController {

	@Autowired
	FuncionarioSevice serv;
	
	@RequestMapping("/buscar")
	private List<Funcionario> Buscar() {
		return serv.Busca();
	}
	
	@RequestMapping(value="buscar/{id}",method=RequestMethod.GET)
	private Optional<Funcionario>  Buscar(@PathVariable Integer id) {
		return serv.Busca(id);
	}
	
	@RequestMapping(value="/gravar",method=RequestMethod.POST)
	private String gravar(@RequestBody Funcionario fun) {
		try {
			serv.Gravar(fun);
			return "Sucesso";
		} catch (Exception e) {
			return "Erro"; 
		}
	}

	@RequestMapping(value="/excluir/{id}",method=RequestMethod.DELETE)
	private String Excluir(@PathVariable Integer id) {
		try {
			serv.Excluir(id);
			return "Sucesso";
		} catch (Exception e) {
			return "Erro"; 
		}
	}

	@RequestMapping("/alterar")
	private void Alterar() {
		
	}
	
	@RequestMapping("/excluir")
	private void Excluir() {
		
	}
}

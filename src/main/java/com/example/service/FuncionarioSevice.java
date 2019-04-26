package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modal.Funcionario;
import com.example.repository.FuncionarioRepository;

@Service
public class FuncionarioSevice{
	
	@Autowired    
	FuncionarioRepository repo;
	
	public List<Funcionario> Busca() {
		 return  repo.findAll();
	}
	
	public Optional<Funcionario> Busca(Integer id ) {
		return repo.findById(id);
	}
	
	public void Gravar(Funcionario fun) {
		repo.save(fun);
	}

	public void Excluir(Integer id ) {
		repo.deleteById(id);
	}
	


}

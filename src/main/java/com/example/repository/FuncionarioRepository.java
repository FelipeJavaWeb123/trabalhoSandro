package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modal.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
}

package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public Optional<Postagem> findByTitulo(String titulo);
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}

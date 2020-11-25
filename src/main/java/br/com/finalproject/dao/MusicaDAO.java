package br.com.finalproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer>{

	public List<Musica> findByTitulo(String titulo);
	public List<Musica> findByArtistaId(int id);
	public List<Musica> findByTituloAndArtistaId(String titulo , int id);
	
	
	
}

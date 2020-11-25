package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Artista;

public interface ArtistaDAO extends CrudRepository<Artista, Integer>{

	public Artista findByNomeArtisticoAndNacionalidade(String nomeartistico, String nacionalildade);

}

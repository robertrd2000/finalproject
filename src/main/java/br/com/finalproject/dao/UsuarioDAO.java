package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

/*
 * DAO = Data Access Object (Design Pattern)
 * Classed que contem os metodos que irão manipular os dados
 * Manipular dos dados = CRUD
 * C=CREATE(inserir o dados na tabela)
 * R=READ(consultar o dado na tabela)
 * U=UPDATE(alterar um dado na tabela)
 * D=DELETE(apagar  um dado na tabela)
 * Classe CrudRepository<1º classeBeans,2º TipoDadoPK> 
 */
public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{
	
	public Usuario findByEmailAndSenha(String email, String senha);
/*
 * Sava()    => gravar/alterar 
 * findALL   => consultar
 * deleteALL => apagar
 */

}

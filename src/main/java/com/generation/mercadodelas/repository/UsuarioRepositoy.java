package com.generation.mercadodelas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.mercadodelas.model.Usuario;

@Repository
public interface UsuarioRepositoy extends JpaRepository<Usuario, Long> {

		public Optional<Usuario> findByUsuario(String usuario);
}

package com.personalacademy.personalacademy.repositories;
import com.personalacademy.personalacademy.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}

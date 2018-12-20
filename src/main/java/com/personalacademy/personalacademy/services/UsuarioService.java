package com.personalacademy.personalacademy.services;

import com.personalacademy.personalacademy.domain.Usuario;
import com.personalacademy.personalacademy.repositories.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario find(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElse(null);
    }

    public void create(Usuario user) {
        repository.save(user);
    }
}

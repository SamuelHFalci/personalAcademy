package com.personalacademy.personalacademy.config;

import com.personalacademy.personalacademy.domain.AvaliacaoFisica;
import com.personalacademy.personalacademy.domain.Usuario;
import com.personalacademy.personalacademy.repositories.AvaliacaoFisicaRepository;
import com.personalacademy.personalacademy.repositories.UsuarioRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UsuarioRepository repo;
    
    @Autowired
    AvaliacaoFisicaRepository avaliacaoRepo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {

        List<Usuario> lista = repo.findAll();

        if (lista.isEmpty()) {
            Usuario user = new Usuario("Samuel", "Falci", 'M',"35313163", "samuelhfalci@gmail.com");
            AvaliacaoFisica a1 = new AvaliacaoFisica(31,105.5,1.82, user);
            AvaliacaoFisica a2 = new AvaliacaoFisica(32,97.5,1.82, user);
            user.getAvaliacoesFisicas().addAll(Arrays.asList(a1, a2));
            repo.save(user);
            avaliacaoRepo.saveAll(Arrays.asList(a1,a2));
            
        }

    }

}

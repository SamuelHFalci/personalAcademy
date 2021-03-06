package com.personalacademy.personalacademy.resources;

import com.personalacademy.personalacademy.domain.Usuario;
import com.personalacademy.personalacademy.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Usuario obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    public ResponseEntity<?> create(Usuario usr) {
        service.create(usr);
        return ResponseEntity.ok().body("ok");
    }
}

package com.personalacademy.personalacademy.repositories;
import com.personalacademy.personalacademy.domain.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Integer> {

}

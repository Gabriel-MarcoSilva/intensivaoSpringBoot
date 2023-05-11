package com.intensivao.intense.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivao.intense.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}

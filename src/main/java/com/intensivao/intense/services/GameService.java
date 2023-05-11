package com.intensivao.intense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.GetMapping;

import com.intensivao.intense.dtos.GameDTO;
import com.intensivao.intense.entites.Game;
import com.intensivao.intense.repositories.GameRepository;

@Service //indica que é um componente de injeção
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public List<GameDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList(); //transforma Game pra GameDTO
        return dto;
    }
}

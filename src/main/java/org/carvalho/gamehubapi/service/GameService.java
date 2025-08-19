package org.carvalho.gamehubapi.service;

import org.carvalho.gamehubapi.entity.Game;
import org.carvalho.gamehubapi.entity.dto.GameDTO;
import org.carvalho.gamehubapi.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  public List<GameDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(GameDTO::new).toList();
  }
}

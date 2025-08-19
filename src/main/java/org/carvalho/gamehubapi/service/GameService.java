package org.carvalho.gamehubapi.service;

import org.carvalho.gamehubapi.entity.Game;
import org.carvalho.gamehubapi.entity.dto.GameDTO;
import org.carvalho.gamehubapi.entity.dto.GameMinDTO;
import org.carvalho.gamehubapi.repository.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(GameMinDTO::new).toList();
  }

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    GameDTO gameDTO = new GameDTO(result);

    return gameDTO;
  }
}

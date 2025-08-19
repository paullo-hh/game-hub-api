package org.carvalho.gamehubapi.service;

import org.carvalho.gamehubapi.entity.Game;
import org.carvalho.gamehubapi.entity.GameList;
import org.carvalho.gamehubapi.entity.dto.GameDTO;
import org.carvalho.gamehubapi.entity.dto.GameListDTO;
import org.carvalho.gamehubapi.entity.dto.GameMinDTO;
import org.carvalho.gamehubapi.repository.GameListRepository;
import org.carvalho.gamehubapi.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {
  @Autowired
  private GameListRepository gameListRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(GameListDTO::new).toList();
  }
}

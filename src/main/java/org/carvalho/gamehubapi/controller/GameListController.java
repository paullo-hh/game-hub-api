package org.carvalho.gamehubapi.controller;

import org.carvalho.gamehubapi.entity.dto.GameListDTO;
import org.carvalho.gamehubapi.entity.dto.GameMinDTO;
import org.carvalho.gamehubapi.projection.GameMinProjection;
import org.carvalho.gamehubapi.service.GameListService;
import org.carvalho.gamehubapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gameLists")
public class GameListController {

  @Autowired
  private GameListService gameListService;

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameListDTO> findAll() {
      List<GameListDTO> result = gameListService.findAll();
      return result;
  }

  @GetMapping(value = "/{listId}/games")
  public List<GameMinDTO> searchByList(@PathVariable Long listId) {
    List<GameMinDTO> result = gameService.searchByList(listId);
    return result;
  }
}

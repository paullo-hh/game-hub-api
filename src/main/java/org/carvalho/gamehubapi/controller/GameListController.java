package org.carvalho.gamehubapi.controller;

import org.carvalho.gamehubapi.entity.GameList;
import org.carvalho.gamehubapi.entity.dto.GameDTO;
import org.carvalho.gamehubapi.entity.dto.GameListDTO;
import org.carvalho.gamehubapi.entity.dto.GameMinDTO;
import org.carvalho.gamehubapi.service.GameListService;
import org.carvalho.gamehubapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gameLists")
public class GameListController {

  @Autowired
  private GameListService gameListService;

  @GetMapping
  public List<GameListDTO> findAll() {
      List<GameListDTO> result = gameListService.findAll();
      return result;
  }
}

package org.carvalho.gamehubapi.controller;

import org.carvalho.gamehubapi.entity.dto.GameDTO;
import org.carvalho.gamehubapi.entity.dto.GameMinDTO;
import org.carvalho.gamehubapi.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameMinDTO> findAll() {
      List<GameMinDTO> result = gameService.findAll();
      return result;
  }

  @GetMapping(value = "/{id}")
  public GameDTO findById(@PathVariable Long id) {
    GameDTO result = gameService.findById(id);
    return result;
  }
}

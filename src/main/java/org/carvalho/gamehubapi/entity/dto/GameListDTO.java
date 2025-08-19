package org.carvalho.gamehubapi.entity.dto;

import org.carvalho.gamehubapi.entity.Game;
import org.carvalho.gamehubapi.entity.GameList;

public class GameListDTO {
  private Long id;
  private String name;

  public GameListDTO() {
  }

  public GameListDTO(GameList gameList) {
    id = gameList.getId();
    name = gameList.getName();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

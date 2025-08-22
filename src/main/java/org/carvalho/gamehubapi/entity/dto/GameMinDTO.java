package org.carvalho.gamehubapi.entity.dto;

import org.carvalho.gamehubapi.entity.Game;
import org.carvalho.gamehubapi.projection.GameMinProjection;

public class GameMinDTO {
  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO() {

  }

  public GameMinDTO(Game game) {
    id = game.getId();
    title = game.getTitle();
    year = game.getYear();
    imgUrl = game.getImgUrl();
    shortDescription = game.getShortDescription();
  }

  public GameMinDTO(GameMinProjection gameMinProjection) {
    id = gameMinProjection.getId();
    title = gameMinProjection.getTitle();
    year = gameMinProjection.getGameYear();
    imgUrl = gameMinProjection.getImgUrl();
    shortDescription = gameMinProjection.getShortDescription();
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }
}

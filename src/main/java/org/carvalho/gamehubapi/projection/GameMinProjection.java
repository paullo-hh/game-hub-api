package org.carvalho.gamehubapi.projection;

public interface GameMinProjection {
   Long getId();
   String getTitle();
   Integer getGameYear();
   String getImgUrl();
   String getShortDescription();
   String getPosition();
}

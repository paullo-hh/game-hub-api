package org.carvalho.gamehubapi.projection;

public interface GameMinProjection {
   Long getId();
   String getTitle();
   Integer getYear();
   String getImgUrl();
   String getShortDescription();
   String getPosition();
}

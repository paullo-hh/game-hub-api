package org.carvalho.gamehubapi.repository;

import org.carvalho.gamehubapi.entity.GameList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

package org.carvalho.gamehubapi.repository;

import org.carvalho.gamehubapi.entity.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

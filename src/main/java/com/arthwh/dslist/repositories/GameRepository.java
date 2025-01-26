package com.arthwh.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthwh.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

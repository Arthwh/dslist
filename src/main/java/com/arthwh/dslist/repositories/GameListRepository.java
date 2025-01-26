package com.arthwh.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthwh.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
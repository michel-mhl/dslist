package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entitties.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}

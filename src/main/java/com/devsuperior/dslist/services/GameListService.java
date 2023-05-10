package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entitties.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;


@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    private static final Logger LOGGER = Logger.getLogger(GameListService.class.getName());

    @Transactional(readOnly = true) // argumento para garantir que a transação seja feita no modo leitura e nao escrita
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}

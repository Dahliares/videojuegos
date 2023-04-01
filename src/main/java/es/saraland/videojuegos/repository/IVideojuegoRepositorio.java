package es.saraland.videojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.saraland.videojuegos.entities.Videojuego;
import org.springframework.data.repository.CrudRepository;

public interface IVideojuegoRepositorio extends CrudRepository<Videojuego, Long>{


}

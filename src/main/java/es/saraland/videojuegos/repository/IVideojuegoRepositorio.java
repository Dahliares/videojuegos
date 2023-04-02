package es.saraland.videojuegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.saraland.videojuegos.entities.Videojuego;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVideojuegoRepositorio extends JpaRepository<Videojuego, Long>{

    //@Query("SELECT j FROM juegos j WHERE j.nombre LIKE %?1%")
    //public List<Videojuego> fi

}

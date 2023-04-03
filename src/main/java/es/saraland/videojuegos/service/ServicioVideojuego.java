package es.saraland.videojuegos.service;

import es.saraland.videojuegos.entities.Videojuego;
import es.saraland.videojuegos.repository.IVideojuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioVideojuego{
    @Autowired
    private IVideojuegoRepositorio videojuegoRepositorio;

    public List<Videojuego> listAll(String clave) {
        if (clave != null) {
            return videojuegoRepositorio.findAll(clave);
        }
        return videojuegoRepositorio.findAll();

    }
    public void save(Videojuego videojuego){

        videojuegoRepositorio.save(videojuego);
    }

    public Videojuego getJuego(Long id){
        return videojuegoRepositorio.findById(id).get();
    }

    public void delete(Long id){

        videojuegoRepositorio.deleteById(id);

    }

}

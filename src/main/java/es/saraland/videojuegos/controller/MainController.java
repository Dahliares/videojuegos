package es.saraland.videojuegos.controller;

import es.saraland.videojuegos.entities.Videojuego;
import es.saraland.videojuegos.service.ServicioVideojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ServicioVideojuego servicioVideojuego;

    @GetMapping(path = {"/","index"})
        public String index(Model modelo){

        List<Videojuego> listaVideojuegos = servicioVideojuego.listAll();

        modelo.addAttribute("listaVideojuegos",listaVideojuegos);
        return "index";
        }


    }



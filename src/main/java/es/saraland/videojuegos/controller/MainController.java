package es.saraland.videojuegos.controller;

import es.saraland.videojuegos.entities.Videojuego;
import es.saraland.videojuegos.service.ServicioVideojuego;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ServicioVideojuego servicioVideojuego;

    @GetMapping(path = {"/","index"})
        public String index(Model modelo, @Param("consola") String consola){

        List<Videojuego> listaVideojuegos = servicioVideojuego.listAll(consola);
        modelo.addAttribute("consola",consola);
        modelo.addAttribute("listaVideojuegos",listaVideojuegos);
        return "index";
        }


    @GetMapping("/add")
    public String add(Model modelo){

       Videojuego juego = new Videojuego();

        modelo.addAttribute("juego",juego);
        return "add";
    }


    @PostMapping("/save")
    public String save(@ModelAttribute("juego") Videojuego juego){

        System.out.println(juego.getImg());

        servicioVideojuego.save(juego);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public ModelAndView update(@PathVariable(name="id") Long id){
    ModelAndView modelo = new ModelAndView("/update");
        Videojuego juego = servicioVideojuego.getJuego(id);

        modelo.addObject("juego",juego);

        return modelo;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name="id") Long id){

        servicioVideojuego.delete(id);



        return "redirect:/";
    }

    @GetMapping("/info/{id}")
    public ModelAndView info(@PathVariable(name="id") Long id){
        ModelAndView modelo = new ModelAndView("/info");
        Videojuego juego = servicioVideojuego.getJuego(id);

        modelo.addObject("juego",juego);

        return modelo;
    }
}



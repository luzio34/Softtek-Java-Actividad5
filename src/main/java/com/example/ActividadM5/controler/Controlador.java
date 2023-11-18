
package com.example.ActividadM5.controler;


import org.springframework.ui.Model;
import com.example.ActividadM5.modelo.Tarea;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.ActividadM5.interfaceService.ITareaService;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private ITareaService service;
    
    //Creamos el metodo para listar
    @GetMapping("/")
    public String listar(Model model){
        List<Tarea>tareas=service.listar();
        model.addAttribute("tareas", tareas);
        return "index";
    }
    
    //Creamos el metodo para agregar new
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("tarea", new Tarea());
        return "form";
    }
    
    @PostMapping("/save")
    public String save(@Valid Tarea p, Model model){
        service.save(p);
        return "redirect:/";
    }
    
    //Funcionalidad para editar
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        //Optional<Tarea>tarea = service.listarId(id);
        //model.addAttribute("tarea", tarea);
        
        Optional<Tarea> optionalTarea = service.listarId(id);
        Tarea tarea = optionalTarea.get();
        
        model.addAttribute("tarea", tarea);
        
        return "form";        
    }
    
    //Funcionalidad para eliminar
    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/";
    }
    
    
    
    
    
}

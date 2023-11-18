
package com.example.ActividadM5.interfaceService;

import com.example.ActividadM5.modelo.Tarea;
import java.util.List;
import java.util.Optional;


public interface ITareaService {
    
    public List<Tarea>listar();
    
    public Optional<Tarea>listarId(int id);
    
    public int save(Tarea p);
    
    public void delete(int id);
    }
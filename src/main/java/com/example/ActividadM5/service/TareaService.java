
package com.example.ActividadM5.service;

import com.example.ActividadM5.interfaceService.ITareaService;
import com.example.ActividadM5.interfaces.ITarea;
import com.example.ActividadM5.modelo.Tarea;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TareaService implements ITareaService {

    @Autowired
    private ITarea data;
    
    @Override
    public List<Tarea> listar() {
        return (List<Tarea>) data.findAll();
    }

    @Override
    public Optional<Tarea> listarId(int id) {
        return data.findAllById(id); 
    }

    @Override
    public int save(Tarea p) {
        int res=0;
        Tarea tarea = data.save(p);
        if (!tarea.equals(null)){
            
        }
            
        return res; 
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
    
    
}

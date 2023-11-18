
package com.example.ActividadM5.modelo;

import jakarta.persistence.*;

@Entity //Establecemos que esta clase es la entidad principal
@Table(name="tareas") //Nos va a crear la tabla con el atributo tarea
public class Tarea {
    
    //Con esto hacemos referencia de que esto es el id de la tabla tarea
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //Establecemos atributos que va a manejar nuestra app
    
    private int id;
    private String nombre;
    private String descripcion;
    
    public Tarea (){}

    public Tarea(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

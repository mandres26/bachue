package com.modelo;
// Generated 27/08/2011 09:10:57 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Institucion generated by hbm2java
 */
public class Institucion  implements java.io.Serializable {


     private int codigo;
     private String nit;
     private String nombre;
     private String direccion;
     private String telefono;
     private String ciudad;
     private Character estado;
     private String correoElectronico;
     private Set<RolPersona> rolPersonas = new HashSet<RolPersona>(0);
     private Set<Sede> sedes = new HashSet<Sede>(0);

    public Institucion() {
    }

	
    public Institucion(int codigo, String nit, String nombre, String direccion, String telefono, String ciudad) {
        this.codigo = codigo;
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }
    public Institucion(int codigo, String nit, String nombre, String direccion, String telefono, String ciudad, Character estado, String correoElectronico, Set<RolPersona> rolPersonas, Set<Sede> sedes) {
       this.codigo = codigo;
       this.nit = nit;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.ciudad = ciudad;
       this.estado = estado;
       this.correoElectronico = correoElectronico;
       this.rolPersonas = rolPersonas;
       this.sedes = sedes;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Set<RolPersona> getRolPersonas() {
        return this.rolPersonas;
    }
    
    public void setRolPersonas(Set<RolPersona> rolPersonas) {
        this.rolPersonas = rolPersonas;
    }
    public Set<Sede> getSedes() {
        return this.sedes;
    }
    
    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }




}


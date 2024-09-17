package com.example.demo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "TRATAMIENTO_TABLE")
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fecha;
    private int cantidad_mascotas;
    private float precio;

    @ManyToOne  // Relación con Mascota
    private Mascota mascota;

    @ManyToOne // Relación con veterinario
    private Veterinario veterinario;

    @ManyToMany //Relación con medicamentos
    private List<Medicamento> medicamentos = new ArrayList<>();
    
    //Constructor Vacio
    public Tratamiento() {
    
    }

    //Constructor
    public Tratamiento(Integer id, Date fecha, int cantidad_mascotas, float precio, Mascota mascota, Veterinario veterinario, List<Medicamento> medicamentos) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad_mascotas = cantidad_mascotas;
        this.precio = precio;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.medicamentos = medicamentos;
    }

    //Constructor sin ID
    public Tratamiento(Date fecha, int cantidad_mascotas, float precio, Mascota mascota, Veterinario veterinario, List<Medicamento> medicamentos) {
        this.fecha = fecha;
        this.cantidad_mascotas = cantidad_mascotas;
        this.precio = precio;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.medicamentos = medicamentos;
    }

    
    //Getter and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad_mascotas() {
        return cantidad_mascotas;
    }

    public void setCantidad_mascotas(int cantidad_mascotas) {
        this.cantidad_mascotas = cantidad_mascotas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

}

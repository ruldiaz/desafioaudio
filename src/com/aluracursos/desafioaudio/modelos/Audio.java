package com.aluracursos.desafioaudio.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones = 0;
    private int totalDeMeGusta = 0;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproducir(){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getMeGusta() {
        return totalDeMeGusta;
    }

    public void setMeGusta(int meGusta) {
        this.totalDeMeGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }




}

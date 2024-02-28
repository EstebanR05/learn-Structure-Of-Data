package com.esteban.academico;

public class Estudiante {

    private Integer codigo;
    private String nombre;
    private String apellidos;
    private String semestres;
    private String programas;

    public Estudiante(Integer codigo, String nombre, String apellidos, String semestres, String programas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.semestres = semestres;
        this.programas = programas;
    }

    public Estudiante() {
        this.codigo = 0;
        this.nombre = "";
        this.apellidos = "";
        this.semestres = "";
        this.programas = "";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSemestres() {
        return semestres;
    }

    public void setSemestres(String semestres) {
        this.semestres = semestres;
    }

    public String getProgramas() {
        return programas;
    }

    public void setProgramas(String programas) {
        this.programas = programas;
    }

    @Override
    public String toString() {
        return "Estudiante: "
                + " con codigo = " + codigo
                + ", nombre = " + nombre
                + ", apellidos = " + apellidos
                + ", semestres = " + semestres
                + ", programas = " + programas;
    }

}

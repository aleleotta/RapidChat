package com.example.rapidchat.entities;

public class Usuario {
    private int numeroTelefono = 0;
    private String nombre = "";
    private String apellidos = "";

    public Usuario(int numeroTelefono, String nombre, String apellidos) {
        String strNumeroTelefono = numeroTelefono + "";
        if (strNumeroTelefono.length() == 9) {
            this.numeroTelefono = numeroTelefono;
        }
        if (!nombre.equals("") && nombre != null) {
            this.nombre = nombre;
        }
        if (!apellidos.equals("") && apellidos != null) {
            this.nombre = apellidos;
        }
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        String strNumeroTelefono = numeroTelefono + "";
        if (strNumeroTelefono.length() == 9) {
            this.numeroTelefono = numeroTelefono;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.equals("") && nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (!apellidos.equals("") && apellidos != null) {
            this.nombre = apellidos;
        }
    }

}

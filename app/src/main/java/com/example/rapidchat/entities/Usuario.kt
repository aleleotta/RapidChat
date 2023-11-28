package com.example.rapidchat.entities

class Usuario(numeroTelefono: Int, nombre: String?, apellidos: String?) {
    private var numeroTelefono = 0
    private var nombre = ""
    private var apellidos = ""

    init {
        if (numeroTelefono.toString().length == 9) {
            this.numeroTelefono = numeroTelefono
        }
        if (nombre != "" && nombre != null) {
            this.nombre = nombre
        }
        if (apellidos != "" && apellidos != null) {
            this.nombre = apellidos
        }
    }

    fun getNumeroTelefono(): Int {
        return numeroTelefono
    }

    fun setNumeroTelefono(numeroTelefono: Int) {
        if (numeroTelefono.toString().length == 9) {
            this.numeroTelefono = numeroTelefono
        }
    }

    fun getNombre(): String {
        return nombre
    }

    fun setNombre(nombre: String?) {
        if (nombre != "" && nombre != null) {
            this.nombre = nombre
        }
    }

    fun getApellidos(): String {
        return apellidos
    }

    fun setApellidos(apellidos: String?) {
        if (apellidos != "" && apellidos != null) {
            this.apellidos = apellidos
        }
    }

}
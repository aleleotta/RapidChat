package com.example.rapidchat.entities

import java.sql.Timestamp

class Message(
    id: Int,
    numSender: Int,
    numReceiver: Int,
    statusNum: Int,
    timestamp: Timestamp?,
    mensaje: String?
) {
    private var id = 0
    private var numSender = 0
    private var numReceiver = 0
    private var statusNum = 0
    private var timestamp: Timestamp? = null
    private var mensaje = ""

    init {
        if (id > 0) {
            this.id = id
        }
        val strNumSender = numSender.toString() + ""
        if (strNumSender.length == 9) {
            this.numSender = numSender
        }
        val strNumReceiver = numReceiver.toString() + ""
        if (strNumReceiver.length == 9) {
            this.numReceiver = numReceiver
        }
        if (statusNum == 1 || statusNum == 2 || statusNum == 3) {
            this.statusNum = statusNum
        }
        if (timestamp != null && timestamp.time != 0L) {
            this.timestamp = timestamp
        }
        if (mensaje != "" && mensaje != null) {
            this.mensaje = mensaje
        }
    }

    fun getStatusNum(): Int {
        return statusNum
    }

    fun setStatusNum(statusNum: Int) {
        if (statusNum == 1 || statusNum == 2 || statusNum == 3) {
            this.statusNum = statusNum
        }
    }

    fun getMensaje(): String {
        return mensaje
    }

    fun setMensaje(mensaje: String?) {
        if (mensaje != "" && mensaje != null) {
            this.mensaje = mensaje
        }
    }
}
package com.example.rapidchat.entities;

import java.sql.Timestamp;

public class Message {

    private int id = 0;
    private int numSender = 0;
    private int numReceiver = 0;
    private int statusNum = 0;
    private Timestamp timestamp;
    private String mensaje = "";

    public Message(int id, int numSender, int numReceiver, int statusNum, Timestamp timestamp, String mensaje) {
        if (id > 0) {
            this.id = id;
        }
        String strNumSender = numSender + "";
        if (strNumSender.length() == 9) {
            this.numSender = numSender;
        }
        String strNumReceiver = numReceiver + "";
        if (strNumReceiver.length() == 9) {
            this.numReceiver = numReceiver;
        }
        if (statusNum == 1 || statusNum == 2 || statusNum == 3) {
            this.statusNum = statusNum;
        }
        if (timestamp != null && timestamp.getTime() != 0) {
            this.timestamp = timestamp;
        }
        if (!mensaje.equals("") && mensaje != null) {
            this.mensaje = mensaje;
        }
    }

    public int getId() {
        return id;
    }

    public int getNumSender() {
        return numSender;
    }

    public int getNumReceiver() {
        return numReceiver;
    }

    public int getStatusNum() {
        return statusNum;
    }

    public void setStatusNum(int statusNum) {
        if (statusNum == 1 || statusNum == 2 || statusNum == 3) {
            this.statusNum = statusNum;
        }
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        if (!mensaje.equals("") && mensaje != null) {
            this.mensaje = mensaje;
        }
    }

}

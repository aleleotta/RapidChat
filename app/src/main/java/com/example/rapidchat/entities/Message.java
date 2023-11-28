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
        this.id = id;
        this.numSender = numSender;
        this.numReceiver = numReceiver;
        this.statusNum = statusNum;
        this.timestamp = timestamp;
        this.mensaje = mensaje;
    }

}

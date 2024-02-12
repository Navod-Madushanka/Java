/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Navod Madusanka
 */
public class Mail implements Comparable<Mail>{
    private String to;
    private String from;
    private String subject;
    private String body;

    public Mail() {
    }

    public Mail(String to, String from, String subject, String body) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return 
                "To: "+this.to+
                "From: "+this.from+
                "Subject: "+this.subject+
                "Body: "+this.body;
    }

    @Override
    public int compareTo(Mail o) {
        return 0;
    }
    
}

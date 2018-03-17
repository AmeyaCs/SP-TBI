package com.sahil.sp_tbi;

/**
 * Created by SAHIL on 01-Jul-17.
 */

public class data {

    private String Contact,Email,Founder;

    public data(){

    }

    public data(String contact, String email, String founder) {
        Contact = contact;
        Email = email;
        Founder = founder;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFounder() {
        return Founder;
    }

    public void setFounder(String founder) {
        Founder = founder;
    }
}

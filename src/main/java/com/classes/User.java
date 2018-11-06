package com.classes;

public class User {
    public int id;
    public String login;
    public String password;
    public String mail;
    public boolean isAdmin;
    public boolean isPremium;


   public User (int id, String login, String password, String mail, boolean isAdmin, boolean isPremium){
        super();
        this.id = id;
        this.login = login;
        this.password = password;
        this.mail = mail;
        this.isAdmin = isAdmin;
        this.isPremium = isPremium;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    void createUser(int id, String login, String password, String mail, boolean isAdmin, boolean isPremium){

    }

    @Override
    public String toString() {
        return "User [id=" + id + "name=" + login + ", password=" + password + ", mail=" + mail + ", isPremium= " + isPremium + ", isAdmin=" + isAdmin + "]";
    }
}

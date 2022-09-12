package com.example.demoGame.entity;

public class Player {
    private String login;
    private String password;




    public String name;
    public int win;
    public int lose;
    public int draw;

    public Player(String login, String password, String name, int win, int lose, int draw) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public Player(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

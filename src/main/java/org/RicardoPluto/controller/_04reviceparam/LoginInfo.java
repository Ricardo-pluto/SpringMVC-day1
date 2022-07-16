package org.RicardoPluto.controller._04reviceparam;

public class LoginInfo {
    private String name;
    private String password;

    @Override
    public String toString() {
        return "LoginInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

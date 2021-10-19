package com.radio.mvvmdemo;

import androidx.annotation.Nullable;

public class Modal {
    public Modal(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Nullable
    private String email,password;

}

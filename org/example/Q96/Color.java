package org.example.Q96;

import java.io.Serializable;

public enum Color implements Serializable {
    R(1), G(2), B(3);
    private int c;

    private Color(int c){
        this.c = c;
    }
}

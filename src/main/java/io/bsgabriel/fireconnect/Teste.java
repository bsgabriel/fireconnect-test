package io.bsgabriel.fireconnect;

import javax.swing.*;
import java.util.HashMap;

public class Teste {

    public static void main(String[] args) {
        var m = new HashMap<String, Object>();
        m.put("a", 1);
        m.put("b", "a");
        m.put("c", new JLabel("asd"));

        System.out.println(m.toString());
    }
}

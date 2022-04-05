package com.dzaton.Funcional.SomeJavaInterfaces;

import javax.swing.*;
import java.awt.*;

public class WorkingWithActionListener {

    public static void main(String[] args) {
        actionListenerExample();
    }

    private static void actionListenerExample()
    {
        var frame = new JFrame();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        var btn = new JButton("EXIT");
        btn.setSize(frame.getSize());

        btn.addActionListener(event -> {
            out();
        });

        frame.getContentPane().add(btn);
        frame.setVisible(true);
    }

    private static void out() {
        System.out.println("Saliendo...");
        System.exit(0);
    }
}

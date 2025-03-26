package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;     //declare
    private JLabel clockLebel;
    private Font font = new Font("", Font.BOLD, 35);

    MyWindow() {               //contructor call
        super.setTitle("My clock");      //call,super lgaoo ya mt lgaoo
        super.setSize(400, 400);
        super.setLocation(300, 50);
        this.createGUI();        //call kia h createGUI method ko
        this.startClock();      //call kia startclock method ko
        super.setVisible(true);
    }

    public void createGUI() {
        heading = new JLabel("My clock");
        clockLebel = new JLabel("clock");
        heading.setFont(font);
        clockLebel.setFont(font);

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLebel);
    }

    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String dateTime=new Date().toString();
                //String dateTime=new Date().toLocaleString();    //AM,PM ke liee
                Date d = new Date();
                SimpleDateFormat sfd = new SimpleDateFormat("hh:mm:ss a");
                String dateTime = sfd.format(d);

                clockLebel.setText(dateTime);
            }
        });

        timer.start();


    }
}

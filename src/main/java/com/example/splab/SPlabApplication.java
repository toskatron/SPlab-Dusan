package com.example.splab;

import module.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import proxy.ImageProxy;
import strategy.AlignCenter;
import strategy.AlignLeft;
import strategy.AlignRight;


@SpringBootApplication
public class SPlabApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SPlabApplication.class, args);
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);

        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();

        // Set different alignment strategies
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();

    }

}

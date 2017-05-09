package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, FileNotFoundException {

        Clothing myCloth = new Shirt("Shirt", 250);

        myCloth.wash("Masha");
        
        Clothing[] clothes = {
                new Shirt("S1", 26),
                new Shirt("S2", 22),
                new Shirt("S3", 27),
                new Shirt("S4", 21),
                new Trousers("T1", 250),
                new Trousers("T2", 240),
                new Trousers("T3", 245),
        };

        for (Clothing clothing: clothes) {
            clothing.wash("Masha");
        }

        System.out.println(myCloth.doReturn());

        Scanner sc = new Scanner(new File("config"));
        String type = sc.nextLine();

        List<String> sList = (List) Class.forName(type).newInstance();

        System.out.println(sList.getClass().getName());
        sList.add("Hello");
        sList.add("Friend!");
        System.out.println(sList.toString());

        Loundry loundry = new Loundry();

        loundry.clean(myCloth);

        Arrays.sort(clothes);

        for (Clothing cloth: clothes) {
            System.out.println(cloth);

        }
    }
}


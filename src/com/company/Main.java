package com.company;

public class Main {

    public static void main(String[] args) {
        String people[] = new String[3];
        people[0] = "Света";
        people[1] = "Вика";
        people[2] = "Вероника";

        for (String a : people) {

            switch (a) {
                case "Света":
                    System.out.println("Доброе утро" + "," + a + "!");
                    break;
                case "Вика":
                    System.out.println("Добрый день" + "," + a + "!");
                    break;
                case "Вероника":
                    System.out.println("Добрый вечер" + "," + a + "!");
                    break;
            }
        }
    }
}







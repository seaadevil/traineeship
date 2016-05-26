/*1.
        8 цепей по 6 звеньев = 48 звеньев
        Берем одну цепь и разъединяем каждое звено
        Остаётся 7 цепей по 6 звеньев  и 6 разъединённых звеньев
        Разъединёнными звеньями соединяем 7 цепей и у нас получается одна непрерывная цепь, состоящая из 48 звеньев

2.
        F = 10^15 -->>  10^16 - число после F

3.*/
package com;


public class Test {


    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
                System.out.println(" -- ");
            } else {


                if (i % 3 == 0) {
                    System.out.println("Fizz" + "  " + i);
                    System.out.println(" -- ");
                }
                if (i % 5 == 0) {
                    System.out.println("Bazz" + "  " + i);
                    System.out.println(" -- ");
                }

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBazz" + "  " + i);
                    System.out.println(" -- ");
                }


            }
        }
    }
}

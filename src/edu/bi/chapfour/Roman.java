package edu.bi.chapfour;

import java.util.*;

public class Roman {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("How long is your number? ");
        int length = console.nextInt();
        System.out.print("what is your number? ");
        int number = console.nextInt();

        public static void printNumber() {
            //produces first number in length
            if (length = 3) {
                if (length.charAt(0) = 1) {
                    System.out.print("C");
                } else if (length.charAt(0) = 2) {
                    System.out.print("CC");
                } else if (length.charAt(0) = 3) {
                    System.out.print("CCC");
                } else if (length.charAt(0) = 4) {
                    System.out.print("CD");
                } else if (length.charAt(0) = 5) {
                    System.out.print("D");
                } else if (length.charAt(0) = 6) {
                    System.out.print("DC");
                } else if (length.charAt(0) = 7) {
                    System.out.print("DCC");
                } else if (length.charAt(0) = 8) {
                    System.out.print("DCC");
                } else if (length.charAt(0) = 9) {
                    System.out.print("CM");
                }
            } else if (length = 2) {
                if (length.charAt(0) = 1) {
                    System.out.print("X");
                } else if (length.charAt(0) = 2) {
                    System.out.print("XX");
                } else if (length.charAt(0) = 3) {
                    System.out.print("XXX");
                } else if (length.charAt(0) = 4) {
                    System.out.print("XL");
                } else if (length.charAt(0) = 5) {
                    System.out.print("L");
                } else if (length.charAt(0) = 6) {
                    System.out.print("LX");
                } else if (length.charAt(0) = 7) {
                    System.out.print("LXX");
                } else if (length.charAt(0) = 8) {
                    System.out.print("LXXX");
                } else if (length.charAt(0) = 9) {
                    System.out.print("XC");
                }
            } else if (length = 1) {
                if (length.charAt(0) = 1) {
                    System.out.print("I");
                } else if (length.charAt(0) = 2) {
                    System.out.print("II");
                } else if (length.charAt(0) = 3) {
                    System.out.print("III");
                } else if (length.charAt(0) = 4) {
                    System.out.print("IV");
                } else if (length.charAt(0) = 5) {
                    System.out.print("V");
                } else if (length.charAt(0) = 6) {
                    System.out.print("VI");
                } else if (length.charAt(0) = 7) {
                    System.out.print("VII");
                } else if (length.charAt(0) = 8) {
                    System.out.print("VIII");
                } else if (length.charAt(0) = 9) {
                    System.out.print("IX");
                }
            }

            //produces second number in length
            if (length = 3) {
                if (length.charAt(1) = 1) {
                    System.out.print("X");
                } else if (length.charAt(1) = 2) {
                    System.out.print("XX");
                } else if (length.charAt(1) = 3) {
                    System.out.print("XXX");
                } else if (length.charAt(1) = 4) {
                    System.out.print("XL");
                } else if (length.charAt(1) = 5) {
                    System.out.print("L");
                } else if (length.charAt(1) = 6) {
                    System.out.print("LX");
                } else if (length.charAt(1) = 7) {
                    System.out.print("LXX");
                } else if (length.charAt(1) = 8) {
                    System.out.print("LXXX");
                } else if (length.charAt(1) = 9) {
                    System.out.print("XC");
                }
            } else if (length = 2) {
                if (length.charAt(1) = 1) {
                    System.out.print("I");
                } else if (length.charAt(1) = 2) {
                    System.out.print("II");
                } else if (length.charAt(1) = 3) {
                    System.out.print("III");
                } else if (length.charAt(1) = 4) {
                    System.out.print("IV");
                } else if (length.charAt(1) = 5) {
                    System.out.print("V");
                } else if (length.charAt(1) = 6) {
                    System.out.print("VI");
                } else if (length.charAt(1) = 7) {
                    System.out.print("VII");
                } else if (length.charAt(1) = 8) {
                    System.out.print("VIII");
                } else if (length.charAt(1) = 9) {
                    System.out.print("IX");
                }
            }

            //produces third number in length
            if (length = 3_ {
                if (length.charAt(2) = 1) {
                    System.out.print("I");
                } else if (length.charAt(2) = 2) {
                    System.out.print("II");
                } else if (length.charAt(2) = 3) {
                    System.out.print("III");
                } else if (length.charAt(2) = 4) {
                    System.out.print("IV");
                } else if (length.charAt(2) = 5) {
                    System.out.print("V");
                } else if (length.charAt(2) = 6) {
                    System.out.print("VI");
                } else if (length.charAt(2) = 7) {
                    System.out.print("VII");
                } else if (length.charAt(2) = 8) {
                    System.out.print("VIII");
                } else if (length.charAt(2) = 9) {
                    System.out.print("IX");
            }


    public static void giveIntro() {
        System.out.print("This program produces a roman numeral.");
        System.out.print("The number can be up to 3 digits long.");
    }
}
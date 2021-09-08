package com.company;

public class Main {

    public static void main(String[] args) {                    //1
        int bizz = 5;                                           //2
        int buzz = 2;                                           //3
        zoop("just for", bizz);                            //4
        clink(2 * buzz);                                    //11
    }                                                           //20

    public static void zoop(String fred, int bob) {             //5             //15
        System.out.println(fred);                               //6             //16
        if (bob == 5) {                                         //7             //17
            ping("not ");                            //8
        } else {                                                                //18
            System.out.println("!");                                            //19
        }
    }

    public static void clink(int fork) {                        //12
        System.out.print("It's ");                              //13
        zoop("breakfast ", fork);                          //14
    }

    public static void ping(String strangStrung) {              //9
        System.out.println("any " + strangStrung + "more ");    //10
    }

}

/*
just for
any not more
It's
Hertil vil programmet være nået 2. gang zoop træder i kræft.
2. gang den bruger zoop, bliver den brugt fra clink. Den går til clink med værdierne String=breakfast og int=2*2.

Complete output:
just for
any not more
It's breakfast !
*/

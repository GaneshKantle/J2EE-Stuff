package com.basics;

public class Dcl {

    String name;
    int age;
    static String company = "DCL";
    static double height = 5.8;

    {
        System.out.println("non-static\n");
    }

    static {
        System.out.println("this is static\n");
    }

    // 1 param constructor
    Dcl(String nameParam) {
        name = nameParam;
        System.out.println("This is 1 Param Constructor: ");
    }

    // 2 param constructor
    Dcl(String nameParam, int ageParam) {
        String nickName = "Gani";
        int ageOfGani = 22;

        name = "Ganesh Kantle";
        age = 21;

        System.out.println("This is two param constructors");
        System.out.println("These are local variables: " + nickName + "," + ageOfGani);
    }

    // 3 param constructor
    Dcl(String nameParam, String companyParam, double heightParam) {
        name = "Ganesh";
        Dcl.company = companyParam;
        Dcl.height = heightParam;

        System.out.println("These are three params:");
    }

    public static void main(String args[]) {

        Dcl d1 = new Dcl("Heyy man");
        System.out.println(d1.name);

        System.out.println("....................................");

        Dcl d2 = new Dcl("Classyy", 21);
        System.out.println("These are instance var " + d2.name + "," + d2.age);

        System.out.println("....................................");

        Dcl d3 = new Dcl("Ganesh Kantle", "Dhee Coding Lab", 5.7);
        System.out.println(d3.name + ", " + Dcl.company + ", " + Dcl.height);
    }
}
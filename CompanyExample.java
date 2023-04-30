
/* Copyright (C) 2023 Ashkan Eghbal - All Rights Reserved
 * You may use, distribute and modify this code when your permission request is accepted by the code owner (Ashkan EGhbal)
 * To request for permission send an email to aeghbal@uci.edu with the following title: : java-programming repo permission request"
 * Add where and why do you need repo for.
 */

class Company {
    String name;

    // no-Arg constructor
    public Company() {
        name = "Ashkan";
    }

    // Parametrized constructor
    public Company(String comp_name) {
        name = comp_name;
    }
}


class CompanyExample {
    public static void main(String[] args) {

        // object is created in another class
        Company obj1 = new Company();
        Company obj2 = new Company("Ashkan_lab");
                System.out.println("Company-1 name =  "+ obj1.name);
                        System.out.println("Company-2 name = " + obj2.name);
    }
}


package com.homeworkScanner.java;


import java.util.Scanner;

public class studentA {
    public static void main(String[] args) {

        //String name="Fazlu";

        int pw=12345;  ///database password
        int totalbalance,deposit,withdrow;


        Scanner Obj = new Scanner(System.in);
        // Scanner Obj = new Scanner();

        System.out.println("Enter your password");
        int password =Obj.nextInt();

        System.out.println(password);

        if(password==pw) {
            System.out.println("you enter correct password");

            System.out.println("Enter your total balance");
            totalbalance=Obj.nextInt();
            System.out.println("your total balance="+totalbalance);


            System.out.println("Enter your deposit amount");
            deposit=Obj.nextInt();
            System.out.println("your deposit amount="+deposit);
            totalbalance=totalbalance+deposit;
            System.out.println("After deposit your total balance="+totalbalance);


            System.out.println("Enter your withdrow amount");
            withdrow=Obj.nextInt();
            System.out.println("you withdrow="+withdrow);
            totalbalance=totalbalance-withdrow;
            System.out.println("After withdrow your total balance="+totalbalance);


        }

        else{

            System.out.println("you enter wrong password");
        }




    }


}

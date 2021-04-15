package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner a= new Scanner(System.in);

        double x = a.nextDouble();


        if ( x>=5){

            double y;
            int k =2;
            y= (Math.pow(x,k)-10)/ (x+7);
            System.out.println(y);

        }

        else if (-3<x && x<5){

            double y;
            y= (x+3)*(Math.pow(x,2)-2);
            System.out.println(y);

        }
        else {

            double y;
            y=420;
            System.out.println(y);

        }


    }
}

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int k; //length of array
        double income; double income10;
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        //length of array
        System.out.println("How many familes are there?");
        k = scan.nextInt();

        //initalize array
        double [] myArray = new double[k];

        //add values to array
        for(int a = 0; a < myArray.length; a++)
        {
            System.out.println("Enter in an income for each family");
            myArray[a] = scan.nextDouble();
        }

        //find max of array
        double max = myArray[0];
        for(int b = 0; b < myArray.length; b++)
        {
            if(myArray[b] > max)
            {
                max = myArray[b];
            }
        }
        System.out.println("Max Value in the array is " + max);

        //find min of array
        double min = myArray[0];
        {
            for(int c = 0; c < myArray.length; c++)
            {
                if(myArray[c] < min)
                {
                    min = myArray[c];
                }
            }
            System.out.println("Min value in the array is " + min);
        }

        //find familes that make less then 10% of maximum
        income10 = max / 10;
        for (int d = 0; d < myArray.length; d++)
        {
            if(myArray[d] < income10)
            {
                counter++;
                System.out.println("The amount the family made that was below 10 percent of maximum income was " + myArray[d]);
            }
        }
        System.out.println("The amount of familys with less than 10$ of maximum income is " + counter);
    }
}

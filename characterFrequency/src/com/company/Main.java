package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int phoneNumberArrayIndex = 0;
        char [] phoneNumberArray = new char[10];
        String phoneNumber;
        Scanner scan = new Scanner(System.in);

        //Prompt for phone phoneNumber
        System.out.println("Please enter a 10 digit phone number");
        phoneNumber = scan.nextLine();
        for(int i = 0; i < phoneNumber.length(); i++)
        {
            if(phoneNumber.charAt(i) >=  (char) 48 && phoneNumber.charAt(i) <= (char) 57)
            {
                phoneNumberArray[phoneNumberArrayIndex++] = phoneNumber.charAt(i);
            }
        }

        int[] counter = new int [10];
        for(int i = 0; i < counter.length; i++)
        {
            counter[i] = 0;
        }
        for(int i = 0; i < phoneNumberArray.length; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(phoneNumberArray[i] == (char) (j + 48))
                {
                    counter[j]++;
                }
            }
        }
        for(int i = 0; i < phoneNumberArray.length; i++)
        {
            System.out.println(i + " - " + counter[i]);
        }
    }
}

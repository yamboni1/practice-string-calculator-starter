package com.tw;

public class StringCalculator {
       public int add(String string) {
        int sum = 0;
        String[] splitInt = string.split("");
        int[] numbers = new int[splitInt.length]; // gets the length of the string array

        for (int i = 0; i < splitInt.length; i++){
           
            numbers[i] = Integer.parseInt(splitInt[i]);
        }
        for(int j = 0; j < numbers.length; j++)
        {
            System.out.println(numbers[j]);
            sum = sum + numbers[j];

        }
        return sum;
        
    }
}

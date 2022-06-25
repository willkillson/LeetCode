package com.will;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for(int i = 0;i< arr.size();i++){
            int n = arr.get(i);
            if(n>0){
                posCount++;
            }else if(n==0){
                zeroCount++;
            }else{
                negCount++;
            }
        }
        System.out.printf("%.5f\n", (float)posCount/arr.size());
        System.out.printf("%.5f\n", (float)negCount/arr.size());
        System.out.printf("%.5f\n", (float)zeroCount/arr.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(-4);
        l.add(3);
        l.add(-9);
        l.add(0);
        l.add(4);
        l.add(1);
        plusMinus(l);

        String data = "This is a line of text inside the string.";



        try {
            // Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            // Writes data to the output stream
            out.write(array);

            // Retrieves data from the output stream in string format
            String streamData = out.toString();
            System.out.println("Output stream: " + streamData);

            out.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}



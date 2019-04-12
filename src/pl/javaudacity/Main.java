package pl.javaudacity;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = {1,42,3,19,6,8,3};
        System.out.println("Array is:"+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array is:"+ Arrays.toString(array));
    }

    public static void reverse(int [] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length/2;

        for (int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }

}

package task_3;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 8, 12};
        int swap = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = swap;
        System.out.println(Arrays.toString(array));
        System.out.println(array[0] + array[array.length/2]);
    }
}

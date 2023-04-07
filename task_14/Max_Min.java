package task_14;

public class Max_Min {

    static int find_max(int[] array){
        int result = array[0];
        for(int element : array){
            if (result < element) result = element;
        }
        return result;
    }
    static int find_min(int[] array){
        int result = array[0];
        for(int element : array){
            if (result > element) result = element;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = new int[15];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*40 - 20);
            System.out.println(array[i]);
        }
        int max = find_max(array);
        int min = find_min(array);
        System.out.println("max: " + max + " min: " + min);
        if (Math.abs(max) > Math.abs(min)) System.out.println("max по модулю: " + Math.abs(max));
        else System.out.println("max по модулю: " + Math.abs(min));
    }
}

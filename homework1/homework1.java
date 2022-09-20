public class homework1 {

    public static void main(String[] args) {
        
    }

    // Task 1

    public static void ariphmeticMethod() {
        int n = 10/0;  
    }

    public static void arrayMethod() {
        int [] array = new int [10];
        array [20] = 1;
    }

    public static void parseIntMethod() {
        int n = Integer.parseInt("10a6");    
    }
    // Task 3
    public static int[] arraySum(int[] array1, int[] array2) {
        
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины заданных массивов не равны");
        }
        int[] sum_array = new int[array1.length];
        for (int index = 0; index < array1.length; index++) {
            sum_array[index] = array1[index]+array2[index];
        }
        return sum_array;
        
    }
    // Task 4
    public static float[] arrayQuoit(int[] array1, int[] array2) {
        
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины заданных массивов не равны");
        }
        float[] quoit_array = new float[array1.length];
        for (int index = 0; index < array1.length; index++) {
            if (array2[index] ==0) {
               throw new RuntimeException("Элемент второго массива равен 0. На 0 делить нельзя!");
            }
            quoit_array[index] = array1[index]/array2[index];
        }
        return quoit_array;
    }    
}
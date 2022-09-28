import java.util.InputMismatchException;
import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        //System.out.println(transform());
        //int[] testArray = {1,2,3,4,5,6,7,8,9};
        //task2(testArray);
        //inputString();

        // Task 3
        
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1,2};
            abc[3] = 9;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            } 
            catch (NullPointerException ex) {  // При данных условиях эта обработка в принципе не нужна и этот cath можно удалить. 
                //В теории при изменении данных эта ошибка может всплыть, если массиву присвоить значение null. Но тогда и ArithmeticException
                // нужно, по-хорошему, обрабатывать, т.к. и переменной b можно присвоить значение 0. А с другой стороны все равно все неуказанные отдельно исключения
                // будут обработаны последним блоком catch. в общем, не зная конкретных условий использования программы, невозможно на 100% угадать, 
                // какие исключения обязательно стоит обрабатывать, а какие - нет.
                System.out.println("Указатель не может указывать на null!");
            } 
            catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            }
             
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    
    // Task 1
    public static float transform (){
        //boolean flag = true;
        while (true){
            System.out.println("Введите дробное число (через запятую!): ");
            Scanner in = new Scanner(System.in);
            try{
                float result = (float) in.nextDouble();
                return result;
            }catch (InputMismatchException e) {
                System.out.println("Вы ввели неверные данные. Попробуйте еще раз.");
            }   
        }
    }

    //Task 2 
    public static void task2(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
         }  
    }

    //Task 4
    public static String inputString() {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in); 
        String result = in.nextLine();
        if (result.equals("")) {
            throw new RuntimeException("Нельзя вводить пустую строку.");
        }  
        return result;   
    } 
}
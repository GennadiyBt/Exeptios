
public class homework3 {

    public static void main(String[] args) {
        String[][] arg = {{"1","2", "3","4a"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            System.out.println(sumArray(arg));
        } catch (MyArraySizeExeption e) {
            System.out.println("Размер массива не соответствует заданным параметрам");
        } catch (MyArrayDataExeption e){
            System.out.println(String.format("Во входном массиве на позиции: (%d,%d) находится некорректный элемент.",
            e.getI(), e.getJ()));
        }
    }
    
    public static int sumArray(String [][] dataArray) throws MyArraySizeExeption, MyArrayDataExeption {
        int sum = 0;
        if (dataArray.length != 4) {
            throw new MyArraySizeExeption();
        }
        else {
            for (int index = 0; index < dataArray.length; index++) {
                if (dataArray[index].length != 4) {
                    throw new MyArraySizeExeption();
                }
            }    
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                try {
                    sum += Integer.parseInt(dataArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption(i, j);
                }
            }
        }
        

        return sum;   
    }  
}
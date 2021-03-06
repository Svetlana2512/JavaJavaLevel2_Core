package Lesson2;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "2"}, {"4", "4", "4", "4"}
        };
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException a) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException a) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + a.i + "x" + a.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException a) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}

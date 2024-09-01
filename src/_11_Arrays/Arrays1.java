package _11_Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int num = 98;
        StringBuilder sb = new StringBuilder(("Hello"));
        int nums[] = new int[3];
        nums[0] = 10;
        nums[1] = 15;
        nums[2] = 20;
        System.out.println(nums); //[I@2a84aee7
        System.out.println(Arrays.toString(nums)); //[10, 15, 20]
        System.out.println(nums[1]); //15
        System.out.println(nums[0]); //10
        System.out.println(nums[2]); //20
        // index                0   1   2
        int nums2[] = new int[]{78, 12, 55};
        System.out.println(nums2[1]); //12
        System.out.println(Arrays.toString(nums2)); //[78, 12, 55]

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        // index                        0   1   2
        int nums3[] = new int[]{num1, num2, num3};
        // length                      0   2   3
        System.out.println(nums3.length);//3
        nums3[2] = 333;
        System.out.println(Arrays.toString(nums3));//333

        //  1     2    3    4    5
        String str = "Hello"; // ['H', 'e', 'l', 'l', 'o'];


        String colors[] = new String[]{"Green", "Pink", "red"};
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors);
        System.out.println(Arrays.toString(colors));//[Green, Pink, red]
        colors[2] = "Red";
        System.out.println(Arrays.toString(colors));//[Green, Pink, Red]
        colors[0] = "Blue";
        System.out.println(Arrays.toString(colors));//[Blue, Pink, Red]
        // System.out.println(colors[3]);
        //System.out.println(colors[4]);

        char[] symbols = new char[]{'K', '8', '#', 'd'};
        System.out.println(symbols);//K8#d
        System.out.println(Arrays.toString(symbols));//[K, 8, #, d]

        String str0 = Arrays.toString(symbols);

        // значение по умолчанию работает только с обьектами
        float[] prices = new float[4];
        System.out.println(prices[0]);//0.0
        System.out.println(prices[3]);//0.0
        System.out.println(Arrays.toString(prices));//[0.0, 0.0, 0.0, 0.0]

        long[] lnums1 = new long[]{123, 345, 456, 567};
        System.out.println(lnums1.length);
        long[] lnums2 = new long[4];
        lnums2[0] = 567;
        lnums2[3] = 201;
        System.out.println(Arrays.toString(lnums2));//[567, 0, 0, 201]

        String names[] = new String[]{"Jon", "Gery"};
        System.out.println(names[1]);//Gery

        String names1[] = new String[2];
        System.out.println(names1[1]);//null
        names1 [0] = "uri";
        names1 [1] = "badam";
        System.out.println(Arrays.toString(names1));//[uri, badam]



        // есть 3 способа создания массива
        int a [] = new int [3];
        int b [] = new int [] {1,2,3};
        int c [] = {123,123,123};


        int numbers [] = new int [5]; // cчитаем длину

        System.out.println(Arrays.toString(numbers));//[0, 0, 0, 0, 0]

        numbers[1]=78;

        System.out.println(Arrays.toString(numbers));//[0, 78, 0, 0, 0]

        System.out.println("-------------------------");

        for (int myNums : c) {
            // nyNums = 123;
            // myNums = 123;
            // myNums = 123;
            System.out.println(myNums);
            // 123
            // 123
            // 123
        }


        String [] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        Arrays.sort(seasons);
        System.out.println(Arrays.toString(seasons));
        System.out.println(seasons[3]);
        seasons[2]="0";
        System.out.println(Arrays.toString(seasons));

        // циклический вывод массива:
        for (int i = 0; i < seasons.length; i ++) {
            System.out.print(seasons[i]+" ");
        }
        //Полезные методы для работы с массивами

        //Сортировка
        /*Метод void sort(int[] myArray, int fromIndex,
        int toIndex) сортирует массив целых чисел или
        его под массив по возрастанию.*/

        Arrays.sort(seasons); //Сортировка массива

        //Поиск в массиве нужного элемента
        /*int binarySearch(int[] myArray, int fromIndex,
        int toIndex, int key). Этот метод ищет элемент
        key в уже отсортированном массиве myArray
        или под массиве, начиная с fromIndex и до
        toIndex. Если элемент найден, метод возвращает
        его индекс, если нет - (-fromIndex)-1.*/
        System.out.println( Arrays.binarySearch(seasons, 0,1, "Winter"));


        //Пример на sort, binarySearch и toString

        int[] array = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив
        System.out.println(array);//пытаемся вывести наш массив на экран без метода toString - получаем 16-ричное число
        System.out.println(Arrays.toString(array));//печатаем массив "правильно"
        Arrays.sort(array, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
        System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
        int key = Arrays.binarySearch(array, 5); // ищем key - число 5 в отсортированном массиве.
        //метод binarySearch выдаст индекс элемента отсортированного массива, в котором "спрятано" искомое число
        System.out.println(key);//распечатываем индекс искомого числа
        System.out.println(Arrays.binarySearch(array, 0));//а теперь попробуем найти число, которого в массиве нет,
        // и сразу же выведем результат на экран

        int two = array[2];
        System.out.println(two);


        //  сортировка без метода sort

        int[] numbers1 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        for (int i = numbers1.length-1; i >0; i --) {
            for (int j = 0; j < i; j++) {
                if (numbers1[j]>numbers1[j+1]) {
                    int tmp = numbers1[j];
                    numbers1 [j] = numbers1 [j+1];
                    numbers1 [j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers1));






    }

}

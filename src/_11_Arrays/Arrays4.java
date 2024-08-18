package _11_Arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {


        //            0   1   2   3
        int nums[] = {12, 45, 94, 72};
        System.out.println(nums[2]); //94
        System.out.println(Arrays.toString(nums)); //[12, 45, 94, 72]
        Arrays.sort(nums); // сортировка по возрастанию

        System.out.println(Arrays.toString(nums)); // [12, 45, 72, 94]
        System.out.println(Arrays.binarySearch(nums, 45)); //1
        System.out.println(Arrays.binarySearch(nums, 72)); //2
        System.out.println("___________");


        //              0   1   2   3  4
        int nums2[] = {23, 90, 17, 55, 6};
        //             0   1   2   3   4
        //            [6, 17, 23, 55, 90]
        System.out.println(Arrays.toString(nums2));
        System.out.println(nums2[0]);
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.println(nums2[2]);

        System.out.println(Arrays.binarySearch(nums2, 55));
        System.out.println(Arrays.binarySearch(nums2, 90));

        // [6, 17, 23,          55, 90]

        // 99

        // [1, 5, 9, 10, 34, 78,       86, 99, 112,                 138, 197, 204]

        // Askar

        // 1Kate
        // Aaaa
        // ALEX


        // Askar
        // Askar O!
        // Askar MEGACOM


        // Zendeya

        int nums3[] = {77, 457, 23, 45, 11, 0, 8};
        System.out.println(nums3[3]);
//        Arrays.sort(nums3);
//        System.out.println(Arrays.toString(nums3));
//        System.out.println(Arrays.binarySearch(nums3, 11));
        System.out.println("________");

        for (int numbers : nums3) {
            if (numbers == 45) {
                System.out.println(numbers);

            }
        }

        String students[] = {"Tanya", "Askar", "Tancholpon", "Cholpon", "Azamat"};
        //                    [Askar, Azamat, Cholpon, Tancholpon, Tanya]
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println(students[0] + " " + students[2]);
        System.out.println(students[3] + " " + students[4]);
        System.out.println("___________________");

        for (int i = 0; i < students.length; i++) {
            if (students[i].startsWith("Tan")) {
                System.out.print(students[i] + " ");
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i].contains("Tan")) {
                System.out.print(students[i] + " ");
            }
        }
        System.out.println();






    }
}

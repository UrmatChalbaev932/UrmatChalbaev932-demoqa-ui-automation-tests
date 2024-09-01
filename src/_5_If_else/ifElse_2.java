package _5_If_else;

public class ifElse_2 {
    public static void main(String[] args) {


        boolean reference = true;
        int photo3x4 = 5;
        int contract = 15999;

       /* if (reference == true) {
            if (photo3x4 == 2) {
                if (contract == 15878.50f) {
                    System.out.println("Accepted, Welcome!");
                } else {
                    System.out.println("Invalid contract");
                }
            }else {
                System.out.println("No photo");
            }
        } else {
            System.out.println("Need reference");
        }*/


        //_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+ не желательное сокращение

        /*if (reference && photo3x4==2 && contract == 15878) {
            System.out.println("Accepted! Welcome");
        }
        else {
            System.out.println("Not accepted");
        }*/

        // ______________________________________________
        //1. reference
        if (reference) {
            //2.photo
            if (true) {
                if (photo3x4 ==1 || photo3x4 < 2) {
                    System.out.println("Please one more photo");
                }
                else if (photo3x4 >2) {
                    System.out.println("Photos accepted");
                    int retern1 = photo3x4-2;
                    System.out.println("Here you are photos : " +retern1);
                    }
                        // 3. contract
                          if (contract >= 15878) {
                              System.out.println("Accepted, Welcome!");
                                int retern2 = contract-15878;
                              System.out.println("Her you are money " +retern2);
                          } else {
                             System.out.println("Invalid contract");
                             }
                }else {
                System.out.println("No photo");
                }
            } else {
            System.out.println("Need reference");
            }



    }
}

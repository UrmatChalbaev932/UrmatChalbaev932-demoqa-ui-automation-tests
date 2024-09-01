package _7_String;

import com.sun.jdi.Value;

public class Methods {
    public static void main(String[] args) {
        char[] chars = {'H','e','l','l','o'};
        String str = new String(chars);
        System.out.println(str);
        char[] chars1 = str.toCharArray();
        System.out.println(chars1);
        System.out.println(str.isEmpty());
        String str1 = new String("Word");
        System.out.println(str1);

        char ch = 'a';
        int i = 1;
        String chToSt = String.valueOf(ch);
        System.out.println("Next");
        System.out.println(chToSt);
        String intToSt = String.valueOf(i);
        System.out.println(intToSt);

        System.out.println(str.concat(str1));
        System.out.println(String.join(" ", str, str1));
        System.out.println(str.charAt(0));
        char[] arr = new char [str.length()];
        str.getChars(0, 5, arr, 0);
        System.out.println(arr);
        String str3 = "word";
        String str4 = "word";
        boolean bl = str3.regionMatches(0, str4, 0, 4);
        System.out.println(bl);



        String sss ="AAAxyzBBB";
        Methods m = new Methods();
        m.xyzMiddle(sss);

        String ssss = "ab*cd";
        m.starOut(ssss);
        System.out.println(ssss);
    }

    public boolean xyzMiddle(String str) {

        while (str.length() > 4 ){
            str = str.substring(1, str.length() - 1 );
        }
        return(str.contains("xyz"));
    }


    public String starOut(String str) {
        String starOut ="";
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)=='*'){
                starOut.substring(i-2);
                i+=1;

            } else {
                starOut+=str.charAt(i);
            }
        }return starOut;
     }

}

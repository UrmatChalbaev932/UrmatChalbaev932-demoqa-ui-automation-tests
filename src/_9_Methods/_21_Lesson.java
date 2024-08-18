package _9_Methods;

public class _21_Lesson {
    public static void main(String[] args) {

        _21_Lesson obj = new _21_Lesson();
        StringBuilder word = new StringBuilder("aziza");

        System.out.println(obj.isPalindrome(word));
        System.out.println(obj.isPalindrome2(word.toString()));
    }

    public String isPalindrome (StringBuilder sb) {
        String sb2 = sb.reverse().toString();
        String result = "";
        if (sb.toString().equals(sb2)){
            result = "Palindrome";
            return result;
        } else {
            result = "Not Palindrome";
            return result;
        }
    }

    public String isPalindrome2 (String word){
        StringBuilder sb1= new StringBuilder(word);
        sb1.reverse();
        String result = "";
        if (word.equalsIgnoreCase(sb1.toString())) {
            result = "Palindrome";
            return result;
        } else {
            result = "Not Palindrome";
            return result;
        }

    }
}

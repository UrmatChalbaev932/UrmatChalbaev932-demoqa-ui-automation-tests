import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class _16_Override_Equals_hashCode {
    public static void main(String[] args) {

        String str1 = "siLten";
        String str2 = "Listen";

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        System.out.println(Arrays.equals(char1, char2));

        _16_Override_Equals_hashCode badam = new _16_Override_Equals_hashCode("Badam", 24);
        _16_Override_Equals_hashCode urmat = new _16_Override_Equals_hashCode("Urmat", 30);

        System.out.println(badam.hashCode());
        System.out.println(urmat.hashCode());
        System.out.println(urmat.equals(badam));

    }

    public String name;
    public int age;

    public _16_Override_Equals_hashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        _16_Override_Equals_hashCode that = (_16_Override_Equals_hashCode) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

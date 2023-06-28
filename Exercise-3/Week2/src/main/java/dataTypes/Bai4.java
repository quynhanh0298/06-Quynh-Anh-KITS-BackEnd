package dataTypes;

public class Bai4 {
    public static void main(String[] args) {
        String s = "abcd";
        char[] chars = {'a', 'n', 'h'};
        //Convert char[] to String:
        String str = new String(chars);
        String s2 = String.copyValueOf(chars);
        System.out.println(str);
        char[] cs = s.toCharArray();
        System.out.println(cs);
    }
}

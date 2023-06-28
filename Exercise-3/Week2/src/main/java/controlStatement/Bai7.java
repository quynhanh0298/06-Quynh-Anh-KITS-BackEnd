package controlStatement;

import java.util.ArrayList;

public class Bai7 {
    public static void main(String[] args) {
        //Nhập tham số truyền vào thông qua terminal: java path variable
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (String arg : args) {
            array.add(Integer.parseInt(arg));
        }
        int s = 0;
        for (int i = 0; i < array.size(); i++) {
            s += array.get(i);
        }
        System.out.println(s);
    }

}

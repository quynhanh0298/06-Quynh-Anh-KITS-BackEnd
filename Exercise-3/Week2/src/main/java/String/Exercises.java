package String;

import java.util.ArrayList;

public class Exercises {
    //Bai 1
    public ArrayList<String> dedupe(String str) { //Dùng split theo ký tự, nếu trả về > 2 mảng thì dedupe
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    arr.add(String.valueOf(str.charAt(i)));
}
            }
        }
        return arr;
    }

    //Bai 2
    public char findChar(String str, int index){
        if (str.length() != 0) {
            if (index < str.length()) {
                return str.charAt(index);
            }
        }
        return '#';
    }

    //Bai 3
    public String replace(String str, String param){
        if (str.contains("{}")) {
            return str.replace("{}",param);
        }
        else {
            return str;
        }
    }

    //Bai 4:
    public String joinStr(String delimiter, String... args){
        String s = "";
        if (args.length > 0) {
            for (int i = 0; i < args.length -1; i++) {
                s += (args[i] + delimiter);
            }
            s += args[args.length - 1];
            return s;
        }else {
            return "";
        }

    }
}

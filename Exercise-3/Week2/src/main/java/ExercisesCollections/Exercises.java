package ExercisesCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercises {
    //Bai 1: At least 3 ways to loop through an arraylist
//    public static

    //LinkedList
    public void insertHead(LinkedList<String> arr, String item){
        arr.addFirst(item);
    }
    public void insertTail(LinkedList<String> arr, String item){
        arr.addLast(item);
    }

    public void remove(LinkedList<String> arr, int index) {
        arr.remove(index);
    }

    public List<String> migrate(LinkedList<String> left, ArrayList<String> right) {
        int size = left.size();
        for (int i = 0; i < size; i++) {
            right.add(left.pop());
        }
        return right;
    }

    public List<String> reverse(LinkedList<String> arr) {
        LinkedList<String> newArr = new LinkedList<String>();
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            newArr.addFirst(arr.pop());
        }
        return newArr;
    }

    public void replace(LinkedList<String> arr, int pos, String newValue) {
        arr.set(pos, newValue);
    }
}

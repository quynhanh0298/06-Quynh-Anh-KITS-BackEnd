package CollectionExercises;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Integer i = 1;

        switch (args[0]) {
            case "1":
                System.out.println("1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.");
                System.out.print("Input elements for ArrayList<Integer>:");
                int[] arr = inputInt();
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int num : arr) {
                    list.add(num);
                }
                System.out.println("Sum of ArrayList<Integer> elements: " + list.stream().mapToInt(Integer::intValue).sum());

                break;
            case "9":
                System.out.println("9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.");
                System.out.print("Input elements for HashSet<Integer>: ");
                int[] hashsetQ9arr = inputInt();
                HashSet<Integer> hashsetQ9 = new HashSet<Integer>();
                for (int num : hashsetQ9arr) {
                    hashsetQ9.add(num);
                }
                System.out.print("Input elements for ArrayList<Integer>: ");
                int[] arraylistQ9arr = inputInt();
                ArrayList<Integer> arraylistQ9 = new ArrayList<Integer>();
                for (int num : arraylistQ9arr) {
                    arraylistQ9.add(num);
                }
                hashsetQ9.addAll(arraylistQ9);
                System.out.println("Hashset after add all elements of ArrayList: " + hashsetQ9);
                break;
            case "10":
                System.out.println("10. Xóa các phần tử trùng lặp từ một ArrayList.");
                System.out.print("Input elements for ArrayList<Integer> with duplicate elements: ");
                int[] arraylistQ10arr = inputInt();
                ArrayList<Integer> arraylistQ10 = new ArrayList<Integer>();
                for (int num : arraylistQ10arr) {
                    arraylistQ10.add(num);
                }

                Set<Integer> setQ10 = new HashSet<Integer>(arraylistQ10);
                arraylistQ10 = new ArrayList<>(setQ10);
                System.out.println("ArrayList<Integer> after remove duplicate elements: " + arraylistQ10);
                break;
            case "11":
                System.out.println("11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.");
                System.out.print("Input elements for ArrayList<Integer>: ");
                int[] arraylistQ11arr = inputInt();
                ArrayList<Integer> arraylistQ11 = new ArrayList<Integer>();
                for (int num : arraylistQ11arr) {
                    arraylistQ11.add(num);
                }
                //arr.clone()
                ArrayList<Integer> arraylistQ11new = new ArrayList<Integer>(arraylistQ11); //Khong dc lam nhu vay vi cung bo nho
                System.out.println("New ArrayList: " + arraylistQ11new);
                break;
            case "12":
                System.out.println("12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.");
                System.out.print("Input a paragraph: ");
                Scanner scanner = new Scanner(System.in);
                String paragraph = scanner.nextLine();
                String[] paragraphArr = paragraph.split(" ");
                System.out.print("Input words for TreeMap");
                String[] words = inputString();
                TreeMap<String, Integer> wordCounts = new TreeMap<String, Integer>();
                for (String word : words) {
                    int count = 0;
                    for (String paragraphWord : paragraphArr) {
                        if (word.equals(paragraphWord)) {
                            count++;
                        }
                    }
                    wordCounts.put(word, count);
                }
                System.out.println(wordCounts);
                break;
            case "13":
                System.out.println("13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.");
                System.out.print("Input elements for LinkedList<Integer>: ");
                int[] linkedlistQ13arr = inputInt();
                LinkedList<Integer> linkedlistQ13 = new LinkedList<>();
                for (int num : linkedlistQ13arr) {
                    linkedlistQ13.add(num);
                }
                System.out.print("Input element to find: ");
                Scanner scanner1 = new Scanner(System.in);
                int e = scanner1.nextInt();
                AtomicInteger count = new AtomicInteger();
                linkedlistQ13.stream().forEach(x -> {
                    if (x == e) {
                        count.getAndIncrement();
                    }
                });
                System.out.println("Số lần xuất hiện của " + e + " là: " + count);
                break;
            case "14":
                System.out.println("14. Kiểm tra xem một ArrayList có rỗng hay không.");
                System.out.print("Input elements for ArrayList<Integer>: ");
                int[] arraylistQ14arr = inputInt();
                ArrayList<Integer> arraylistQ14 = new ArrayList<Integer>();
                for (int num : arraylistQ14arr) {
                    arraylistQ14.add(num);
                }
                if (arraylistQ14.size() == 0) {
                    System.out.println("Empty!");
                } else {
                    System.out.println("Not empty!");
                }
                break;
            case "15":
                System.out.println("15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.");
                System.out.print("Input elements for ArrayList<Integer>: ");
                int[] arraylistQ15arr = inputInt();
                ArrayList<Integer> arraylistQ15 = new ArrayList<Integer>();
                for (int num : arraylistQ15arr) {
                    arraylistQ15.add(num);
                }
                System.out.print("Input element to add into ArrayList<Integer>: ");
                Scanner scanner2 = new Scanner(System.in);
                int e15 = scanner2.nextInt();
                System.out.print("Input position to add into ArrayList<Integer>: ");
                Scanner scanner3 = new Scanner(System.in);
                int position = scanner3.nextInt();
                LinkedList<Integer> linkedListQ15Duplicate = new LinkedList<Integer>(arraylistQ15);
                linkedListQ15Duplicate.add(position, e15);
                arraylistQ15 = new ArrayList<>(linkedListQ15Duplicate);
                System.out.println("ArrayList after add element: " + arraylistQ15);
                break;
            case "16":
                System.out.println("16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.");
                System.out.print("Input elements for ArrayList<Integer>: ");
                int[] arraylistQ16arr = inputInt();
                ArrayList<Integer> arraylistQ16 = new ArrayList<Integer>();
                for (int num : arraylistQ16arr) {
                    arraylistQ16.add(num);
                }
                PriorityQueue<Integer> queueQ16 = new PriorityQueue<Integer>(arraylistQ16);
                System.out.println("All elements in Priority Queue: " + queueQ16);
                break;
            case "17":
                System.out.println("17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.");
                System.out.print("Input elements for ArrayList<Integer>: ");
                int[] arraylistQ17arr = inputInt();
                ArrayList<Integer> arraylistQ17 = new ArrayList<Integer>();
                for (int num : arraylistQ17arr) {
                    arraylistQ17.add(num);
                }

                System.out.print("Input elements for another ArrayList<Integer>: ");
                int[] arraylistQ17NewArr = inputInt();
                ArrayList<Integer> arraylistQ17New = new ArrayList<Integer>();
                for (int num : arraylistQ17NewArr) {
                    arraylistQ17New.add(num);
                }

                Set<Integer> listQ17no1 = new HashSet<Integer>(arraylistQ17);
                Set<Integer> listQ17no2 = new HashSet<Integer>(arraylistQ17New);

                boolean containAll = true;
                for (int num : listQ17no2) {
                    if (!listQ17no1.contains(num)) {
                        containAll = false;
                        break;
                    }
                }
                if (containAll) {
                    System.out.println("The input ArrayList has all the elements!");
                } else {
                    System.out.println("The input ArrayList doesn't have all the elements!");
                }
                break;
            case "18":
                System.out.println("18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.");
                System.out.print("Input elements for LinkedList<Integer>: ");
                int[] linkedlistQ18arr = inputInt();
                LinkedList<Integer> linkedlistQ18 = new LinkedList<>();
                for (int num : linkedlistQ18arr) {
                    linkedlistQ18.add(num);
                }
                linkedlistQ18.sort(Comparator.reverseOrder());
                System.out.println("LinkedList after sorting in reverse Order: " + linkedlistQ18);
                break;
            case "19":
                System.out.println("19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.");
                System.out.print("Input elements for Hashset<Integer>: ");
                int[] hashsetQ19arr = inputInt();
                HashSet<Integer> hashsetQ19 = new HashSet<>();
                for (int num : hashsetQ19arr) {
                    hashsetQ19.add(num);
                }
                System.out.println("All the elements of HashSet<Integer>: " + hashsetQ19);
                break;
            case "20":
                System.out.println("20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.");
                System.out.print("Input elements for ArrayList<Integer>: ");
                int[] arraylistQ20arr = inputInt();
                ArrayList<Integer> arraylistQ20 = new ArrayList<Integer>();
                for (int num : arraylistQ20arr) {
                    arraylistQ20.add(num);
                }
                if (arraylistQ20.size() == 0) {
                    System.out.println("ArrayList is empty!");
                }
                else {
                    System.out.println("First element of ArrayList: " + arraylistQ20.get(0));
                    System.out.println("Last element of ArrayList: " + arraylistQ20.get(arraylistQ20.size() - 1));
                }
                break;
            case "21":
//                String s= "a";
//                s.concat("abc");
//                StringBuilder sb = new StringBuilder(5);
//                System.out.println(s);
//                System.out.println(sb.toString().equals(s.toString()));
//                int a = 100;
//                int b = 101;
//                int c = 102;
//                int d = (a<b) ? (a<c) ? a : (b<c)?b :c:a;
                int[][] a = new int[2][];

                break;
            default:
                System.out.println("Question not available!");
        }

    }

    public static int[] inputInt() {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine()
                        .trim()
                        .split(" "))
                .filter(x -> !x.equals(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }

    public static String[] inputString() {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        return arr;
    }
}

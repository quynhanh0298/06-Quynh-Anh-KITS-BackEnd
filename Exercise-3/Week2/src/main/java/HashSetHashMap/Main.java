package HashSetHashMap;

public class Main {

    public static void main(String[] args) {
        Election elec = new Election();

        elec.vote("Obama");
        elec.vote("Obama");
        elec.vote("Obama");
        elec.vote("Abraham Lincon");
        elec.vote("Abraham Lincon");
        elec.vote("Abraham Lincon");
        System.out.println(elec.candidates);
        System.out.println(elec.winner());

    }
}

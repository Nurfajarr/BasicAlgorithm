import java.util.ArrayList;

public class TestTiga {

    public static void main(String[] args) {

        ArrayList<Integer> objek = new ArrayList<>();
        objek.add(1);
        objek.add(2);
        objek.add(3);
        objek.add(4);
        objek.add(5);
        objek.add(6);
        objek.add(7);
        objek.add(8);
        objek.add(9);
        objek.add(2);

        for (int i = 1; i<=objek.size(); i++){
            if (i == 8){
                System.out.print(objek + "hasilnya ada");
            }
        }

    }

}

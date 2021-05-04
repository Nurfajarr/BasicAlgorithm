public class TestDua {

    public static void main(String[] args) {

        int a = -5;
        int b = -3;

        int hasil;

        if (a<=5){
            hasil = 2 +a;
            a++;
        }else if (b>a){
            b=1;
            if (b<=3){
                hasil = b*2;
                b++;
            }else {
                hasil = a-2;
            }
        }else if (a>=5){
            hasil = a-2;
        }else {
            hasil = b * 2;
        }
        System.out.println(hasil);
    }

}

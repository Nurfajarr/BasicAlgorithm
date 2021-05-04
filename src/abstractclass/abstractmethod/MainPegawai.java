package abstractclass.abstractmethod;

public class MainPegawai {

    public static void main(String args[]) {

        //inisialisasi menggunakan konsep polimorfisme
        Pegawai objek = new DetailPegawai();
        objek.nama();
        objek.umur();

    }
}

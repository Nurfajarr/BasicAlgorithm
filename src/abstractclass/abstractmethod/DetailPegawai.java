package abstractclass.abstractmethod;

//subclass mewarisi sifat induk(Pegawai)
public class DetailPegawai extends Pegawai {

    //contoh dinamic polimorfisme(Method override)
    @Override
    public void nama() {
        System.out.println("Fajar");
    }

    //contoh dinamic polimorfisme (Method override)
    @Override
    public void umur() {
        System.out.println("21");
    }
}

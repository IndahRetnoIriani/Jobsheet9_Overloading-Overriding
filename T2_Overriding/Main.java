package T2_Overriding;

public class Main {
    public static void main(String args[]){
        Manusia ma = new Mahasiswa();
        ma.bernafas();
        ma.makan();

        Manusia m = new Dosen();
        m.bernafas();
        m.makan();
    }
}

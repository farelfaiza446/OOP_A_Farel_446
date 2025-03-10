public class Main {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank("2024103703110446", "Farel", 500000.0);
        AkunBank akun2 = new AkunBank("2024103703110402", "Ripan", 1000000.0);

        System.out.println();
        akun1.tampilkanInfo();
        System.out.println();
        akun2.tampilkanInfo();
        System.out.println();

        akun1.setorUang(200000.0);
        akun2.setorUang(500000.0);
        System.out.println();

        akun1.tarikUang(800000.0);
        akun2.tarikUang(300000.0);
        System.out.println();


        akun1.tampilkanInfo();
        System.out.println();
        akun2.tampilkanInfo();
    }
}

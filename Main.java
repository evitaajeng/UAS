/**
 * Created by TOSHIBA on 7/7/2015.
 */
public class Main {
    public static void main(String[] args) {

        //Membuat Liga
        Liga Polinema = new Liga("Polinema");

        //Membuat Divisi
        Divisi TataNiaga = new Divisi("TataNiaga",Polinema);
        Divisi Rekayasa = new Divisi("Rekayasa",Polinema);

        //Membuat Club
        Club Akuntansi = new Club("Akuntansi",TataNiaga,Polinema);
        Club Administrasi = new Club("Administrasi",TataNiaga,Polinema);
        Club Elektro = new Club("Elektro",Rekayasa,Polinema);
        Club Sipil = new Club("Sipil",Rekayasa,Polinema);

        Polinema.setDaftarDivisi(TataNiaga);
        Polinema.setDaftarDivisi(Rekayasa);

        TataNiaga.setDaftarClub(Akuntansi);
        TataNiaga.setDaftarClub(Administrasi);
        Rekayasa.setDaftarClub(Elektro);
        Rekayasa.setDaftarClub(Sipil);

        //Soal 1. Get daftar divisi by nama liga

        System.out.println("Menampilkan Soal Nomer 1 :");
        System.out.println("Divisi Liga Polinema : ");
        Polinema.getDaftarDivisi("Polinema");
        System.out.println();

        //Soal 2. Get Daftar Club by nama liga

        System.out.println("Menampilkan Soal Nomer 2 :");
        System.out.println("Klub Liga Polinema : ");
        TataNiaga.getDaftarClubLiga("Polinema");
        System.out.println();

        //Soal 3. Get Daftar Club by nama Divisi

        System.out.println("Menampilkan Soal Nomer 3 :");
        System.out.println("Club Liga Polinema : ");
        TataNiaga.getDaftarClubDivisi("Polinema");
        System.out.println("Liga Polinema : ");
        Rekayasa.getDaftarClubDivisi("Rekayasa");
        System.out.println();

        //Soal 4. Get Club ini berada di divisi mana by nama Club

        System.out.println("Menampilkan Soal Nomer 4 :");
        Elektro.getDivisi("Elektro");
        Administrasi.getDivisi("Administrasi");
        System.out.println();

        //Soal 5. Get Club ini berada di liga apa by nama Club

        System.out.println("Menampilkan Soal Nomer 5 :");
        Akuntansi.getLiga("Akuntansi");

    }
}
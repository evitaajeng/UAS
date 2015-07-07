import java.util.ArrayList;
/**
 * Created by TOSHIBA on 7/7/2015.
 */
public class Divisi {
    private String namaDivisi;
    private Liga liga;
    ArrayList<Club> daftarClub = new ArrayList<Club>();

    //Constructor
    public Divisi(String namaDivisi, Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaDivisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {

        return namaDivisi;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Liga getLiga(){
        return liga;
    }

    public void setDaftarClub(Club club) {

        this.daftarClub.add(club);
    }

    public ArrayList<Club> getDaftarClub() {

        return daftarClub;
    }

    //soal untuk nomer 2

    public void getDaftarClubLiga(String cariLiga)
    {
        if (cariLiga == liga.getNamaLiga())
        {
            for (int a = 0; a < liga.daftarDivisi.size() ; a++)
            {
                Divisi b = liga.daftarDivisi.get(a);
                System.out.println(b.getNamaDivisi());
                for (int c = 0; c <daftarClub.size() ; c++)
                {
                    System.out.println(b.daftarClub.get(c));
                }
            }
        }
        else
        {
            System.out.println("Tidak terdapat Club di dalam Liga ini");
        }
    }

    //soal untuk nomer3
    public void getDaftarClubDivisi(String divisiCari)
    {
        for (int q = 0; q < liga.daftarDivisi.size() ; q++)
        {
            Divisi w = liga.daftarDivisi.get(q);
            if (divisiCari == w.getNamaDivisi())
            {
                for (int e = 0; e <daftarClub.size() ; e++)
                {
                    System.out.println(w.daftarClub.get(e));
                }
            }
        }
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Divisi l = liga.daftarDivisi.get(0);
            Divisi k = liga.daftarDivisi.get(1);
            if (divisiCari != k.getNamaDivisi())
            {
                if (divisiCari != l.getNamaDivisi())
                {
                    System.out.println("Club tidak dapat ditemukan");
                    break;
                }
            }
        }

    }

    //toString
    @Override
    public String toString() {
        return
                "Nama Divisi = " + namaDivisi;
    }
}

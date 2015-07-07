import java.util.ArrayList;
/**
 * Created by TOSHIBA on 7/7/2015.
 */
public class Liga {
        private String namaLiga;

        ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

        //Constructor
        public Liga(String namaLiga) {

            this.namaLiga = namaLiga;
        }

        //Setter and Getter

        public void setNamaLiga(String namaLiga) {

            this.namaLiga = namaLiga;
        }

        public String getNamaLiga() {

            return namaLiga;
        }

        public void setDaftarDivisi(Divisi divisi)
        {

            this.daftarDivisi.add(divisi);
        }

        public ArrayList<Divisi> getDaftarDivisi() {

            return daftarDivisi;
        }

        //soal untuk nomer1
        public void getDaftarDivisi(String liga)
        {
            if (liga == getNamaLiga())
            {
                for (int i = 0; i <daftarDivisi.size() ; i++)
                {
                    System.out.println(daftarDivisi.get(i));
                }
            }
            else
            {
                System.out.println("Tidak ada di dalam Divisi");
            }

        }

        //toString
        @Override
        public String toString() {
            return "Nama Liga = " + namaLiga +
                    "\nDaftar Divisi = " + daftarDivisi ;
        }
}
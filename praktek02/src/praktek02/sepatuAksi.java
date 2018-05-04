package praktek02;
public class sepatuAksi {
    public static void main(String[] args) {
        sepatu jalan = new sepatu();
        jalan.merk="Adidas";
            jalan.warna="Merah";
            jalan.bahan="Kulit";
            jalan.size="41";
            jalan.madein="EUR";
            jalan.CetakInfo();
            
        sepatu sekolah = new sepatu();
         sekolah.merk="Nike";
            sekolah.warna="Hitam";
            sekolah.bahan="Kain";
            sekolah.size="40";
            sekolah.madein="Vietnam";
            sekolah.CetakInfo();
            
        sepatu kerja = new sepatu();
        kerja.merk="Converse";
            kerja.warna="Biru";
            kerja.bahan="Canvas";
            kerja.size="41";
            kerja.madein="Indonesia";
            kerja.CetakInfo();
    }
}

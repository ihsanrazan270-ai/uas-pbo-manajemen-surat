package model;

public class SuratMasuk extends Surat {

    private String pengirim;

    public SuratMasuk(String nomor, String tanggal, String perihal, String pengirim) {
        super(nomor, tanggal, perihal);
        this.pengirim = pengirim;
    }

    public String getPengirim() {
        return pengirim;
    }
}
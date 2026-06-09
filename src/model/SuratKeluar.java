package model;

public class SuratKeluar extends Surat {

    private String penerima;

    public SuratKeluar(String nomor, String tanggal, String perihal, String penerima) {
        super(nomor, tanggal, perihal);
        this.penerima = penerima;
    }

    public String getPenerima() {
        return penerima;
    }
}
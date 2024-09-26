/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttes4;
public class SuratKematian extends Surat{
    private int RT;
    private int RW;
    private String Kecamatan;
    private String Keperluan;
    private String TanggalMeninggal;

    public SuratKematian(int RT, int RW, String Kecamatan, String Keperluan, String TanggalMeninggal, int Nik, String Nama, String TanggalLahir, String JenisKelamin) {
        super(Nik, Nama, TanggalLahir, JenisKelamin);
        this.RT = RT;
        this.RW = RW;
        this.Kecamatan = Kecamatan;
        this.Keperluan = Keperluan;
        this.TanggalMeninggal = TanggalMeninggal;
    }

    public SuratKematian() {
        this.RT = 0;
        this.RW = 0;
        this.Kecamatan = "";
        this.Keperluan = "";
        this.TanggalMeninggal = "";
    }

    public int getRT() {
        return RT;
    }

    public void setRT(int RT) {
        this.RT = RT;
    }

    public int getRW() {
        return RW;
    }

    public void setRW(int RW) {
        this.RW = RW;
    }

    public String getKecamatan() {
        return Kecamatan;
    }

    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    public String getKeperluan() {
        return Keperluan;
    }

    public void setKeperluan(String Keperluan) {
        this.Keperluan = Keperluan;
    }

    public String getTanggalMeninggal() {
        return TanggalMeninggal;
    }

    public void setTanggalMeninggal(String TanggalMeninggal) {
        this.TanggalMeninggal = TanggalMeninggal;
    }
    

    
    
    
}

package POSTTEST3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSi-GAMING
 */
public class data {
    private String a;
    private String b;
    private String c;
    private int d;

    data(String artikel, String warna, String harga, int total_brg) {
        this.a = artikel;
        this.b = warna;
        this.c = harga;
        this.d = total_brg;
    }

    void dataDitambah() {
        System.out.println("Data Telah Ditambahkan !");
    }

    void dataDihapus() {
        System.out.println("Data Telah Dihapus !");
    }

    void dataDiubah() {
        System.out.println("Data Telah Diubah !");
    }

    void dataDitampilkan() {
        System.out.println("Data Telah Ditampilkan !");
    }

    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(String b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public String getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(String c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public int getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(int d) {
        this.d = d;
    }
}
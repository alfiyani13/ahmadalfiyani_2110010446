package perlengkapan;

import java.util.ArrayList;

public class Cuti {
    private String tipecuti, alasancuti, tanggaldibuat;
    private final ArrayList<Cuti> cutiList;

    public Cuti() {
        cutiList = new ArrayList<>();
    }

    public void setTipecuti(String tipecuti) {
        this.tipecuti = tipecuti;
    }

    public String getTipecuti() {
        return this.tipecuti;
    }

    public void setAlasancuti(String alasancuti) {
        this.alasancuti = alasancuti;
    }

    public String getAlasancuti() {
        return this.alasancuti;
    }

    public void setTanggaldibuat(String tanggaldibuat) {
        this.tanggaldibuat = tanggaldibuat;
    }

    public String getTanggaldibuat() {
        return this.tanggaldibuat;
    }

    public void addCuti(Cuti cuti) {
        cutiList.add(cuti);
    }

    public ArrayList<Cuti> getCutiList() {
        return cutiList;
    }

    public static void main(String[] args) {
        Cuti cutiObj = new Cuti();

        Cuti cuti1 = new Cuti();
        cuti1.setTipecuti("Cuti Tahunan");
        cuti1.setAlasancuti("Liburan");
        cuti1.setTanggaldibuat("2023-06-12");
        cutiObj.addCuti(cuti1);

        Cuti cuti2 = new Cuti();
        cuti2.setTipecuti("Cuti Sakit");
        cuti2.setAlasancuti("Sakit Flu");
        cuti2.setTanggaldibuat("2023-06-12");
        cutiObj.addCuti(cuti2);

        ArrayList<Cuti> cutiList = cutiObj.getCutiList();

        // Menampilkan data cuti dari ArrayList
        for (Cuti c : cutiList) {
            System.out.println("Tipe Cuti: " + c.getTipecuti());
            System.out.println("Alasan Cuti: " + c.getAlasancuti());
            System.out.println("Tanggal Dibuat: " + c.getTanggaldibuat());
            System.out.println();
        }
    }
}

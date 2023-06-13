package perlengkapan;

import java.util.ArrayList;

public class departemen {
    private String namadepartemen, singkatandepartemen, kodedepartemen, tanggaldibuat;
    private final ArrayList<departemen> departemenList;

    public departemen() {
        departemenList = new ArrayList<>();
    }

    public void setNamadepartemen(String namadepartemen) {
        this.namadepartemen = namadepartemen;
    }

    public String getNamadepartemen() {
        return this.namadepartemen;
    }

    public void setSingkatandepartemen(String singkatandepartemen) {
        this.singkatandepartemen = singkatandepartemen;
    }

    public String getSingkatandepartemen() {
        return this.singkatandepartemen;
    }

    public void setKodedepartemen(String kodedepartemen) {
        this.kodedepartemen = kodedepartemen;
    }

    public String getKodedepartemen() {
        return this.kodedepartemen;
    }

    public void setTanggaldibuat(String tanggaldibuat) {
        this.tanggaldibuat = tanggaldibuat;
    }

    public String getTanggaldibuat() {
        return this.tanggaldibuat;
    }

    public void addDepartemen(departemen departemen) {
        departemenList.add(departemen);
    }

    public ArrayList<departemen> getDepartemenList() {
        return departemenList;
    }

    public static void main(String[] args) {
        departemen departemenObj = new departemen();

        departemen dep1 = new departemen();
        dep1.setNamadepartemen("Departemen A");
        dep1.setSingkatandepartemen("DA");
        dep1.setKodedepartemen("001");
        dep1.setTanggaldibuat("2023-06-12");
        departemenObj.addDepartemen(dep1);

        departemen dep2 = new departemen();
        dep2.setNamadepartemen("Departemen B");
        dep2.setSingkatandepartemen("DB");
        dep2.setKodedepartemen("002");
        dep2.setTanggaldibuat("2023-06-12");
        departemenObj.addDepartemen(dep2);

        ArrayList<departemen> departemenList = departemenObj.getDepartemenList();

        // Menampilkan data departemen dari ArrayList
        for (departemen d : departemenList) {
            System.out.println("Nama Departemen: " + d.getNamadepartemen());
            System.out.println("Singkatan Departemen: " + d.getSingkatandepartemen());
            System.out.println("Kode Departemen: " + d.getKodedepartemen());
            System.out.println("Tanggal Dibuat: " + d.getTanggaldibuat());
            System.out.println();
        }
    }
}

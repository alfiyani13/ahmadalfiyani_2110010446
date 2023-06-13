package ahmad.alfi.yani.pkg2110010446;

import java.util.ArrayList;
import perlengkapan.admin;
import perlengkapan.departemen;
import perlengkapan.Cuti;
import perlengkapan.detail_cuti;

/**
 * Main class
 */
public class AhmadAlfiYani2110010446 {

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Admin
        admin adminObj = new admin();
        
        admin admin1 = new admin();
        admin1.setUsername("admin1");
        admin1.setPassword("password1");
        admin1.setTanggaldibuat("2023-06-12");
        adminObj.addAdmin(admin1);
        
        admin admin2 = new admin();
        admin2.setUsername("admin2");
        admin2.setPassword("password2");
        admin2.setTanggaldibuat("2023-06-12");
        adminObj.addAdmin(admin2);
        
        // Mendapatkan ArrayList adminList
        ArrayList<admin> adminList = adminObj.getAdminList();
        
        // Menampilkan data admin dari ArrayList
        System.out.println("Daftar Admin:");
        for (admin a : adminList) {
            System.out.println("Username: " + a.getUsername());
            System.out.println("Password: " + a.getPassword());
            System.out.println("Tanggal Dibuat: " + a.getTanggaldibuat());
            System.out.println();
        }
        
        // Membuat objek Departemen
        departemen departemenObj = new departemen();
        
        // Membuat ArrayList departemenList
        ArrayList<departemen> departemenList = departemenObj.getDepartemenList();
        
        // Menampilkan data departemen dari ArrayList
        System.out.println("Daftar Departemen:");
        for (departemen d : departemenList) {
            System.out.println("Nama Departemen: " + d.getNamadepartemen());
            System.out.println("Singkatan Departemen: " + d.getSingkatandepartemen());
            System.out.println("Kode Departemen: " + d.getKodedepartemen());
            System.out.println("Tanggal Dibuat: " + d.getTanggaldibuat());
            System.out.println();
        }
        
        // Membuat objek Cuti
        Cuti cutiObj = new Cuti();
        
        // Membuat ArrayList cutiList
        ArrayList<Cuti> cutiList = cutiObj.getCutiList();
        
        // Menampilkan data cuti dari ArrayList
        System.out.println("Daftar Cuti:");
        for (Cuti c : cutiList) {
            System.out.println("Tipe Cuti: " + c.getTipecuti());
            System.out.println("Alasan Cuti: " + c.getAlasancuti());
            System.out.println("Tanggal Dibuat: " + c.getTanggaldibuat());
            System.out.println();
        }
        
        // Membuat objek Detail Cuti
        detail_cuti detailCutiObj = new detail_cuti();
        
        // Menambahkan data ke objek Detail Cuti
        detailCutiObj.setTipecuti("Cuti Tahunan");
        detailCutiObj.setTanggalcuti("2023-06-15");
        detailCutiObj.setTanggalselesaicuti("2023-06-20");
        detailCutiObj.setAlasancuti("Liburan");
        detailCutiObj.setTanggalpengajuan("2023-06-12");
        detailCutiObj.setPesanadmin("Cuti disetujui");
        detailCutiObj.setTanggalkonfirmasiadmin("2023-06-13");
        detailCutiObj.setStatus("Disetujui");
        detailCutiObj.setTelahdibacaadmin("Ya");
        
        // Membuat ArrayList detailCutiList
        ArrayList<detail_cuti> detailCutiList = new ArrayList<>();
        
        // Menambahkan objek Detail Cuti ke dalam ArrayList
        detailCutiList.add(detailCutiObj);
        
        // Menampilkan data detail cuti dari ArrayList
        System.out.println("Daftar Detail Cuti:");
        for (detail_cuti dc : detailCutiList) {
            System.out.println("Tipe Cuti: " + dc.getTipecuti());
            System.out.println("Tanggal Cuti: " + dc.getTanggalcuti());
            System.out.println("Tanggal Selesai Cuti: " + dc.getTanggalselesaicuti());
            System.out.println("Alasan Cuti: " + dc.getAlasancuti());
            System.out.println("Tanggal Pengajuan: " + dc.getTanggalpengajuan());
            System.out.println("Pesan Admin: " + dc.getPesanadmin());
            System.out.println("Tanggal Konfirmasi Admin: " + dc.getTanggalkonfirmasiadmin());
            System.out.println("Status: " + dc.getStatus());
            System.out.println("Telah Dibaca Admin: " + dc.getTelahdibacaadmin());
            System.out.println();
        }
    }
}

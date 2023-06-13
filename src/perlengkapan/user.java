package perlengkapan;

import java.util.ArrayList;

public class user {
    private String idkaryawan, namaawal, namaakhir, email, password, jeniskelamin, tanggallahir,
            departemen, alamat, kota, negara, nomertelpon, status, tanggaldaftar;
    
    public user(){}
    
    public void setIdkaryawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }
    
    public String getIdkaryawan() {
        return this.idkaryawan;
    }
    
    public void setNamaawal(String namaawal) {
        this.namaawal = namaawal;
    }
    
    public String getNamaawal() {
        return this.namaawal;
    }
    
    public void setNamaakhir(String namaakhir) {
        this.namaakhir = namaakhir;
    }
    
    public String getNamaakhir() {
        return this.namaakhir;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    
    public String getJeniskelamin() {
        return this.jeniskelamin;  
    }
    
    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }
    
    public String getTanggallahir() {
        return this.tanggallahir;  
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    public String getDepartemen() {
        return this.departemen;  
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return this.alamat;  
    }
    
    public void setKota(String kota) {
        this.kota = kota;
    }
    
    public String getKota() {
        return this.kota;  
    }
    
    public void setNegara(String negara) {
        this.negara = negara;
    }
    
    public String getNegara() {
        return this.negara;  
    }
    
    public void setNomertelpon(String nomertelpon) {
        this.nomertelpon = nomertelpon;
    }
    
    public String getNomertelpon() {
        return this.nomertelpon;  
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;  
    }
    
    public void setTanggaldaftar(String tanggaldaftar) {
        this.tanggaldaftar = tanggaldaftar;
    }
    
    public String getTanggaldaftar() {
        return this.tanggaldaftar;  
    }
    
    public static void main(String[] args) {
        ArrayList<user> userList = new ArrayList<>();

        // Membuat objek user
        user user1 = new user();
        user1.setIdkaryawan("001");
        user1.setNamaawal("Alfi");
        user1.setNamaakhir("Yani");
        // Menambahkan objek user ke dalam ArrayList
        userList.add(user1);

        user user2 = new user();
        user2.setIdkaryawan("002");
        user2.setNamaawal("Aazay");
        user2.setNamaakhir("biasalah");
        // Menambahkan objek user ke dalam ArrayList
        userList.add(user2);

        // Menampilkan data user dari ArrayList
        for (user u : userList) {
            System.out.println("ID Karyawan: " + u.getIdkaryawan());
            System.out.println("Nama Lengkap: " + u.getNamaawal() + " " + u.getNamaakhir());
            System.out.println();
        }
    }
}

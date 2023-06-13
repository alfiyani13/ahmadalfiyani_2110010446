package perlengkapan;

import java.util.ArrayList;

public class admin {
    private String username, password, tanggaldibuat;
    private final ArrayList<admin> adminList;

    public admin() {
        adminList = new ArrayList<>();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setTanggaldibuat(String tanggaldibuat) {
        this.tanggaldibuat = tanggaldibuat;
    }

    public String getTanggaldibuat() {
        return this.tanggaldibuat;
    }

    public void addAdmin(admin admin) {
        adminList.add(admin);
    }

    public ArrayList<admin> getAdminList() {
        return adminList;
    }

    public static void main(String[] args) {
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

        admin admin3 = new admin();
        admin3.setUsername("admin3");
        admin3.setPassword("password3");
        admin3.setTanggaldibuat("2023-06-12");
        adminObj.addAdmin(admin3);

        admin admin4 = new admin();
        admin4.setUsername("admin4");
        admin4.setPassword("password4");
        admin4.setTanggaldibuat("2023-06-12");
        adminObj.addAdmin(admin4);

        admin admin5 = new admin();
        admin5.setUsername("admin5");
        admin5.setPassword("password5");
        admin5.setTanggaldibuat("2023-06-12");
        adminObj.addAdmin(admin5);

        ArrayList<admin> adminList = adminObj.getAdminList();

        // Menampilkan data admin dari ArrayList
        for (admin a : adminList) {
            System.out.println("Username: " + a.getUsername());
            System.out.println("Password: " + a.getPassword());
            System.out.println("Tanggal Dibuat: " + a.getTanggaldibuat());
            System.out.println();
        }
    }
}

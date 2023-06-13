package perlengkapan;

import java.util.ArrayList;

public class detail_cuti {
    private String tipecuti, tanggalcuti, tanggalselesaicuti, alasancuti,
                    tanggalpengajuan, pesanadmin, tanggalkonfirmasiadmin,
                    status, telahdibacaadmin;
    private ArrayList<detail_cuti> cutiList;

    public detail_cuti() {
        cutiList = new ArrayList<>();
    }

    public void setTipecuti(String tipecuti) {
        this.tipecuti = tipecuti;
    }

    public String getTipecuti() {
        return this.tipecuti;
    }

    public void setTanggalcuti(String tanggalcuti) {
        this.tanggalcuti = tanggalcuti;
    }

    public String getTanggalcuti() {
        return this.tanggalcuti;
    }

    public void setTanggalselesaicuti(String tanggalselesaicuti) {
        this.tanggalselesaicuti = tanggalselesaicuti;
    }

    public String getTanggalselesaicuti() {
        return this.tanggalselesaicuti;
    }

    public void setAlasancuti(String alasancuti) {
        this.alasancuti = alasancuti;
    }

    public String getAlasancuti() {
        return this.alasancuti;
    }

    public void setTanggalpengajuan(String tanggalpengajuan) {
        this.tanggalpengajuan = tanggalpengajuan;
    }

    public String getTanggalpengajuan() {
        return this.tanggalpengajuan;
    }

    public void setPesanadmin(String pesanadmin) {
        this.pesanadmin = pesanadmin;
    }

    public String getPesanadmin() {
        return this.pesanadmin;
    }

    public void setTanggalkonfirmasiadmin(String tanggalkonfirmasiadmin) {
        this.tanggalkonfirmasiadmin = tanggalkonfirmasiadmin;
    }

    public String getTanggalkonfirmasiadmin() {
        return this.tanggalkonfirmasiadmin;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTelahdibacaadmin(String telahdibacaadmin) {
        this.telahdibacaadmin = telahdibacaadmin;
    }

    public String getTelahdibacaadmin() {
        return this.telahdibacaadmin;
    }

    public void addCuti(detail_cuti cuti) {
        cutiList.add(cuti);
    }

    public ArrayList<detail_cuti> getCutiList() {
        return cutiList;
    }

    public static void main(String[] args) {
        detail_cuti cutiObj = new detail_cuti();

        detail_cuti cuti1 = new detail_cuti();
        cuti1.setTipecuti("Cuti Tahunan");
        cuti1.setTanggalcuti("2023-06-12");
        cuti1.setTanggalselesaicuti("2023-06-15");
        cuti1.setAlasancuti("Liburan");
        cuti1.setTanggalpengajuan("2023-06-10");
        cuti1.setPesanadmin("Cuti disetujui");
        cuti1.setTanggalkonfirmasiadmin("2023-06-11");
        cuti1.setStatus("Disetujui");
        cuti1.setTelahdibacaadmin("Ya");
        cutiObj.addCuti(cuti1);

        detail_cuti cuti2 = new detail_cuti();
        cuti2.setTipecuti("Cuti Sakit");
        cuti2.setTanggalcuti("2023-06-20");
        cuti2.setTanggalselesaicuti("2023-06-22");
        cuti2.setAlasancuti("Sakit Flu");
        cuti2.setTanggalpengajuan("2023-06-18");
        cuti2.setPesanadmin("Cuti ditolak");
        cuti2.setTanggalkonfirmasiadmin("2023-06-19");
        cuti2.setStatus("Ditolak");
        cuti2.setTelahdibacaadmin("Ya");
        cutiObj.addCuti(cuti2);

        ArrayList<detail_cuti> cutiList = cutiObj.getCutiList();

        // Menampilkan data cuti dari ArrayList
        for (detail_cuti c : cutiList) {
            System.out.println("Tipe Cuti: " + c.getTipecuti());
            System.out.println("Tanggal Cuti: " + c.getTanggalcuti());
            System.out.println("Tanggal Selesai Cuti: " + c.getTanggalselesaicuti());
            System.out.println("Alasan Cuti: " + c.getAlasancuti());
            System.out.println("Tanggal Pengajuan: " + c.getTanggalpengajuan());
            System.out.println("Pesan Admin: " + c.getPesanadmin());
            System.out.println("Tanggal Konfirmasi Admin: " + c.getTanggalkonfirmasiadmin());
            System.out.println("Status: " + c.getStatus());
            System.out.println("Telah Dibaca Admin: " + c.getTelahdibacaadmin());
            System.out.println();
        }
    }
}

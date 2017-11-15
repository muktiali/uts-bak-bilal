package tugas.uts;

public class musuh {
    private String nama;
    private int nyawa;
    private String warna_tubuh;

    public musuh(String nama, int nyawa, String warna_tubuh) {
        this.nama = nama;
        this.nyawa = nyawa;
        this.warna_tubuh = warna_tubuh;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }

    public String getWarna_tubuh() {
        return warna_tubuh;
    }

    public void setWarna_tubuh(String warna_tubuh) {
        this.warna_tubuh = warna_tubuh;
    }
}

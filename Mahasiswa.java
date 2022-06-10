package mylaptop;

import java.util.Objects;

public class Mahasiswa {
    private Integer NIM;
    private String nama;
    private String kelas;

    public Mahasiswa(Integer NIM, String nama, String kelas) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mahasiswa mahasiswa = (Mahasiswa) o;
        return Objects.equals(NIM, mahasiswa.NIM) && Objects.equals(nama, mahasiswa.nama) && Objects.equals(kelas, mahasiswa.kelas);
    }

    @Override
    public int hashCode() {

        final int HASH_MULTIPLIER = 29;
        int h1 = NIM.hashCode();
        int h2 = nama.hashCode();
        int h3 = kelas.hashCode();
        int h = HASH_MULTIPLIER * h1 + h2 + h3;
        return h;
    }

    @Override
    public String toString() {

        return "Mahasiswa[ " +
                "NIM=" + NIM +
                ",nama= '" + nama + '\'' +
                ",kelas= '" + kelas + '\'' +
                "}";
    }
}

package mylaptop;

import java.util.HashMap;

public class Main {
    public static int mean (HashMap<Mahasiswa, Integer> mhs){
        int jumlahNilai = 0;
        for (Object o: mhs.keySet()){
            jumlahNilai += mhs.get(o);
        }
        return (jumlahNilai/mhs.size());
    }

    public static void print (HashMap<Mahasiswa, Integer> mhs){
        for (Object o: mhs.keySet()){
            System.out.println("key: " + o + " nilai dari mahasiswa: " + mhs.get(o));
        }
    }

    public static void main(String[] args) {
        HashMap<Mahasiswa, Integer> mhs = new HashMap<Mahasiswa, Integer>();

        Mahasiswa Angel = new Mahasiswa (670621005, "Angel", "45-04");
        mhs.put(Angel, 99);
        Mahasiswa Thessa = new Mahasiswa (670621302, "Thessa", "45-04");
        mhs.put(Thessa, 98);
        Mahasiswa Fina = new Mahasiswa (670621303, "Fina", "45-01");
        mhs.put(Fina, 97);
        Mahasiswa Wulan = new Mahasiswa (670621301, "Wulan", "45-03");
        mhs.put(Wulan, 96);
        Mahasiswa Maria = new Mahasiswa (670621308, "Maria", "45-04");
        mhs.put(Maria, 95);

        print(mhs);
        System.out.println("Rata-rata nilai mahasiswa dengan jumlah mhs: " + mhs.size()+ " adalah " + mean(mhs) );

        mhs.remove(Maria);
        System.out.println();

        print(mhs);
        System.out.println("Rata-rata nilai mahasiswa dengan jumlah mhs: " + mhs.size()+ " adalah " + mean(mhs) );
    }
}


public class Main {
    public static void main(String[] args) {
        Siswa inputdata1 = new Siswa();
        Siswa inputdata2 = new Siswa();
        Siswa inputdata3 = new Siswa();
        Siswa inputdata4 = new Siswa();

        inputdata1.namasiswa = "Baihaqi ";
        inputdata1.nim = "133456666";
        inputdata1.jurusan = "IPS";
        inputdata1.semester = "1";
        inputdata1.mapel = "Geografi";
        inputdata1.kodemapel = "Geo445";



        inputdata1.output1();
        inputdata1.output2();
        inputdata1.output3();

        inputdata2.mapel = "Sosiologi";
        inputdata2.kodemapel = "SO2334";
        inputdata2.semester = "1";

        inputdata2.output2();
        inputdata2.output3();
    }
}

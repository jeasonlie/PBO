public class MKNilai {
    String NamaMK, Grade;
    double NilaiTugas, NilaiKuis,
            NilaiUTS, NilaiUAS, Softskill, NilaiAkhir, Bobot;

    public void nilaiAkhir(){
        NilaiAkhir = Softskill == 0 ? (NilaiTugas*0.2)+(NilaiKuis*0.1)+(NilaiUTS*0.3)+(NilaiUAS*0.4) :
                (NilaiTugas*0.2)+(NilaiKuis*0.1)+(NilaiUTS*0.3)+(NilaiUAS*0.3)+(Softskill*0.1);
        if(NilaiAkhir >= 80){
            Grade = "A";
            Bobot = 4;
        }
        else if(NilaiAkhir >= 76){
            Grade = "A-";
            Bobot = 3.7;
        }
        else if(NilaiAkhir >= 72){
            Grade = "B+";
            Bobot = 3.3;
        }
        else if(NilaiAkhir >= 68){
            Grade = "B";
            Bobot = 3;
        }
        else if(NilaiAkhir >= 64){
            Grade = "B-";
            Bobot = 2.7;
        }
        else if(NilaiAkhir >= 60){
            Grade = "C+";
            Bobot = 2.3;
        }
        else if(NilaiAkhir >= 56){
            Grade = "C";
            Bobot = 2;
        }
        else if(NilaiAkhir >= 46){
            Grade = "D";
            Bobot = 1;
        }
        else{
            Grade = "E";
            Bobot = 0;
        }
    }

}

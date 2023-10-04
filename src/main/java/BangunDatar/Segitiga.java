package BangunDatar;

public class Segitiga {
    private int alas, tinggi;

//    public Segitiga(int alas, int tinggi) { // constructor
//        this.alas = alas;
//        this.tinggi = tinggi;
//    }

    public double hitungluas(int alas, int tinggi){ //method
        double luas = 0.5*alas*tinggi;
        return luas;
    }

    public double SisiMiring(int alas,int tinggi){
        double sisiMiring = Math.sqrt(Math.pow(alas,2)*Math.pow(tinggi,2));
        return sisiMiring;
    }

}

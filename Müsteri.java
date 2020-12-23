package ProjeVeterinerBirligi;

import java.util.ArrayList;

public class Müsteri extends Kisi {


    private String adress;

    private ArrayList<Hayvan> musteriHayvanlari;


    public Müsteri(String isim, String tcKimlik, String adress) {
        super(isim, tcKimlik);
        this.adress=adress;
        musteriHayvanlari=new ArrayList<>();
    }
    public void musteriyeHayvanEkle(Hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan+" " +getIsim()+"Müsterisine eklendi");
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+"Ben bir Müsteriyim");

    }

    @Override
    public String toString() {
        return super.toString()+"Müsteri{" +
                "adress='" + adress + '\'' +
                '}';
    }
}

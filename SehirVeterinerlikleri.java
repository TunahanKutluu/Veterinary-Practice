package ProjeVeterinerBirligi;

import java.util.ArrayList;

public class SehirVeterinerlikleri {


private String sehir ;
private ArrayList<Veteriner> sehirdekiVeterinerler;

private int ToplamVeterinerSayisi;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        ToplamVeterinerSayisi=0;
    }

    public void SehireVeterinerEkle(Veteriner veteriner){
 ToplamVeterinerSayisi++;
        sehirdekiVeterinerler.add(veteriner);
    }
    public void sehirdekiToplamVeterinerSayisiniBUl(){
        System.out.println("toplam veteriner sayisi : "+sehirdekiVeterinerler.size());
    }
}

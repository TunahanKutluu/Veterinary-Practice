package ProjeVeterinerBirligi;

import java.util.ArrayList;

public class Veteriner extends Kisi {

    private String mezunOlduguOkul;
    int calısmasuresi;

    private ArrayList<Müsteri> veterinerMüsterileri;
    private int musteriSayisi;

    public Veteriner(String isim, String tcKimlik,String mezunOlduguOkul, int calısmasuresi) {
        super(isim, tcKimlik);
        this.mezunOlduguOkul=mezunOlduguOkul;
        this.calısmasuresi=calısmasuresi;
        veterinerMüsterileri= new ArrayList<>();
        musteriSayisi=0;
    }
    public void musteriEkle(Müsteri müsteri){
veterinerMüsterileri.add(müsteri);
musteriSayisi++;
    }
    public void musterileriListele(){
        for (Müsteri m : veterinerMüsterileri){
        m.kendiniTanit();
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(toString()+"Ben bir veterinerim");
    }

    @Override
    public String toString() {
        return super.toString()+"Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                ", calısmasuresi=" + calısmasuresi +
                '}';
    }
}

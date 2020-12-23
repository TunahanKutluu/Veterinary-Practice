package ProjeVeterinerBirligi;

public class Main {
    public static void main(String[] args) {
     ilkNesneleriOlustur();

    }

    private static void ilkNesneleriOlustur() {
        Kedi kedi = new Kedi("01.01.2017",true,"Van kedisi");
        Kedi kedi2= new Kedi("01.02.2012",false,"tekir");

        Kopek kopek = new Kopek("01.02.2021",true,1,"Golden");
        Kopek kopek2 = new Kopek("01.02.2022",true,4,"Rotwaier");
        Kopek kopek3 = new Kopek("01.02.2017",true,3,"Pug");

        Müsteri m1 = new Müsteri("emre","12133213","Ankara");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek);

        Müsteri m2 = new Müsteri("taylan","32323","Ankara");
        Müsteri m3 = new Müsteri("tunahan","1323","izmir");

        Veteriner v1 = new Veteriner("Ayse","42424","Avrasya",6);
        v1.musteriEkle(m1);
        v1.musteriEkle(m2);
        Veteriner v2 = new Veteriner("bora","1231","izmir",4);

        v1.musteriEkle(m1);
        Veteriner v3 = new Veteriner("ahmey","7557","ankara",1);
        v3.musteriEkle(m3);
        v1.musterileriListele();
        SehirVeterinerlikleri ankara = new SehirVeterinerlikleri("Ankara");
        ankara.SehireVeterinerEkle(v1);


        SehirVeterinerlikleri izmir = new SehirVeterinerlikleri("izmir");
        izmir.SehireVeterinerEkle(v1);

        ankara.sehirdekiToplamVeterinerSayisiniBUl();
        izmir.sehirdekiToplamVeterinerSayisiniBUl();

    }
}

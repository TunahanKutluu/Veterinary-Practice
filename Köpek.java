package ProjeVeterinerBirligi;

class Kopek extends Hayvan {
    private int asiSayisi;
    private String tur;
    private String cins;



    public Kopek(String dogumTarihi, boolean kayitli , int asiSayisi ,String cins) {
        super(dogumTarihi, kayitli);
        this.asiSayisi=asiSayisi;
        this.tur="Kopek";
        this.cins=cins;

    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString()+"" +super.toString());

    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getAsiSayisi() {
        return asiSayisi;
    }

    public void setAsiSayisi(int asiSayisi) {
        this.asiSayisi = asiSayisi;
    }

    @Override
    public String   toString() {
        return "Kopek{" +
                "asiSayisi=" + asiSayisi +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}

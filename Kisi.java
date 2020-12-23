package ProjeVeterinerBirligi;

abstract public class Kisi {
    private String İsim;
    private  String tcKimlik;

    public Kisi(String isim, String tcKimlik) {
        İsim = isim;
        this.tcKimlik = tcKimlik;
    }

    public String getIsim() {
        return İsim;
    }

    public void setIsim(String isim) {
        İsim = isim;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }
    abstract void kendiniTanit();

    @Override
    public String toString() {
        return "Kisi{" +
                "İsim='" + İsim + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                '}';
    }
}

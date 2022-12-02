package Cars;

public enum TypeCouzov {
    SEDAN(" Cedan"), HETCHBEK("JHerch"),COUPE("Coupe"),UNIVERSAL("Universali"),VNEDOROG("4x4"),CROSSOver("crossqver"),PIKAP("pikapi"),FURGON("furgon"),MINIVEN("miniven ");
    private  final String nazvenie;

    TypeCouzov(String nazvenie) {
        this.nazvenie = nazvenie;
    }

    public String getNazvenie() {
        return nazvenie;
    }
}

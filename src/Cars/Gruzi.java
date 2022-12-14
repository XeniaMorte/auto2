package Cars;

public enum Gruzi {
    N1(0,3.5f),N2(3.5f,12),N(12,Float.MAX_VALUE);
    private   float countMinGruzi;
    private float countMaxGruzi;
    Gruzi(float countMinGruzi,float countMaxGruzi){
        this.countMinGruzi=countMinGruzi;
       this.countMaxGruzi=countMaxGruzi;
    }

    public float getCountMaxGruzi() {
        return countMaxGruzi;
    }

    public float getCountMinGruzi() {
        return countMinGruzi;
    }
}

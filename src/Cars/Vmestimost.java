package Cars;

public enum Vmestimost {
    OSOBOMALA(0,10),MALA(11,25),SREDN(40,50),BOLSHA(60,80),OBOLSHA(100,120);
    int minCountSit;
    int maxCountSit;
    Vmestimost(int minCountSit,int maxCountSit){
        this.minCountSit=minCountSit;
        this.maxCountSit=maxCountSit;
    }

    public int getMaxCountSit() {
        return maxCountSit;
    }

    public int getMinCountSit() {
        return minCountSit;
    }
}

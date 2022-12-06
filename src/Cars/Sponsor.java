package Cars;

public class Sponsor {
 private    String sName;
   private Integer chekS;
    public Sponsor(String sName, String alpha, Integer chekS){
        this.chekS=chekS;
        this.sName=sName;
    }

    public Integer getChekS() {
        return chekS;
    }

    public String getsName() {
        return sName;
    }

    @Override
    public String toString() {
        return "Cars.Sponsor{" +
                "sName='" + sName + '\'' +
                ", chekS=" + chekS +
                '}';
    }
    public void sponsored(){
        System.out.println("Sponsored by: "+ sName+" $"+chekS);
    }
}

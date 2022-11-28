package Cars;

public abstract class Driver<T> {
    private String fio;
    private T havingLicense;



    public String getFio() {
        return fio;
    }
    public T isHavingLicense() {
        return havingLicense;
    }

    public Driver(String fio,String skill,T havingLicense){
        this.fio=fio;
        this.havingLicense=havingLicense;


    class LisenceA {
        String lic = "A";

        @Override
        public String toString() {
            return "A lisenc" + lic;

        }
    }

        class LisenceB {
            String lic = "B";

            @Override
            public String toString() {
                return "B lisenc" + lic;

            }
        }

           class LisenceC {
                String lic = "C";

                @Override
                public String toString() {
                    return "C lisenc" + lic;

                }
            }

        }
        public String inFo(){
        return  this.fio+ isHavingLicense().toString();}

    public String inFoClass(){
        return  this.fio+ isHavingLicense().getClass();}

    abstract String start();

    abstract String stop();

    abstract String refuel();
}




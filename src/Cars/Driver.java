package Cars;

public abstract class Driver<T> {
    private String fio;
    private T license;


    public String getFio() {
        return fio;
    }


    public Driver(String fio, T license) {
        this.fio = fio;
        this.license = license;
    }


    abstract String start();

    abstract String stop();

    abstract String refuel();

    abstract public void printCarMessage();

    public static class LicenceB {
        String lic = "B";

        @Override
        public String toString() {
            return "License is: " + lic;

        }
    }

    public static class LicenceC {
        String lic = "C";

        @Override
        public String toString() {
            return "License is: " + lic;

        }
    }

    public static class LicenceD {
        String lic = "D";

        @Override
        public String toString() {
            return "License is: " + lic;

        }
    }

}




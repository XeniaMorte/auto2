package Cars;

public class DiagnostocExpression extends Exception{
    String massange;
    public DiagnostocExpression(String massange){
        this.massange=massange;
    }

    @Override
    public String toString() {
        return massange;

    }
}

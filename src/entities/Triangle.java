package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double get_area(){
        double p = (a + b + c)/2.0;
        double result = Math.sqrt(p*(p-a)*(p-a)*(p-a));

        return result;
    }
}

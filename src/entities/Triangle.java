package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double get_area(){
        double p = (a + b + c)/2.0;
        double result = Math.sqrt(p*(p-a)*(p-a)*(p-a));

        return result;
    }
}

package solver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class TwoLineEquation{
    //ax+by=c
    //dx+ey=f
    final double a,b,c,d,e,f;
    private double x,y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public TwoLineEquation(double a, double b, double c, double d, double e,double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f=f;
        this.y=(f-c*d/a)/(e-b*d/a);
        this.x=(c-b*y)/a;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> strArg=new ArrayList<>();
        strArg.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        strArg.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        double[] dArg=new double[6];
        for(int i=0;i<6;i++){
            dArg[i]=Double.parseDouble(strArg.get(i));
        }
        TwoLineEquation eq=new TwoLineEquation(dArg[0],dArg[1],dArg[2],dArg[3],dArg[4],dArg[5]);
        System.out.printf(eq.getX()+" "+eq.getY());
    }
}

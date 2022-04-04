import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        double a=2.14 ,e=3.67,d=1.11,m=0.95,p=5.00;
        double akg,ekg,dkg,mkg,pkg;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç kilo armut?  :");
        akg=girdi.nextDouble();

        System.out.print("Kaç kilo elma?  :");
        ekg=girdi.nextDouble();

        System.out.print("Kaç kilo domates?:");
        dkg=girdi.nextDouble();

        System.out.print("Kaç kilo muz?    :");
        mkg=girdi.nextDouble();

        System.out.print("Kaç kilo patlican? :");
        pkg=girdi.nextDouble();

        double tutar =((a*akg)+(e*ekg)+(d*dkg)+(m*mkg)+(p*pkg));
        System.out.print("Toplam Tutar : " + tutar);



    }

}

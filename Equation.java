import java.util.Scanner;

public class Equation {
     static void CalculateQuadratic() {
        Scanner scanner = new Scanner(System.in);
        double delta;
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();

        if ( a==0 && b==0){
            System.out.println(" Phuong trinh vo nghiem");
        }
        else if( a==0){
            System.out.println("Phuong trinh co mot nghiem: "+ -(c)/b);
        }
        else{
            delta = b*b-4*a*c;
            if ( delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if( delta ==0){
                System.out.println("Phuong trinh co nghiem kep: "+ -(b)/(2*a));
            }
            else if( delta >0){
            System.out.println("Nghiem thu nhat la: "+((-b + Math.sqrt(delta))/ (2*a)));
            System.out.println("Nghiem thu hai la: "+((-b - Math.sqrt(delta))/ (2*a)));
        }
        scanner.close();
    }
}
}

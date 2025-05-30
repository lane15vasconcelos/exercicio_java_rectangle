package application;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        double area = rec.area();
        double perimeter = rec.perimeter();
        double diagonal = rec.diagonal();


        System.out.println("Área: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

    sc.close();
    }
    

    
}

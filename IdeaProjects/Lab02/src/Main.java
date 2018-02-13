import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        double lengthRec;
        double widthRec;
        double radCircle;
        double sideA;
        double sideB;
        double sideC;
        double triS;
        double radSphere;
        double diamPris;
        double heightPris;
        double widthPris;
        double heightCyl;
        double radiusCyl;


        System.out.println("Enter length of rectangle (positive integer): ");
        lengthRec = scanner.nextDouble();

        System.out.println("Enter width of rectangle (positive integer): ");
        widthRec = scanner.nextDouble();

        System.out.println("Now enter the radius of the circle (positive integer): ");
        radCircle = scanner.nextDouble();

        System.out.println("Enter side A of triangle (positive integer): ");
        sideA = scanner.nextDouble();

        System.out.println("Enter side B of triangle (positive integer): ");
        sideB = scanner.nextDouble();

        System.out.println("Enter side C of triangle (positive integer): ");
        sideC = scanner.nextDouble();

        triS = (sideA + sideB + sideC) / 2;

        System.out.println("Area of rectangle: " + (lengthRec * widthRec));
        System.out.println("Area of circle: " + (3.14 * (radCircle * radCircle)));
        System.out.println("Perimeter of rectangle: " + (2 * (lengthRec + widthRec)));
        System.out.println("Circumference of circle: " + (2 * 3.14 * radCircle));
        System.out.println("Area of triangle: " + (Math.sqrt(triS * (triS - sideA) * (triS - sideB) * (triS - sideC))));
        System.out.println("Perimeter of triangle: " + (sideA + sideB + sideC));

        System.out.println("Enter the radius of the sphere: ");
        radSphere = scanner.nextDouble();

        System.out.println("Enter the diameter of the rectangular prism: ");
        diamPris = scanner.nextDouble();

        System.out.println("Enter the height of the rectangular prism: ");
        heightPris = scanner.nextDouble();

        System.out.println("Enter the width of the rectangular prism: ");
        widthPris = scanner.nextDouble();

        System.out.println("Enter the height of the cylinder: ");
        heightCyl = scanner.nextDouble();

        System.out.println("Enter the radius of the cylinder: ");
        radiusCyl = scanner.nextDouble();

        System.out.println("The surface area of the sphere is: " + (4 * 3.14 * (radSphere * radSphere)));
        System.out.println("The volume of the sphere is: " + (4 * 3.14 * (radSphere * radSphere * radSphere) / 3));
        System.out.println("The surface area of the rectangular prism is: " + 2 * ((heightPris * widthPris) + (heightPris * diamPris) + (diamPris * widthPris)));
        System.out.println("The volume of the rectangular prism is: " + heightPris * diamPris * widthPris);
        System.out.println("The surface area of the cylinder is: " + ((2 * 3.14 * radiusCyl * heightCyl) + (2 * 3.14 * (radiusCyl * radiusCyl))));
        System.out.println("The volume of the cylinder is: " + 3.14 * (radiusCyl * radiusCyl) * heightCyl);




    }
}
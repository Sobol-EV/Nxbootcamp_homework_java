package nx.bootcamp.homework3;

public class Homework3_2_1 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = -5.0;
        double c = 6.0;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("No solutions");
        }
    }
}

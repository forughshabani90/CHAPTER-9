package listing;

public class totallArea {
    public double radius =0 ;

    public static void main(String[] args) {
        Circle[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
        printCircleArray(circleArray);
    }
    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }
        return circleArray;
    }
    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf( "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf( circleArray[i].getradius() , circleArray[i].getArea());
        }
        System.out.println("--------");
        System.out.printf("%–30s%–15f\n", "The total area of circles is", sum(circleArray));
    }

    public static double sum(Circle[] circleArray) {
        double sum = 0;

        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

        return sum;
    }

}

public class ForLoop {
    public static void main (String [] args) {
        ForLoop forLoop = new ForLoop();
//        forLoop.printXTimes(10, "Dhruv Is Cool");
        forLoop.printXTimes(0, "Dhruv Is Cool");
        System.out.println(forLoop.powers(100,2));
        System.out.println(forLoop.areaOfSquare(10));
        System.out.println(forLoop.areaOfRectangle(5,2));
        System.out.println(forLoop.areaOfCircle(7));
    }
    public void printXTimes(int x, String message){
        for(int i = 1; i < x; i++){
            System.out.println(message);
        }
    }
    public double powers (double base, int exponent){
        double result = 1;
        if (exponent < 0){
            base = 1/base;
            exponent = exponent * -1;
        }
        for(int i = 0; i < exponent; i++){
            result = result * base;
        }
        return result;
    }

    /**
     * areaOfSquare is a function that takes the length of the side of a square as an input and squares the length to
     * return the area of the square. It also throws an exception when the length of the side is negative, which is not
     * possible
     *
     * @param side
     * @return
     */
    public double areaOfSquare (double side) {
        double area = 0;
        if (side < 0){
            throw new IllegalArgumentException("Error, side of a square can never be negative");
        }
        area = side * side;
        return area;
    }

    /**
     * areaOfRectangle is a function that takes the length and width of a rectangle as an input and multiplies both to
     * return the area of the rectangle. It also throws an exception when the length, width, or both are negative, which
     * is not possible
     *
     * @param length
     * @param width
     * @return
     */
    public double areaOfRectangle (double length, double width) {
        double area = 0;
        if (length < 0) {
            throw new IllegalArgumentException("Error, length of a rectangle can never be negative");
        }
        if (width < 0) {
            throw new IllegalArgumentException("Error, width of a rectangle can never be negative");
        }
            area = length * width;
        return area;
    }

    /**
     * @param radius
     * @return
     */
    /* areaOfCircle is a function that takes the radius of a circle as an input and multiplies it by 44/7 to return the
    area of the rectangle. It also throws an exception when the radius is negative, which is not possible
     */
    public double areaOfCircle (double radius) {
        double area = 0;
        if (radius < 0) {
            throw new IllegalArgumentException("Error, radius of a circle can never be negative");
        }
        area = radius * radius * 22/7;
        return area;
    }
    }

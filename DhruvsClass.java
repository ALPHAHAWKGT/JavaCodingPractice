public class DhruvsClass {
    public static void main (String [] args){
        System.out.println("");
        DhruvsClass dhruvsClass = new DhruvsClass();
        System.out.println(dhruvsClass.calculate(2,3, "-"));
        System.out.println(dhruvsClass.calculate(2,3, "+"));
        System.out.println(dhruvsClass.calculate(2,3, "+"));
        System.out.println(dhruvsClass.calculate(2,3, "/"));
        System.out.println(dhruvsClass.calculate(2,0, "/"));
        System.out.println(dhruvsClass.calculate(2,3, "&"));
    }
    public double calculate (int num1, int num2, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0)
                    throw new IllegalArgumentException("Dividing by 0 is illegal");
                result = (double) num1 / num2;
                break;
            default:
                throw new UnsupportedOperationException("Error, Operation Not Supported");
//                System.out.println("Error, Operation Not Supported");
        }
        return result;
    }
}
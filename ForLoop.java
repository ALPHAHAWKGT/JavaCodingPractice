public class ForLoop {
    public static void main (String [] args) {
        ForLoop forLoop = new ForLoop();
//        forLoop.printXTimes(10, "Dhruv Is Cool");
        forLoop.printXTimes(0, "Dhruv Is Cool");
        System.out.println(forLoop.powers(2,-2));
    }
    public void printXTimes(int x, String message){
        for(int i = 0; i < x; i++){
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
}

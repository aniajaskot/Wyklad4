public class Calculator {
    public void sumAndShow(int a, int b){
//        int c = a+b;
        int c = sumAndReturn(a,b);
        System.out.println(c);
    }

    public int sumAndReturn(int a, int b){
        int c = a + b;
        return c;
        // return a+b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public void subtractAndShow(int a, int b){
        System.out.println(a-b);
    }
}

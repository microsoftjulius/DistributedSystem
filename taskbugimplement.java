public class taskbugimplement implements taskbug{
    public void printMsg(){
        System.out.println("Connection has been extablished");
    }
    public void pairOut(int x, int y){
        int Sum = x + y;
        System.out.println("The Sum is: " + Sum);
    }
    public void Subtract(int y, int x){
        int Difference = x - y;
        System.out.println("The Difference is: " + Difference);
    }
    public void Multiplication(int y, int x){
        int Product = y * x;
        System.out.println("The Product is: " + Product);
    }
    public void Division(int y, int x){
        int quotient = y/x;
        System.out.println("The Quotient is: " + quotient);
    }
    public void OddNumbers(int min, int max){
        System.out.println("The Odd numbers are: ");
        for(int i = min; i <=max; i++ ){
            if(i % 2 == 1){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.println("End of Odd Numbers");
    }
    public void EvenNumbers(int min, int max){
        System.out.println("The Even Numbers are: ");
        for(int i = min; i <=max; i++ ){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.println("End of Even Numbers");
    }
    public void squareRoot(double x) {
        System.out.println("Finding the Square root of a number");
        double sqroot = Math.sqrt(x);
        System.out.println("The square root is: " + sqroot);
    }
}
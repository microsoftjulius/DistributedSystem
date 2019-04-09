import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client{
    private client(){}
    public static void main(String[] args){
        String host = (args.length < 1) ? null : args[0];
        try{
            //getting the registry
            Registry registry = LocateRegistry.getRegistry(host);
            //Looking up the registry for the remote Object
            taskbug stub = (taskbug) registry.lookup("Hello");
            //calling the remote method using the obtained object
            stub.printMsg();
            while(true){
                Scanner scanObj = new Scanner(System.in);
                System.out.print("Enter the First Number ");
                int FirstNumber = scanObj.nextInt();
                System.out.print("Enter the Second Number: ");
                int SecondNumber = scanObj.nextInt();
                System.out.println("--------------------------------------------------------");
                    System.out.println("1. Sum");
                    System.out.println("2. Difference");
                    System.out.println("3. Product");
                    System.out.println("4. Division");
                    System.out.println("5. OddNumbers");
                    System.out.println("6. EvenNumbers");
                    System.out.println("7. squareRoot");
                System.out.println("--------------------------------------------------------");
                System.out.println("Choose what to do with the Numbers: ");
                int expression = scanObj.nextInt();
                    switch(expression) {
                        case 1:
                        stub.pairOut(FirstNumber, SecondNumber);
                           break;
                        case 2:
                        stub.Subtract(FirstNumber, SecondNumber);
                           break; // optional
                        case 3:
                        stub.Multiplication(FirstNumber, SecondNumber);
                            break;
                        case 4:
                        stub.Division(FirstNumber, SecondNumber);
                            break;
                        case 5:
                        stub.OddNumbers(FirstNumber, SecondNumber);
                            break;
                        case 6:
                        stub.EvenNumbers(FirstNumber, SecondNumber);
                            break;
                        case 7:
                            stub.squareRoot(FirstNumber);
                            stub.squareRoot(SecondNumber);
                            break;
                        }
                        System.out.println("Type 8 to continue or any other number to Exit: ");
                        int decision = scanObj.nextInt();
                        if(decision != 8){
                            break;
                        }
                     
                // System.out.println("Remote method invoked"); 
            }
           
           
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString()); 
            e.printStackTrace(); 
         } 
      } 
   }
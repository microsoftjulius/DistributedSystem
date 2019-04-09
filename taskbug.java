import java.rmi.Remote;
import java.rmi.RemoteException;
//creating an interface for the app
public interface taskbug extends Remote{
    void printMsg() throws RemoteException;
    void pairOut(int y, int x) throws RemoteException;
    void Subtract(int y, int x) throws RemoteException;
    void Multiplication(int y, int x) throws RemoteException;
    void Division(int y, int x) throws RemoteException;
    void OddNumbers(int y, int x) throws RemoteException;
    void EvenNumbers(int y, int x) throws RemoteException;
    void squareRoot(double x) throws RemoteException;
}
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class server extends taskbugimplement{
    public server(){}
        public static void main(String args[]) { 
            try{
                //Instantiating the Implementation class
                server obj = new server();
                //ImplMaster obj = new ImplMaster();

                //Exporting the Object of the implementation class
                //(here we are exporting the remote object to the stub)

                taskbug stub = (taskbug) UnicastRemoteObject.exportObject(obj, 0);  

                //Binding the remote object (stub) into the registry

                Registry registry = LocateRegistry.getRegistry();

                registry.rebind("Hello", stub);
                System.err.println("Server ready");
            }
            catch(Exception e){
                System.err.println("Server Exeption: " + e.toString());
                e.printStackTrace();
            }
    }
}
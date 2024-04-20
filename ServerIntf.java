import java.rmi.*;

interface ServerIntf extends Remote{
	
	public String vowelscount(char[] str) throws RemoteException;

}

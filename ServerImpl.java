import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf{
	public ServerImpl() throws RemoteException{
	
	}
	
	public String vowelscount(char[] str) throws RemoteException{
		int i, vowels=0;
		for(i=0;i<str.length;i++){
			if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' ||
			str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'  ){
			
				vowels++;
			}
			
		}
		
		return Integer.toString(vowels);
	}

}

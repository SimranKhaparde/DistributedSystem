import java.rmi.*;
import java.util.Scanner;

public class Client{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
	
		try{
		
			String serverURL="rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			System.out.println("Enter String: ");
			String str = sc.next();
			char[] charArray = str.toCharArray();
			
			System.out.println("Vowels count is: " + serverIntf.vowelscount(charArray));
		}catch(Exception e){
			System.out.println("Error at Client!" + e.getMessage());
			}
	}
}

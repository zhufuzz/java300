package InetAddressTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		InetAddress addr = null;
		
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(addr);
	}

}

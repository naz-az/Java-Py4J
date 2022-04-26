import py4j.GatewayServer;

public class Py4j {
public int addition(int first, int second, int third, int forth) {
		System.out.println("Hello,c!"); 
	    return first + second + third + forth;
	  }
public int prism(int acai) {
	acai=6000001;
	System.out.println("Hello, World!"); 
    return acai;
  }


public String prismz(String acai) {
	acai="PRISM probability and statesssssssssss";
	System.out.println("Hello, Worldzz!"); 
    return acai;
  }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        // TODO code application logic here
	     Py4j app = new Py4j();
	    // app is now the gateway.entry_point
	    GatewayServer server = new GatewayServer(app);
	    server.start();
	    }
}

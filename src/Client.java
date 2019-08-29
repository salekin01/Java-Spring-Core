//import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// Object Construction | Done by developer
		
		Employee eRef = new Employee();
		eRef.setEid(557731);
		eRef.setEname("Salekin");
		eRef.setEaddress("RitterStraﬂe");
		
		System.out.println("Employee Details:" + eRef);		 
	}
}

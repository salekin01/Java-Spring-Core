//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// Object Construction | Done by developer
		
		Employee eRef = new Employee();
		eRef.setEid(557731);
		eRef.setEname("Salekin");
		eRef.setEaddress(new Address("chemnitz", "Saxony",9111));		
		System.out.println("Employee Details:" + eRef);	
		
		// Spring Way | IOC (Inversion of Control)
		
		//Container1
		/*
		Resource resource = new ClassPathResource("EmployeeBean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);    //BeanFactory = spring container which will parse xml file and construct the objects
		
		Employee e1 = (Employee)factory.getBean("emp1");       //way1: object is constructed using spring core container, i didn't create the object
		Employee e2 = factory.getBean("emp2",Employee.class);  //way2:  
		
		System.out.println("Employee1 Details: "+ e1);         //Details are coming from spring core container object
		System.out.println("Employee1 Details: "+ e2);
		*/
		
		//Container2
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
		
		Employee e1 = (Employee)context.getBean("emp1");       
		Employee e2 = context.getBean("emp2",Employee.class);    
		
		System.out.println("Employee1 Details: "+ e1);          
		System.out.println("Employee1 Details: "+ e2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // close the context
	}
}

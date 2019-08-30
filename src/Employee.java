
//Bean or Model or POJO(Plain Old Java Object)
public class Employee {
	//Attributes
	int eid;
	String ename;
	Address eaddress;
	
	//Methods
	public Employee() {
		System.out.println("--Employee object constructed--");
	}
	
	//Dependency injection used by developer
	public Employee(int eid, String ename, Address eaddress) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	
	//Dependency injection used by IOC
	public Employee(Address eaddress) {
		this.eaddress = eaddress;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Address getEaddress() {
		return eaddress;
	}

	//setter injection
	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}

	public void myInit() {
		System.out.println("--Object Initialized--");
	}
	
	public void myDestroy() {
		System.out.println("--Object Destroyed--");
	}
}

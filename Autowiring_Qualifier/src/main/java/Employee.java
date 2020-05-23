import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired(required=true)
    @Qualifier("address2")  //it will find the bean with the given name
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	
}

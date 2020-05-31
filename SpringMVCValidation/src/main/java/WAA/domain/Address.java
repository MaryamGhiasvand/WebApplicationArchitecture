package WAA.domain;

//for notBlank hibernate is deprecated
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {
	@NotBlank(message ="Street must have a value")
	private String street;
	
	@Size(min=2, max=2, message ="Size of State must be 2")
	private String state;
	
	@NotNull(message = "zipCode must have a value")
	private Integer zipcode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	

}

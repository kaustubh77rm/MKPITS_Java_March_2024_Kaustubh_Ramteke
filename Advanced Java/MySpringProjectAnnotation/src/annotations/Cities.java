package annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component("c1")
@PropertySource("application.properties")
public class Cities {
	@Value("${city}")
	private String city;
	@Value("${state}")
	private String state;
	@Value("${country}")
	private String country;
	
	Cities(){}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void display() {
		System.out.println("city="+city);
		System.out.println("state="+state);
		System.out.println("country="+country);
	}
}
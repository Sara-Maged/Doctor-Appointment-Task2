package validation_Task2;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import java.util.Calendar;

import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;

public class User {
	@NotNull(message = "Name cannot be null")
	@Size(min = 10, max = 100, message = "Patient's Name must be between 10 and 100 characters")
    private String patientName;
	
	@PositiveOrZero(message = "Age should not be negtive")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;
	
	@Pattern(regexp = "(?=(.*\\d){2})[0-9a-zA-Z!@#$% ]+", message = "Address must contain Building & Street Number")
    private String address;
	
	
	@Email(message = "Email should be valid")
    private String patientsEmail;
	
	@NotNull(message = "Name cannot be null")
	@Size(min = 10, max = 100, message = "Doctor's Name must be between 10 and 100 characters")
    private String doctorName;
	
	@FutureOrPresent(message = "Appointments must be in the future")
	private Calendar appointment = Calendar.getInstance();
	
	//Setters & Getters
	//Patient's Name Setter & Getter
	
	public void setPatientName(String pName) {
		this.patientName = pName; 
	}
	
	public String getPatientName() {
		return this.patientName;
	}
	
	//Patient's Age Setter & Getter

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	//Patient's Address Setter & Getter

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//Patient's Email Setter & Getter

	public void setEmail(String email) {
		this.patientsEmail = email;
	}
	
	public String getEmail() {
		return this.patientsEmail;
	}
	
	//Patient's Doctor Name Setter & Getter

	
	public void setDoctorName(String dName) {
		this.doctorName = dName;
	}
	
	public String getDoctorName() {
		return this.doctorName;
	}
	
	//Appointment Setter & Getter
	
	public void setAppointment(int year, int month, int day, int hour, int minute) {
		this.appointment.set(year, month, day, hour, minute);
		
	}
	
	public Calendar getAppointment() {
		return this.appointment;
		
	}
	
}

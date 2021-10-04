package validation_Task2;


import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


public class Validation_task2_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		User user = new User();		
		
		user.setPatientName("Sara Ahmed Maged");
		user.setAge(21);
		user.setAddress("building 2 street 3");
		user.setEmail("sara@gmail.com");
		user.setDoctorName("Mahmoud Osama Aly");
		user.setAppointment(2022, 7, 3, 5, 32);
		
		
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		for (ConstraintViolation<User> violation : violations){
			String x = (violation.getMessage()); 
			System.out.println(x);
		}

		

	}

}

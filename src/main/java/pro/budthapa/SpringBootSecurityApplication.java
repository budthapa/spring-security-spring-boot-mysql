package pro.budthapa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import pro.budthapa.domain.AppUser;
import pro.budthapa.domain.Role;
import pro.budthapa.service.UserService;

@SpringBootApplication
public class SpringBootSecurityApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private UserService userService;
	
	/*
	 * This method will run during application startup and execute all the codes inside this method
	 * 
	 */
	@Override
	public void run(String... arg0) throws Exception {
		//Remove or comment this part after first execution of application, 
		//or else duplicate data will be inserted in the database
		/*
		AppUser admin = new AppUser();
		admin.setActive(true);
		admin.setPassword(encoder.encode("password"));
		admin.setUsername("admin");
		admin.setRoles(Arrays.asList(new Role("ADMIN")));
		userService.saveUser(admin);
		
		AppUser user = new AppUser();
		user.setActive(true);
		user.setPassword(encoder.encode("password"));
		user.setUsername("user");
		user.setRoles(Arrays.asList(new Role("USER")));
		userService.saveUser(user);
		*/
		
	}
	
	
}

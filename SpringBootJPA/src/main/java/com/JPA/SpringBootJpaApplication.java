package com.JPA;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.JPA.DAO.UserRepository;
import com.JPA.Entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		UserRepository userRepositrory = context.getBean(UserRepository.class);
		User user = new User();
		user.setName("Kajal");
		User user1 = new User();
		user1.setName("Soma");
		// insert data in db
		// used to save single data
//		 User data = userRepositrory.save(user);

		// save multiple data
		List<User> list = List.of(user, user1);
		Iterable<User> saveAll = userRepositrory.saveAll(list);

		for (User user2 : saveAll) {
			System.out.println(user2);

		}

		// get data and update it
		Optional<User> byId = userRepositrory.findById(1);
		User user2 = byId.get();

		user2.setName("Rekha");
		User update = userRepositrory.save(user2);
		System.out.println("Updated data : " + update);

		userRepositrory.deleteById(2);
		List<User> byName = userRepositrory.findByName("Kajal");

		byName.forEach(e -> System.out.println(e));
		
		System.out.println("Distinct values .....");
		List<User> distinctByNameAndId = userRepositrory.findDistinctByNameAndId("kajal", 102);
		distinctByNameAndId.forEach(e -> System.out.println(e));

		
		//get all users using @Query annotation
		System.out.println("All users !!!!!");
		List<User> allUsers = userRepositrory.getAllUsers();
		allUsers.forEach(e->System.out.println(e));
		
		System.out.println("-----------------------");
		List<User> particularData = userRepositrory.getParticularData(102);
		particularData.forEach(e->{
			System.out.println(e);
		});
		
		//update data using Query
		userRepositrory.getUpdateQuery("Sunil", 152);
		
		
		
		
	}
	
	

}

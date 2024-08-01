package com.JPA.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.JPA.Entities.User;

import jakarta.transaction.Transactional;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public List<User> findByName(String name);
	
	public List<User> findDistinctByNameAndId(String name, int id);
	
	//write queries using @Query annotation
	
	@Query("select u from User u")
	public List<User> getAllUsers();
	
	@Query("select u from User u where id=:i")
	public List<User> getParticularData(@Param("i") int id);
	
	//update data using Query
	@Transactional
	@Query("update User u set u.name=:n where u.id=:i")
	public void getUpdateQuery(@Param("n") String name,@Param("i") int id);

}

package com.projeto_api.Api_Sql.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_api.Api_Sql.entites.User;

@RestController
@RequestMapping(value = "/users")
public class UserResorce {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Bruno", "brunosouzav9876@gmail.com", "9999999999999", "87787131b");
		return ResponseEntity.ok().body(user);
	}




}

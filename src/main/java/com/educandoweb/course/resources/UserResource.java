package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
//recurso web correspondente a entidade user

@RestController // controlador rest
@RequestMapping(value = "/users") // caminho do recurso

public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {

		User u = new User(1L, "Maria", "maria1@gmail.com", "629999875", "123456");
		return ResponseEntity.ok().body(u);
	}

}

package com.utecws.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utecws.entity.Response;
import com.utecws.entity.User;
import com.utecws.repository.IUsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UserController {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces= { MediaType.APPLICATION_JSON_VALUE } ) 
	public ResponseEntity<Response> addAsistencia(@RequestBody User user) {
		
		User mUser = usuarioRepository.getUserByUserAndPassword(user.getUser(), user.getPassword());
		
		Response response = new Response();
		if (mUser != null) {
			
			response.setRol(mUser.getRol());
		}else {
			
			response.setRol(-1);
		}
		
		
       return new ResponseEntity<Response>(response , HttpStatus.OK);
     }
}
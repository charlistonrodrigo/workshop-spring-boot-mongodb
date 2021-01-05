package com.charlistonrodrigo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charlistonrodrigo.workshopmongo.domain.User;
import com.charlistonrodrigo.workshopmongo.repository.UserRepository;
import com.charlistonrodrigo.workshopmongo.services.exception.ObjectNotFoundException;
import java.util.Optional;


@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();	
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
     
	}


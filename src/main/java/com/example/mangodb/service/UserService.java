package com.example.mangodb.service;

import java.util.List;

import com.example.mangodb.entity.User;

public interface UserService {
	
	public List<User> getUserCollection();

	List<User> getUserDocumentsByName(String name);

	List<User> getUserDocumentsByNameAndPin(String name, String pin);

	List<User> getDocumentsByNamepin(String name, String pin);

	List<User> getDocumentsByName(String name);

	User saveUser(User user);

}
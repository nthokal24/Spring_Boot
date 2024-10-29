package in.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.user.model.UserInfo;
import in.user.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/save")
	public ResponseEntity<UserInfo> saveUserdata(@RequestBody UserInfo userInfo) {
		UserInfo saveUser = userServiceImpl.saveUser(userInfo);		
		return new ResponseEntity<UserInfo>(saveUser, HttpStatus.OK);
	}
	@GetMapping("/get")
	public ResponseEntity<List<UserInfo>> getAllUserData(){
		List<UserInfo> allUser = userServiceImpl.getAllUser();
		
		return new ResponseEntity<List<UserInfo>>(allUser, HttpStatus.OK);
	}
	@GetMapping("/get/{userId}")
	public ResponseEntity<UserInfo> getUserById(@PathVariable Integer userId){
		UserInfo userById = userServiceImpl.getUserById(userId);
		return new ResponseEntity<UserInfo>(userById, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable Integer userId){
		String deleteUserById = userServiceImpl.deleteUserById(userId);
		return new ResponseEntity<String>(deleteUserById, HttpStatus.OK);
	}
	
	
	
	
	
	
	
}

package in.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.user.model.UserInfo;

@Service
public interface UserService {
	
	UserInfo saveUser(UserInfo userInfo);
	
	List<UserInfo> getAllUser();
	
	UserInfo getUserById(Integer userId);
	
	String deleteUserById(Integer userId);

}

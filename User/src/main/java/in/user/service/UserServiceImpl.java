package in.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.user.model.UserInfo;
import in.user.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public UserInfo saveUser(UserInfo userInfo) {
		return userRepo.save(userInfo);
	}

	@Override
	public List<UserInfo> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public UserInfo getUserById(Integer userId) {

		return userRepo.findById(userId).orElseThrow(
				()-> new RuntimeException("User Not found " + userId)
				);
	}

	@Override
	public String deleteUserById(Integer userId) {
		if(userRepo.existsById(userId)) {
			userRepo.deleteById(userId);
			return "Record Deleted";
		}
		else {
			return "Not not founds";
		}
	}
}

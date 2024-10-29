package in.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer UserId;
	private String UserName;
	private String UserCity;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserCity() {
		return UserCity;
	}
	public void setUserCity(String userCity) {
		UserCity = userCity;
	}
	public UserInfo(Integer userId, String userName, String userCity) {
		super();
		UserId = userId;
		UserName = userName;
		UserCity = userCity;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserInfo [UserId=" + UserId + ", UserName=" + UserName + ", UserCity=" + UserCity + "]";
	}
	
	
	
	
	
}

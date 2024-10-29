package in.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.user.model.UserInfo;

@Repository
public interface UserRepo extends JpaRepository<UserInfo, Integer>{

}

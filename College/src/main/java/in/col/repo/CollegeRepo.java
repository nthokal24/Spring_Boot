package in.col.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.col.model.CollegeInfo;

@Repository
public interface CollegeRepo extends JpaRepository<CollegeInfo, Integer> {

}

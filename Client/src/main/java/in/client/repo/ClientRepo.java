package in.client.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.client.model.ClientInfo;

@Repository
public interface ClientRepo extends JpaRepository<ClientInfo, Integer>{

}

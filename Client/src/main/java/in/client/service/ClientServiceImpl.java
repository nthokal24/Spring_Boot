package in.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.client.model.ClientInfo;
import in.client.repo.ClientRepo;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientRepo clientRepo;
	@Override
	public ClientInfo saveClient(ClientInfo clientInfo) {
		return clientRepo.save(clientInfo);
	}

	@Override
	public List<ClientInfo> getAllClient() {
		return clientRepo.findAll();
	}

	@Override
	public ClientInfo getClientById(Integer ClientId) {
		return clientRepo.findById(ClientId).orElseThrow(
				()-> new RuntimeException("Record Not found")
				);
	}

	@Override
	public String deleteClientById(Integer ClientId) {
		if(clientRepo.existsById(ClientId)) {
			clientRepo.deleteById(ClientId);
			return "Record deleted";
		}
		else {
			return "Rrcord Not Found";
		}
	}
}

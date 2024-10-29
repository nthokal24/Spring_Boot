package in.client.service;

import java.util.List;

import in.client.model.ClientInfo;


public interface ClientService {

	
	ClientInfo saveClient(ClientInfo clientInfo);
	
	List<ClientInfo> getAllClient();
	
	ClientInfo getClientById(Integer ClientId);
	
	String deleteClientById(Integer ClientId);
	
}

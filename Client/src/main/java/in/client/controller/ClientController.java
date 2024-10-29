package in.client.controller;

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

import in.client.model.ClientInfo;
import in.client.service.ClientServiceImpl;

@RestController
public class ClientController {

	@Autowired
	ClientServiceImpl clientServiceImpl;

	@PostMapping("/save")
	public ResponseEntity<ClientInfo> saveClientData(@RequestBody ClientInfo clientInfo){
		return new ResponseEntity<ClientInfo>(clientServiceImpl.saveClient(clientInfo), HttpStatus.OK);	
	}

	@GetMapping("/get")
	public ResponseEntity<List<ClientInfo>> getAllClientdata(){
		return new ResponseEntity<List<ClientInfo>>(clientServiceImpl.getAllClient(), HttpStatus.OK);		
	}

	@GetMapping("/get/{clientId}")
	public ResponseEntity<ClientInfo> getClientById(@PathVariable Integer clientId) {
		return new ResponseEntity<ClientInfo>(clientServiceImpl.getClientById(clientId), HttpStatus.OK);
	}
	@DeleteMapping("/delete/{clientId}")
	public ResponseEntity<String> deleteClientDataById(@PathVariable Integer clientId){
		return new ResponseEntity<String>(clientServiceImpl.deleteClientById(clientId), HttpStatus.OK);
	}
}

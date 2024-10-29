package in.client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClientInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ClientId;
	private String ClientProject;
	private String ClientCompany;
	public Integer getClientId() {
		return ClientId;
	}
	public void setClientId(Integer clientId) {
		ClientId = clientId;
	}
	public String getClientProject() {
		return ClientProject;
	}
	public void setClientProject(String clientProject) {
		ClientProject = clientProject;
	}
	public String getClientCompany() {
		return ClientCompany;
	}
	public void setClientCompany(String clientCompany) {
		ClientCompany = clientCompany;
	}
	public ClientInfo(Integer clientId, String clientProject, String clientCompany) {
		super();
		ClientId = clientId;
		ClientProject = clientProject;
		ClientCompany = clientCompany;
	}
	public ClientInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ClientInfo [ClientId=" + ClientId + ", ClientProject=" + ClientProject + ", ClientCompany="
				+ ClientCompany + "]";
	}
	
	
	
	}

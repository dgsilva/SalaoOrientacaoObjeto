package modelo;

import java.util.Date;

public class Agendamento {
	private String data ;	
	private Cliente cliente;
	private Profissional profissional;
	private Servico servico;
	
	
	public Agendamento() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}
	
	

}

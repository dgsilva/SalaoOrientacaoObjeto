package modelo;

import java.util.Date;

public class Agendamento {
	private Date data ;	
	private Cliente cliente;
	private Profissional profissional;
	private Servico servico;
	
	public Agendamento() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Agendamento(Date data) {
		super();
		this.data = data;
	}



	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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
	
	

}

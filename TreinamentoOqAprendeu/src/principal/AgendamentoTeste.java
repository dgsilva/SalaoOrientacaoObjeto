package principal;

import modelo.Agendamento;
import modelo.Cliente;
import modelo.Profissional;
import modelo.Servico;

public class AgendamentoTeste {
	
	public static void main(String[] args) {
		Cliente c = new Cliente();
		Profissional p = new Profissional();
		Servico s = new Servico();
		Agendamento a = new Agendamento();
		c.setNome("Diego");
		a.setCliente(c);
		p.setNome("Joana");
		a.setProfissional(p);
		s.setDescricao("Corte de Cabelo Masculino");
		a.setServico(s);
		a.setData("2020-02-01");
		
		System.out.println("Nome Cliente: " + a.getCliente().getNome());
		System.out.println("Nome do Profissional: " + a.getProfissional().getNome());
		System.out.println("Descrição do Servico: " +a.getServico().getDescricao());
		System.out.println("Data: " +a.getData());
		
		
	}

}

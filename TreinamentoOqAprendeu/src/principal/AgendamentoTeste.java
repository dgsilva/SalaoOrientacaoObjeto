package principal;

import javax.swing.JOptionPane;

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
		System.out.println("--------------------------------------------------------");
		Cliente c2 = new Cliente();
		Profissional p2 = new Profissional();
		Servico s2 = new Servico();
		Agendamento a2 = new Agendamento();
		c2.setNome(JOptionPane.showInputDialog("Digite o nome do seu cliente? "));
		a2.setCliente(c2);
		p2.setNome(JOptionPane.showInputDialog("Digite o nome do profissional? "));
		a2.setProfissional(p2);
		s2.setDescricao(JOptionPane.showInputDialog("Digite a descrição do serviço? "));
		a2.setData(JOptionPane.showInputDialog("Digite a data do agendamento?"));
		a2.setServico(s2);
		JOptionPane.showMessageDialog(null, "Nome do cliente: " + a2.getCliente().getNome());
		JOptionPane.showMessageDialog(null, "Nome do Profissional: " + a2.getProfissional().getNome());
		JOptionPane.showMessageDialog(null, "Descrição do servico: " + a2.getServico().getDescricao());
		JOptionPane.showMessageDialog(null, "Data do agendamento:  " + a2.getData());
		

		
	}

}

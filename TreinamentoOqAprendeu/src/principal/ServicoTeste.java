package principal;

import modelo.Profissional;
import modelo.Servico;

public class ServicoTeste {

	public static void main(String[] args) {
		
		Servico s = new Servico();
		Profissional p = new Profissional();
		s.setDescricao("Corte cabelo");
		s.setValor(25.00);
		p.setNome("Joana");
		s.setProfissional(p);
		System.out.println("Descrição:" +s.getDescricao());
		System.out.println("Valor:" +s.getValor());
		System.out.println("Profissional:" +s.getProfissional().getNome());
		
	}
}

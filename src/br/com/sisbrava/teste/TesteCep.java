package br.com.sisbrava.teste;

import java.util.List;

import br.com.sisbrava.bean.Cep;
import br.com.sisbrava.interfaces.mensagem.ITables;
import br.com.sisbrava.repository.CepRepository;

public class TesteCep {
	
	public static void main(String[] args) {
		
		/*
		Cep cep = new Cep();
		cep.setCidade("ARARAQUARA");
		cep.setEstado("S�O PAULO");
		cep.setPais("BRASIL");
		
		CepRepository.getInstance().insert(cep);
		
		cep = new Cep();
		cep.setCidade("MAT�O");
		cep.setEstado("S�O PAULO");
		cep.setPais("BRASIL");
		
		CepRepository.getInstance().insert(cep);
		
		cep = new Cep();
		cep.setCidade("S�O CARLOS");
		cep.setEstado("S�O PAULO");
		cep.setPais("BRASIL");
		
		CepRepository.getInstance().insert(cep);
		*/
		
		List<Object> lo = (List<Object>) CepRepository.getInstance().selectMultiplusObjects(ITables.CEP);

		for (Object obj : lo) {
			Cep c = (Cep) obj;
			System.out.println(c.toString());
		}
		
	}
	
}

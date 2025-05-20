package primeiraAV2024semestre1.builder;

import java.util.ArrayList;
import java.util.List;

import primeiraAV2024semestre1.model.Arma;
import primeiraAV2024semestre1.model.SoldadoGuerraSecessao;

public class SoldadoGuerraSecessaoBuilder extends PersonagemBuilder{

	public void reset() {
		this.ataqueRapido = 15.0;
		this.ataqueForca = 30.0; 
		this.ataqueEspecial = 75.0;
		this.defesa = 150.0;
		this.moedas = 200.0; 
		this.habilidade = false;
		this.armas = new ArrayList<Arma>();		
	}
	
	public void addArma(Arma arma) {
		this.armas.add(arma);
	}
	
	public SoldadoGuerraSecessao build() {
		return new SoldadoGuerraSecessao(this.ataqueRapido, this.ataqueForca, this.ataqueEspecial, 
				this.defesa, this.moedas, this.habilidade, this.armas);
	}


}

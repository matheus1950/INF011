package primeiraAV2024semestre1.builder;

import java.util.ArrayList;

import primeiraAV2024semestre1.model.Arma;
import primeiraAV2024semestre1.model.SoldadoGuerraGolfo;

public class SoldadoGuerraGolfoBuilder extends PersonagemBuilder{
	
	public void reset() {
		this.ataqueRapido = 10.0;
		this.ataqueForca = 20.0; 
		this.ataqueEspecial = 50.0;
		this.defesa = 200.0;
		this.moedas = 1000.0; 
		this.habilidade = false;
		this.armas = new ArrayList<Arma>();		
	}
	
	
	public void addArma(Arma arma) {
		this.armas.add(arma);
	}
	
	public SoldadoGuerraGolfo build() {
		return new SoldadoGuerraGolfo(this.ataqueRapido, this.ataqueForca, this.ataqueEspecial, 
				this.defesa, this.moedas, this.habilidade, this.armas);
	}
}

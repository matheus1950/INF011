package primeiraAV2024semestre1.builder;

import java.util.ArrayList;

import primeiraAV2024semestre1.model.Arma;
import primeiraAV2024semestre1.model.Cruzado;
import primeiraAV2024semestre1.model.Personagem;

public class CruzadoBuilder extends PersonagemBuilder{
	
	public void reset() {
		this.ataqueRapido = 10.0;
		this.ataqueForca = 50.0; 
		this.ataqueEspecial = 100.0;
		this.defesa = 150.0;
		this.moedas = 100.0; 
		this.habilidade = false;
		this.armas = new ArrayList<Arma>();
	}
	
	public void addArma(Arma arma) {
		this.armas.add(arma);
	}
	
	public Personagem build() {
		return new Cruzado(this.ataqueRapido, this.ataqueForca, this.ataqueEspecial, this.defesa, 
						   this.moedas, this.habilidade, this.armas);
	}
}

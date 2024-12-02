package primeiraAV2024semestre1.builder;

import java.util.List;

import primeiraAV2024semestre1.model.Arma;
import primeiraAV2024semestre1.model.Personagem;

public abstract class PersonagemBuilder {
	
	protected Double ataqueRapido;
	protected Double ataqueForca; 
	protected Double ataqueEspecial;
	protected Double defesa;
	protected Double moedas; 
	protected Boolean habilidade;
	protected List<Arma> armas;
	
	public void reset() {
	}
	public Personagem build() {
		return null;
	}
	public void addArma(Arma arma) {
		
	}
}

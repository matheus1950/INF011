package primeiraAV2024semestre1.builder;

import primeiraAV2024semestre1.model.Arma;

public abstract class ArmaBuilder {
	
	protected Double danoAdicionalRapido;
	protected Double danoAdicionalForca; 
	protected Double danoAdicionalEspecial;
	protected Boolean habilitada;

	
	public void reset() {
	}
	public Arma build() {
		return null;
	}
	public boolean habilitar() {
		return false;
	}
}

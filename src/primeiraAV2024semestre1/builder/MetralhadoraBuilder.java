package primeiraAV2024semestre1.builder;

import primeiraAV2024semestre1.model.Espada;
import primeiraAV2024semestre1.model.Metralhadora;

public class MetralhadoraBuilder extends ArmaBuilder{
	public void reset() {
		this.danoAdicionalForca = 5.0;
		this.danoAdicionalRapido = 20.0;
		this.danoAdicionalEspecial = 50.0;
		this.habilitada = false;	
	}

	public Metralhadora build() {
		// TODO Auto-generated method stub
		this.habilitar();
		return new Metralhadora(this.danoAdicionalRapido, this.danoAdicionalForca, this.danoAdicionalEspecial,this.habilitada);
	}

	public boolean habilitar() {
		// TODO Auto-generated method stub
		return true;
	}
}

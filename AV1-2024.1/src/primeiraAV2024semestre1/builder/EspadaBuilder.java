package primeiraAV2024semestre1.builder;

import primeiraAV2024semestre1.model.Bacamarte;
import primeiraAV2024semestre1.model.Espada;

public class EspadaBuilder extends ArmaBuilder{
	
	public void reset() {
		this.danoAdicionalForca = 20.0;
		this.danoAdicionalRapido = 15.0;
		this.danoAdicionalEspecial = 30.0;
		this.habilitada = false;	
	}

	public Espada build() {
		// TODO Auto-generated method stub
		this.habilitar();
		return new Espada(this.danoAdicionalRapido, this.danoAdicionalForca, this.danoAdicionalEspecial,this.habilitada);
	}

	public boolean habilitar() {
		// TODO Auto-generated method stub
		return true;
	}
}

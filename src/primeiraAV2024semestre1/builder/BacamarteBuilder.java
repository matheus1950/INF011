package primeiraAV2024semestre1.builder;

import primeiraAV2024semestre1.model.Arma;
import primeiraAV2024semestre1.model.Bacamarte;

public class BacamarteBuilder extends ArmaBuilder{
	
	
	public void reset() {
		this.danoAdicionalForca = 10.0;
		this.danoAdicionalRapido = 15.0;
		this.danoAdicionalEspecial = 40.0;
		this.habilitada = false;	
	}

	public Bacamarte build() {
		// TODO Auto-generated method stub
		this.habilitar();
		return new Bacamarte(this.danoAdicionalRapido, this.danoAdicionalForca, this.danoAdicionalEspecial,this.habilitada);
	}

	public boolean habilitar() {
		// TODO Auto-generated method stub
		return true;
	}

}

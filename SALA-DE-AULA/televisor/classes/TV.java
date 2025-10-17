package televisor.classes;

import java.util.ArrayList;
import java.util.List;

public class TV {
	private List<Canal> canais;
	private Canal canalAtual;
	private int volume;
	private boolean ligada;

	public TV() {
		this.canais = new ArrayList<>();
		this.canalAtual = null;
		this.volume = 10;
		this.ligada = false;
	}

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void aumentarVolume() {
		if (ligada && volume < 100) {
			volume++;
		}
	}

	public void diminuirVolume() {
		if (ligada && volume > 0) {
			volume--;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void adicionarCanal(Canal canal) {
		canais.add(canal);
	}

	public void removerCanal(Canal canal) {
		canais.remove(canal);
	}

	public List<Canal> getCanais() {
		return canais;
	}

	public Canal getCanalAtual() {
		return canalAtual;
	}

	public void trocarCanal(int numero) {
		for (Canal canal : canais) {
			if (canal.getNumero() == numero) {
				canalAtual = canal;
				break;
			}
		}
	}
}

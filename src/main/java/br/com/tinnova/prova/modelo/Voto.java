package br.com.tinnova.prova.modelo;

import java.math.BigDecimal;

public class Voto {
	
	private Double totalEleitores = 1000.0;
	private Double validos = 800.0;
	private Double brancos = 150.0;
	private Double nulos = 50.0;
	
	public Double getTotalEleitores() {
		return totalEleitores;
	}
	public void setTotalEleitores(Double totalEleitores) {
		this.totalEleitores = totalEleitores;
	}
	public Double getValidos() {
		return validos;
	}
	public void setValidos(Double validos) {
		this.validos = validos;
	}
	public Double getBrancos() {
		return brancos;
	}
	public void setBrancos(Double brancos) {
		this.brancos = brancos;
	}
	public Double getNulos() {
		return nulos;
	}
	public void setNulos(Double nulos) {
		this.nulos = nulos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brancos == null) ? 0 : brancos.hashCode());
		result = prime * result + ((nulos == null) ? 0 : nulos.hashCode());
		result = prime * result + ((totalEleitores == null) ? 0 : totalEleitores.hashCode());
		result = prime * result + ((validos == null) ? 0 : validos.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (brancos == null) {
			if (other.brancos != null)
				return false;
		} else if (!brancos.equals(other.brancos))
			return false;
		if (nulos == null) {
			if (other.nulos != null)
				return false;
		} else if (!nulos.equals(other.nulos))
			return false;
		if (totalEleitores == null) {
			if (other.totalEleitores != null)
				return false;
		} else if (!totalEleitores.equals(other.totalEleitores))
			return false;
		if (validos == null) {
			if (other.validos != null)
				return false;
		} else if (!validos.equals(other.validos))
			return false;
		return true;
	}
	
	
	public Double percentualValidosTotal() {
		return (this.nulos / this.totalEleitores) * 100;
	}
	
	public Double percentualBrancosTotal() {
		return (this.brancos / this.totalEleitores) * 100;
	}
	
	public Double percentualNulosTotal() {
		return (this.nulos / this.totalEleitores) * 100;
	}
}

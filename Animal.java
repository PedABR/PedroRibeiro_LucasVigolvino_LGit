package LabGit;

public class Animal {
	private String nome, tipo;
	private int idade;
	public Animal(String nome, String tipo, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((raca == null) ? 0 : tipo.hashCode());
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
		Animal other = (Animal) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (raca == null) {
			if (other.tipo != null)
				return false;
		} else if (!raca.equals(other.raca))
			return false;
		return true;
	}
	public String getNome() {
		return nome;
	}
	public String getEspecie() {
		return raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEspecie(String tipo) {
		this.raca = raca;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}

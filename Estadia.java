package LabGit;

public class Estadia {
	private Animal animal;
	private double valor;
	private int dias;
	public Estadia(Animal animal, double valor, int dias) {
		this.animal = animal;
		this.valor = valor;
		this.dias = dias;
	}
	@Override
	public String toString() {
		return animal.getNome() + ", " + animal.getEspecie() + ", " + dias + " dias com o preço de R$ " + valor;
	}
}

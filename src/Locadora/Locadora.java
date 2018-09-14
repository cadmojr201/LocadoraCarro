package Locadora;

import Classes.Carro;

public class Locadora {

	public static void main(String[] args) 
	{
		
		Carro carro1 = new Carro();
		carro1.setMarca("bmw");
		carro1.setId(1000);
		carro1.setCor("preto");
		carro1.setModelo("x1");
		
		System.out.println("ID: "+carro1.getId()+"\nMarca: "+carro1.getMarca()+"\nModelo: "+carro1.getModelo()+"\nCor: "+carro1.getCor());
		
		carro1.ligar();
		
		System.out.println("\nID: "+carro1.getId()+"\nMarca: "+carro1.getMarca()+"\nModelo: "+carro1.getModelo()+"\nCor: "+carro1.getCor());
		
		carro1.ligar();
		
		System.out.println("\nID: "+carro1.getId()+"\nMarca: "+carro1.getMarca()+"\nModelo: "+carro1.getModelo()+"\nCor: "+carro1.getCor());
		
		carro1.ligarTurbo();
		
		System.out.println("\nID: "+carro1.getId()+"\nMarca: "+carro1.getMarca()+"\nModelo: "+carro1.getModelo()+"\nCor: "+carro1.getCor());
		
		carro1.ligarTurbo();

	}

}

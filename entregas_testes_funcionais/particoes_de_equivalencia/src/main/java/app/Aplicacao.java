package app;

import model.ValidaCPF;

public class Aplicacao{

    public static void main(String[] args) {
		ValidaCPF cpf = new ValidaCPF();
		System.out.print(cpf.isCPF("17952865714"));

	}
    
}
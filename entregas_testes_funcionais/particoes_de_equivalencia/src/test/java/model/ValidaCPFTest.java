package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.ValidaCPF;

public class ValidaCPFTest{
	
	@Test
	public void validarCPFTrue(){
		ValidaCPF cpf = new ValidaCPF();
		
		assertEquals (true, cpf.isCPF("17952865714"));
		
    }
    
    @Test
    public void validarCPFVazio(){
		ValidaCPF cpf = new ValidaCPF();
	
		assertEquals (false, cpf.isCPF(""));
		
    }
    
    @Test
    public void validarCPFFake(){
		ValidaCPF cpf = new ValidaCPF();
	
        assertEquals (false, cpf.isCPF("11111111111"));
		
	}

	@Test
    public void validarCPFMaior(){
		ValidaCPF cpf = new ValidaCPF();
	
        assertEquals (false, cpf.isCPF("179528657141"));
		
	}

	@Test
    public void validarCPFMenor(){
		ValidaCPF cpf = new ValidaCPF();
	
        assertEquals (false, cpf.isCPF("179528"));
		
	}

}
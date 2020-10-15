package model;

import java.util.InputMismatchException;

public class ValidaCPF {

    public static boolean isCPF(String CPF) {
       // sequencia de numeros iguais = CPF Invalido
        if ((CPF.length() != 11) ||
        CPF.equals("11111111111")){
            return (true);
        }
        return (false);
        
    }
}
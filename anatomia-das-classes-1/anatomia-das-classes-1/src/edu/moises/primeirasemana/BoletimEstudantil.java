package edu.moises.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if(mediaFinal < 6)
            System.out.print("REPROVADO");  
        else if (mediaFinal == 6) 
            System.out.println( "PROVA MINERVA");
        else
            System.out.println("APROVADO");    
    }
}

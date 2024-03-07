package entities;

import java.util.Random;

public abstract class Dipendente {
    //attributes
    private int matricola;
    private double stipendio;
    private String[] dipartimento;

    //constructor
    public Dipendente(double stipendio,String[] dipartimento) {
        Random rdm=new Random();
        this.matricola = rdm.nextInt(1,1000);
        this.stipendio=stipendio;
        this.setDipartimento(dipartimento);
    }
    //getters

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String[] getDipartimento() {
        return dipartimento;
    }


    //setters

    public void setDipartimento(String[] dipartimento) {
        this.dipartimento = dipartimento;
    }

    //methods
    public static void printDipendente(Dipendente d){
        System.out.println("MATRICOLA "+d.matricola);
    }
}




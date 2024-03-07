package entities;

public class Dirigente extends Dipendente{
    public Dirigente(double stipendio, String[] dipartimento) {
        super(stipendio, dipartimento);
    }
    public double calculateSalary (){
        return super.getStipendio();
    }
    }




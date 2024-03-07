package entities;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(double stipendio, String[] dipartimento) {
        super(stipendio, dipartimento);
    }


    public double calculateSalary (){
        return super.getStipendio();
    }
}

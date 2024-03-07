package entities;

public class DipendentePartTime extends Dipendente{
    public DipendentePartTime(double stipendio, String[] dipartimento) {
        super(stipendio, dipartimento);
    }
    public double calculateSalary(int hoursWorked) {
        double hourlyRate = 12.5; // Hourly rate in euros
        double salary = hourlyRate * hoursWorked;
        return salary;
    }

}

import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;

public class Main {
    public static void main(String[] args) {
        String[]dipartimento={"VENDITE","PRODUZIONE","MANUTENZIONE"};
//        Dipendente a=new Dipendente(3000, new String[]{dipartimento[0]});
//        Dipendente b=new Dipendente(4000, new String[]{dipartimento[1]});
//        Dipendente c=new Dipendente(5000, new String[]{dipartimento[2]});
//        Dipendente.printDipendente(a);
//        Dipendente.printDipendente(b);
//        Dipendente.printDipendente(c);
//        Dipendente[]dipendenti={a,b,c};
//for (int i=0;i<dipendenti.length;i++){
//    System.out.println(dipendenti[i].getMatricola());
//}

        DipendenteFullTime a=new DipendenteFullTime(1800,new String[]{dipartimento[0]});
        DipendentePartTime b = new DipendentePartTime(20, new String[]{dipartimento[1]});
        Dirigente c = new Dirigente(5000, new String[]{dipartimento[2]});

      
        Dipendente[] dipendenti = {a, b, c};

        double totalSalary = 0.0;

        for (int i = 0; i < dipendenti.length; i++) {
            if (dipendenti[i] instanceof DipendenteFullTime) {
                totalSalary += ((DipendenteFullTime) dipendenti[i]).calculateSalary();
            }
            if (dipendenti[i] instanceof DipendentePartTime) {
                totalSalary += ((DipendentePartTime) dipendenti[i]).calculateSalary(20);
            }
            if (dipendenti[i] instanceof Dirigente) {
                totalSalary += ((Dirigente) dipendenti[i]).calculateSalary();
            }
        }

        System.out.println(totalSalary);


    }
}
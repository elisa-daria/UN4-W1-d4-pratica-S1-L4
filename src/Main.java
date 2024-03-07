import entities.Dipendente;

public class Main {
    public static void main(String[] args) {
        String[]dipartimento={"VENDITE","PRODUZIONE","MANUTENZIONE"};
        Dipendente a=new Dipendente(3000, new String[]{dipartimento[0]});
        Dipendente b=new Dipendente(4000, new String[]{dipartimento[1]});
        Dipendente c=new Dipendente(5000, new String[]{dipartimento[2]});
//        Dipendente.printDipendente(a);
//        Dipendente.printDipendente(b);
//        Dipendente.printDipendente(c);
        Dipendente[]dipendenti={a,b,c};
for (int i=0;i<dipendenti.length;i++){
    System.out.println(dipendenti[i].getMatricola());
}

    }
}
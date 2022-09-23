package example;

public class Main {
    public static void main(String[] args) {

        Personne franck = new Personne("Franck");
        Personne autrePersonne = franck;
        franck.nom="Tom";
        String[] tableau = {"titi","tato","tata"};
        String[] autreTableau = tableau;
        tableau[1]= "tuto";
        System.out.println(autreTableau[1]);

        System.out.println(autrePersonne);
        System.out.println(franck.nom);
        System.out.println(autrePersonne.nom);
    }
}
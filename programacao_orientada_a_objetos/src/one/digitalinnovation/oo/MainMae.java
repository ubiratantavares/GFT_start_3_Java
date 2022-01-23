package one.digitalinnovation.oo;

public class MainMae {

    public static void main(String[] args) {

        Mae[] classes = new Mae[]{new Filho(), new Filha(), new Mae()};

        for (Mae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (Mae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        Mae classe = new Filha();
        classe.metodo2();
    }
}

package one.digitalinnovation.oo;

public class MainCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 65);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));
    }
}

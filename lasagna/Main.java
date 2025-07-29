package exercism.lasagna;

public class Main {

    public static void main(String[] args) {

        Lasagna lasagna = new Lasagna();

        System.out.println("Tempo para cozinhar Lasanha: " + lasagna.expectedMinutesInOven() + " Minutos");
        System.out.println("Minutos restante: " + lasagna.remainingMinutesInOven(20) + " Minutos");
        System.out.println("Preparação em minutos para cada camada adicional: " +
                lasagna.preparationTimeInMinutes(2) + " Minutos");

        System.out.println("Total para cozinhar (Camadas + Minutos) = " + lasagna.totalTimeInMinutes(2, 10));
    }
}

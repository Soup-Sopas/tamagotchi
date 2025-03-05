import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido \n" +
                "Elige el nombre de tu Tamagochi:");
        String name = sc.nextLine();
        Tamagochi tamagochi = new Tamagochi(name);
        tamagochi.showTamagochi();

        Environment envr = new Environment(tamagochi);

        //UI interfaz = new UI();
        //interfaz.setSize(500, 500);
        //interfaz.setLocationRelativeTo(null);
        //interfaz.setVisible(true);

        envr.game();

        sc.close();
    }
}
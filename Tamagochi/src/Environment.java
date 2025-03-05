import java.util.Scanner;

public class Environment {
    Places places;
    Tamagochi tamagochi;


    public Environment(Tamagochi tamagochi) {
        this.places = new Places();
        this.tamagochi = tamagochi;
    }

    public void game() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int times = 1;

        while (flag) {
            tamagochi.getState().showState();
            System.out.println("Estas en: " + places.getPlace());
            places.showMenuPlace();
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    if (places.getPlace().equals("Sala") || places.getPlace().equals("Patio") || places.getPlace().equals("Piscina")) {
                        tamagochi.playWithTamagochi();
                    } else if (places.getPlace().equals("Dormitorio")) {
                        tamagochi.sleepTamaochi();
                    } else if (places.getPlace().equals("Cocina")) {
                        tamagochi.giveFood();
                    }
                    break;
                case 2:
                    if (places.getPlace().equals("Sala")) {
                        places.movePlace(places.kitchen);
                        break;
                    } else if (places.getPlace().equals("Dormitorio") || places.getPlace().equals("Patio") || places.getPlace().equals("Cocina")) {
                        places.movePlace(places.livingRoom);
                        break;
                    } else if (places.getPlace().equals("Piscina")) {
                        places.movePlace(places.backyard);
                        break;
                    }
                    break;
                case 3:
                    if (places.getPlace().equals("Sala")) {
                        places.movePlace(places.bedroom);
                        break;
                    } else if (places.getPlace().equals("Patio")) {
                        places.movePlace(places.pool);
                        break;
                    } else if (places.getPlace().equals("Cocina") || places.getPlace().equals("Dormitorio") || places.getPlace().equals("Piscina")) {
                        flag = false;
                        break;
                    }
                case 4:
                    if (places.getPlace().equals("Sala")) {
                        places.movePlace(places.backyard);
                        break;
                    } else if (places.getPlace().equals("Patio")) {
                        flag = false;
                        break;
                    }
                    System.out.println("Opcion no valida");
                    break;
                case 5:
                    if (places.getPlace().equals("Sala")) {
                        flag = false;
                        break;
                    }
                    System.out.println("Opcion no valida");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            if (times % 5 == 0) {
                tamagochi.getState().decreaseState();
            }
            times++;
        }
        sc.close();
    }
}

public class Places {
    public final int[] livingRoom = {0,0};
    public final int[] bedroom = {0,1};
    public final int[] kitchen = {0,2};
    public final int[] backyard = {1,0};
    public final int[] pool = {1,1};


    private String[][] place;
    private int[] position;

    public Places() {
        this.place = new String[][]{{"Sala", "Dormitorio", "Cocina"}, {"Patio", "Piscina"}};
        this.position = new int[]{0, 0};
    }

    public String getPlace() {
        return this.place[this.position[0]][this.position[1]];
    }

    public void movePlace(int[] newPosition) {
        this.position = newPosition;
    }

    public void showMenuPlace() {
        if (getPlace().equals("Sala")) {
            System.out.println("Opciones:\n1.- Jugar\n2.- Ir a la cocina\n3.- Ir al dormitorio\n4.- Ir al patio\n5.- Salir");
        }
        else if (getPlace().equals("Dormitorio")) {
            System.out.println("Opciones:\n1.- Dormir\n2.- Ir a la sala\n3.- Salir");
        }
        else if (getPlace().equals("Cocina")) {
            System.out.println("Opciones:\n1.- Comer\n2.- Ir a la sala\n3.- Salir");
        }
        else if (getPlace().equals("Patio")) {
            System.out.println("Opciones:\n1.- Jugar\n2.- Entrar a la casa\n3.- Ir a la piscina\n4.- Salir");
        }
        else if (getPlace().equals("Piscina")) {
            System.out.println("Opciones:\n1.- Jugar\n2.- Salir de la piscina\n3.- Salir");
        }

    }

}

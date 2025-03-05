public class State {
    private int hunger = 50;
    private int energy = 50;
    private int happiness = 50;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void showState(){
        int[] actualState = {energy, hunger, happiness};
        String[] nameState = {"Energia", "Hambre", "Felicidad"};
        System.out.println("----------------------------");
        for (int i = 0; i < actualState.length; i++) {
            if (nameState[i].equals("Energia")) {
                System.out.print(nameState[i] + "   " + actualState[i] + "% |");
            } else if (nameState[i].equals("Hambre")) {
                System.out.print(nameState[i] + "    " + actualState[i] + "% |");
            } else {
                System.out.print(nameState[i] + " " + actualState[i] + "% |");
            }
            for (int j = 0; j < 10; j++){
                if (j < actualState[i] / 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");

        }
        System.out.println("----------------------------");
    }

    public void decreaseState() {
        setHunger(Math.max(getHunger() - 20,0));
        setEnergy(Math.max(getEnergy() - 20,0));
        setHappiness(Math.max(getHappiness() - 20,0));
    }




}

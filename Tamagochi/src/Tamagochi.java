public class Tamagochi {
    private String name;
    private State state;

    public Tamagochi(String name) {
        this.name = name;
        this.state = new State();
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public void playWithTamagochi() {
        if (state.getEnergy() > 0) {
            state.setHappiness(Math.min(state.getHappiness() + 10,100));
            state.setEnergy(Math.max(state.getEnergy() - 10,0));
            playingTamagochi();
        } else {
            System.out.println(name + " no tiene energia para jugar");
            tiredTamagochi();
        }

    }

    public void sleepTamaochi() {
        state.setEnergy(Math.min(state.getEnergy() + 30,100));
        sleepingTamagochi();
    }

    public void giveFood() {
        state.setHunger(Math.min(state.getHunger() + 10,100));
        eatingTamagochi();
    }



    public void showTamagochi() {
        System.out.println(" __         __");
        System.out.println("/  \\.-\"\"\"-./  \\");
        System.out.println("\\    -   -    /");
        System.out.println(" |   o   o   |");
        System.out.println(" \\  .-'''-.  /");
        System.out.println("  '-\\__Y__/-'");
        System.out.println("     `---`");
    }

    public void eatingTamagochi() {
        System.out.println("      (()__(()\n" +
                "     /       \\ \n" +
                "    ( /    \\  \\\n" +
                "     \\ o o    /\n" +
                "     (_()_)__/ \\             \n" +
                "    / _,==.____ \\\n" +
                "   (   |--|      )\n" +
                "   /\\_.|__|'-.__/\\_\n" +
                "  / (        /     \\ \n" +
                "  \\  \\      (      /\n" +
                "   )  '._____)    /    \n" +
                "(((____.--(((____/");
    }

    public void sleepingTamagochi() {
        System.out.println("  _,-\"\"`\"\"-~`)\n" +
                "(`~_,=========\\\n" +
                " |---,___.-.__,\\\n" +
                " |        o     \\ ___  _,,,,_     _.--.\n" +
                "  \\      `^`    /`_.-\"~      `~-;`     \\\n" +
                "   \\_      _  .'                 `,     |\n" +
                "     |`-                           \\'__/ \n" +
                "    /                      ,_       \\  `'-. \n" +
                "   /    .-\"\"~~--.            `\"-,   ;_    /\n" +
                "  |              \\               \\  | `\"\"`\n" +
                "   \\__.--'`\"-.   /_               |'\n" +
                "              `\"`  `~~~---..,     |\n" +
                "                             \\ _.-'`-.\n" +
                "                              \\       \\\n" +
                "                               '.     /\n" +
                "                                 `\"~\"`");
    }

    public void playingTamagochi() {
        System.out.println("                  _         _\n" +
                " .-\"\"-.          ( )-\"```\"-( )          .-\"\"-.\n" +
                "/ O O  \\          /         \\          /  O O \\\n" +
                "|O .-.  \\        /   0 _ 0   \\        /  .-. O|\n" +
                "\\ (   )  '.    _|     (_)     |     .'  (   ) /\n" +
                " '.`-'     '-./ |             |`\\.-'     '-'.'\n" +
                "   \\         |  \\   \\     /   /  |         /\n" +
                "    \\        \\   '.  '._.'  .'   /        /\n" +
                "     \\        '.   `'-----'`   .'        /\n" +
                "      \\   .'    '-._        .-'\\   '.   /\n" +
                "       |/`          `'''''')    )    `\\|\n" +
                "       /                  (    (      ,\\\n" +
                "      ;                    \\    '-..-'/ ;\n" +
                "      |                     '.       /  |\n" +
                "      |                       `'---'`   |\n" +
                "      ;                                 ;\n" +
                "       \\                               /\n" +
                "        `.                           .'\n" +
                "          '-._                   _.-'\n" +
                "           __/`\"  '  - - -  ' \"`` \\__\n" +
                "         /`            /^\\           `\\\n" +
                "         \\(          .'   '.         )/\n" +
                "          '.(__(__.-'       '.__)__).'");
    }

    public void tiredTamagochi() {
        System.out.println("   .--.              .--.\n" +
                "   : (\\ \". _......_ .\" /) :\n" +
                "    '.    `        `    .'\n" +
                "     /'   _        _   `\\\n" +
                "    /     0}      {0     \\\n" +
                "   |       /      \\       |\n" +
                "   |     /'        `\\     |\n" +
                "    \\   | .  .==.  . |   /\n" +
                "     '._ \\.' \\__/ './ _.'\n" +
                "     /  ``'._-''-_.'``  \\");
    }
}

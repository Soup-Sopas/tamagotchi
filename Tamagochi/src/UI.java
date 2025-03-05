import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI extends JFrame implements ActionListener {

    // Etiquetas para mostrar los valores
    private JLabel energyLabel;
    private JLabel hungerLabel;
    private JLabel happinessLabel;

    // Botones
    private JButton dormirBtn, jugarBtn, comerBtn, salirBtn;
    Tamagochi tm = new Tamagochi("Prueba");

    public UI() {
        super("Tamagotchi UI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);

        // Inicializamos valores de las estadísticas

        // Panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);

        // ──────────────── Panel Superior ────────────────
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

        // Fila con "Stats" y "Name"
        JPanel titleRow = new JPanel(new GridLayout(1, 2));
        JLabel statsLabel = new JLabel("Stats", SwingConstants.CENTER);
        JLabel nameLabel = new JLabel("Name", SwingConstants.CENTER);
        titleRow.add(statsLabel);
        titleRow.add(nameLabel);
        topPanel.add(titleRow);

        // Separador horizontal
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        topPanel.add(separator);

        // Panel para estadísticas en columna
        JPanel statsListPanel = new JPanel();
        statsListPanel.setLayout(new BoxLayout(statsListPanel, BoxLayout.Y_AXIS));

        // Creamos las etiquetas con valores iniciales
        energyLabel = new JLabel("Energía: " + tm.getState().getEnergy());
        hungerLabel = new JLabel("Hambre: "   + tm.getState().getHunger());
        happinessLabel = new JLabel("Felicidad: " + tm.getState().getHappiness());

        // Agregamos las etiquetas al panel
        statsListPanel.add(energyLabel);
        statsListPanel.add(hungerLabel);
        statsListPanel.add(happinessLabel);

        topPanel.add(statsListPanel);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // ──────────────── Panel Central (zona gris) ────────────────
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // ──────────────── Panel Inferior ────────────────
        JPanel bottomPanel = new JPanel(new BorderLayout());

        // Botón Dormir a la izquierda
        JPanel westPanel = new JPanel();
        dormirBtn = new JButton("Dormir");
        westPanel.add(dormirBtn);
        bottomPanel.add(westPanel, BorderLayout.WEST);

        // Botón Comer a la derecha
        JPanel eastPanel = new JPanel();
        comerBtn = new JButton("Comer");
        eastPanel.add(comerBtn);
        bottomPanel.add(eastPanel, BorderLayout.EAST);

        // Dos botones en el centro, apilados verticalmente (Jugar y Salir)
        JPanel centerButtonsPanel = new JPanel();
        centerButtonsPanel.setLayout(new BoxLayout(centerButtonsPanel, BoxLayout.Y_AXIS));

        jugarBtn = new JButton("Jugar");
        salirBtn = new JButton("Salir");

        // Alinear al centro horizontal
        jugarBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        salirBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerButtonsPanel.add(jugarBtn);
        centerButtonsPanel.add(Box.createVerticalStrut(5)); // espacio entre botones
        centerButtonsPanel.add(salirBtn);

        bottomPanel.add(centerButtonsPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // ──────────────── Listeners de los botones ────────────────
        dormirBtn.addActionListener(this);
        jugarBtn.addActionListener(this);
        comerBtn.addActionListener(this);
        salirBtn.addActionListener(this);

        setVisible(true);
    }

    // Método que se llama al hacer clic en cualquiera de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == dormirBtn) {
            // Ejemplo: Dormir incrementa "Sueño"  +10, decrementa "Felicidad" -5
            tm.sleepTamaochi();
            ajustarValores();  // Método para corregir rangos y refrescar etiquetas
        }
        else if (source == jugarBtn) {
            // Ejemplo: Jugar incrementa "Felicidad" +10, decrementa "Energía" -5
            tm.playWithTamagochi();
            ajustarValores();
        }
        else if (source == comerBtn) {
            // Ejemplo: Comer incrementa "Energía" +10, decrementa "Sueño" -5
            tm.giveFood();
            ajustarValores();
        }
        else if (source == salirBtn) {
            // Cerrar la aplicación
            System.exit(0);
        }
    }

    /**
     * Ajusta cada valor para que no se salga de un rango (ej. 0–100)
     * y refresca las etiquetas en pantalla.
     */
    private void ajustarValores() {

        // Actualizamos texto de las etiquetas
        energyLabel.setText("Energía: " + tm.getState().getEnergy());
        hungerLabel.setText("Hambre: " + tm.getState().getHunger());
        happinessLabel.setText("Felicidad: " + tm.getState().getHappiness());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UI::new);
    }
}

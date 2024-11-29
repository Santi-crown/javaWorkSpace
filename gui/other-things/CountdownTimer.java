import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountdownTimer extends JFrame {
    private JTextField minuteField;
    private JButton startButton;
    private JLabel timerLabel;
    private Timer timer;
    private int totalTimeInSeconds;

    public CountdownTimer() {
        // Configuración de la ventana
        setTitle("Countdown Timer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3, 1));

        // Campo para ingresar minutos
        minuteField = new JTextField();
        minuteField.setHorizontalAlignment(JTextField.CENTER);
        add(new JLabel("Ingrese los minutos:", SwingConstants.CENTER));
        add(minuteField);

        // Botón para iniciar el cronómetro
        startButton = new JButton("Iniciar");
        add(startButton);

        // Etiqueta para mostrar el tiempo restante
        timerLabel = new JLabel("00:00", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(timerLabel);

        // Acción al presionar el botón
        startButton.addActionListener(e -> startCountdown());

        setVisible(true);
    }

    private void startCountdown() {
        String input = minuteField.getText();
        try {
            int minutes = Integer.parseInt(input);
            if (minutes < 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un número mayor o igual a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            totalTimeInSeconds = minutes * 60; // Convertir a segundos
            updateTimerLabel(); // Mostrar el tiempo inicial

            // Detener cualquier timer previo
            if (timer != null && timer.isRunning()) {
                timer.stop();
            }

            // Configurar el Timer
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (totalTimeInSeconds > 0) {
                        totalTimeInSeconds--;
                        updateTimerLabel();
                    } else {
                        timer.stop();
                        JOptionPane.showMessageDialog(CountdownTimer.this, "¡Tiempo terminado!", "Fin", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });

            timer.start(); // Iniciar el Timer
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTimerLabel() {
        int minutes = totalTimeInSeconds / 60;
        int seconds = totalTimeInSeconds % 60;
        timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CountdownTimer::new);
    }
}

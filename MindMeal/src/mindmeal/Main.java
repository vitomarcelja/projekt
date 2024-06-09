package mindmeal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Object[] options = {"Korisnik", "Stručnjak"};
            int choice = JOptionPane.showOptionDialog(null,
                    "Dobrodošli u MindMeal aplikaciju!\nMolimo prijavite se kako biste nastavili.",
                    "Prijava",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choice == JOptionPane.YES_OPTION) {
                String email = JOptionPane.showInputDialog(null, "Upišite svoj email:");
                String password = JOptionPane.showInputDialog(null, "Upišite svoju lozinku:");
                if (validateUserCredentials(email, password)) {
                    openUserInterface();
                } else {
                    JOptionPane.showMessageDialog(null, "Pogrešan email ili lozinka!");
                }
            } else if (choice == JOptionPane.NO_OPTION) {
                String email = JOptionPane.showInputDialog(null, "Upišite svoj email:");
                String password = JOptionPane.showInputDialog(null, "Upišite svoju lozinku:");
                if (validateExpertCredentials(email, password)) {
                    openExpertInterface();
                } else {
                    JOptionPane.showMessageDialog(null, "Pogrešan email ili lozinka!");
                }
            }
        });
    }

    private static boolean validateUserCredentials(String email, String password) {
        return true; 
    }

    private static boolean validateExpertCredentials(String email, String password) {
        return true; 
    }

    private static void openUserInterface() {
        Korisnik krsnkOdabir = new Korisnik();
        krsnkOdabir.setVisible(true);
    }

    private static void openExpertInterface() {
        Strucnjak stručnjak = new Strucnjak();
        stručnjak.setVisible(true);
    }
}

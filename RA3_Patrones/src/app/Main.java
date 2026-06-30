package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.VentanaPrincipal;

public class Main {

    public static void main(String[] args) {    

        try {

            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;

                }

            }

        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {

            ex.printStackTrace();

        }

        java.awt.EventQueue.invokeLater(() -> {

            new VentanaPrincipal().setVisible(true);

        });

    }

}

/*s
package Visualizacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class teste extends JFrame {
    private JButton button;

    public teste() {
        setTitle("Main Frame");
        setSize(300, 200);

        button = new JButton("Open new window");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewFrame newFrame = new NewFrame();
                newFrame.setVisible(true);
            }
        });

        add(button);
    }

    public static void main(String[] args) {
        teste mainFrame = new teste();
        mainFrame.setVisible(true);
    }
}

class NewFrame extends JFrame {
    public NewFrame() {
        setTitle("New Frame");
        setSize(300, 200);
    }
}
/*
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class teste extends JFrame {
    public teste() {
        setTitle("Centralized Components");
        setSize(300, 200);
        setLayout(new GridBagLayout());

        JButton button = new JButton("Click me");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.CENTER;
        add(button, constraints);
    }

    public static void main(String[] args) {
        teste frame = new teste();
        frame.setVisible(true);
    }
}


/*
import java.awt.event.*;
import javax.swing.*;

public class teste {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Exemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria a barra de menu
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        // Cria itens de menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        // Adiciona ações aos itens de menu
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para abrir um arquivo aqui
            }
        });
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.pack();
        frame.setVisible(true);
    }
}

/*
package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class teste {
	 public static void main (String[] args) {
	        JFrame frame = new JFrame("Barra Lateral Exemplo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel sidebar = new Sidebar(); // sua classe de barra lateral
	        frame.add(sidebar, BorderLayout.WEST);

	        JPanel content = new JPanel();
	        content.add(new JLabel("Conteúdo Principal"));
	        frame.add(content, BorderLayout.CENTER);

	        frame.pack();
	        frame.setVisible(true);
	    }
	}

	class Sidebar extends JPanel {
	    public Sidebar() {
	        setPreferredSize(new Dimension(150, 0));
	        setBackground(Color.LIGHT_GRAY);
	        add(new JButton("Botão 1"));
	        add(new JButton("Botão 2"));
	    }
	}
*/

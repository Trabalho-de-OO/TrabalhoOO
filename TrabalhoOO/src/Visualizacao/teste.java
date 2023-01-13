/*
package Visualizacao;

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

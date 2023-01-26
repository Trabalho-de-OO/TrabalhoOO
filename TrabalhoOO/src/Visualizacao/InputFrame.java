package Visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
import java.util.ArrayList;

public class Cadastro {
    private ArrayList<String> lista;

    public Cadastro() {
        lista = new ArrayList<String>();
    }

    public void adicionarItem(String item) {
        lista.add(item);
    }

    public String[] getLista() {
        return lista.toArray(new String[lista.size()]);
    }

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
}

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputFrame extends JFrame {

	private JTextField textField;
	private JButton btnAdd;
	private MainFrame mainFrame;

	public InputFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		setTitle("Input Frame");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		textField = new JTextField();
		btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.addItemToList(textField.getText());
				textField.setText("");
			}
		});

		add(textField, BorderLayout.NORTH);
		add(btnAdd, BorderLayout.SOUTH);

		// Adicionando uma mensagem de confirmação ao fechar a janela
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(InputFrame.this,
                        "Tem certeza de que deseja fechar esta janela?",
                        "Confirmação", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    InputFrame.this.dispose();
                }
            }
        });
    }
}








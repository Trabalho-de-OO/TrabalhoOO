package Visualizacao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends JFrame implements ActionListener {
    private JList<String> lista;
    private JButton btnAdicionar;
    private Cadastro cadastro;

    public Tela() {
        setTitle("Tela com JList");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        cadastro = new Cadastro();

        lista = new JList<String>(cadastro.getLista());
        add(lista, BorderLayout.CENTER);

        btnAdicionar = new JButton("Adicionar Item");
        btnAdicionar.addActionListener(this);
        add(btnAdicionar, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdicionar) {
            String novoItem = JOptionPane.showInputDialog("Digite o novo item:");
            cadastro.adicionarItem(novoItem);
            lista.setListData(cadastro.getLista());
        }
    }

    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.setVisible(true);
    }
}
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    private JList<String> list;
    private DefaultListModel<String> listModel;
    private JButton btnOpen;
    private Timer updateTimer;

    public MainFrame() {
        setTitle("Main Frame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        btnOpen = new JButton("Abrir outra janela");
        btnOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InputFrame(MainFrame.this).setVisible(true);
            }});
        // Adicionando um Timer para atualizar a JList a cada 2 segundos
        updateTimer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.repaint();}});
        updateTimer.start(); 
        add(scrollPane, BorderLayout.CENTER);
        add(btnOpen, BorderLayout.SOUTH);
    }
    public void addItemToList(String item) {
        listModel.addElement(item);
    }
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}


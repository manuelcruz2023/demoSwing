package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import co.edu.uptc.ImagePanel;

public class MainView extends JFrame {

    // private JPanel panel1;
    // private JPanel panel2;
    // private JLabel label1;
    // private JLabel label2;
    private JMenuBar menuBar;
    public MainView() {
        initComponents();
    }

    private void initComponents() {
        initFrame();
        // createPanel1();
        // createButton1();
        // createPanel2();
        // createLabel1();
        // createLabel2();
        createMenu();
    }

    private void initFrame() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(Color.black);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    // private void createButton1() {
    // JButton button1 = new JButton();
    // button1.setText("Button 1");
    // button1.setBounds(100, 100, 100, 50);
    // button1.setBackground(Color.red);
    // button1.setForeground(Color.WHITE);
    // button1.addActionListener(new ActionListener() {
    // @Override
    // public void actionPerformed(ActionEvent e) {
    // label2.setText("aloalaoaloaloaloaloaloaloalaaloalo");
    // }
    // });
    // panel1.add(button1);
    // }

    // private void createPanel1() {
    // panel1 = new JPanel();
    // panel1.setBounds(0, 200, 300, 200);
    // panel1.setBackground(Color.lightGray);
    // add(panel1);
    // }

    // private void createPanel2() {
    // panel2 = new JPanel();
    // panel2.setBounds(400, 200, 300, 200);
    // panel2.setBackground(Color.lightGray);
    // add(panel2);
    // }

    // private void createLabel1() {
    // label1 = new JLabel();
    // label1.setText("Nombre: Manuel Esteban Cruz");
    // label1.setBounds(100, 100, 100, 50);
    // label1.setFont(new Font("Tahoma", Font.BOLD, 14));
    // panel2.add(label1);
    // }

    // private void createLabel2() {
    // label2 = new JLabel();
    // label2.setText("Codigo: 202310238");
    // label2.setFont(new Font("Tahoma", Font.BOLD, 10));
    // label2.setBounds(200, 200, 100, 50);
    // panel2.add(label2);
    // }

    public ImageIcon createIconItems() {
        ImageIcon icon = new ImageIcon("imagenes//iconItems.png");
        return icon;
    }

    public ImageIcon createIcon(String pathIcon) {
        ImageIcon icon = new ImageIcon(pathIcon);
        return icon;
    }

    private void createMenu() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        UIManager.put("MenuBar.background", Color.DARK_GRAY);
        createmenu1();
        createmenu2();
        createmenu3();
    }

    public void addIcons(JMenu menu) {
        JMenuItem menuItem1 = new JMenuItem("Item 1");
        // agregar icono al item
        ImageIcon iconItem = createIconItems();
        menuItem1.setIcon(iconItem);
        menu.add(menuItem1);
        JMenuItem menuItem2 = new JMenuItem("Item 2");
        menuItem2.setIcon(iconItem);
        menu.add(menuItem2);
        JMenuItem menuItem3 = new JMenuItem("Item 3");
        menuItem3.setIcon(iconItem);
        menu.add(menuItem3);
    }

    private void createmenu1() {
        JMenu menu1 = new JMenu("Google");
        menu1.setFont(new Font("Tahoma", Font.BOLD, 14));
        menu1.setForeground(Color.WHITE);
        // agregar icono al menu
        menu1.setIcon(createIcon("imagenes//iconGoogle.png"));
        // submenu
        JMenuItem itemYt = new JMenuItem("Youtube");
        itemYt.setIcon(createIcon("imagenes//iconYt.png"));
        itemYt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ImagePanel imagePanel = new ImagePanel("imagenes//yt.png");
                imagePanel.setBounds(0, 0, getWidth(), getHeight());
                add(imagePanel);
                validate();
                repaint();
            }
        });//imagenes\Github.png

        JMenuItem itemGit = new JMenuItem("Github");
        itemGit.setIcon(createIcon("imagenes//iconGit.png"));
        itemGit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImagePanel imagePanel = new ImagePanel("imagenes//Github.png");
                imagePanel.setBounds(0, 0, getWidth(), getHeight());
                add(imagePanel);
                validate();
                repaint();
            }
            
        });
        menu1.add(itemYt);
        menu1.add(itemGit);
        
        menuBar.add(menu1);
        addIcons(menu1);
        menu1.add(createItemExit());

        this.setJMenuBar(menuBar);
    }

    private void createmenu2() {
        JMenu menu2 = new JMenu("VScode");
        menu2.setFont(new Font("Tahoma", Font.BOLD, 14));
        menu2.setForeground(Color.WHITE);
        menu2.setIcon(createIcon("imagenes//iconVsCode.png"));
        menuBar.add(menu2);
        addIcons(menu2);
        this.setJMenuBar(menuBar);
    }

    private void createmenu3() {
        JMenu menu3 = new JMenu("Edge");
        menu3.setFont(new Font("Tahoma", Font.BOLD, 14));
        menu3.setForeground(Color.WHITE);
        menu3.setIcon(createIcon("imagenes//iconEdge.png"));
        menuBar.add(menu3);
        addIcons(menu3);
        this.setJMenuBar(menuBar);
    }

    private JMenuItem createItemExit() {
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK));
        menuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return menuItemExit;
    }
}
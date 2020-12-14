
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rekoncarloz
 */
public class tablero extends javax.swing.JFrame implements Runnable {

    private randomOrder log = new randomOrder();
    private boolean caraUp = false;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    public ImageIcon im1;
    public ImageIcon im2;
    private int puntaje = 0;
    int[] position;
    private Timer t;
    private int h, m, s, cs;
    private String address, username;

    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 100) {
                cs = 0;
                ++s;
            }
            if (s == 60) {
                s = 0;
                ++m;
            }
            if (m == 60) {
                m = 0;
                ++h;
            }
            actualizarLabel();
        }

    };

    private void actualizarLabel() {
        String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
        tiempoTrans.setText(tiempo);
    }

    private void setImagenes() {
        position = log.ordenarandom();

        ImageIcon image = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[0] + ".png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton1.setDisabledIcon(icon);

        ImageIcon image1 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[1] + ".png");
        Icon icon1 = new ImageIcon(image1.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton2.setDisabledIcon(icon1);

        ImageIcon image2 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[2] + ".png");
        Icon icon2 = new ImageIcon(image2.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton3.setDisabledIcon(icon2);

        ImageIcon image3 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[3] + ".png");
        Icon icon3 = new ImageIcon(image3.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton4.setDisabledIcon(icon3);

        ImageIcon image4 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[4] + ".png");
        Icon icon4 = new ImageIcon(image4.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton5.setDisabledIcon(icon4);

        ImageIcon image5 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[5] + ".png");
        Icon icon5 = new ImageIcon(image5.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton6.setDisabledIcon(icon5);

        ImageIcon image6 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[6] + ".png");
        Icon icon6 = new ImageIcon(image6.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton7.setDisabledIcon(icon6);

        ImageIcon image7 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[7] + ".png");
        Icon icon7 = new ImageIcon(image7.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton8.setDisabledIcon(icon7);

        ImageIcon image8 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[8] + ".png");
        Icon icon8 = new ImageIcon(image8.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton9.setDisabledIcon(icon8);

        ImageIcon image9 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[9] + ".png");
        Icon icon9 = new ImageIcon(image9.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton10.setDisabledIcon(icon9);

        ImageIcon image10 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[10] + ".png");
        Icon icon10 = new ImageIcon(image10.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton11.setDisabledIcon(icon10);

        ImageIcon image11 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[11] + ".png");
        Icon icon11 = new ImageIcon(image11.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton12.setDisabledIcon(icon11);

        ImageIcon image12 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[12] + ".png");
        Icon icon12 = new ImageIcon(image12.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton13.setDisabledIcon(icon12);

        ImageIcon image13 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[13] + ".png");
        Icon icon13 = new ImageIcon(image13.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton14.setDisabledIcon(icon13);

        ImageIcon image14 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[14] + ".png");
        Icon icon14 = new ImageIcon(image14.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton15.setDisabledIcon(icon14);

        ImageIcon image15 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[15] + ".png");
        Icon icon15 = new ImageIcon(image15.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton16.setDisabledIcon(icon15);

        ImageIcon image16 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[16] + ".png");
        Icon icon16 = new ImageIcon(image16.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton17.setDisabledIcon(icon16);

        ImageIcon image17 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[17] + ".png");
        Icon icon17 = new ImageIcon(image17.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton18.setDisabledIcon(icon17);

        ImageIcon image18 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[18] + ".png");
        Icon icon18 = new ImageIcon(image18.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton19.setDisabledIcon(icon18);

        ImageIcon image19 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[19] + ".png");
        Icon icon19 = new ImageIcon(image19.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton20.setDisabledIcon(icon19);

        ImageIcon image20 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[20] + ".png");
        Icon icon20 = new ImageIcon(image20.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton21.setDisabledIcon(icon20);

        ImageIcon image21 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[21] + ".png");
        Icon icon21 = new ImageIcon(image21.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton22.setDisabledIcon(icon21);

        ImageIcon image22 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[22] + ".png");
        Icon icon22 = new ImageIcon(image22.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton23.setDisabledIcon(icon22);

        ImageIcon image23 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[23] + ".png");
        Icon icon23 = new ImageIcon(image23.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton24.setDisabledIcon(icon23);

        ImageIcon image24 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[24] + ".png");
        Icon icon24 = new ImageIcon(image24.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton25.setDisabledIcon(icon24);

        ImageIcon image25 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[25] + ".png");
        Icon icon25 = new ImageIcon(image25.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton26.setDisabledIcon(icon25);

        ImageIcon image26 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[26] + ".png");
        Icon icon26 = new ImageIcon(image26.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton27.setDisabledIcon(icon26);

        ImageIcon image27 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[27] + ".png");
        Icon icon27 = new ImageIcon(image27.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton28.setDisabledIcon(icon27);

        ImageIcon image28 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[28] + ".png");
        Icon icon28 = new ImageIcon(image28.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton29.setDisabledIcon(icon28);

        ImageIcon image29 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[29] + ".png");
        Icon icon29 = new ImageIcon(image29.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton30.setDisabledIcon(icon29);

        ImageIcon image30 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[30] + ".png");
        Icon icon30 = new ImageIcon(image30.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton31.setDisabledIcon(icon30);

        ImageIcon image31 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[31] + ".png");
        Icon icon31 = new ImageIcon(image31.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton32.setDisabledIcon(icon31);

        ImageIcon image32 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[32] + ".png");
        Icon icon32 = new ImageIcon(image32.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton33.setDisabledIcon(icon32);

        ImageIcon image33 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[33] + ".png");
        Icon icon33 = new ImageIcon(image33.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton34.setDisabledIcon(icon33);

        ImageIcon image34 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[34] + ".png");
        Icon icon34 = new ImageIcon(image34.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton35.setDisabledIcon(icon34);

        ImageIcon image35 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[35] + ".png");
        Icon icon35 = new ImageIcon(image35.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton36.setDisabledIcon(icon35);

        ImageIcon image36 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[36] + ".png");
        Icon icon36 = new ImageIcon(image36.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton37.setDisabledIcon(icon36);

        ImageIcon image37 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[37] + ".png");
        Icon icon37 = new ImageIcon(image37.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton38.setDisabledIcon(icon37);

        ImageIcon image38 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[38] + ".png");
        Icon icon38 = new ImageIcon(image38.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton39.setDisabledIcon(icon38);

        ImageIcon image39 = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/" + position[39] + ".png");
        Icon icon39 = new ImageIcon(image39.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton40.setDisabledIcon(icon39);
    }

    public tablero(String address, String username) {
        initComponents();
        tiempoTrans.setEnabled(false);
        this.address = address;
        labelName.setText(username);
        setTitle("Memorama");
        t = new Timer(10, acciones);
        ImageIcon foto = new ImageIcon("/Users/rekoncarloz/Desktop/cartasServer/fondo.png");
        System.out.println(this.address);
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), WIDTH));
        jButton1.setIcon(icono);
        jButton1.setEnabled(false);
        jButton2.setIcon(icono);
        jButton2.setEnabled(false);
        jButton3.setIcon(icono);
        jButton3.setEnabled(false);
        jButton4.setIcon(icono);
        jButton4.setEnabled(false);
        jButton5.setIcon(icono);
        jButton5.setEnabled(false);
        jButton6.setIcon(icono);
        jButton6.setEnabled(false);
        jButton7.setIcon(icono);
        jButton7.setEnabled(false);
        jButton8.setIcon(icono);
        jButton8.setEnabled(false);
        jButton9.setIcon(icono);
        jButton9.setEnabled(false);
        jButton10.setIcon(icono);
        jButton10.setEnabled(false);
        jButton11.setIcon(icono);
        jButton11.setEnabled(false);
        jButton12.setIcon(icono);
        jButton12.setEnabled(false);
        jButton13.setIcon(icono);
        jButton13.setEnabled(false);
        jButton14.setIcon(icono);
        jButton14.setEnabled(false);
        jButton15.setIcon(icono);
        jButton15.setEnabled(false);
        jButton16.setIcon(icono);
        jButton16.setEnabled(false);
        jButton17.setIcon(icono);
        jButton17.setEnabled(false);
        jButton18.setIcon(icono);
        jButton18.setEnabled(false);
        jButton19.setIcon(icono);
        jButton19.setEnabled(false);
        jButton20.setIcon(icono);
        jButton20.setEnabled(false);
        jButton21.setIcon(icono);
        jButton21.setEnabled(false);
        jButton22.setIcon(icono);
        jButton22.setEnabled(false);
        jButton23.setIcon(icono);
        jButton23.setEnabled(false);
        jButton24.setIcon(icono);
        jButton24.setEnabled(false);
        jButton25.setIcon(icono);
        jButton25.setEnabled(false);
        jButton26.setIcon(icono);
        jButton26.setEnabled(false);
        jButton27.setIcon(icono);
        jButton27.setEnabled(false);
        jButton28.setIcon(icono);
        jButton28.setEnabled(false);
        jButton29.setIcon(icono);
        jButton29.setEnabled(false);
        jButton30.setIcon(icono);
        jButton30.setEnabled(false);
        jButton31.setIcon(icono);
        jButton31.setEnabled(false);
        jButton32.setIcon(icono);
        jButton32.setEnabled(false);
        jButton33.setIcon(icono);
        jButton33.setEnabled(false);
        jButton34.setIcon(icono);
        jButton34.setEnabled(false);
        jButton35.setIcon(icono);
        jButton35.setEnabled(false);
        jButton36.setIcon(icono);
        jButton36.setEnabled(false);
        jButton37.setIcon(icono);
        jButton37.setEnabled(false);
        jButton38.setIcon(icono);
        jButton38.setEnabled(false);
        jButton39.setIcon(icono);
        jButton39.setEnabled(false);
        jButton40.setIcon(icono);
        jButton40.setEnabled(false);
        this.repaint();
    }

    private void buttonPressed(JButton btn, int pos) {
        String des = String.valueOf(pos);
        if (!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            im1.setDescription(des);
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        } else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            im2.setDescription(des);
            pbtn[1] = btn;
            primerc = true;
            paresDestapados.setText(String.valueOf(puntaje));
        }
    }

    private void comparar() {
        if (caraUp && primerc) {
            if (!im1.getDescription().equals(im2.getDescription())) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if (pbtn[0] == pbtn[1]) {
                    puntaje += 1;
                }
            }
            caraUp = false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        initGame = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        menuTiempo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tiempoTrans = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        paresDestapados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(8, 5, 10, 10));

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);

        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton18MouseExited(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);

        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton19MouseExited(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);

        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton20MouseExited(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);

        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton21MouseExited(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);

        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton22MouseExited(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);

        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton23MouseExited(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);

        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton24MouseExited(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);

        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton25MouseExited(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);

        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton26MouseExited(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);

        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton27MouseExited(evt);
            }
        });
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);

        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton28MouseExited(evt);
            }
        });
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28);

        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton29MouseExited(evt);
            }
        });
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29);

        jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton30MouseExited(evt);
            }
        });
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30);

        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton31MouseExited(evt);
            }
        });
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31);

        jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton32MouseExited(evt);
            }
        });
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32);

        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton33MouseExited(evt);
            }
        });
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton33);

        jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton34MouseExited(evt);
            }
        });
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton34);

        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton35MouseExited(evt);
            }
        });
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton35);

        jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton36MouseExited(evt);
            }
        });
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton36);

        jButton37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton37MouseExited(evt);
            }
        });
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton37);

        jButton38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton38MouseExited(evt);
            }
        });
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton38);

        jButton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton39MouseExited(evt);
            }
        });
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39);

        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton40MouseExited(evt);
            }
        });
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton40);

        jLabel4.setFont(new java.awt.Font("Avenir", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JUGADOR: ");

        initGame.setText("INICIAR JUEGO");
        initGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initGameActionPerformed(evt);
            }
        });

        jButton42.setText("TERMINAR JUEGO");

        labelName.setFont(new java.awt.Font("Avenir", 1, 15)); // NOI18N
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(initGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(initGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton42)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Avenir", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIEMPO TRANSCURRIDO");

        jLabel3.setFont(new java.awt.Font("Avenir", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PARES DESCUBIERTOS");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tiempoTrans.setColumns(20);
        tiempoTrans.setRows(5);
        jScrollPane1.setViewportView(tiempoTrans);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        paresDestapados.setColumns(20);
        paresDestapados.setRows(5);
        jScrollPane3.setViewportView(paresDestapados);

        javax.swing.GroupLayout menuTiempoLayout = new javax.swing.GroupLayout(menuTiempo);
        menuTiempo.setLayout(menuTiempoLayout);
        menuTiempoLayout.setHorizontalGroup(
            menuTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTiempoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(menuTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        menuTiempoLayout.setVerticalGroup(
            menuTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTiempoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menuTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buttonPressed(jButton1, position[0]);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buttonPressed(jButton2, position[1]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buttonPressed(jButton3, position[2]);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        buttonPressed(jButton4, position[3]);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        buttonPressed(jButton5, position[4]);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        buttonPressed(jButton6, position[5]);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        buttonPressed(jButton7, position[6]);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        buttonPressed(jButton8, position[7]);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        buttonPressed(jButton9, position[8]);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        buttonPressed(jButton10, position[9]);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        buttonPressed(jButton11, position[10]);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        buttonPressed(jButton12, position[11]);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        buttonPressed(jButton13, position[12]);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        buttonPressed(jButton14, position[13]);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        buttonPressed(jButton15, position[14]);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        buttonPressed(jButton16, position[15]);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        buttonPressed(jButton17, position[16]);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        buttonPressed(jButton18, position[17]);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        buttonPressed(jButton19, position[18]);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        buttonPressed(jButton20, position[19]);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        buttonPressed(jButton21, position[20]);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        buttonPressed(jButton22, position[21]);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        buttonPressed(jButton23, position[22]);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        buttonPressed(jButton24, position[23]);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        buttonPressed(jButton25, position[24]);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        buttonPressed(jButton26, position[25]);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        buttonPressed(jButton27, position[26]);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        buttonPressed(jButton28, position[27]);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        buttonPressed(jButton29, position[28]);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        buttonPressed(jButton30, position[29]);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        buttonPressed(jButton31, position[30]);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        buttonPressed(jButton32, position[31]);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        buttonPressed(jButton33, position[32]);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        buttonPressed(jButton34, position[33]);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        buttonPressed(jButton35, position[34]);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        buttonPressed(jButton36, position[35]);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        buttonPressed(jButton37, position[36]);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        buttonPressed(jButton38, position[37]);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        buttonPressed(jButton39, position[38]);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        buttonPressed(jButton40, position[39]);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void initGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initGameActionPerformed
        t.start();
        setImagenes();
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        jButton31.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton34.setEnabled(true);
        jButton35.setEnabled(true);
        jButton36.setEnabled(true);
        jButton37.setEnabled(true);
        jButton38.setEnabled(true);
        jButton39.setEnabled(true);
        jButton40.setEnabled(true);
    }//GEN-LAST:event_initGameActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        comparar();
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        comparar();
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        comparar();
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        comparar();
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        comparar();
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        comparar();
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        comparar();
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        comparar();
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        comparar();
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        comparar();
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        comparar();
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        comparar();
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        comparar();
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        comparar();
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        comparar();
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        comparar();
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
        comparar();
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseExited
        comparar();
    }//GEN-LAST:event_jButton18MouseExited

    private void jButton19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseExited
        comparar();
    }//GEN-LAST:event_jButton19MouseExited

    private void jButton20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseExited
        comparar();
    }//GEN-LAST:event_jButton20MouseExited

    private void jButton21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseExited
        comparar();
    }//GEN-LAST:event_jButton21MouseExited

    private void jButton22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseExited
        comparar();
    }//GEN-LAST:event_jButton22MouseExited

    private void jButton23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseExited
        comparar();
    }//GEN-LAST:event_jButton23MouseExited

    private void jButton24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseExited
        comparar();
    }//GEN-LAST:event_jButton24MouseExited

    private void jButton25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseExited
        comparar();
    }//GEN-LAST:event_jButton25MouseExited

    private void jButton26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseExited
        comparar();
    }//GEN-LAST:event_jButton26MouseExited

    private void jButton27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseExited
        comparar();
    }//GEN-LAST:event_jButton27MouseExited

    private void jButton28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MouseExited
        comparar();
    }//GEN-LAST:event_jButton28MouseExited

    private void jButton29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseExited
        comparar();
    }//GEN-LAST:event_jButton29MouseExited

    private void jButton30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton30MouseExited
        comparar();
    }//GEN-LAST:event_jButton30MouseExited

    private void jButton31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MouseExited
        comparar();
    }//GEN-LAST:event_jButton31MouseExited

    private void jButton32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton32MouseExited
        comparar();
    }//GEN-LAST:event_jButton32MouseExited

    private void jButton33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseExited
        comparar();
    }//GEN-LAST:event_jButton33MouseExited

    private void jButton34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton34MouseExited
        comparar();
    }//GEN-LAST:event_jButton34MouseExited

    private void jButton35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MouseExited
        comparar();
    }//GEN-LAST:event_jButton35MouseExited

    private void jButton36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton36MouseExited
        comparar();
    }//GEN-LAST:event_jButton36MouseExited

    private void jButton37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton37MouseExited
        comparar();
    }//GEN-LAST:event_jButton37MouseExited

    private void jButton38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton38MouseExited
        comparar();
    }//GEN-LAST:event_jButton38MouseExited

    private void jButton39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton39MouseExited
        comparar();
    }//GEN-LAST:event_jButton39MouseExited

    private void jButton40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40MouseExited
        comparar();
    }//GEN-LAST:event_jButton40MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    @Override
    public void run() {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton initGame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelName;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuTiempo;
    private javax.swing.JTextArea paresDestapados;
    private javax.swing.JTextArea tiempoTrans;
    // End of variables declaration//GEN-END:variables
}

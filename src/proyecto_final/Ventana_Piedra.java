package proyecto_final;

import javax.swing.JOptionPane;

public class Ventana_Piedra extends javax.swing.JFrame {

    int cont1=0, cont2=0;
    String nombre = "JUGADOR";
    public Ventana_Piedra() {
        
        this.setLocationRelativeTo(null);
        initComponents();
        nombre = Ventana_Registro.nombre;
        if (nombre == null) {
            nombre = "JUGADOR";
        }
        jLabel3.setText(nombre);
        setResizable(false);
        setSize(724, 455);
        this.setLocationRelativeTo(null);
        score.setText("0");
        score2.setText("0 ");
        
        rock1.setVisible(false);
        paper1.setVisible(false);
        scissors1.setVisible(false);
        lizard1.setVisible(false);
        spoke1.setVisible(false);
        
        rock3.setVisible(false);
        paper3.setVisible(false);
        scissors3.setVisible(false);
        lizard3.setVisible(false);
        spoke3.setVisible(false);
        
        label1.setVisible(false);
        label2.setVisible(false);
        
        
    }

    
    public void IA(){
        rock2.setEnabled(true);
        paper2.setEnabled(true);
        scissors2.setEnabled(true);
        lizard2.setEnabled(true);
        spoke2.setEnabled(true);
        int computer=(int) (Math.random()*5);
        String cadena = String.valueOf(computer);
        label2.setText(cadena);
        
        if (computer==0) {
            
        rock2.setEnabled(false);
            
        }else if (computer==1) {
            
            paper2.setEnabled(false);
        }else if (computer==2) {
            scissors2.setEnabled(false);
        }else if (computer==3) {
            lizard2.setEnabled(false);
        }else if (computer==4) {
            spoke2.setEnabled(false);
        }
    }
    
    public void game(){
       
        
        int computer=Integer.parseInt(label2.getText());
        
        if (label1.getText()=="0" && computer==0) {
    
            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Empate!");
           
        
        
        }else if (label1.getText()=="0" && computer==1) {
            
            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Perdiste!");
            cont2=cont2+1;
            
            
            
            
        }else if (label1.getText()=="0" && computer==2) {
            
            
            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste!");
            cont1=cont1+1;
            
            
        }else if (label1.getText()=="0" && computer==3) {
            
            
            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
             NOTE.setText("Ganaste!");
            cont1=cont1+1;
            
            
        }else if (label1.getText()=="0" && computer==4) {
            
            rock1.setVisible(true);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("Perdiste!");
            cont2=cont2+1;
            
///////////////////////////////////////////////////////////////
    }else if (label1.getText()=="1" && computer==0) {
    
            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste!");
            cont1=cont1+1;
        
        
        }else if (label1.getText()=="1" && computer==1) {
            
            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Empate!");
            
            
            
            
            
        }else if (label1.getText()=="1" && computer==2) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Perdiste!");
            cont2=cont2+1;
            
            
        }else if (label1.getText()=="1" && computer==3) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
             NOTE.setText("Ganaste!");
            cont2=cont2+1;
            
            
        }else if (label1.getText()=="1" && computer==4) {
            
            rock1.setVisible(false);
            paper1.setVisible(true);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("Ganaste!");
            cont1=cont1+1;
            

    }else if (label1.getText()=="2" && computer==0) {
    
            rock1.setVisible(false);
            paper1.setVisible(false);
            lizard1.setVisible(false);
            scissors1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Perdiste!");
            cont2=cont2+1;
        
        
        }else if (label1.getText()=="2" && computer==1) {
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste!");
            cont1=cont1+1;
            
            
            
            
        }else if (label1.getText()=="2" && computer==2) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Empate!");
            
            
            
        }else if (label1.getText()=="2" && computer==3) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
             NOTE.setText("Ganaste!");
            cont1=cont1+1;
            
            
        }else if (label1.getText()=="2" && computer==4) {
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(true);
            lizard1.setVisible(false);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("Ganaste!");
            cont2=cont2+1;
            

    }else if (label1.getText()=="3" && computer==0) {
    
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste!");
            cont2=cont2+1;
        
        
        }else if (label1.getText()=="3" && computer==1) {
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste!");
            cont1=cont1+1;
            
            
            
            
        }else if (label1.getText()=="3" && computer==2) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Perdiste!");
            cont2=cont2+1;
            
            
            
        }else if (label1.getText()=="3" && computer==3) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
            NOTE.setText("Empate!");
            
            
            
        }else if (label1.getText()=="3" && computer==4) {
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(true);
            spoke1.setVisible(false);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("Ganaste!");
            cont1=cont1+1;
            
/////////////////////////////////////
    }else if (label1.getText()=="4" && computer==0) {
    
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(true);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste!");
            cont1=cont1+1;
        
        
        }else if (label1.getText()=="4" && computer==1) {
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(true);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Perdiste!");
            cont2=cont2+1;
            
            
            
            
        }else if (label1.getText()=="4" && computer==2) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(true);
            lizard3.setVisible(false);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste !");
            cont1=cont1+1;
            
            
            
        }else if (label1.getText()=="4" && computer==3) {
            
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(true);
            spoke3.setVisible(false);
            NOTE.setText("Ganaste !");
            cont2=cont2+1;
            
            
            
        }else if (label1.getText()=="4" && computer==4) {
            
            rock1.setVisible(false);
            paper1.setVisible(false);
            scissors1.setVisible(false);
            lizard1.setVisible(false);
            spoke1.setVisible(true);
            rock3.setVisible(false);
            paper3.setVisible(false);
            scissors3.setVisible(false);
            lizard3.setVisible(false);
            spoke3.setVisible(true);
            NOTE.setText("Empate!");
            
            

    }
        
        score2.setText(cont2+" ");
        score.setText(cont1+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scissors = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        rock = new javax.swing.JButton();
        lizard = new javax.swing.JButton();
        spoke = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        spoke2 = new javax.swing.JButton();
        scissors2 = new javax.swing.JButton();
        paper2 = new javax.swing.JButton();
        rock2 = new javax.swing.JButton();
        lizard2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        NOTE = new javax.swing.JLabel();
        rock1 = new javax.swing.JButton();
        paper1 = new javax.swing.JButton();
        scissors1 = new javax.swing.JButton();
        lizard1 = new javax.swing.JButton();
        spoke1 = new javax.swing.JButton();
        rock3 = new javax.swing.JButton();
        paper3 = new javax.swing.JButton();
        scissors3 = new javax.swing.JButton();
        lizard3 = new javax.swing.JButton();
        spoke3 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuCuenta = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors.png"))); // NOI18N
        scissors.setBorder(null);
        scissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsActionPerformed(evt);
            }
        });
        getContentPane().add(scissors, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper.png"))); // NOI18N
        paper.setBorder(null);
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });
        getContentPane().add(paper, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock (1).png"))); // NOI18N
        rock.setBorder(null);
        rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });
        getContentPane().add(rock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        lizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard.png"))); // NOI18N
        lizard.setBorder(null);
        lizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lizardActionPerformed(evt);
            }
        });
        getContentPane().add(lizard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        spoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock.png"))); // NOI18N
        spoke.setBorder(null);
        spoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spokeActionPerformed(evt);
            }
        });
        getContentPane().add(spoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vs (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 150, -1));

        spoke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock2.png"))); // NOI18N
        spoke2.setBorder(null);
        getContentPane().add(spoke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        scissors2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors2.png"))); // NOI18N
        scissors2.setBorder(null);
        getContentPane().add(scissors2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));

        paper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper2.png"))); // NOI18N
        paper2.setBorder(null);
        getContentPane().add(paper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        rock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock2.png"))); // NOI18N
        rock2.setBorder(null);
        getContentPane().add(rock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        lizard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard2.png"))); // NOI18N
        lizard2.setBorder(null);
        getContentPane().add(lizard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 10, 170));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 270, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 10, 170));

        jLabel2.setFont(new java.awt.Font("AppleGothic", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RIVAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("AppleGothic", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JUGADOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 120, 100));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 90, 90));

        score.setFont(new java.awt.Font("AppleGothic", 2, 36)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        score.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        score.setText("0");
        score.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 150, 40));

        score2.setFont(new java.awt.Font("AppleGothic", 2, 36)); // NOI18N
        score2.setForeground(new java.awt.Color(255, 255, 255));
        score2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        score2.setText("0 ");
        score2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        score2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 110, 40));

        NOTE.setFont(new java.awt.Font("Lucida Grande", 2, 40)); // NOI18N
        NOTE.setForeground(new java.awt.Color(255, 255, 255));
        NOTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NOTE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(NOTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 210, 110));

        rock1.setBackground(new java.awt.Color(255, 255, 255));
        rock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock (1).png"))); // NOI18N
        rock1.setBorderPainted(false);
        rock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rock1ActionPerformed(evt);
            }
        });
        getContentPane().add(rock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        paper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper.png"))); // NOI18N
        paper1.setBorderPainted(false);
        getContentPane().add(paper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        scissors1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors.png"))); // NOI18N
        scissors1.setBorderPainted(false);
        getContentPane().add(scissors1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        lizard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard.png"))); // NOI18N
        lizard1.setBorderPainted(false);
        getContentPane().add(lizard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        spoke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock.png"))); // NOI18N
        spoke1.setBorderPainted(false);
        getContentPane().add(spoke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        rock3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rock2.png"))); // NOI18N
        rock3.setBorderPainted(false);
        getContentPane().add(rock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        paper3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper2.png"))); // NOI18N
        paper3.setBorderPainted(false);
        getContentPane().add(paper3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        scissors3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scissors2.png"))); // NOI18N
        scissors3.setBorderPainted(false);
        getContentPane().add(scissors3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        lizard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lizard2.png"))); // NOI18N
        lizard3.setBorderPainted(false);
        getContentPane().add(lizard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        spoke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/spock2.png"))); // NOI18N
        spoke3.setBorderPainted(false);
        getContentPane().add(spoke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo_1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuInicio.setBackground(new java.awt.Color(102, 0, 255));
        menuInicio.setForeground(new java.awt.Color(102, 0, 255));
        menuInicio.setText("Inicio");

        jMenuItem1.setText("Pagina de inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuInicio.add(jMenuItem1);

        jMenuItem2.setText("Pagina principal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuInicio.add(jMenuItem2);

        jMenuBar1.add(menuInicio);

        menuCuenta.setText("Mi cuenta");

        jMenuItem3.setText("Mis datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCuenta.add(jMenuItem3);

        jMenuItem4.setText("Cerrar sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuCuenta.add(jMenuItem4);

        jMenuBar1.add(menuCuenta);

        jMenu3.setText("Juegos");

        jMenuItem5.setText("Tragamonedas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Adivina el número");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("El gato y el ratón");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Piedra, papel o tijera");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsActionPerformed
        label1.setText("2");
        IA();
        game();
    }//GEN-LAST:event_scissorsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String nombre = "";
        nombre = Ventana_Registro.nombre;
        if (nombre != null) {
            int aux= JOptionPane.showConfirmDialog(null, "Si vuelve a la pagina inicial se cerrara su sesion"
                    +"\n¿Estas seguro de salir de la pagina principal?");
            if (aux==JOptionPane.YES_OPTION) {
            Ventana_Inicio f1 = new Ventana_Inicio();
            f1.setVisible(true);
            Ventana_Registro.nombre = null;
            Ventana_Registro.apellido = null;
            Ventana_Registro.contraseña = null;
            Ventana_Registro.correo = null;
            Ventana_Registro.nacimiento = null;
            Ventana_Registro.sexo = null;
            this.setVisible(false);
        }  else if(aux==JOptionPane.NO_OPTION){
        }
        } else {
            Ventana_Inicio f1 = new Ventana_Inicio();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if (nombre == "") {
            Ventana_Principal f1 = new Ventana_Principal();
            f1.setVisible(true);
          this.setVisible(false);
        } else {
            Ventana_Principal f1 = new Ventana_Principal();
            f1.jLabel2.setVisible(false);
          f1.jLabel3.setVisible(false);
          f1.jLabel4.setVisible(false);
          f1.jLabel5.setVisible(false);
          f1.jLabel6.setVisible(false);
          f1.entradaCorreo.setVisible(false);
          f1.entradaContraseña.setVisible(false);
          f1.jSeparator1.setVisible(false);
          f1.jButton1.setVisible(false);
          f1.jButton2.setVisible(false);
          f1.jPanel2.setVisible(false);
          f1.jLabel7.setVisible(true);
          f1.jLabel8.setVisible(true);
          f1.jLabel8.setText(Ventana_Registro.nombre);
          f1.setVisible(true);
          this.setVisible(false);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Ventana_Cuenta f1 = new Ventana_Cuenta();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String nombre = "";
        nombre = Ventana_Registro.nombre;
        if (nombre != null) {
            int aux= JOptionPane.showConfirmDialog(null, "¿Estas seguro de cerrar tu sesión?");
            if (aux==JOptionPane.YES_OPTION) {
            Ventana_Principal f2 = new Ventana_Principal();
            Ventana_Registro.nombre = null;
            Ventana_Registro.apellido = null;
            Ventana_Registro.contraseña = null;
            Ventana_Registro.correo = null;
            Ventana_Registro.nacimiento = null;
            Ventana_Registro.sexo = null;
            this.setVisible(false);
        }  else if(aux==JOptionPane.NO_OPTION){
        }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockActionPerformed
        label1.setText("0");
        IA();
        game();
    }//GEN-LAST:event_rockActionPerformed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed
        label1.setText("1");
        IA();
        game();
    }//GEN-LAST:event_paperActionPerformed

    private void lizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lizardActionPerformed
        label1.setText("3");
        IA();
        game();
    }//GEN-LAST:event_lizardActionPerformed

    private void spokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spokeActionPerformed
        label1.setText("4");
        IA();
        game();
    }//GEN-LAST:event_spokeActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        String nombre1 = "";
        nombre1 = Ventana_Registro.nombre;
        if (nombre1 == null) {
            Ventana_Principal f1 = new Ventana_Principal();
            f1.setVisible(true);
          this.setVisible(false);
        } else {
            Ventana_Principal f1 = new Ventana_Principal();
            f1.jLabel2.setVisible(false);
          f1.jLabel3.setVisible(false);
          f1.jLabel4.setVisible(false);
          f1.jLabel5.setVisible(false);
          f1.jLabel6.setVisible(false);
          f1.entradaCorreo.setVisible(false);
          f1.entradaContraseña.setVisible(false);
          f1.jSeparator1.setVisible(false);
          f1.jButton1.setVisible(false);
          f1.jButton2.setVisible(false);
          f1.jPanel2.setVisible(false);
          f1.jLabel7.setVisible(true);
          f1.jLabel8.setVisible(true);
          f1.jLabel8.setText(Ventana_Registro.nombre);
          f1.setVisible(true);
          this.setVisible(false);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jVentanaTragamonedas f1 = new jVentanaTragamonedas();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JOptionPane.showMessageDialog(null, "El juego del gato y el raton es de: "
                                           +"\n         2 JUGADORES");
        jVentanaGato f1 = new jVentanaGato();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jVentanaAdivina f1 = new jVentanaAdivina();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void rock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rock1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Piedra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Piedra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Piedra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Piedra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Piedra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NOTE;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton lizard;
    private javax.swing.JButton lizard1;
    private javax.swing.JButton lizard2;
    private javax.swing.JButton lizard3;
    private javax.swing.JMenu menuCuenta;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JButton paper;
    private javax.swing.JButton paper1;
    private javax.swing.JButton paper2;
    private javax.swing.JButton paper3;
    private javax.swing.JButton rock;
    private javax.swing.JButton rock1;
    private javax.swing.JButton rock2;
    private javax.swing.JButton rock3;
    private javax.swing.JButton scissors;
    private javax.swing.JButton scissors1;
    private javax.swing.JButton scissors2;
    private javax.swing.JButton scissors3;
    private javax.swing.JLabel score;
    private javax.swing.JLabel score2;
    private javax.swing.JButton spoke;
    private javax.swing.JButton spoke1;
    private javax.swing.JButton spoke2;
    private javax.swing.JButton spoke3;
    // End of variables declaration//GEN-END:variables
}

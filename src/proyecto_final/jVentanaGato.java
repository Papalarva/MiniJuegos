package proyecto_final;
import java.awt.event.*;
import javax.swing.*;
import static proyecto_final.Ventana_Registro.nombre;
public class jVentanaGato extends JFrame implements ActionListener{
    
    JuegoDelGato [][]TABLERO;
    int Contador;
    public jVentanaGato() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(320, 400));
        setResizable(false);
        
        jButton1.setVisible(true);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        pack();
        Contador = 0;
        TABLERO = new JuegoDelGato[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                TABLERO[i][j] = new JuegoDelGato();
                TABLERO[i][j].A.setBounds((i*100)+10, (j*100)+10, 100, 100);
                TABLERO[i][j].A.addActionListener(this);
                this.add(TABLERO[i][j].A);
            }
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        menuInicio.setBackground(new java.awt.Color(102, 0, 255));
        menuInicio.setForeground(new java.awt.Color(102, 0, 255));
        menuInicio.setText("Inicio");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });

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
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 245, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuInicioActionPerformed

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

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jVentanaTragamonedas f1 = new jVentanaTragamonedas();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Ventana_Piedra f1 = new Ventana_Piedra();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jVentanaAdivina f1 = new jVentanaAdivina();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jVentanaGato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JMenu menuCuenta;
    private javax.swing.JMenu menuInicio;
    // End of variables declaration//GEN-END:variables
void Tiro(JuegoDelGato X)
    {
        ImageIcon ICONO=null;
        if(Contador%2==0)
        {
            ICONO = new ImageIcon(this.getClass().getResource("O.png"));
            X.B=1;
        }
        else
        {
            ICONO = new ImageIcon(this.getClass().getResource("X.png"));
            X.B=4;
        }
        
        ICONO = new ImageIcon(ICONO.getImage().getScaledInstance(90, -1, java.awt.Image.SCALE_DEFAULT));
        X.A.setIcon(ICONO);
        X.A.removeActionListener(this);
    }
@Override
public void actionPerformed(ActionEvent e) {
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if (e.getSource()==TABLERO[i][j].A) 
                {
                    Tiro(TABLERO[i][j]);
                    if(Revisar())
                    {
                        JOptionPane.showMessageDialog(null,"Has ganado");
                        jVentanaGato f1 = new jVentanaGato();
                        f1.setVisible(true);
                        this.setVisible(false);
                    }
                    else if(Contador<9)
                    {
                    	Contador++;
                    }if (Contador==9)
                    {
                    	JOptionPane.showMessageDialog(null,"Juego empatado");
                        jVentanaGato f1 = new jVentanaGato();
                        f1.setVisible(true);
                        this.setVisible(false);               	
                    }
                }
            }
        }        
    }
    boolean Revisar()
    {
        boolean Gano= false;
        int Suma=0;
        for(int i=0;i<3;i++)
        {
            Suma=TABLERO[i][0].B+TABLERO[i][1].B+TABLERO[i][2].B;
            if(Suma==3 || Suma==12)
            {
                Gano=true;
                break;
            }
        }
        for(int i=0;i<3;i++)
        {
            Suma=TABLERO[0][i].B+TABLERO[1][i].B+TABLERO[2][i].B;
            if(Suma==3 ||Suma==12)
            {
                Gano=true;
                break;
            } 
        }
        Suma=TABLERO[0][2].B+TABLERO[1][1].B+TABLERO[2][0].B;
        if(Suma==3 ||Suma==12)
                Gano=true;
        Suma=0;
        for(int i=0;i<3;i++)
            Suma+=TABLERO[i][i].B;
        
        if(Suma==3 ||Suma==12)
                Gano=true;        
                return Gano;
        
        }
   }
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */
public class calculator_form extends javax.swing.JFrame {

    /**
     * Creates new form calculator_form
     */
    public calculator_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        l_label = new javax.swing.JLabel();
        x_label = new javax.swing.JLabel();
        t_label = new javax.swing.JLabel();
        lamda_input = new javax.swing.JTextField();
        x_input = new javax.swing.JTextField();
        t_input = new javax.swing.JTextField();
        x_arrivals = new javax.swing.JButton();
        max_x_arrivals = new javax.swing.JButton();
        min_x_arrivals = new javax.swing.JButton();
        k1_to_k2_arrivals = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        result_1 = new javax.swing.JTextField();
        result_2 = new javax.swing.JTextField();
        result_3 = new javax.swing.JTextField();
        result_4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_label.setText("lamda");

        x_label.setText("x");

        t_label.setText("t");

        lamda_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamda_inputActionPerformed(evt);
            }
        });

        x_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x_inputActionPerformed(evt);
            }
        });

        t_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_inputActionPerformed(evt);
            }
        });

        x_arrivals.setText("calculate prob. for x arrivals");
        x_arrivals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x_arrivalsActionPerformed(evt);
            }
        });

        max_x_arrivals.setText("calculate prob. for max x arrivals");
        max_x_arrivals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                max_x_arrivalsActionPerformed(evt);
            }
        });

        min_x_arrivals.setText("calculate prob. for min x arrivals");
        min_x_arrivals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min_x_arrivalsActionPerformed(evt);
            }
        });

        k1_to_k2_arrivals.setText("calculate prob for k1 to k2 arrivals");

        jLabel4.setText("answer:");

        jLabel5.setText("answer:");

        jLabel6.setText("answer:");

        jLabel7.setText("answer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(l_label))
                    .addComponent(lamda_input, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(x_input, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(x_label)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(t_input, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t_label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(k1_to_k2_arrivals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(min_x_arrivals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(max_x_arrivals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(x_arrivals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result_1)
                    .addComponent(result_2)
                    .addComponent(result_3)
                    .addComponent(result_4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_label)
                    .addComponent(x_label)
                    .addComponent(t_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lamda_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x_arrivals)
                    .addComponent(jLabel4)
                    .addComponent(result_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(max_x_arrivals)
                    .addComponent(jLabel5)
                    .addComponent(result_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(min_x_arrivals)
                    .addComponent(jLabel6)
                    .addComponent(result_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k1_to_k2_arrivals)
                    .addComponent(jLabel7)
                    .addComponent(result_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void x_inputActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
      
    }                                       

    private void max_x_arrivalsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        int x ;
        double lamda , t;
        x=Integer.parseInt(this.x_input.getText());
        lamda=Double.parseDouble(this.lamda_input.getText());
        t=Double.parseDouble(this.t_input.getText());
        
        double poisson;
        double k=0;
        if( x>=0 && lamda>=0 && t>=0) {
        poisson=Math.pow(Math.E,-lamda*t)*Math.pow(lamda*t,x)/factorial(x);
        
        for (int i=0;i<=x;i++){
            k=k+poisson;
        }
        result_2.setText(String.valueOf(k));
         }
      
    }                                              

    private void lamda_inputActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void t_inputActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void x_arrivalsActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int x ;
        double lamda , t;
        x=Integer.parseInt(this.x_input.getText());
        lamda=Double.parseDouble(this.lamda_input.getText());
        t=Double.parseDouble(this.t_input.getText());
        double poisson=0;
       if( x>=0 && lamda>=0 && t>=0) {
        poisson=Math.pow(Math.E,-lamda*t)*Math.pow(lamda*t,x)/factorial(x);
       }
       else {
            JOptionPane.showMessageDialog(this,"negative numbers not accepted","Bad Value",JOptionPane.ERROR_MESSAGE);
        }//end else
       result_1.setText(String.valueOf(poisson));
    }                                          

    private void min_x_arrivalsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        int x ;
        double lamda , t;
        x=Integer.parseInt(this.x_input.getText());
        lamda=Double.parseDouble(this.lamda_input.getText());
        t=Double.parseDouble(this.t_input.getText());
        
        double poisson;
        double k=0;
        if( x>=0 && lamda>=0 && t>=0) {
        poisson=Math.pow(Math.E,-lamda*t)*Math.pow(lamda*t,x)/factorial(x);
        
        for (int i=0;i<=x;i++){
            k=k+poisson;
        }
        result_2.setText(String.valueOf(1-k));
         }
    }                                              

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
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator_form().setVisible(true);
            }
        });
    }
    public static int factorial(int x){
       int fact = 1;
        if (x>0){
            for (int i=1; i<x ; i++){
                fact=x*i;
            }//end for
        }
//end if
        else if (x==0){
            fact=1;
        }
    
        return fact;
    }//end factorial

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton k1_to_k2_arrivals;
    private javax.swing.JLabel l_label;
    private javax.swing.JTextField lamda_input;
    private javax.swing.JButton max_x_arrivals;
    private javax.swing.JButton min_x_arrivals;
    private javax.swing.JTextField result_1;
    private javax.swing.JTextField result_2;
    private javax.swing.JTextField result_3;
    private javax.swing.JTextField result_4;
    private javax.swing.JTextField t_input;
    private javax.swing.JLabel t_label;
    private javax.swing.JButton x_arrivals;
    private javax.swing.JTextField x_input;
    private javax.swing.JLabel x_label;
    // End of variables declaration                   

}


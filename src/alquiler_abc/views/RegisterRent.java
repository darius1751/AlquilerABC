package alquiler_abc.views;

import alquiler_abc.models.Client;
import alquiler_abc.models.Rent;
import alquiler_abc.models.Vehicule;
import alquiler_abc_main.Main;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class RegisterRent extends javax.swing.JFrame {

    
    public RegisterRent() {
        initComponents();
        this.setLocationRelativeTo(null); 
        rentDate.setText(LocalDate.now().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        registerRent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        identification = new javax.swing.JTextField();
        plate = new javax.swing.JTextField();
        addVehicule = new javax.swing.JButton();
        addClient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rentDate = new javax.swing.JTextField();
        rentalDays = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(510, 460));
        getContentPane().setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(510, 460));
        jPanel2.setLayout(null);

        registerRent.setText("Registrar Alquiler");
        registerRent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerRentActionPerformed(evt);
            }
        });
        jPanel2.add(registerRent);
        registerRent.setBounds(180, 250, 180, 30);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Ir al Menu Principal");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenu(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(210, 370, 140, 18);

        jLabel2.setText("Numero Identificacion Cliente:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 50, 240, 18);

        jLabel3.setText("Placa:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(300, 50, 110, 18);
        jPanel2.add(identification);
        identification.setBounds(30, 70, 190, 24);
        jPanel2.add(plate);
        plate.setBounds(300, 70, 180, 24);

        addVehicule.setText("Registrar Automovil");
        addVehicule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehiculeActionPerformed(evt);
            }
        });
        jPanel2.add(addVehicule);
        addVehicule.setBounds(180, 290, 180, 30);

        addClient.setText("Registrar Cliente");
        addClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });
        jPanel2.add(addClient);
        addClient.setBounds(183, 330, 180, 30);

        jLabel4.setText("Fecha del Alquiler:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 130, 190, 18);

        rentDate.setEditable(false);
        rentDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rentDate.setEnabled(false);
        jPanel2.add(rentDate);
        rentDate.setBounds(30, 150, 190, 24);
        jPanel2.add(rentalDays);
        rentalDays.setBounds(310, 150, 64, 24);

        jLabel5.setText("Dias de Alquiler:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(310, 130, 130, 18);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 510, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehiculeActionPerformed
        this.dispose();
        new AddVehicule().setVisible(true);
    }//GEN-LAST:event_addVehiculeActionPerformed

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        this.dispose();
        new AddClient().setVisible(true);
    }//GEN-LAST:event_addClientActionPerformed

    private void registerRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerRentActionPerformed
        try{
            existClient(identification.getText());
            isAvailableVehicule(plate.getText());
            validateRentalDays();
            Main.rents.add(
                new Rent(
                    identification.getText(),
                    plate.getText(),
                    rentDate.getText(),
                    Integer.parseInt(rentalDays.getText())
                )
            );
            disableVehicule(plate.getText());
            JOptionPane.showMessageDialog(null, "Se ha realizado el alquiler de forma exitosa.");
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_registerRentActionPerformed

    private void openMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenu
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_openMenu

    private void existClient(String identification){
        for(Client client : Main.clients){
            if(client.getIdentification().equals(identification))
                return;
        }
        throw new IllegalArgumentException("Error: El cliente con Numero de Identificacion: " + identification +" No se encuentra registrado, si desea registrarlo de en \"Registrar Cliente\"" );
    }
    
    private void isAvailableVehicule(String plate){
        final String AVAILABLE_VEHICULE = "Disponible";
        for(Vehicule vehicule : Main.vehicules){
            if(vehicule.getPlate().equals(plate)){
                if(vehicule.getState().equals(AVAILABLE_VEHICULE))
                    return;
                else
                    throw new IllegalArgumentException("Error: El Automovil con la placa: " + plate + " Se encuentra en estado \"Alquilado\"");
            }
        }
        throw new IllegalArgumentException("Error: El Automovil con la placa: " + plate + " No existe, si desea crearlo de en \"Registrar Vehiculo\"");
        
    }
    
    private void disableVehicule(String plate){
        for(int i = 0; i <= Main.vehicules.size(); i++){
            if(Main.vehicules.get(i).getPlate().equals(plate)){
                Main.vehicules.get(i).setState("Alquilado");
                return;
            }
        }
    }
    
    private void validateRentalDays(){
        int rentalDaysClient = Integer.parseInt(this.rentalDays.getText());
        if(rentalDaysClient <= 0)
            throw new IllegalArgumentException("Error: Los dias de renta deben ser mayores a 0");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClient;
    private javax.swing.JButton addVehicule;
    private javax.swing.JTextField identification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField plate;
    private javax.swing.JButton registerRent;
    private javax.swing.JTextField rentDate;
    private javax.swing.JTextField rentalDays;
    // End of variables declaration//GEN-END:variables
}

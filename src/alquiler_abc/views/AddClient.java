package alquiler_abc.views;

import alquiler_abc.models.Client;
import alquiler_abc_main.Main;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class AddClient extends javax.swing.JFrame {

    /**
     * Creates new form AddClient
     */
    public AddClient() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        identification = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNames = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        names = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 460));
        setPreferredSize(new java.awt.Dimension(510, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(510, 460));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setLabel("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleAddClient(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 320, 100, 50);

        jLabel1.setText("Numero de Documento:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 30, 190, 30);
        jPanel1.add(identification);
        identification.setBounds(170, 60, 180, 24);

        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 130, 170, 18);
        jPanel1.add(lastNames);
        lastNames.setBounds(270, 150, 220, 24);

        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 130, 220, 18);
        jPanel1.add(names);
        names.setBounds(20, 150, 170, 24);

        jLabel4.setText("Numero de Contacto:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 240, 170, 18);
        jPanel1.add(phone);
        phone.setBounds(20, 260, 170, 24);

        jLabel5.setText("Direccion de Residencia:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 240, 210, 18);
        jPanel1.add(address);
        address.setBounds(280, 260, 210, 24);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Ir al Menu Principal");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenu(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 380, 140, 18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenu
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_openMenu

    private void handleAddClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handleAddClient
        try{
            String identificationClient = identification.getText();
            String phoneClient = phone.getText();
            validateFieldsEmpty();
            validatePhone(phoneClient);
            if(!existIdentification(identificationClient)){
                Main.clients.add(new Client(
                    identificationClient,
                    names.getText(),
                    lastNames.getText(),
                    phoneClient,
                    address.getText()
                )
            );
            JOptionPane.showMessageDialog(null, "Se ha registrado el cliente de forma correcta.");
        }else
            JOptionPane.showMessageDialog(null, "Error: El numero de documento: "+identificationClient+" Ya existe");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error: Formato de telefono no valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_handleAddClient
    
    private boolean existIdentification(String identification){
        for(Client client : Main.clients){
            if(client.getIdentification().equals(identification))
                return true;
        }
        return false;
    }
    
    private void validateFieldsEmpty(){
        if(identification.getText().isBlank() || identification.getText().isBlank())
            throw new IllegalArgumentException("Numero de Identificacion no puede estar vacia");
        if(names.getText().isBlank() || names.getText().isBlank())
            throw new IllegalArgumentException("Nombres no puede estar vacia");
        if(lastNames.getText().isBlank() || lastNames.getText().isBlank())
            throw new IllegalArgumentException("Apellidos no puede estar vacia");
        if(phone.getText().isBlank() || phone.getText().isBlank())
            throw new IllegalArgumentException("Numero de contacto no puede estar vacia");
        if(address.getText().isBlank() || address.getText().isBlank())
            throw new IllegalArgumentException("Direccion no puede estar vacia");
    }
    private void validatePhone(String phone) throws IllegalArgumentException {
        String validPhone = "\\A\\d{7,10}\\Z";
        if(!Pattern.matches(validPhone, phone))
            throw new IllegalArgumentException("Formato de telefono no valido");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField identification;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNames;
    private javax.swing.JTextField names;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
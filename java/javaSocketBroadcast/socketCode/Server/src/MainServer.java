import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MainServer extends javax.swing.JFrame {

    DatagramSocket socket;
    DatagramPacket packet;
  
    public MainServer() {
        
        initComponents();
        this.setTitle("Server");
        this.setVisible(true);
    }
    
    public void startRunning()
    {
        
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 50, 270, 30);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 50, 80, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Write your text here");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 30, 150, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg7.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, -5, 410, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(417, 194));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        sendMessage(jTextField1.getText());
	jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        sendMessage(jTextField1.getText());
	jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void sendMessage(String message)
    {
        try
        {
                socket = new DatagramSocket();
                socket.setBroadcast(true);
                // tableau de 15 octets qui contiendra les données reçues
                // création d'un paquet en utilisant le tableau d'octets
                InetAddress addr=InetAddress.getByName("192.168.43.255");
                packet = new DatagramPacket(message.getBytes(), message.getBytes().length,addr,4445);
                //packet2 = new DatagramPacket(message.getBytes(), message.length(),addr,4446);
                socket.send(packet);
                //socket.send(packet2);
                socket.close();
        }
        catch(IOException ioException)
        {
        }
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

import java.awt.BorderLayout;
import java.io.IOException;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client extends javax.swing.JFrame {

    DatagramPacket packet;
    DatagramSocket socket;
//    private String message="";
//    private Socket connection;
//    private int port = 6789;
    
    
    public Client() throws SocketException, UnknownHostException {
        
        initComponents();
        try {
             socket = new DatagramSocket(4445);

        } catch (SocketException e) {
            // socket = new DatagramSocket(4446);

        }
        
        this.setTitle("PC : " + InetAddress.getLocalHost().getHostName() + " <---> IP : " + InetAddress.getLocalHost().getHostAddress());
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new BorderLayout(2,2));

        chatArea.setColumns(20);   
        chatArea.setRows(5);
        jScrollPane1.setViewportView(chatArea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 410, 400);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg7.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(444, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void startRunning()
    {while (true) {
       try
       {
            byte[] data = new byte[1024];
            // création d'un paquet en utilisant le tableau d'octets
            packet = new DatagramPacket(data, data.length);
            // attente de la réception d'un paquet. Le paquet reçu est //placé dans packet et ses données dans data.            
            socket.receive(packet);
            // récupération et affichage des données (unechaîne de caractères)
            String chaine = new String(packet.getData());
            chatArea.append("\n\nip" + packet.getAddress() + "\nmessage : "   +chaine);
            //test

       }
       catch(IOException ioException)
       {
       }
    }}
    
    
  
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

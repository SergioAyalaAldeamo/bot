
package bot;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Main extends javax.swing.JFrame {

    String pregunta,respuesta,preguntagenerada;
    boolean reproduciendo=false;
    AudioClip sonido1,sonido2,alive;

    public Main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NameBot = new javax.swing.JLabel();
        online = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        texto = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        NameBot.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        NameBot.setForeground(new java.awt.Color(255, 255, 255));
        NameBot.setText("Chat Cortana");
        NameBot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));

        online.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));

        jButton1.setText("Nueva Palabra");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pantalla.setBackground(new java.awt.Color(204, 204, 204));
        pantalla.setColumns(20);
        pantalla.setRows(5);
        pantalla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        jScrollPane1.setViewportView(pantalla);

        texto.setBackground(new java.awt.Color(204, 204, 204));
        texto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));

        enviar.setText("Enviar");
        enviar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(texto)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(online, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameBot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(online, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        Thread hilo = new Thread(new Runnable(){
        @Override
        public void run(){
            try{
                pregunta=texto.getText();
                respuesta=(new BuscarDatos().translate(texto.getText()));
                preguntagenerada=(new BuscarDatos().translate(generarpregunta()));
                pantalla.append("Usted: "+texto.getText()+"\n");
                    if(respuesta.equalsIgnoreCase("si")){
                        pantalla.append("Cortana: Podrias enseñarme que debo responder si me dicen: '"+pregunta+"'Por favor (si/no)\n");
                        String respuestaUsuario= JOptionPane.showInputDialog("Deseas enseñarle (si/no)");
                        if(respuestaUsuario.equalsIgnoreCase("si")){
                            String respuestaUsuarioPregunta= JOptionPane.showInputDialog("Que responder a '"+pregunta+"'");
                            Leer aprender = new Leer();
                            String nuevapalabra=aprender.preguntanueva(pregunta,respuestaUsuarioPregunta);
                            aprender.guardar(aprender.leertxt("datos.txt"),nuevapalabra);


                        }
                    }
            texto.setText("");
            animacionEscribir(respuesta);
            int probabilidad=mitadProbabilidad();
                if(probabilidad>5){
                    animacionpregunta(preguntagenerada);
                    if(preguntagenerada.equalsIgnoreCase("pongamos musica")&& reproduciendo != true){
                        alive=java.applet.Applet.newAudioClip(getClass().getResource("./alive.wav"));
                        alive.play();
                    }
                }
            }catch(Exception e){
            }
        }
    });
hilo.start();



    }//GEN-LAST:event_enviarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String UsuarioPregunta=JOptionPane.showInputDialog("Ingrese Pregunta");
        String respuestaUsuarioPregunta =JOptionPane.showInputDialog("Que responder a '"+UsuarioPregunta+"'");
        Leer aprender = new Leer();
        String nuevapalabra=aprender.preguntanueva(UsuarioPregunta,respuestaUsuarioPregunta);
        aprender.guardar(aprender.leertxt("datos.txt"),nuevapalabra);
    }//GEN-LAST:event_jButton1ActionPerformed

    public JButton enviarPresionado(){
        return enviar;
    }
    public void setPantalla(){
        pantalla.append("Maquina: "+respuesta+"\n");
    }
    public JTextArea regresaPantalla(){
        return pantalla;
    }
    public JTextField regresaTexto(){
    return texto;
    }



public String generarpregunta(){
    int numero;
    numero= (int) (Math.random()*9)+1;
    String preguntaAleatoria = Integer.toString(numero);
    String preguntacompletada=preguntaAleatoria+"p";
    return preguntacompletada;

}

public int mitadProbabilidad(){
    int numero;
    numero= (int)(Math.random()*9)+1;
    return numero;

}

public void animacionEscribir(String respuestaxd) throws InterruptedException,URISyntaxException,IOException{
    sonido1=java.applet.Applet.newAudioClip(getClass().getResource("./mensajellegada.wav"));
    sonido2=java.applet.Applet.newAudioClip(getClass().getResource("./pop.wav"));
    Thread.sleep(generarRandom());
    online.setForeground(Color.blue);
    sonido2.play();
    online.setText("Visto");
    Thread.sleep(generarRandom());
    online.setText("Escribiendo");
    Thread.sleep(generarRandom());
    online.setText("");
    sonido1.play();
    pantalla.append("Cortana: "+ respuestaxd+"\n");
        if(pregunta.equalsIgnoreCase("reproducir musica")){
            reproduciendo=true;
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=2A2XBoxtcUA&list=RD2A2XBoxtcUA&start_radio=1&ab_channel=DominoRecordingCo."));

        }


}

public void animacionpregunta(String respuestaxd) throws InterruptedException{

    sonido1=java.applet.Applet.newAudioClip(getClass().getResource("./mensajellegada.wav"));
    Thread.sleep(1500);
    online.setText("Escribiendo");
    Thread.sleep(1000);
    online.setText("");
    sonido1.play();
    pantalla.append("Cortana: "+respuestaxd+"\n");

}

public int generarRandom(){

int numero;
numero=(int)(Math.random()*4000)+1000;
return numero;

}

public void fijartexto(){

pantalla.append("maquina: "+respuesta+"\n");
texto.setText("");
}





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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameBot;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel online;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}

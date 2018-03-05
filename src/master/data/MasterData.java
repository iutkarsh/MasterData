package master.data;


public class MasterData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try { 
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        TableFrame tf = new TableFrame();
        tf.setLocationRelativeTo(null);
        tf.setVisible(true);
    }
    
}

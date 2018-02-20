
package text_editor;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static java.util.Collections.copy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private Color color = (Color.BLACK);
    File selectedFile = null;
    JComboBox jcbFont = new javax.swing.JComboBox();
    JComboBox jcbSelectSize = new javax.swing.JComboBox();
    int fstyle;
    Font font1;
    static int fsize = 20;
    public String familyvalue [];
    public String sizevalue [];
    String ffamily, fsizestr, fstylestr;
    int [] stylevalue={ Font.PLAIN, Font.BOLD, Font.ITALIC };
    String [] stylevalues={ "PLAIN", "BOLD", "ITALIC" };
    private JMenuBar jMenuBar2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JMenu jMenu44;
    private JMenuItem status;
    private JMenuItem fontsize;
    private JMenuItem fontstyle;
    private JMenuItem fontfamily;
    public MainFrame() {
        initComponents();
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES","text","txt");
        //fileOpener.setFileFilter(filter);
        this.setLocationRelativeTo(null);
        File selectedFile=null;
        font1 = new Font("Arial",Font.PLAIN,17);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        loadFont();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu44 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JList familylist, stylelist, sizelist;
        
        
        fontfamily = new JMenuItem("Font Family");
	fontstyle = new JMenuItem("Font Style");
	fontsize = new JMenuItem("Font Size");
        
        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem12.setText("jMenuItem12");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        familylist = new JList(familyvalue);
        //System.out.println(familylist);
	stylelist = new JList(stylevalues);
	sizelist = new JList(sizevalue);


	familylist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	sizelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	stylelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
      
        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        jButton3.setText("jButton3");

        jMenu3.setText("File");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("New");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Open");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Save");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setText("Quit");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Edit");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Undo");
        jMenu2.add(jMenuItem2);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setText("Select All");
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Format");
        
        jMenuItem10.setText("Text Color");
        jMenu44.setText("Font");
        jMenu4.add(jMenu44);
        jMenu4.add(jMenuItem10);
        jMenu44.add(fontfamily);
        jMenu44.add(fontstyle);
        jMenu44.add(fontsize);
        
        jMenuBar1.add(jMenu4);
        
        jcbSelectSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "14", "18", "22", "26", "30", "34", "36", "40", "44", "48", "52" }));
        jcbSelectSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectSizeActionPerformed(evt);
            }
        });
        
        fontfamily.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 JOptionPane.showConfirmDialog(null, jcbFont, "Choose Font Family", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                display.setFont(new Font(jcbFont.getSelectedItem().toString(),
                Font.PLAIN, Integer.parseInt(jcbSelectSize.getSelectedItem().toString())));
             }
        });
        
        fontstyle.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 JOptionPane.showConfirmDialog(null, stylelist, "Choose Font Style", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		fstyle=stylevalue[stylelist.getSelectedIndex()];
		font1=new Font(ffamily,fstyle,fsize);
		display.setFont(font1);
             }
        });
        
        fontsize.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showConfirmDialog(null, jcbSelectSize, "Choose Font Size", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
             }
        });
        
        jMenuItem10.addActionListener(new java.awt.event.ActionListener(){
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 color = JColorChooser.showDialog(null,"Choose colour", color);
                 if(color==null)
                     color = (Color.BLACK);
                 display.setForeground(color);
             }
        });
        
        jMenu6.setText("Help");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem14.setText("About");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    
    private void jcbSelectSizeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String getSize = jcbSelectSize.getSelectedItem().toString();
        Font f = display.getFont();
        display.setFont(new Font(f.getFontName(),
                f.getStyle(), Integer.parseInt(getSize)));

    }
    private void loadFont() {
    GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    familyvalue = gEnv.getAvailableFontFamilyNames();
    
    ComboBoxModel model = new DefaultComboBoxModel(familyvalue);
    jcbFont.setModel(model);
    }
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //Show Open File Menu
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			
                    
                    selectedFile = jfc.getSelectedFile();
		    System.out.println(selectedFile.getAbsolutePath());
                    try{
                        Scanner sc = new Scanner(new FileInputStream(selectedFile));
                        String buffer="";
                        while(sc.hasNext()){
                            buffer+=sc.nextLine()+"\n";
                        }
                        display.setText(buffer);
                    }catch(FileNotFoundException e){
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE,null,e);
                    }
		}
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        System.exit(0);
    }                                          

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // SHOW DEVELOPERS INFO
       
    }                                      

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
         JPopupMenu popupmenu = new JPopupMenu("About");   
        JMenuItem desc = new JMenuItem("Developers");
        JMenuItem dev1 = new JMenuItem("Ajay Hegde");  
        JMenuItem dev2 = new JMenuItem("Dattatreya Nayak");  
        JMenuItem dev3 = new JMenuItem("Prajjwal Rai");
        JMenuItem dev4 = new JMenuItem("CSE,MIT Manipal");
        popupmenu.add(desc); 
        popupmenu.add(dev1); 
        popupmenu.add(dev2);
        popupmenu.add(dev3);  
        popupmenu.add(dev4); 
        /*display.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                
            }                 
        });*/
         popupmenu.show(display , 500, 500); 
        //display.add(popupmenu);   
        //display.setSize(300,300);  
        //display.setLayout(null);  
        //display.setVisible(true);  
    }                                           

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(selectedFile!=null){
            try {
                PrintWriter pw = new PrintWriter(selectedFile);
                pw.write(display.getText());
                pw.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            int status = jfc.showSaveDialog(this);
            if (status == JFileChooser.APPROVE_OPTION) {
                File f = new File(jfc.getSelectedFile().getPath());
                if(f.exists()){
                    JOptionPane.showMessageDialog(rootPane,"File already exists","error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                PrintWriter pw;
                try {
                    pw = new PrintWriter(f);
                    pw.write(display.getText());
                    pw.close();
                    JOptionPane.showMessageDialog(rootPane,"Saved","Done",JOptionPane.INFORMATION_MESSAGE);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                 JOptionPane.showMessageDialog(rootPane,"Can't save","error",JOptionPane.ERROR_MESSAGE);
            }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea display;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   

    private void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

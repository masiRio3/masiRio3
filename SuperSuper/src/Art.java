
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

public class Art extends JFrame {

    private JPanel contentPane;
    private JTextField txtArt;
    private JTextField txtPrecio;
    int frut, verd, carn, totProd, precio, sumaPrec, prod;
    int pagoTotal;
    private boolean bandera = false;
    private JLabel lblTot;
    private JButton btnProcesar;
    private JComboBox cmbProd;
    private JLabel lblCarne;
    private JLabel lblVerd;
    private JLabel lblFrut;
    private JLabel lblTotArt;
    private JButton btnReiniciar;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Art frame = new Art();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
    }

    /**
     * Create the frame.
     */
    public Art() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 945, 575);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNombreDelProducto = new JLabel("Nombre del Articulo");
        lblNombreDelProducto.setBounds(12, 43, 135, 16);
        contentPane.add(lblNombreDelProducto);

        txtArt = new JTextField();
        txtArt.setBounds(179, 40, 116, 22);
        contentPane.add(txtArt);
        txtArt.setColumns(10);

        txtPrecio = new JTextField();
        txtPrecio.setColumns(10);
        txtPrecio.setBounds(179, 86, 116, 22);

        contentPane.add(txtPrecio);

        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setBounds(12, 89, 135, 16);
        contentPane.add(lblPrecio);

        JLabel lblRubro = new JLabel("Rubro");
        lblRubro.setBounds(12, 143, 135, 16);
        contentPane.add(lblRubro);

        cmbProd = new JComboBox();
        cmbProd.addItemListener(new ItemListener() {
            public void itemStateChanged (ItemEvent e) { 

               if (e.getStateChange()== ItemEvent.SELECTED) {
            

                    String seleccionado = (String)cmbProd.getSelectedItem();

                   
                    if (seleccionado.equals("Frutas")) {

                       
                        ++frut;
                        
                         System.out.println(frut);

                    }

                    if (seleccionado.equals("Verduras")) {

                        ++verd;
                        System.out.println(verd);
                    }

                    if (seleccionado.equals("Carnes")) {

                        ++carn; 
                        System.out.println(carn);
                    }

                }

            }
            

        });
        
       
        

        cmbProd.setModel(new DefaultComboBoxModel(new String[]{"Seleccione", "Frutas", "Verduras", "Carnes"}));
        cmbProd.setBounds(179, 140, 116, 22);
        contentPane.add(cmbProd);

        JLabel lblPagoTotal = new JLabel("Pago Total");
        lblPagoTotal.setBounds(12, 227, 66, 16);
        contentPane.add(lblPagoTotal);

        lblTot = new JLabel("");
        lblTot.setBounds(105, 227, 66, 16);
        contentPane.add(lblTot);

        JLabel lblFrutas = new JLabel("Frutas");
        lblFrutas.setBounds(12, 263, 66, 16);
        contentPane.add(lblFrutas);

        lblFrut = new JLabel("");
        lblFrut.setBounds(105, 263, 66, 16);
        contentPane.add(lblFrut);

        JLabel lblVerduras = new JLabel("Verduras");
        lblVerduras.setBounds(12, 297, 66, 16);
        contentPane.add(lblVerduras);

        lblVerd = new JLabel("");
        lblVerd.setBounds(105, 297, 66, 16);
        contentPane.add(lblVerd);

        JLabel lblCarnes = new JLabel("Carnes");
        lblCarnes.setBounds(12, 333, 66, 16);
        contentPane.add(lblCarnes);

        lblCarne = new JLabel("");
        lblCarne.setBounds(105, 333, 66, 16);
        contentPane.add(lblCarne);

        btnProcesar = new JButton("Procesar");
        btnProcesar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                
                if (e.getSource() == btnProcesar) {
                    
                     
                    
                    try {
                        String valor = txtPrecio.getText();
                        int val = Integer.parseInt(valor);
                        pagoTotal = pagoTotal + val;
                        lblTot.setText(String.valueOf(pagoTotal));
                        lblFrut.setText(String.valueOf(frut));
                        lblVerd.setText(String.valueOf(verd));
                        lblCarne.setText(String.valueOf(carn));
                        prod++;
                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "POR FAVOR COMPLETE LOS DATOS");
                    }

                }

            }
        });
        btnProcesar.setBounds(179, 189, 116, 25);
        contentPane.add(btnProcesar);

        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(btnReiniciar)) {

                    lblTot.setText("");
                    lblFrut.setText("");
                    lblVerd.setText("");
                    lblCarne.setText("");
                    lblTotArt.setText("");
                    pagoTotal=0;
                    prod = 0;
                    
                    //Se inicializan en 1, ya que al presionar "Procesar" comenzara a contar desde este valor
                    frut = 1;
                    verd = 1;
                    carn = 1;
                }
            }
        });
        btnReiniciar.setBounds(105, 366, 95, 25);
        contentPane.add(btnReiniciar);

        JButton btnTotalDeProductos = new JButton("Total de Productos que lleva");
        btnTotalDeProductos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                lblTotArt.setText(String.valueOf(prod));
            }
        });
        btnTotalDeProductos.setBounds(467, 39, 209, 25);
        contentPane.add(btnTotalDeProductos);

        lblTotArt = new JLabel("");
        lblTotArt.setBounds(536, 86, 52, 16);
        contentPane.add(lblTotArt);

        JButton btnGraficoDeTarta = new JButton("Grafico de Tarta");
        btnGraficoDeTarta.addActionListener(new ActionListener() {
         
            
            public void actionPerformed(ActionEvent arg0) {
                
               

                bandera = true;
                repaint();
                
            }
        });
        btnGraficoDeTarta.setBounds(467, 189, 209, 25);
        contentPane.add(btnGraficoDeTarta);
    }
 
   
    public void paint(Graphics g) {
        super.paint(g);
        try {
            if (bandera) {
            String d1 = lblFrut.getText();
            String d2 = lblVerd.getText();
            String d3 = lblCarne.getText();
            int v1 = Integer.parseInt(d1);
            int v2 = Integer.parseInt(d2);
            int v3 = Integer.parseInt(d3);
            int suma = v1 + v2 + v3;
            int grados1 = v1 * 360 / suma;
            int grados2 = v2 * 360 / suma;
            int grados3 = v3 * 360 / suma;

            g.setColor(new Color(255, 0, 0));
            g.fillArc(400, 300, 200, 200, 0, grados1);
            g.fillRect(670, 390, 20, 20);
            g.drawString("Frutas", 700, 400);

            g.setColor(new Color(0, 128, 0));
            g.fillArc(400, 300, 200, 200, grados1, grados2);
            g.fillRect(670, 420, 20, 20);
            g.drawString("Verduras", 700, 430);

            g.setColor(new Color(0, 0, 255));
            g.fillArc(400, 300, 200, 200, grados1 + grados2, grados3);
            g.fillRect(670, 450, 20, 20);
            g.drawString("Carnes", 700, 460);
            } 
        }catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "SIN DATOS");
                    }
        
        
    }

}

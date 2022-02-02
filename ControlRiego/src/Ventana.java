import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

import java.awt.event.*;


class Ventana extends JFrame implements ActionListener,ItemListener{

	private JPanel contentPane;
	JTextField txtNivel;
	JTextField txtEstado;
	public int col=20;
	int columna;
	
	int b1,b2,b3;
	int Cbombas=0;
	String estado=("BOMBA/S APAGADA/S");
	
	
	private JSpinner spinner;
	private JLabel lblB1;
	private JLabel lblB2;
	private JLabel lblB3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 440);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.BOLD, 30));
		setContentPane(contentPane);
		contentPane.setBackground(Color.CYAN);
		
		spinner = new JSpinner();
		spinner.setBounds(114, 191, 100, 73);
		spinner.setFont(new Font("Calibri", Font.BOLD, 40));
		spinner.setModel(new SpinnerNumberModel(0, 0, 100, 10));
		spinner.setToolTipText("0\r\n10\r\n20\r\n30\r\n40\r\n50\r\n60\r\n70\r\n80\r\n90\r\n100");
		
		
		spinner.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				
				
				columna=Integer.parseInt(spinner.getValue().toString());
				
				
				col=20;
				col=col+columna*3;
				
				repaint();
				
			 
				 
				if(columna>50||columna<80){
					 txtNivel.setText("Medio");
					 
					 if(columna<50){
						 txtNivel.setText("Bajo");
					 }
				 }
				
				if(columna>80){
					 txtNivel.setText("Alto");
				 }
				
				if(columna==0){
					 txtNivel.setText("DETERMINE NIVEL");
				 }
				
			}
				 
			
				
		
		});
		
		
		JLabel lblCaudal = new JLabel("Caudal");
		lblCaudal.setBounds(133, 25, 52, 16);
		lblCaudal.setFont(new Font("Calibri", Font.BOLD, 14));
		
		JLabel lblNivel = new JLabel("Nivel");
		lblNivel.setBounds(133, 277, 35, 16);
		lblNivel.setFont(new Font("Calibri", Font.BOLD, 14));
		
		txtNivel = new JTextField();
		txtNivel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNivel.setText("DETERMINE NIVEL");
		txtNivel.setBounds(65, 296, 186, 31);
		txtNivel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNivel.setBackground(Color.YELLOW);
		txtNivel.setColumns(10);
		
		JLabel lblControlDeBombas = new JLabel("Control de Bombas");
		
		lblControlDeBombas.setBounds(439, 25, 127, 17);
		lblControlDeBombas.setFont(new Font("Calibri", Font.BOLD, 14));
		
		final JButton btnB1 = new JButton("Bomba 1");
		btnB1.addActionListener(new ActionListener() {
			int c1;
			
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnB1) {
		            c1++;
		            if(c1%2==0){
		            	lblB1.setText("Desactivado");
		            	b1=0;
		            }
		            else{
		            	lblB1.setText("Activado");
		            	b1=1;
		            }
		            Cbombas=b1+b2+b3;
					if (Cbombas==1){
						txtEstado.setText("Normal");
						estado=("NORMAL");
					}
					if (Cbombas==2){
						txtEstado.setText("Precaucion");
						estado=("PRECAUCION");
					}
					if (Cbombas==3){
						txtEstado.setText("PELIGRO!!");
						estado=("PELIGRO");
		    			
		    		}
					
					if (Cbombas==0){
						txtEstado.setText("BOMBA/S APAGADA/S");
						estado=("BOMBA/S APAGADA/S");
					}
		    		
		    		
		        }
			}
		});
		btnB1.setBounds(386, 93, 93, 36);
		
		
		final JButton btnB2 = new JButton("Bomba 2");
		btnB2.setBounds(386, 142, 93, 37);
		btnB2.addActionListener(new ActionListener() {
			int c2;
			
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnB2) {
		            c2++;
		            if(c2%2==0){
		            	lblB2.setText("Desactivado");
		            	b2=0;
		            }
		            else{
		            	lblB2.setText("Activado");
		            	b2=1;
		            }
		            Cbombas=b1+b2+b3;
					if (Cbombas==1){
						txtEstado.setText("Normal");
						estado=("NORMAL");
					}
					if (Cbombas==2){
						txtEstado.setText("Precaucion");
						estado=("PRECAUCION");
					}
					if (Cbombas==3){
						txtEstado.setText("PELIGRO!!");
						estado=("PELIGRO");
		    			
		    		}
					if (Cbombas==0){
						txtEstado.setText("BOMBA/S APAGADA/S");
						estado=("BOMBA/S APAGADA/S");
					}
		    		
		        }
			}
		});
		
		
		final JButton btnB3 = new JButton("Bomba 3");
		btnB3.setBounds(386, 192, 93, 37);
		btnB3.addActionListener(new ActionListener() {
			int c3;
			
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnB3) {
		            c3++;
		            if(c3%2==0){
		            	lblB3.setText("Desactivado");
		            	b3=0;
		            }
		            else{
		            	lblB3.setText("Activado");
		            	b3=1;
		            }
		        }
				Cbombas=b1+b2+b3;
				if (Cbombas==1){
					txtEstado.setText("Normal");
					estado=("NORMAL");
				}
				if (Cbombas==2){
					txtEstado.setText("Precaucion");
					estado=("PRECAUCION");
				}
				if (Cbombas==3){
					txtEstado.setText("PELIGRO!!");
					estado=("PELIGRO");
	    		
				}
				if (Cbombas==0){
					txtEstado.setText("BOMBA/S APAGADA/S");
					estado=("BOMBA/S APAGADA/S");
				}
				
			}
			
		
		});
		
		txtEstado = new JTextField();
		txtEstado.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstado.setText("\"BOMBA/S APAGADA/S\"");
		
		
		txtEstado.setBounds(386, 296, 233, 31);
		txtEstado.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtEstado.setColumns(10);
		txtEstado.setBackground(Color.YELLOW);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(471, 277, 52, 17);
		lblEstado.setFont(new Font("Calibri", Font.BOLD, 14));
		
		lblB1 = new JLabel("Desactivado");
		lblB1.setBounds(511, 103, 80, 16);
		
		lblB2 = new JLabel("Desactivado");
		lblB2.setBounds(511, 152, 80, 16);
		
		lblB3 = new JLabel("Desactivado");
		lblB3.setBounds(511, 202, 80, 16);
		contentPane.setLayout(null);
		contentPane.add(lblControlDeBombas);
		contentPane.add(btnB1);
		contentPane.add(btnB2);
		contentPane.add(btnB3);
		contentPane.add(txtEstado);
		contentPane.add(lblEstado);
		contentPane.add(lblB1);
		contentPane.add(lblB2);
		contentPane.add(lblB3);
		contentPane.add(lblCaudal);
		contentPane.add(spinner);
		contentPane.add(lblNivel);
		contentPane.add(txtNivel);
		
		JLabel label = new JLabel("0");
		label.setBounds(10, 56, 14, 16);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("10");
		label_2.setBounds(35, 56, 14, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("20");
		label_3.setBounds(65, 56, 14, 16);
		contentPane.add(label_3);
		
		JLabel label_1 = new JLabel("30");
		label_1.setBounds(95, 56, 14, 16);
		contentPane.add(label_1);
		
		JLabel label_4 = new JLabel("40");
		label_4.setBounds(125, 56, 14, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("50");
		label_5.setBounds(155, 56, 14, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("60");
		label_6.setBounds(185, 56, 14, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("70");
		label_7.setBounds(215, 56, 14, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("80");
		label_8.setBounds(245, 56, 14, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("90");
		label_9.setBounds(275, 56, 14, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("100");
		label_10.setBounds(305, 56, 29, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("%");
		label_11.setFont(new Font("Calibri", Font.PLAIN, 40));
		label_11.setBounds(226, 207, 35, 41);
		contentPane.add(label_11);
		
		final JButton BtnDialog = new JButton("Ver Dialogo\r\n");
		BtnDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if (e.getSource()==BtnDialog) {
						DialogoRiego v = new DialogoRiego(columna, estado);
						v.setBounds(759,100,220,122);
						v.setVisible (true);
					    }	
			}
		});
		BtnDialog.setBounds(275, 340, 120, 25);
		
		contentPane.add(BtnDialog);
		
		setTitle("***Control de Riego***");
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);
		g.setColor(Color.YELLOW);
		g.fillRect(20, 105, 306, 70);
		
		g.setColor(Color.BLACK);
		g.drawRect(20, 105, 306, 70);
		
		g.setColor(Color.red);
		g.fillRect(col, 105, 5, 70);
		
	
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}


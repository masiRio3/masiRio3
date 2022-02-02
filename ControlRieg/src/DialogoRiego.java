import javax.swing.*;

import java.awt.event.*; 

public class DialogoRiego  extends JDialog implements ActionListener{
	private JLabel label1,label2;
	private JButton btnSalir;
	
	public DialogoRiego(int columna ,String estado ) {
		setLayout (null);	
		
		setModal(true);
		label1= new JLabel(" Nivel de Caudal: "+columna+"%");
		label1.setBounds(5,5,240,15);
		add(label1);
		
		label2= new JLabel(" Estado: "+estado);
		label2.setBounds(5,35,240,15);
		add(label2);
	
		btnSalir = new JButton("CONFIRMAR");
		btnSalir.setBounds(40,60,120,20);
		btnSalir.addActionListener(this);
		add(btnSalir);
	}
	
	 public void actionPerformed(ActionEvent e) {
		 if (e.getSource()==btnSalir) {
			 dispose();
		 }
	

     }
}
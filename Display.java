import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Display extends JPanel implements ActionListener {
	private JButton print;
	private JLabel label;
	
	
	public Display() {
		print = new JButton ("Print");
		label = new JLabel("Hit this button to print the console");
		
		setPreferredSize(new Dimension(245, 136));
		setLayout(null);
		
		add(print);
		add(label);
		
		print.setBounds(70, 10, 100, 25); //Sets sizes and 
		label.setBounds(20, 45, 210, 35);
		
		print.addActionListener(this); //this refers to the 'Display' class
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == print) {
			System.out.println("Button was pressed");
		}
	}

}

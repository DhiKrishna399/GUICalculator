import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener extends JLabel implements ActionListener {
	
	private JButton reverse;
	private JTextField input;
	private JTextField output;
	private JLabel inputString;
	private JLabel outputString;
	
	public String words;
	public String wordReverse;
	
	public Listener() {
		
		setPreferredSize(new Dimension(300, 300));
		setLayout(null);
		
		reverse = new JButton("Reverse");
		input = new JTextField();
		output = new JTextField();
		inputString = new JLabel("Enter a word or sentence", SwingConstants.CENTER);
		outputString = new JLabel("Your reversed output is:", SwingConstants.CENTER);
		output.setEditable(false);
		
		add(reverse);
		add(input);
		add(output);
		add(inputString);
		add(outputString);
		
		input.setBounds(0, 30, 300, 50);
		reverse.setBounds(0, 120, 300, 50);
		output.setBounds(0, 220, 300, 50);
		inputString.setBounds(0, 0, 300, 50);
		outputString.setBounds(0, 180, 300, 50);
		
		reverse.addActionListener(this);
		input.addKeyListener(new KeyListener(){
					
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					wordReverse = "";
					words = input.getText();
				
				for(int i = words.length() - 1; i >= 0; i--) {
					wordReverse = wordReverse + words.charAt(i);
				}
				
				output.setText(wordReverse);
				
				}
			
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
		
	}
		
		
		

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == reverse) {
			wordReverse = "";
			words = input.getText();
			
			for(int i = words.length() - 1; i >= 0; i--) {
				wordReverse = wordReverse + words.charAt(i);
			}
			
			output.setText(wordReverse);
			
		}
	}
	
public static void main(String[] args) {
		
		JFrame frame = new JFrame("Listener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Listener());
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		
		
	}
	
	

}

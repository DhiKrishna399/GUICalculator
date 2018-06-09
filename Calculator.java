
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JLabel implements ActionListener {
		
	private JButton plus;
	private JButton minus;
	private JButton times;
	private JButton divide;
	private JButton copy1;
	private JButton copy2;
	private JButton quit;
	private JTextField input1;
	private JTextField input2;
	private JLabel answer;
	private JLabel inputOne;
	private JLabel inputTwo;
	private JLabel res;
	
	public double f1 = 0, f2 = 0, result = 0;
	public int testCase = 0;
	String error = "Invalid input";
	
		public Calculator() {
		
			setPreferredSize(new Dimension(400, 400));
			setLayout(null);
			
		//Button declarations
			//frame = new JFrame("Calculator");
			plus = new JButton ("+");
			minus = new JButton ("-");
			times = new JButton ("x");
			divide = new JButton ("÷");
			copy1 = new JButton("Copy1");
			copy2 = new JButton("Copy2");
			quit = new JButton("Quit");
			inputOne = new JLabel("Input #1", SwingConstants.CENTER);
			inputTwo = new JLabel("Input #2", SwingConstants.CENTER);
			res = new JLabel("Result", SwingConstants.CENTER);
			input1 = new JTextField();
			input2 = new JTextField();
			answer = new JLabel("", SwingConstants.CENTER);
			
		
		//Add each button to the GUI
			add(plus);
			add(minus);
			add(times);
			add(divide);
			add(copy1);
			add(copy2);
			add(input1);
			add(input2);
			add(answer);
			add(quit);
			add(inputOne);
			add(inputTwo);
			add(res);
			
		//Boundaries/position of each button implemented	
		
		//Operators
			plus.setBounds(0, 200, 200, 50);
			minus.setBounds(200, 200, 200, 50);
			times.setBounds(0, 250, 200, 50);
			divide.setBounds(200, 250, 200, 50);
			copy1.setBounds(0, 300, 200, 50);
			copy2.setBounds(200, 300, 200, 50);
			quit.setBounds(0, 350, 400, 50);
			
		//TextField & Labels
			answer.setBounds(0, 100, 400, 50);
			res.setBounds(0, 150, 400, 50);
			input1.setBounds(0, 0, 200, 50);
			inputOne.setBounds(0, 50, 200, 50);
			input2.setBounds(200, 0, 200, 50);
			inputTwo.setBounds(200, 50, 200, 50);
			
		//ActionListener Declarations for each buttonPress
			plus.addActionListener(this);
			minus.addActionListener(this);
			times.addActionListener(this);
			divide.addActionListener(this);
			copy1.addActionListener(this);
			copy2.addActionListener(this);
			quit.addActionListener(this);
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == plus) {
				
				 if(input1.getText().equals("") || input2.getText().equals("")) {
	               answer.setText(error);
	               
	                } else {
	                	
	            f1 = Double.parseDouble(input1.getText());
	    			f2 = Double.parseDouble(input2.getText());
				result = f1 + f2;
				answer.setText(Double.toString(result));
	                }
			}
			
			if(e.getSource() == minus) {
				
				if(input1.getText().equals("") || input2.getText().equals("")) {
		         answer.setText(error);
		               
		                } else {
		                
				f1 = Double.parseDouble(input1.getText());
				f2 = Double.parseDouble(input2.getText());
				result = f1 - f2;
				answer.setText(Double.toString(result));
		        }
			}
			
			if(e.getSource() == times) {
				if(input1.getText().equals("") || input2.getText().equals("")) {
			         answer.setText(error);
			               
			                } else {
			                
					f1 = Double.parseDouble(input1.getText());
					f2 = Double.parseDouble(input2.getText());
					result = f1 * f2;
					answer.setText(Double.toString(result));
			        }
				}
			
			if(e.getSource() == divide) {
				if(input1.getText().equals("") || input2.getText().equals("")) {
			         answer.setText(error);
			         
				}else if(input2.getText().equals("0")) {
					answer.setText("Cannot divide by zero");
			               
			                } else {
			                
					f1 = Double.parseDouble(input1.getText());
					f2 = Double.parseDouble(input2.getText());
					result = f1 / f2;
					answer.setText(Double.toString(result));
			        }
				}
			
			if(e.getSource() == copy1) {
				if(input1.getText().equals("") || input2.getText().equals("")) {
			         answer.setText("No result to copy");
				}else {
				double temp;
				temp = Double.parseDouble(answer.getText());
				input1.setText(Double.toString(temp));
				
				}
				
			}
			
			if(e.getSource() == copy2) {
				if(input1.getText().equals("") || input2.getText().equals("")) {
			         answer.setText("No result to copy");
				}else {
				double temp2;
				temp2 = Double.parseDouble(answer.getText());
				input2.setText(Double.toString(temp2));
				}
			}
			
			if(e.getSource() == quit) {
				System.exit(0);
			}
				
	}
		
		public static void main(String[] args) {
			
			JFrame frame = new JFrame("Calculator");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(new Calculator());
			frame.pack();
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.pink);
			frame.setResizable(false);
			
			
		}
			
			
}



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrameCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField2;
	
	float number1;
	float number2;
	float resultado;
	String operacao;
	String texto2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCalculadora frame = new FrameCalculadora();
					frame.setVisible(true);
					frame.setResizable(false); // não permite reajustar o tamanho do frame
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameCalculadora() {
		setTitle("Calculadora em Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(25, 332, 70, 56);
		contentPane.add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(25, 272, 70, 56);
		contentPane.add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(25, 212, 70, 56);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(105, 212, 70, 56);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(105, 272, 70, 56);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(105, 332, 70, 56);
		contentPane.add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(185, 212, 70, 56);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(185, 272, 70, 56);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(185, 332, 70, 56);
		contentPane.add(btn3);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText()!="") {
					textField.setText("");
					textField2.setText(null);
				}
				
			}
		});
		btnAC.setBackground(new Color(169, 169, 169));
		btnAC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAC.setBounds(185, 151, 150, 56);
		contentPane.add(btnAC);
		
		JButton btnDivisao = new JButton("÷");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					number1 = Float.parseFloat(textField.getText());
					textField2.setText(textField.getText() + "÷");
					operacao="/";
					Thread.sleep(50);
					textField.setText(null);
					
				} catch (Exception erro) {
					System.out.println(erro);
				}
			}
		});
		btnDivisao.setBackground(new Color(255, 165, 0));
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivisao.setBounds(105, 151, 70, 56);
		contentPane.add(btnDivisao);
		
		JButton btnMultiplicacao = new JButton("×");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					number1 = Float.parseFloat(textField.getText());
					textField2.setText(textField.getText() + "×");
					operacao="*";
					Thread.sleep(50);
					textField.setText(null);
					
				} catch (Exception erro) {
					System.out.println(erro);
				}
			}
		});
		btnMultiplicacao.setBackground(new Color(255, 165, 0));
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplicacao.setBounds(25, 151, 70, 56);
		contentPane.add(btnMultiplicacao);
		
		JButton btnSubtracao = new JButton("–");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					number1 = Float.parseFloat(textField.getText());
					textField2.setText(textField.getText() + "-");
					operacao="-";
					Thread.sleep(50);
					textField.setText(null);
					
				} catch (Exception erro) {
					System.out.println(erro);
				}	
			}
		});
		btnSubtracao.setBackground(new Color(255, 165, 0));
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubtracao.setBounds(265, 272, 70, 56);
		contentPane.add(btnSubtracao);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					number1 = Float.parseFloat(textField.getText());
					textField2.setText(textField.getText() + "+");
					operacao="+";
					Thread.sleep(50);
					textField.setText(null);
					
				} catch (Exception erro) {
					System.out.println(erro);
				}	
			}
		});
		btnSoma.setBackground(new Color(255, 165, 0));
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSoma.setBounds(265, 212, 70, 56);
		contentPane.add(btnSoma);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(25, 393, 150, 56);
		contentPane.add(btn0);
		
		JButton btnVirgula = new JButton(".");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '.');
			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVirgula.setBounds(185, 393, 70, 56);
		contentPane.add(btnVirgula);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					number2 = Float.parseFloat(textField.getText());
					texto2 = textField2.getText();
					if(texto2.charAt(texto2.length()-1) == '+' 
							|| texto2.charAt(texto2.length()-1) == '-' 
							|| texto2.charAt(texto2.length()-1) == '×'
							|| texto2.charAt(texto2.length()-1) == '÷') {
					
						textField2.setText(textField2.getText()+textField.getText());
					}
					else {
						number1=number2;
					}
					
					
					switch (operacao) {
						case "+":
							resultado = number1+number2;
							textField2.setText(String.valueOf(resultado));
							break;
							
						case "-":
							resultado = number1-number2;
							textField2.setText(String.valueOf(resultado));
							break;
							
						case "*":
							resultado = number1*number2;
							textField2.setText(String.valueOf(resultado));
							break;
						
						case "/":
							resultado = number1/number2;
							textField2.setText(String.valueOf(resultado));
							break;

					}
					
					Thread.sleep(50);
					textField.setText(String.valueOf(resultado));
					
				} catch (Exception erro) {
					System.out.println(erro);
				}
		}});
		btnIgual.setBackground(new Color(255, 165, 0));
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIgual.setBounds(265, 332, 70, 117);
		contentPane.add(btnIgual);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(new Color(0, 0, 0));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBounds(25, 57, 310, 84);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(98, 112, 45, 13);
		contentPane.add(lblNewLabel);
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField2.setForeground(Color.WHITE);
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBackground(Color.BLACK);
		textField2.setBounds(25, 10, 310, 48);
		contentPane.add(textField2);
	}
}
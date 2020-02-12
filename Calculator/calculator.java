package Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import javafx.scene.layout.Border;

public class calculator implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextArea textarea= new JTextArea(2,10); //For the text area at the top
	
	//will create this button total of 17 times
	JButton button1 =new JButton(); 
	JButton button2 =new JButton();
	JButton button3 =new JButton();
	JButton button4 =new JButton();
	JButton button5 =new JButton();
	JButton button6 =new JButton();
	JButton button7 =new JButton();
	JButton button8 =new JButton();
	JButton button9 =new JButton();
	JButton button0 =new JButton();
	JButton buttonadd =new JButton();
	JButton buttonsub =new JButton();
	JButton buttonmulti =new JButton();
	JButton buttondiv =new JButton();
	JButton buttondot =new JButton();
	JButton buttonclear =new JButton();
	JButton buttonequal =new JButton();
	
	double number1, number2, result;
	int addc=0, mulc=0, divc=0, subc=0;
	
	public calculator () {
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Ritika's First Calculator!!");
		
		frame.add(panel);
		panel.setBackground(Color.PINK);
		javax.swing.border.Border border = BorderFactory.createLineBorder(Color.gray,4);
		//Border border = BorderFactory.createLineBorder(Color,gray, 4);
		panel.setBorder(border);
		
		panel.add(textarea);  //adding textarea in the constructors and creating methods
		
		textarea.setBackground(Color.white);
		javax.swing.border.Border tborder= BorderFactory.createLineBorder(Color.BLACK, 3);
		
		textarea.setBorder(tborder);
		Font font= new Font("arial", Font.BOLD, 33);
		textarea.setFont(font);
		textarea.setForeground(Color.black);
		textarea.setPreferredSize(new Dimension(2,10));  //to prevent the letters/numbers to go out of the textare
		textarea.setLineWrap(true); //wraps the text in the textarea
		
		button1.setPreferredSize(new Dimension(100,43));
		button1.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//button1(2).jpg"));
		
		button2.setPreferredSize(new Dimension(100,43));
		button2.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//button2.jpg"));
		
		button3.setPreferredSize(new Dimension(100,43));
		button3.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//button3.jpg"));
	
		button4.setPreferredSize(new Dimension(100,43));
		button4.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//4.jpg"));
		
		button5.setPreferredSize(new Dimension(100,30));
		button5.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//5.jpg"));
		
		button6.setPreferredSize(new Dimension(100,30));
		button6.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//6.jpg"));
		
		button7.setPreferredSize(new Dimension(100,30));
		button7.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//7.jpg"));
		
		button8.setPreferredSize(new Dimension(100,30));
		button8.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//8.jpg"));
		
		button9.setPreferredSize(new Dimension(100,30));
		button9.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//9.jpg"));
		
		button0.setPreferredSize(new Dimension(100,30));
		button0.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//0.jpg"));
	
		buttonadd.setPreferredSize(new Dimension(100,30));
		buttonadd.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//+.jpg"));
		
		buttonsub.setPreferredSize(new Dimension(100,30));
		buttonsub.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//minus.jpg"));
		
		buttonmulti.setPreferredSize(new Dimension(100,30));
		buttonmulti.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//multi.jpg"));
		
		buttondiv.setPreferredSize(new Dimension(100,30));
		buttondiv.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//division.jpg"));
		
		buttondot.setPreferredSize(new Dimension(100,30));
		buttondot.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//dot.jpg"));
		
		buttonclear.setPreferredSize(new Dimension(200,30));
		buttonclear.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//c.jpg"));
		
		buttonequal.setPreferredSize(new Dimension(100,30));
		buttonequal.setIcon(new ImageIcon("//Users//RitikaChhibba//Desktop//Calculator_Images//equal.jpg"));
		
		
		
		//adding the buttons to the panel at exact locations order
		panel.add(button1); 
		
		
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmulti);
		panel.add(buttondiv);
		panel.add(buttondot);
		panel.add(buttonclear);
		panel.add(buttonequal);
	
		//method to have action done on the buttons
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonadd.addActionListener(this);
		buttonsub.addActionListener(this);
		buttonmulti.addActionListener(this);
		buttondiv.addActionListener(this);
		buttonclear.addActionListener(this);
		buttondot.addActionListener(this);
		buttonequal.addActionListener(this);
	
	
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source= e.getSource();
		
		
		//this will type # if the button # is selected
		
		if (source ==buttonclear) {
			number1=0;
			number2=0;
			textarea.setText("");
		}
		if (source ==button1) {
			textarea.append("1");
		}
		if (source ==button2) {
			textarea.append("2");
		}
		if (source ==button3) {
			textarea.append("3");
		}
		if (source ==button4) {
			textarea.append("4");
		}
		if (source ==button5) {
			textarea.append("5");
		}
		if (source ==button6) {
			textarea.append("6");
		}
		if (source ==button7) {
			textarea.append("7");
		}
		if (source ==button8) {
			textarea.append("8");
		}
		if (source ==button9) {
			textarea.append("9");
		}
		if (source ==button0) {
			textarea.append("0");
		}
		if (source ==buttondot) {
			textarea.append(".");
		}
		
		if (source ==buttonadd) {
			number1=number_reader();
			textarea.setText("");
			addc =1;
			divc=0;
			mulc=0;
			subc=0;
		}
		
		if (source ==buttonsub) {
			number1=number_reader();
			textarea.setText("");
			addc =0;
			divc=0;
			mulc=0;
			subc=1;
		}
		
		if (source ==buttondiv) {
			number1=number_reader();
			textarea.setText("");
			addc =0;
			divc=1;
			mulc=0;
			subc=0;
		}
		
		if (source ==buttonmulti) {
			number1=number_reader();
			textarea.setText("");
			addc =0;
			divc=0;
			mulc=1;
			subc=0;
		}
		
		//method to perform the +,-,*,/ on number 1 and 2
		if (source == buttonequal) {
			number2= number_reader();
			 
			if(addc>0) {
				result = number1+number2;
				textarea.setText(Double.toString(result));
			}
			
			if(subc>0) {
				result = number1-number2;
				textarea.setText(Double.toString(result));
			}
			
			if(mulc>0) {
				result = number1*number2;
				textarea.setText(Double.toString(result));
			}
			
			if(divc>0) {
				result = number1/number2;
				textarea.setText(Double.toString(result));
			}
		}
	}
	//reads and display the number you selected in the textarea
	public double number_reader(){
			double num1;
			String s;
			s=textarea.getText();
			num1= Double.valueOf(s);
			return num1;
		}
	}


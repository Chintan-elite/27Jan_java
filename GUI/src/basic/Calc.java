package basic;

import java.awt.event.*;  
import javax.swing.*;

public class Calc implements ActionListener
{
	JTextField t1,t2,t3;
	JButton add,sub,mul,div;
	public Calc() {
		
		JFrame frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		 t1 = new JTextField();
		 t2 = new JTextField();
		 t3 = new JTextField();
		 add = new JButton("ADD");
		 sub = new JButton("SUB");
		 mul = new JButton("MUL");
		 div = new JButton("DIV");
		
		t1.setBounds(150,100,200,30);
		t2.setBounds(150,150,200,30);
		t3.setBounds(150,200,200,30);
		add.setBounds(150,250,90,30);
		sub.setBounds(250,250,90,30);
		mul.setBounds(150,300,90,30);
		div.setBounds(250,300,90,30);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(add);
		frame.add(mul);
		frame.add(sub);
		frame.add(div);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int i1 = Integer.parseInt(t1.getText());
		int i2 = Integer.parseInt(t2.getText());
		
		if(e.getSource()==add)
		{
			int r = i1+i2;
			t3.setText(r+"");
		}
		else if(e.getSource()==sub)
		{
			int r = i1-i2;
			t3.setText(r+"");
		}
		else if(e.getSource()==div)
		{
			int r = i1/i2;
			t3.setText(r+"");
		}
		else if(e.getSource()==mul)
		{
			int r = i1*i2;
			t3.setText(r+"");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Calc c = new Calc();
	}


	
}

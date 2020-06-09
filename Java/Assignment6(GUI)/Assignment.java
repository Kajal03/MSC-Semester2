import java.util.*; 
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class phone2word extends JFrame implements ActionListener
{
	private Container c;
	private JLabel label1, label2;
	private JTextField t1;
	private JTextPane t2;
	private JButton submit;
	public Formatter f;
	phone2word()
	{
		f = new Formatter();
		setTitle("Phone to Word Converter");
		
		setSize(700, 600);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(null);

		label1 = new JLabel("Enter phone number : ");
		label1.setBounds(100, 30, 250, 30);
		c.add(label1);

		t1 = new JTextField();
		t1.setBounds(350, 30, 100, 30);
		c.add(t1);
	
		submit = new JButton("Submit");
		submit.setBounds(250,90,90,30);
		c.add(submit);
		submit.addActionListener(this);

		label2 = new JLabel("All possible words : ");
		label2.setBounds(100, 150, 300, 30);
		c.add(label2);

		t2 = new JTextPane();
		t2.setBounds(120, 200, 500, 300);
		JScrollPane scrollPane = new JScrollPane(t2);
		scrollPane.setVerticalScrollBarPolicy ( javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		scrollPane.setBounds(620, 200, 30, 300);
		t2.setContentType("text/html");
	        t2.setEditable(false);
		this.add(scrollPane);
		c.add(t2);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String n = t1.getText();
		findMappings(n,0, "");
		t2.setText(f.toString());
		
	}

	public static String[] mapping = new String[]{"ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY"};    

	public void findMappings(String n, int number_index, String answer)
	{
  
		if(number_index>n.length()-1)
		{
			f.format(answer);
			f.format("  ");
			return;
		}

		char digit =  n.charAt(number_index);
		int j = digit - '0';

		for(int i=0;i<3;i++)
		{
			char letter = mapping[j-2].charAt(i);			
			findMappings(n,number_index+1, answer+letter);
		}
	}
};

class Assignment
{
	public static void main(String args[])
	{
		phone2word p = new phone2word();	
	}

};



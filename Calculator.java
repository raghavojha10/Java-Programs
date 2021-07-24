import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener 
{
static JFrame jf;
static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
static JTextField tf;
static float a,b,c;
int choice;
String d;

Calculator()
{
c=0;
jf = new JFrame("Calculator");
b1 = new JButton("0");
b2 = new JButton("1");
b3 = new JButton("2");
b4 = new JButton("3");
b5 = new JButton("4");
b6 = new JButton("5");
b7 = new JButton("6");
b8 = new JButton("7");
b9 = new JButton("8");
b10 = new JButton("9");
b11 = new JButton("+");
b12 = new JButton("-");
b13 = new JButton("*");
b14 = new JButton("/");
b15 = new JButton("=");
b16 = new JButton(".");
b17 = new JButton("D");
tf = new JTextField();

tf.setBounds(10,10,265,45);
b8.setBounds(10,65,45,45);
b9.setBounds(65,65,45,45);
b10.setBounds(120,65,45,45);
b5.setBounds(10,120,45,45);
b6.setBounds(65,120,45,45);
b7.setBounds(120,120,45,45);
b2.setBounds(10,175,45,45);
b3.setBounds(65,175,45,45);
b4.setBounds(120,175,45,45);
b11.setBounds(175,65,45,45);
b12.setBounds(175,120,45,45);
b13.setBounds(175,175,45,45);
b14.setBounds(175,230,45,45);
b15.setBounds(230,175,45,100);
b1.setBounds(10,230,155,45);
b16.setBounds(230,65,45,45);
b17.setBounds(230,120,45,45);

jf.add(tf);
jf.add(b1);
jf.add(b2);
jf.add(b3);
jf.add(b4);
jf.add(b5);
jf.add(b6);
jf.add(b7);
jf.add(b8);
jf.add(b9);
jf.add(b10);
jf.add(b11);
jf.add(b12);
jf.add(b13);
jf.add(b14);
jf.add(b15);
jf.add(b16);
jf.add(b17);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);

jf.setLayout(null);
jf.setSize(300,320);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
tf.setText(tf.getText().concat("0"));
}

if(e.getSource()==b2)
{
tf.setText(tf.getText().concat("1"));
}

if(e.getSource()==b3)
{
tf.setText(tf.getText().concat("2"));
}

if(e.getSource()==b4)
{
tf.setText(tf.getText().concat("3"));
}

if(e.getSource()==b5)
{
tf.setText(tf.getText().concat("4"));
}

if(e.getSource()==b6)
{
tf.setText(tf.getText().concat("5"));
}

if(e.getSource()==b7)
{
tf.setText(tf.getText().concat("6"));
}

if(e.getSource()==b8)
{
tf.setText(tf.getText().concat("7"));
}

if(e.getSource()==b9)
{
tf.setText(tf.getText().concat("8"));
}

if(e.getSource()==b10)
{
tf.setText(tf.getText().concat("9"));
}

if(e.getSource()==b11)
{
a=Float.parseFloat(tf.getText());
choice = 1;
tf.setText("");
}

if(e.getSource()==b12)
{
a=Float.parseFloat(tf.getText());
choice = 2;
tf.setText("");
}

if(e.getSource()==b13)
{
a=Float.parseFloat(tf.getText());
choice = 3;
tf.setText("");
}

if(e.getSource()==b14)
{
a=Float.parseFloat(tf.getText());
choice = 4;
tf.setText("");
}

if(e.getSource()==b16)
{
tf.setText(tf.getText().concat("."));
}

if(e.getSource()==b15)
{
b=Float.parseFloat(tf.getText());

switch(choice)
{
case 1: c=a+b;
break;
case 2 : c=a-b;
break;
case 3 : c=a*b;
break;
case 4 : c=a/b;
break;
default : c=0;
}
tf.setText(""+c); 
}

if(e.getSource()==b17)
{
tf.setText("");
}
}

public static void main(String ar[])
{
Calculator ob = new Calculator();
}
}
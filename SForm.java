import java.awt.*;
import java.awt.event.*;
class SForm extends Frame implements ActionListener{
	List l, l2;
	TextField t;
	Button badd,rshift,lshift;
	public SForm(){
		super("Selection Form Demo");
		l = new List(5);
		l2 = new List(5);
		t = new TextField(10);
		badd = new Button("ADD");
		rshift = new Button(">>");
		lshift = new Button("<<");
		setLayout(new FlowLayout());
		add(l);
		add(rshift);
		add(lshift);
		add(l2);
		add(t);
		add(badd);
		badd.addActionListener(this);
		rshift.addActionListener(this);
		lshift.addActionListener(this);
		setSize(700,700);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == badd ){
			String s= t.getText();
			l.add(s);
			t.setText("");
		}
		else if(ae.getSource() == rshift){
			int p = l.getSelectedIndex();
			if(p>=0){
				String s = l.getSelectedItem();
				l2.add(s);
				l.remove(p);
			}
		}
		else if(ae.getSource() == lshift){
			int p = l2.getSelectedIndex();
			if(p>=0){
				String s = l2.getSelectedItem();
				l.add(s);
				l2.remove(p);
			}
		}
	}
	public static void main(String args[]){
		new SForm();
	}
}
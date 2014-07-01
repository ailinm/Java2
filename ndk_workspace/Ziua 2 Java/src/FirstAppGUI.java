
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FirstAppGUI {

	private static class FirstDisplay extends JPanel {
		public void paintComponent (Graphics g){
			super.paintComponent(g);
			
			g.drawString("*** Java ***",20,35);
		}
		
		private static class ButtonHandler implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent ev){ 
				System.exit(0);
			}
		}
		public static void main(String [] args){
			FirstDisplay fd;
			fd=new FirstDisplay();
			
			JButton button = new JButton("exit");
			ButtonHandler bh= new ButtonHandler();
			
			button.addActionListener(bh);
			JPanel content = new JPanel();
			content.setLayout(new BorderLayout());
			content.add(fd,BorderLayout.CENTER);
			content.add(button,BorderLayout.SOUTH);
			
			JFrame win= new JFrame("First Window Yay :)");
			win.setContentPane(content);
			win.setSize(250,100);
			win.setVisible(true);
			
			
			
			
			
			
		}
	}
	
	
	
}

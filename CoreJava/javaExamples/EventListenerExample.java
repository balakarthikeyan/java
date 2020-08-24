package javaExamples;

import java.awt.event.*;		//import for event listener
import javax.swing.JButton;   	//import for JButton class
import javax.swing.JFrame;    	//import for JFrame class
import javax.swing.JTextField;  //import for JTextField 

public class EventListenerExample {  
	// Event listener class without Lambda Expressions
	static JTextField textfield;
	static JButton button;
	static JFrame frame;
  
    public static void main(String[] args) {  
        textfield=new JTextField(); 
        button=new JButton("click");  
        frame=new JFrame("Event Listener without using Lambda Expression"); 
        
        // Set positions of text field and button
        textfield.setBounds(50, 50,150,20);         
        button.setBounds(80,100,70,30);

/*      // Action listener on button
        button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){  
            textfield.setText("hello world");
        }
        });
*/

        // Lambda expression implementing here.  
        button.addActionListener(e-> {textfield.setText("hello world by lamda");});  
        
        frame.add(textfield);
        frame.add(button);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLayout(null);  
        frame.setSize(300, 200);  
        frame.setVisible(true);  

    }  
  
}
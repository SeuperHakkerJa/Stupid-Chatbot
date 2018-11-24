import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class Bot extends JFrame implements KeyListener {

  //Typing area
  private JTextField txtEnter;
  private JTextArea chatArea;
  private JButton send;
  private int i = 1000000000;


  public Bot() {

    // Frame Attributes:
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize((int) (600 * 0.618), 600); // yeah golden ratio
    setResizable(false);
    setTitle("Stupid Bot");
    JPanel panel = new JPanel(new GridLayout());


    // Layout Manager:
    setLayout(new BorderLayout());

    // Typing Area Attributes:
    txtEnter = new JTextField("Enter Text Here");
    panel.add(txtEnter);


    // Button Attributes:
    send = new JButton("SEND");
    panel.add(send);

    add(panel, BorderLayout.SOUTH);

    // Chat Area Attributes:
    chatArea = new JTextArea();
    add(chatArea, BorderLayout.CENTER);
    validate();
    txtEnter.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String text = txtEnter.getText();
        if(text == null || text == "" || text == " "){
          chatArea.append("so you are trying to test me by entering nothing, " +
            "I am still replying since I am so sexy and nice. behave yourself" +
            ".");
        }
        chatArea.append("   Me: " + text + "\n");
        while ( i > 0){
          i--;
        }
        chatArea.append("   Sexy Pikachu: 0 w 0 " +text + "!!!!\n");
        txtEnter.setText("");
      }
    });


  }




  public static void main(String args[]) {
    Bot b = new Bot();
    b.setVisible(true);
  }

  public void keyTyped(KeyEvent e) {


  }

  public void keyPressed(KeyEvent e) {

  }

  public void keyReleased(KeyEvent e) {

  }

}

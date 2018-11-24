import javax.swing.*;
import java.awt.*;

public class Bot extends JFrame {

  //Typing area
  private JTextField txtEnter;
  private JTextArea chatArea;
  private JButton send;


  public Bot() {

    // Frame:
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize( (int)(600 * 0.618), 600);
    setResizable(false);
    setTitle("Stupid Bot");
    JPanel panel = new JPanel(new GridLayout());


    // Layout Manager:
    setLayout(new BorderLayout());

    // Typing Area
    txtEnter = new JTextField("Enter Text Here");
    add(txtEnter, panel);
    // Enter Button:
    send = new JButton("SEND");
    add(txtEnter,panel);
    add(panel,BorderLayout.SOUTH);





  }




  public static void main(String args[]) {
    Bot b = new Bot();
    b.setVisible(true);
  }

}

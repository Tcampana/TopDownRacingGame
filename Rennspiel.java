import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rennspiel
{
  //where everything is going to be displayed.
  private JFrame mainFrame;
  //These two make up the words "Main Menu" vertically on the screen. There's probably a better way to do that.
  private JLabel main;
  private JLabel menu;
  //displays the message on the bottom of the screen telling what button has been pressed.
  private JLabel statusLabel;
  private JPanel controlPanel;
  
  public Rennspiel()
  {
    //method call
    prepareGUI();
  }
  
  public static void main(String[] args)
  {
    //constructor
    Rennspiel gui = new Rennspiel();
    //adds the gui to the interface
    gui.showInterface();
  }
  
  //Prepares GUI elements.
  private void prepareGUI()
  {
    //sets paramaters for the main frame.
    mainFrame = new JFrame("Rennspiel");
    mainFrame.setSize(915,720);
    mainFrame.setLayout(new GridLayout(4, 3));
      
      //sets the positions of the contents of the frame.
      main = new JLabel("",JLabel.CENTER);
      menu = new JLabel("",JLabel.CENTER);
      statusLabel = new JLabel ("",JLabel.CENTER);
      
      //this method exits the program once the program is cancelled.
      mainFrame.addWindowListener(new WindowAdapter() 
        {
        public void windowClosing(WindowEvent windowEvent) 
          {
            System.exit(0);
        }
      });
      
      controlPanel = new JPanel();
      //sets the layout to be part of FlowLayout.
      controlPanel.setLayout (new FlowLayout());
      
      //adds elements to the main frame.
      mainFrame.add(main);
      mainFrame.add(menu);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
  }
  
  //Method to make frame contents visible.
  private void showInterface ()
  {
    //sets the text of the two labels.
    main.setText("Main");
    menu.setText("Menu");
    
    //sets the display text for the two buttons.
    JButton start = new JButton("Start Game");
    JButton quit = new JButton("Quit Game");
    
    //creates action listeners for the two buttons.
    start.setActionCommand("Start Game");
    quit.setActionCommand("Quit Game");
    start.addActionListener(new ClickListener());
    quit.addActionListener(new ClickListener());
    
    //adds the buttons to the panel.
    controlPanel.add(start);
    controlPanel.add(quit);
    
    //makes the frame visible.
    mainFrame.setVisible(true);
  }
  
  //creates action listeners for the two buttons.
  private class ClickListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      //displays the text "Game Started!" if the user clicks "Start Game".
      String command = e.getActionCommand();
      if(command.equals("Start Game"))
      {
       statusLabel.setText("Game Started!");
      }
      //displays the text "Game Quit!" if the user clicks "Quit Game".
      else if(command.equals("Quit Game"))
      {
        statusLabel.setText("Game Quit!");
      }
    }
  }
}

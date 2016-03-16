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
  private JFrame mainFrame;
  private JLabel main;
  private JLabel menu;
  private JLabel statusLabel;
  private JPanel controlPanel;
  
  public Rennspiel()
  {
    prepareGUI();
  }
  
  public static void main(String[] args)
  {
    Rennspiel gui = new Rennspiel();
    gui.showInterface();
  }
  
  private void prepareGUI()
  {
    mainFrame = new JFrame("Rennspiel");
    mainFrame.setSize(915,720);
    mainFrame.setLayout(new GridLayout(4, 3));
      
      main = new JLabel("",JLabel.CENTER);
      menu = new JLabel("",JLabel.CENTER);
      statusLabel = new JLabel ("",JLabel.WEST);
      
      mainFrame.addWindowListener(new WindowAdapter() 
        {
        public void windowClosing(WindowEvent windowEvent) 
          {
            System.exit(0);
        }
      });
      controlPanel = new JPanel();
      controlPanel.setLayout (new FlowLayout());
      
      mainFrame.add(main);
      mainFrame.add(menu);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
  }
  private void showInterface ()
  {
    main.setText("Main");
    menu.setText("Menu");
    
    JButton start = new JButton("Start Game");
    JButton quit = new JButton("Quit Game");
    
    start.setActionCommand("Start Game");
    quit.setActionCommand("Quit Game");
    
    start.addActionListener(new ClickListener());
    quit.addActionListener(new ClickListener());
    
    controlPanel.add(start);
    controlPanel.add(quit);
    
    mainFrame.setVisible(true);
  }
  private class ClickListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String command = e.getActionCommand();
      if(command.equals("Start Game"))
      {
       statusLabel.setText("Game Started!");
      }
      else if(command.equals("Quit Game"))
      {
        statusLabel.setText("Game Quit!");
      }
    }
  }
}

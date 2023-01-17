import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class CarInfo extends JFrame implements ActionListener {
 
 
   private JLabel EnterLabel = new JLabel("Enter the Car Information");
   private JLabel brandLabel = new JLabel("Choose the Brand:");
   private JComboBox brandComboBox = new JComboBox(new String[]{"Mercedes", "BMW", "Honda", "Mazda","Suzuki","Hyundai"});
   private JLabel gearBoxLabel = new JLabel("Choose the GearBox:");
 
   private JRadioButton manualRadioButton = new JRadioButton("Manual", true);
   private JRadioButton automaticRadioButton = new JRadioButton("Automatic");
   private ButtonGroup gearBoxButtonGroup = new ButtonGroup();
   private JLabel modelLabel = new JLabel("Enter the Year:");
   private JTextField yearTextField = new JTextField(4);
   private JLabel maxSpeedLabel = new JLabel("Enter the Max Speed:");
   private JTextField maxSpeedTextField = new JTextField(3);
   private JLabel colorLabel = new JLabel("Enter the Color:");
   private JTextField colorTextField = new JTextField(10);
   private JButton addButton = new JButton("Add Car to the File");
   private JButton searchButton = new JButton("Open the Search Form");
 
   public static void main(String[] args) {
       CarInfo jf = new CarInfo() {};}
 
   public CarInfo() {
       setLayout(new FlowLayout());
       setSize(500, 900);
       setTitle("Car info");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
       EnterLabel.setFont(new Font("Verdana",Font.BOLD,15));
 
       EnterLabel.setForeground(Color.BLUE);
      
       add(EnterLabel);
       add(brandLabel);
       add(brandComboBox);
       add(gearBoxLabel);
       add(manualRadioButton);
       add(automaticRadioButton);
       add(modelLabel);
 
       add(yearTextField);
       add(maxSpeedLabel);
       add(maxSpeedTextField);
       add(colorLabel);
       add(colorTextField);
       add(addButton);
       add(searchButton);
// Group the radio buttons together
       gearBoxButtonGroup.add(manualRadioButton);
       gearBoxButtonGroup.add(automaticRadioButton);
       setVisible(true);
   }
   public void actionPerformed(ActionEvent e) {
   }
   }


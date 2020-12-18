import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private int Result1 = 0;
    private int Result2 = 0;
    private JRadioButton button1 = new JRadioButton("AC Milan");
    private JRadioButton button2 = new JRadioButton("Real Madrid");
    private JLabel label1 = new JLabel("Result: 0 X 0 ");
    private JLabel label2 = new JLabel("Last Scorer: N/A");
    private JLabel label3 = new JLabel("Winner: DRAW");
    private JLabel label4 = new JLabel("");
//--------------------------------------------------------------------------------
    public GUI() {
        super("Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label1);
        container.add(label2);
        container.add(label3);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(button1);
        buttonGroup.add(button2);
        container.add(label4);
        container.add(button1);
        container.add(button2);
        button1.addActionListener(new ButtonEventListen());
        button2.addActionListener(new ButtonEventListen());
    }
//--------------------------------------------------------------------------------
    class ButtonEventListen implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if (button1.isSelected()) {
                Result1+=1;
                label2.setText("Last Scorer: AC Milan");
            }
            else {
                Result2+=1;
                label2.setText("Last Scorer: Real Madrid");
            }
            if (Result1 > Result2 ) {
                label3.setText("Winner: AC Milan");
                label3.setText("Winner: AC Milan");
            }
            else if (Result1 < Result2 ) {
                label3.setText("Winner: Real Madrid");
            }
            else {
                label3.setText("Winner: Draw");
            }
            String message = Result1+" X "+Result2 ;
            label1.setText(message);
        }
    }
}

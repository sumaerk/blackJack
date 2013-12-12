import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class BettingPanel extends JPanel implements ActionListener {
        private JButton add, subtract, reset;
        private BlackJack jack;

        public BettingPanel(BlackJack a){
                this.jack = a;
                setUpbuttons();
        }
        public void setUpbuttons(){
                String title = "Bet More";
                add = new JButton(title);
                add.setActionCommand(title);
                add.addActionListener(this);
                this.add(add);

                title = "Bet Less";
                subtract = new JButton(title);
                subtract.setActionCommand(title);
                subtract.addActionListener(this);
                this.add(subtract);

                title = "Play";
                reset = new JButton(title);
                reset.setActionCommand(title);
                reset.addActionListener(this);
                this.add(reset);                
        }
        public void actionPerformed(ActionEvent ae){
                if ("Bet More".equals(ae.getActionCommand())) {
                        
                        jack.betMore();
                }else if ("Bet Less".equals(ae.getActionCommand())) {
                        jack.betLess();
                }else if ("Play".equals(ae.getActionCommand())) {
                        jack.play();
                }

        }                
}
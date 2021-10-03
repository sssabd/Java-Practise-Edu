import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Pr4 extends JFrame{
    JButton milan = new JButton("AC Milan");
    JButton realM = new JButton("Real Madrid");

    //текст без ввода
    JLabel score = new JLabel();
    JLabel winCommand = new JLabel();
    JLabel lastGoal = new JLabel();

    int milanGoal = 0, madridGoal = 0;

    public Pr4(){
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(3, 1));
        add(realM);
        setSize(500,500);

        updateScore();
        updateWinCommand();

        milan.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++milanGoal;
                updateWinCommand();
                updateScore();
                updateLastGoal("AC Milan");
            }
        });

        realM.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridGoal++;
                updateWinCommand();
                updateScore();
                updateLastGoal("Real Madrid");
            }
        });

        Font fnt = new Font("Times new roman",Font.BOLD,50);
        Font fnt22 = new Font("Times new roman",Font.BOLD,22);
        add(winCommand);
        winCommand.setVerticalAlignment(JLabel.CENTER);
        winCommand.setHorizontalAlignment(JLabel.CENTER);
        winCommand.setFont(fnt22);
        add(milan);
        add(score);
        score.setVerticalAlignment(JLabel.CENTER);
        score.setHorizontalAlignment(JLabel.CENTER);
        score.setFont(fnt);
        add(lastGoal);
        lastGoal.setVerticalAlignment(JLabel.CENTER);
        lastGoal.setHorizontalAlignment(JLabel.CENTER);
        lastGoal.setFont(fnt22);
    }

    public void updateWinCommand() {
        if (milanGoal > madridGoal)
            winCommand.setText("Winner: AC Milan");
        else if (milanGoal < madridGoal)
            winCommand.setText("Winner: Real Madrid");
        else
            winCommand.setText("Draw");
    }

    public void updateLastGoal(String command) {
        lastGoal.setText("Last goal " + command);
    }

    public void updateScore() {
        score.setText( madridGoal + "||" + milanGoal);
    }

    public static void main(String[] args) {
        new Pr4().setVisible(true);
    }
}

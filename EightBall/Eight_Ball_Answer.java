import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Eight_Ball_Answer extends JFrame implements ActionListener{
    
    JLabel RESULTS = new JLabel();
    JButton BACK = new JButton("ASK AGAIN");
    JLabel NAME = new JLabel("ANSWER");

    ImageIcon EIGHT_BALL = new ImageIcon("8_ball.png");
    JLabel ICON_LABEL = new JLabel();

    JLayeredPane MainGamePanel;
    JPanel BACKGROUND_PANEL=new JPanel();

    static final int GAME_WIDTH=1000;
    static final int GAME_HEIGHT=(int)(GAME_WIDTH*(0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public Eight_Ball_Answer(String answer){

        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ANSWER");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       // this.setIconImage(EIGHT_BALL.getImage());

        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(Color.DARK_GRAY);

        RESULTS.setVisible(true);
        RESULTS.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        RESULTS.setBounds(100, 275, 800, 100);
        RESULTS.setForeground(Color.WHITE);
        RESULTS.setFont(new Font("Arial", Font.BOLD, 30));
        RESULTS.setFocusable(false);
        RESULTS.setText(answer);
        RESULTS.setHorizontalAlignment(SwingConstants.CENTER);

        NAME.setVisible(true);
        NAME.setBounds(275,5,700,200);
        NAME.setForeground(Color.WHITE);
        NAME.setFont(new Font("Arial", Font.ITALIC, 90));

        BACK.setVisible(true);
        BACK.setBounds(175, 400, 600, 75);
        BACK.setBackground(Color.WHITE);
        BACK.setFocusable(false);
        BACK.setFont(new Font("Arial", Font.BOLD, 40));
        BACK.addActionListener(this);

        ICON_LABEL.setVisible(true);
        ICON_LABEL.setIcon(EIGHT_BALL);
        ICON_LABEL.setBounds(400,140,195,127);

        MainGamePanel.add(BACKGROUND_PANEL, Integer.valueOf(0));
        MainGamePanel.add(BACK, Integer.valueOf(1));
        MainGamePanel.add(RESULTS, Integer.valueOf(1));
        MainGamePanel.add(NAME, Integer.valueOf(1));
        MainGamePanel.add(ICON_LABEL, Integer.valueOf(2));

        this.add(MainGamePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == BACK){
            Eight_Ball_Frame EBF = new Eight_Ball_Frame();
            this.dispose();
        }
    }

}

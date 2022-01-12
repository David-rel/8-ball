import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Eight_Ball_Frame extends JFrame implements ActionListener{
    
    JLayeredPane MainGamePanel;
    JButton SUBMIT = new JButton("...SUBMIT...");
    JLabel NAME = new JLabel("8 BALL");
    JLabel PROMPT = new JLabel("Ask a question... any question");
    JLabel ICON_LABEL = new JLabel();
    JPanel BACKGROUND_PANEL = new JPanel();
    ImageIcon EIGHT_BALL = new ImageIcon("8_ball.png");
    JTextField QUESTION = new JTextField();

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);


    Eight_Ball_Frame(){
        MainGamePanel = new JLayeredPane();
        MainGamePanel.setPreferredSize(SCREEN_SIZE);

        this.setPreferredSize(SCREEN_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("8 Ball");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //this.setIconImage(EIGHT_BALL.getImage());

        NAME.setVisible(true);
        NAME.setBounds(175,50,700,200);
        NAME.setForeground(Color.BLACK);
        NAME.setFont(new Font("Arial", Font.ITALIC, 90));

        ICON_LABEL.setVisible(true);
        ICON_LABEL.setIcon(EIGHT_BALL);
        ICON_LABEL.setBounds(600,75,195,127);

        PROMPT.setVisible(true);
        PROMPT.setBounds(150,250,500,100);
        PROMPT.setForeground(Color.BLACK);
        PROMPT.setFont(new Font("Arial", Font.ITALIC, 25));

        BACKGROUND_PANEL.setOpaque(true);
        BACKGROUND_PANEL.setSize(SCREEN_SIZE);
        BACKGROUND_PANEL.setBackground(Color.DARK_GRAY);

        QUESTION.setVisible(true);
        QUESTION.setBounds(125,325,700,50);
        QUESTION.setBackground(Color.WHITE);
        QUESTION.setFont(new Font("Arial", Font.ITALIC, 30));

        SUBMIT.setVisible(true);
        SUBMIT.setBounds(300,400,350,100);
        SUBMIT.setBackground(Color.BLACK);
        SUBMIT.setFocusable(false);
        SUBMIT.setFont(new Font("Arial", Font.ITALIC, 40));
        SUBMIT.setForeground(Color.WHITE);
        SUBMIT.addActionListener(this);


        MainGamePanel.add(BACKGROUND_PANEL, Integer.valueOf(0));
        MainGamePanel.add(SUBMIT, Integer.valueOf(1));
        MainGamePanel.add(QUESTION, Integer.valueOf(1));
        MainGamePanel.add(NAME, Integer.valueOf(1));
        MainGamePanel.add(PROMPT, Integer.valueOf(2));
        MainGamePanel.add(ICON_LABEL, Integer.valueOf(2));
        
        this.add(MainGamePanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String answer = "";
        // Eight_Ball_Answer EBA = new Eight_Ball_Answer(answer);

        if(e.getSource() == SUBMIT){
            if(QUESTION.getText().contains("why")){
                answer = "Because it is that way";
                Eight_Ball_Answer EBA = new Eight_Ball_Answer(answer);
                this.dispose();
            }
            else if(QUESTION.getText().contains("what")){
                answer = "if you try your best anytihng can happen";
                Eight_Ball_Answer EBA = new Eight_Ball_Answer(answer);
                this.dispose();
            }
            else if(QUESTION.getText().contains("when")){
                answer = "when time comes you will know";
                Eight_Ball_Answer EBA = new Eight_Ball_Answer(answer);
                this.dispose();
            }
            else if(QUESTION.getText().contains("who")){
                answer = "this person is closer then you think";
                Eight_Ball_Answer EBA = new Eight_Ball_Answer(answer);
                this.dispose();
            }
            else if(QUESTION.getText().contains("how")){
                answer = "only you can figure that out";
                Eight_Ball_Answer EBA = new Eight_Ball_Answer(answer);
                this.dispose();
            }else{
                answer = "I don't know. Please ask again";
                Eight_Ball_Answer EBA = new Eight_Ball_Answer(answer);
                this.dispose();
            }
        }
    }


}

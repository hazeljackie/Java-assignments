import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizApp extends JFrame implements ActionListener {

    JLabel question, timerLabel, scoreLabel;
    JRadioButton opt1, opt2, opt3, opt4;
    JButton nextBtn;
    ButtonGroup group;

    int index = 0, score = 0, time = 60;

    String[][] quiz = {
        {"Java is a?","Language","Car","Animal","Food","Language"},
        {"2+2=?","3","4","5","6","4"},
        {"HTML stands for?","Hyper Text Markup Language","High Text","None","Code","Hyper Text Markup Language"}
    };

    Timer timer;

    public QuizApp() {

        setTitle("Java Quiz");
        setSize(500,300);
        setLayout(new GridLayout(7,1));

        question = new JLabel();
        timerLabel = new JLabel("Time: 60");
        scoreLabel = new JLabel("Score: 0");

        opt1 = new JRadioButton();
        opt2 = new JRadioButton();
        opt3 = new JRadioButton();
        opt4 = new JRadioButton();

        group = new ButtonGroup();
        group.add(opt1); group.add(opt2); group.add(opt3); group.add(opt4);

        nextBtn = new JButton("Next");
        nextBtn.addActionListener(this);

        add(timerLabel);
        add(scoreLabel);
        add(question);
        add(opt1); add(opt2); add(opt3); add(opt4);
        add(nextBtn);

        loadQuestion();

        timer = new Timer(1000, e -> {
            time--;
            timerLabel.setText("Time: " + time);
            if(time == 0){
                nextQuestion();
            }
        });

        timer.start();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void loadQuestion(){
        question.setText(quiz[index][0]);
        opt1.setText(quiz[index][1]);
        opt2.setText(quiz[index][2]);
        opt3.setText(quiz[index][3]);
        opt4.setText(quiz[index][4]);
    }

    void nextQuestion(){

        String answer = quiz[index][5];

        if(opt1.isSelected() && opt1.getText().equals(answer)) score++;
        if(opt2.isSelected() && opt2.getText().equals(answer)) score++;
        if(opt3.isSelected() && opt3.getText().equals(answer)) score++;
        if(opt4.isSelected() && opt4.getText().equals(answer)) score++;

        index++;
        group.clearSelection();

        if(index < quiz.length){
            loadQuestion();
            time = 60;
        } else {
            timer.stop();
            JOptionPane.showMessageDialog(this,"Final Score: " + score);
        }
    }

    public void actionPerformed(ActionEvent e) {
        nextQuestion();
    }

    public static void main(String[] args) {
        new QuizApp();
    }
}

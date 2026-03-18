import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField idField, nameField, courseField, yearField;
    JComboBox<String> deptBox;
    JRadioButton male, female, other;
    JCheckBox hostel;
    JTextArea output;
    JButton registerBtn, clearBtn;

    public StudentRegistration() {

        setTitle("Student Registration");
        setSize(500,500);
        setLayout(new GridLayout(10,2));

        add(new JLabel("Student ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Full Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Course:"));
        courseField = new JTextField();
        add(courseField);

        add(new JLabel("Year of Study:"));
        yearField = new JTextField();
        add(yearField);

        add(new JLabel("Department:"));
        String[] depts = {"IT","Business","Engineering","Science"};
        deptBox = new JComboBox<>(depts);
        add(deptBox);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);
        add(genderPanel);

        add(new JLabel("Hostel Required:"));
        hostel = new JCheckBox();
        add(hostel);

        registerBtn = new JButton("Register");
        clearBtn = new JButton("Clear");

        registerBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        add(registerBtn);
        add(clearBtn);

        output = new JTextArea();
        add(output);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == registerBtn){

            if(idField.getText().isEmpty() || nameField.getText().isEmpty()
                    || courseField.getText().isEmpty() || yearField.getText().isEmpty()){

                JOptionPane.showMessageDialog(this,"Please fill all fields");
                return;
            }

            String gender = "";
            if(male.isSelected()) gender = "Male";
            else if(female.isSelected()) gender = "Female";
            else if(other.isSelected()) gender = "Other";

            output.setText(
                    "ID: " + idField.getText() +
                    "\nName: " + nameField.getText() +
                    "\nCourse: " + courseField.getText() +
                    "\nYear: " + yearField.getText() +
                    "\nDepartment: " + deptBox.getSelectedItem() +
                    "\nGender: " + gender +
                    "\nHostel: " + (hostel.isSelected() ? "Yes" : "No")
            );
        }

        if(e.getSource() == clearBtn){
            idField.setText("");
            nameField.setText("");
            courseField.setText("");
            yearField.setText("");
            hostel.setSelected(false);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}

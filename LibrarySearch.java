import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class LibrarySearch extends JFrame implements ActionListener {

    JTextField searchField;
    JButton searchBtn;
    JTable table;
    DefaultTableModel model;
    DefaultListModel<String> historyModel;
    JList<String> historyList;

    String[][] books = {
        {"Java Basics","John Doe","111","Available"},
        {"Data Structures","Jane Smith","222","Available"},
        {"Networking","Mike Lee","333","Issued"},
        {"Database","Ann Kim","444","Available"},
        {"AI Intro","Tom Ray","555","Available"}
    };

    public LibrarySearch() {

        setTitle("Library Search");
        setSize(600,400);
        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        searchField = new JTextField(20);
        searchBtn = new JButton("Search");
        searchBtn.addActionListener(this);
        top.add(searchField);
        top.add(searchBtn);
        add(top, BorderLayout.NORTH);

        String[] cols = {"Title","Author","ISBN","Availability"};
        model = new DefaultTableModel(cols,0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        historyModel = new DefaultListModel<>();
        historyList = new JList<>(historyModel);
        add(new JScrollPane(historyList), BorderLayout.EAST);

        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));

        JMenu view = new JMenu("View");
        JMenuItem clear = new JMenuItem("Clear History");
        clear.addActionListener(e -> historyModel.clear());

        file.add(exit);
        view.add(clear);

        bar.add(file);
        bar.add(view);
        setJMenuBar(bar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String search = searchField.getText().toLowerCase();
        model.setRowCount(0);

        for(String[] book : books){
            if(book[0].toLowerCase().contains(search)){
                model.addRow(book);
            }
        }

        historyModel.addElement(search);
    }

    public static void main(String[] args) {
        new LibrarySearch();
    }
}

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HotelBooking extends JFrame {

    JTable table;
    DefaultTableModel model;

    public HotelBooking() {

        setTitle("Hotel Booking System");
        setSize(600,400);

        JTabbedPane tabs = new JTabbedPane();

        JPanel booking = new JPanel(new GridLayout(5,2));

        JTextField name = new JTextField();
        JComboBox<String> roomType = new JComboBox<>(new String[]{"Single","Double","Suite"});
        JButton bookBtn = new JButton("Book Now");

        booking.add(new JLabel("Customer Name:"));
        booking.add(name);
        booking.add(new JLabel("Room Type:"));
        booking.add(roomType);
        booking.add(bookBtn);

        tabs.add("Booking", booking);

        String[] cols = {"Room","Status"};
        model = new DefaultTableModel(cols,0);

        for(int i=1;i<=10;i++){
            model.addRow(new Object[]{"Room "+i,"Available"});
        }

        table = new JTable(model);
        tabs.add("Rooms", new JScrollPane(table));

        bookBtn.addActionListener(e -> {
            model.setValueAt("Booked",0,1);
            JOptionPane.showMessageDialog(this,"Room booked!");
        });

        add(tabs);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new HotelBooking();
    }
}

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    
    App(){
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel startingPointLabel = new JLabel("Enter Tables Starting Point:");
        JTextField startingPointField = new JTextField();
        JLabel endingPointLabel = new JLabel("Enter Tables Ending Point:");
        JTextField endingPointField = new JTextField();
        JLabel rangeLabel = new JLabel("Enter Range Of Numbers:");
        JTextField rangeField = new JTextField();

        inputPanel.add(startingPointLabel);
        inputPanel.add(startingPointField);
        inputPanel.add(endingPointLabel);
        inputPanel.add(endingPointField);
        inputPanel.add(rangeLabel);
        inputPanel.add(rangeField);

        JButton generateTableButton = new JButton("Generate Table");
        inputPanel.add(generateTableButton);

        this.add(inputPanel, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        this.add(scrollPane, BorderLayout.CENTER);

        this.setVisible(true);

        generateTableButton.addActionListener(E -> {
            int tableStart = Integer.parseInt(startingPointField.getText());
            int tableEnd = Integer.parseInt(endingPointField.getText());
            int range = Integer.parseInt(rangeField.getText());
            String table = new TableGeneratorClass().getTable(tableStart,tableEnd,range);
            System.out.println(table);
            textArea.setText(table);
        });
    }
}

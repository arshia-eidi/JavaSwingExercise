package part1.app;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class DisplayPanel extends JPanel {


    private JTextField displayField;

    public DisplayPanel() {
        setLayout(new BorderLayout());
        displayField = new JTextField();

        // Configure text field
        setPreferredSize(new Dimension(280, 70));
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setHorizontalAlignment(JTextField.LEFT);
        add(displayField, BorderLayout.CENTER);
    }

    // Returns the current expression from the display
    public String getExpression() {
        return displayField.getText();
    }

    // Updates the display with the provided expression
    public void setExpression(String expr) {
        displayField.setText(expr);
    }

}

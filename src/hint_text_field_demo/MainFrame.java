package hint_text_field_demo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

    private HintTextField hintTextField;
    private JTextField textField;
    private JButton button;

    private MainFrame() {
        initComponents();
        initFrame();
    }

    private void initComponents() {
        hintTextField = new HintTextField("这是一个文本提示！");
        textField = new JTextField("This is a text field.");
        button = new JButton("这是一个按钮。");
        add(hintTextField);
        add(textField);
        add(button);
    }

    private void initFrame() {
        setTitle("HintTextField演示");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}

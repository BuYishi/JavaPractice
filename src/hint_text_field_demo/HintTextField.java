package hint_text_field_demo;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class HintTextField extends JTextField implements FocusListener {

    private final String textHint;

    public HintTextField(String textHint) {
        this.textHint = textHint;
        addFocusListener(this);
        setTextHint();
    }

    @Override
    public void focusGained(FocusEvent ev) {
        if (getText().equals(textHint)) {
            setText(null);
            setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent ev) {
        if (getText().isEmpty()) {
            setTextHint();
        }
    }

    private void setTextHint() {
        setText(textHint);
        setForeground(Color.GRAY);
    }
}

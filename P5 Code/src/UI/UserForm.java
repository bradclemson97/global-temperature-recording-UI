package UI;
//Brad
  //      2019-09-05
    //    11:50

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author ET
 * @version 29/08/2019 09:28
 */
public class UserForm extends JFrame {

    private JButton button = new JButton("Press This!");
    private JList<String> output = new JList<>();
    ArrayList<String> outputText = new ArrayList<>();
    /**
     */
    public UserForm() {
        super("User Form");
        setDefaultFormBehavour();
        initForm();
        setVisible(true);
    }

    private void setDefaultFormBehavour() {
        getContentPane().setLayout(null);
        this.setSize(500, 600);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setResizable(false);
        this.setFont(
                new Font(Font.SANS_SERIF, Font.PLAIN, 16));
    }

    private void initForm() {
        // get reference to the context pane for this frame.
        Container thisPane = this.getContentPane();
        button.setBounds(5, 5, 100, 20);
        button.addActionListener(new buttonListner());
        thisPane.add(button);
        output.setBounds(5, 30, 200, 500);
        thisPane.add(output);

    }

    private class buttonListner implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            outputText.add("Ouch!");
            output.setListData(outputText.toArray(new String[outputText.size()]));
        }
    }
}


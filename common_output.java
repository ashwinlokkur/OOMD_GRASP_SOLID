//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class common_output extends JPanel {
    private JTextArea jcomp1;
    private JLabel jcomp2;
    private JButton jcomp3;
    private static JFrame frame;
    private static boolean proceed = false;

    public common_output(String title, String message) {
        //construct components
        jcomp1 = new JTextArea();
        jcomp2 = new JLabel(title);
        jcomp3 = new JButton("OK");

        jcomp1.setText(message);

        //adjust size and set layout
        setPreferredSize (new Dimension (601, 350));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (105, 155, 370, 130);
        jcomp2.setBounds (110, 105, 355, 35);
        jcomp3.setBounds (215, 305, 100, 25);

        jcomp3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {         
                proceed = true;
                frame.dispose();
            }
        });
    }


    public static void start_gui (String title, String message) {
        frame = new JFrame ("Output");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new common_output(title, message));
        frame.pack();
        frame.setVisible (true);
        while(!proceed)
        {
            System.out.print("");
        }
        return;

    }
}

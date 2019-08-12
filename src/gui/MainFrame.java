package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JSplitPane splitPane;
    private FormPanel formPanel;
    private JTabbedPane tabPane;

    public MainFrame(){
        super("Hello World");
        setLayout(new BorderLayout());

        tabPane = new JTabbedPane();
        formPanel = new FormPanel();
        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,formPanel,tabPane);
        add(splitPane);

        setMinimumSize(new Dimension(300,300));
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}

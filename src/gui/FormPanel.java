package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    private JLabel locationLabel;
    private JLabel companyLabel;
    private JLabel positionLabel;
    private JLabel contactLabel;
    private JLabel respondLabel;
    private JLabel interviewLabel;

    private JTextField companyField;
    private JTextField positionField;
    private JTextField contactField;
    private JComboBox locationBox;
    private JCheckBox respondCheck;
    private JCheckBox interviewCheck;

    public FormPanel(){
        Dimension dimension =getPreferredSize();
        dimension.width = 340;
        setPreferredSize(dimension);
        setMaximumSize(dimension);

        locationLabel = new JLabel("Location:");
        companyLabel = new JLabel("Company:");
        positionLabel = new JLabel("Position:");
        contactLabel = new JLabel("Contact:");
        respondLabel = new JLabel("Heard Back?");
        interviewLabel = new JLabel("Interview?");
        companyField = new JTextField(10);
        positionField = new JTextField(10);
        contactField = new JTextField(20);
        respondCheck = new JCheckBox();
        interviewCheck = new JCheckBox();

        //Box for quick location selection.
        locationBox = new JComboBox();
        DefaultComboBoxModel locationModel = new DefaultComboBoxModel();
        locationModel.addElement("Victoria BC");
        locationModel.addElement("Vancouver BC");
        locationModel.addElement("Toronto ON");
        locationModel.addElement("Alberta");
        locationBox.setModel(locationModel);
        locationBox.setSelectedIndex(0);
        locationBox.setEditable(true);



        Border innerBorder = BorderFactory.createTitledBorder("Add Application");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5 );
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
        layoutComponents();

    }

    public void layoutComponents(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 1;
//        c.weighty = 0.1;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridy = 0;
        c.gridx = 0;

        c.insets = new Insets(0,0,0,5);
        add(companyLabel,c);

        c.gridx = 1;
        add(companyField,c);
        c.gridx = 2;
        add(positionLabel,c);

        c.gridx = 3;
        add(positionField,c);

        // Next Line//
//        c.weightx = 0.05;
        c.gridy++;
        c.gridx = 0;
        add(locationLabel,c);

        c.gridx = 1;
        add(locationBox,c);

        c.gridx = 2;
        add(contactLabel,c);

        c.gridx = 3;
        add(contactField,c);
        // Next Line //
        c.gridy++;
        c.insets = new Insets(0,0,0,0);
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        add(respondLabel,c);

        c.gridx = 1;
        add(respondCheck,c);

        c.insets = new Insets(0,50,0,0);
//        c.gridx = 2;
        add(interviewLabel,c);
        c.insets = new Insets(0,130,0,0);
//        c.gridx = 3;
        add(interviewCheck,c);


    }


}

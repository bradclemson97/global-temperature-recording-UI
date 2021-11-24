package View;

import Model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class RegionEntryForm extends JFrame {

    //Below shows the components belonging to the region form following the given design
    private JList<Object> RegionList = new JList<>();
    private JScrollPane scrollPane = new JScrollPane (RegionList);
    private JLabel EntryNameLabel = new JLabel("Name");
    private JLabel EntryDescriptionLabel = new JLabel("Description");
    private JLabel EntryParentRegionLabel = new JLabel("Parent Region");
    private JLabel EntryTempScaleLabel = new JLabel("Scale");
    private JTextField Nametxt = new JTextField();
    private JTextField Descriptiontxt = new JTextField();
    private JList<String> AddOutput = new JList<>();
    private ArrayList<String> Output = new ArrayList<>();
    private JButton addButton = new JButton("Add");
    private JButton modifyButton = new JButton("Modify");
    private JButton deleteButton = new JButton("Delete");
    private JComboBox<? extends Object> comboTempScale;
    private JComboBox<? extends Object> comboParentRegion;

    private Model model;

    public String getNametxt() {
        return Nametxt.getText();
    }

    public String getDescriptiontxt() {
        return Descriptiontxt.getText();
    }



    public RegionEntryForm(Model model) {
        super("Model.Region Form");
        this.model = model;
        setDefaultFormBehaviour();
        comboTempScale =
                new JComboBox<>(model.getTemperatureScales().toArray());
        comboParentRegion =
                new JComboBox<>(model.getRegion().toArray());
        initFields();
        this.setVisible(true);
    }


    private void setDefaultFormBehaviour() {
        getContentPane().setLayout(null);
        this.setSize(600, 380);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize  = this.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setFont(
                new Font(Font.SERIF, Font.BOLD, 20));
    }

    private void initFields() {
        Container thisPane = this.getContentPane();

        RegionList.setFont(
                new Font(Font.SANS_SERIF, Font.TRUETYPE_FONT, 16));
        scrollPane.setBounds(330, 5, 260, 320);
        thisPane.add(scrollPane);

        Nametxt.setBounds(150,40, 100, 20);
        Descriptiontxt.setBounds(150, 80,100,20);
        thisPane.add(Nametxt);
        thisPane.add(Descriptiontxt);

        comboParentRegion.setBounds(150, 120, 100, 20);
        comboTempScale.setBounds(150, 160, 100, 20);
        thisPane.add(comboParentRegion);
        thisPane.add(comboTempScale);

        EntryNameLabel.setBounds(50,40,100,20);
        EntryDescriptionLabel.setBounds(50,80,100,20);
        EntryParentRegionLabel.setBounds(50, 120, 100, 20);
        EntryTempScaleLabel.setBounds(50, 160,100,20);
        thisPane.add(EntryNameLabel);
        thisPane.add(EntryDescriptionLabel);
        thisPane.add(EntryParentRegionLabel);
        thisPane.add(EntryTempScaleLabel);

        AddOutput.setBounds(350, 15, 250, 300);
        thisPane.add(AddOutput);

        addButton.setBounds(10, 300, 100, 20);
        addButton.addActionListener(new addListener());
        thisPane.add(addButton);

        modifyButton.setBounds(120, 300,100, 20);
        thisPane.add(modifyButton);

        deleteButton.setBounds(230, 300, 100, 20);
        deleteButton.addActionListener(new clearListener(model, this));
        thisPane.add(deleteButton);

    }

    public void redraw(){
        RegionList.setListData(model.getTemperatures().toArray());

    }


    private class addListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Output.add(getNametxt()+ " " +  getDescriptiontxt() + " " + comboParentRegion.getSelectedItem() + " " + comboTempScale.getSelectedItem());
            AddOutput.setListData(Output.toArray(new String[Output.size()]));
            Nametxt.setText("");
            Descriptiontxt.setText("");
        }
    }

    private class clearListener implements ActionListener {
        public clearListener(Model model, RegionEntryForm regionForm) {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Output.clear();
            AddOutput.setListData(Output.toArray(new String[Output.size()]));
        }
    }
}


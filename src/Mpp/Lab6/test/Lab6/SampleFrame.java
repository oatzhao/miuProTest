package Mpp.Lab6.test.Lab6;

import java.awt.*;

import javax.swing.*;


import java.util.ArrayList;

public class SampleFrame extends JFrame {
    String[] links;
    JList<ListItem> linkList;
    JPanel cards;
    JPanel buttonBar;

    JPanel mainPanel;
    JPanel upper, middle, lower;

    private final String MAIN_LABEL = "Login";
    private final String SUBMIT_BUTN = "Submit";
    private final String CANCEL_BUTN = "Cancel";

    private final String CUST_ID = "Customer Id";
    private final String PASSWORD = "Password";

    private JTextField custIdField;
    private JPasswordField pwdField;


    // list items which will be added to the ListModel for linkList
    ListItem item1 = new ListItem("Login", true);
    ListItem item2 = new ListItem("View Title", true);
    ListItem item3 = new ListItem("Add Book", true);

    ListItem[] group1 = { item1, item2 };
    ListItem[] group2 = { item1, item3 };

    public ListItem[] getGroup1Items() {
        return group1;
    }

    public ListItem[] getGroup2Items() {
        return group2;
    }

    public JList<ListItem> getLinkList() {
        return linkList;
    }

    public SampleFrame() {

        setSize(300, 300);

        createLinkLabels();
        createMainPanels();
        createButtonBar();
        creatLists();
        defineMiddlePanel();


        linkList.addListSelectionListener(event -> {
            String value = linkList.getSelectedValue().getItemName();
            boolean allowed = linkList.getSelectedValue().highlight();
            System.out.println(value + " " + allowed);

            //System.out.println("selected = " + value);
            CardLayout cl = (CardLayout) (cards.getLayout());

            if (!allowed) {
                value = item1.getItemName();
                linkList.setSelectedIndex(0);
            }
            cl.show(cards, value);
        });

        // set up split panes

        JSplitPane innerPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                linkList, cards);

        innerPane.setDividerLocation(60);
        JSplitPane outerPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                innerPane, buttonBar);
        outerPane.setDividerLocation(200);
        add(outerPane, BorderLayout.CENTER);
    }

    public void createButtonBar() {
        buttonBar = new JPanel();
        JButton left = new JButton("Login");
        addLeftButtonListener(left);
        buttonBar.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonBar.add(left);
    }

    public void creatLists() {
        mainPanel = new JPanel();
        defineMiddlePanel();
        mainPanel.setLayout(new BorderLayout());
//        mainPanel.add(topPanel, BorderLayout.NORTH);
//        mainPanel.add(middlePanel, BorderLayout.CENTER);
        getContentPane().add(mainPanel);
    }

    public void defineMiddlePanel(){
        middle = new JPanel();
        middle.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel gridPanel = new JPanel();
        middle.add(gridPanel);
        GridLayout gl = new GridLayout(2,2);
        gl.setHgap(8);
        gl.setVgap(8);
        gridPanel.setLayout(gl);



        //add fields
        makeLabel(gridPanel,CUST_ID);
        custIdField = new JTextField(10);
        gridPanel.add(custIdField);

        makeLabel(gridPanel,PASSWORD);
        pwdField = new JPasswordField(10);
        gridPanel.add(pwdField);

    }
    private void makeLabel(JPanel p, String s) {
        JLabel l = new JLabel(s);
        p.add(leftPaddedPanel(l));
    }
    private JPanel leftPaddedPanel(JLabel label) {
        JPanel paddedPanel = new JPanel();
        paddedPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        paddedPanel.add(label);
        return paddedPanel;
    }

    public void addLeftButtonListener(JButton butn) {
        butn.addActionListener(evt -> {
            updateList(group1);
            repaint();
        });
    }

    public void addRightButtonListener(JButton butn) {
        butn.addActionListener(evt -> {
            updateList(group2);
            repaint();
        });
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void updateList(ListItem[] items) {
        DefaultListModel<ListItem> model = (DefaultListModel) linkList.getModel();
        int size = model.getSize();
        if (items != null) {
            java.util.List<Integer> indices = new ArrayList<>();
            for (ListItem item : items) {
                int index = model.indexOf(item);
                indices.add(index);
                ListItem next = (ListItem) model.get(index);
                next.setHighlight(true);

            }
            for (int i = 0; i < size; ++i) {
                if (!indices.contains(i)) {
                    ListItem next = (ListItem) model.get(i);
                    next.setHighlight(false);
                }
            }
        } else {
            for (int i = 0; i < size; ++i) {
                ListItem next = (ListItem) model.get(i);
                next.setHighlight(true);
            }
        }
    }

    @SuppressWarnings("serial")
    public void createLinkLabels() {
        DefaultListModel<ListItem> model = new DefaultListModel<>();
        model.addElement(item1);
        model.addElement(item2);
        model.addElement(item3);

        linkList = new JList<ListItem>(model);
        linkList.setCellRenderer(new DefaultListCellRenderer() {

            @SuppressWarnings("rawtypes")
            @Override
            public Component getListCellRendererComponent(JList list,
                                                          Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list,
                        value, index, isSelected, cellHasFocus);
                if (value instanceof ListItem) {
                    ListItem nextItem = (ListItem) value;
                    setText(nextItem.getItemName());
                    if (nextItem.highlight()) {
                        setForeground(Mpp.Lab6.test.Util.LINK_AVAILABLE);
                    } else {
                        setForeground(Util.LINK_NOT_AVAILABLE);
                    }
                    if (isSelected) {
                        setForeground(Color.BLACK);
                        setBackground(new Color(236,243,245));
                    }
                } else {
                    setText("illegal item");
                }
                return c;
            }

        });
    }

    public void createMainPanels() {
        // item1 panel
        Item1Panel p1 = new Item1Panel();
        JPanel panel1 = p1.getMainPanel();

        cards = new JPanel(new CardLayout());
        cards.add(panel1, item1.getItemName());
    }

    static class Item1Panel {
        JPanel mainPanel = new JPanel();
        JLabel item1Label = new JLabel("Login");

        Item1Panel() {
            mainPanel.add(item1Label);
        }

        JPanel getMainPanel() {
            return mainPanel;
        }

    }

    private static final long serialVersionUID = -7438493168871970597L;
}

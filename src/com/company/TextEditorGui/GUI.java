package com.company.TextEditorGui;

import javax.swing.*;
import java.awt.*;

public class GUI {
    static class Start extends JFrame
    {
        JTextArea area1;

        private JMenu createMenuItems(final String[][] items)
        {
            JMenu menu = new JMenu(items[0][0]);
            menu.setMnemonic(items[0][1].charAt(0));
            for (int i = 1; i < items.length; i++) {
                JMenuItem item = new JMenuItem(items[i][0]);
                item.setMnemonic(items[i][1].charAt(0));
                item.setAccelerator(KeyStroke.getKeyStroke("control "+items[i][2]));
                if (item.getText().equals("Открыть"))
                    Functions.fileChooserCreation(item, Start.this, area1);
                if (item.getText().equals("Новый"))
                    Functions.createNewTxt(item, Start.this);
                if (item.getText().equals("Сохранить"))
                    Functions.saveChanges(item, area1);
                if (item.getText().equals("Сохранить как"))
                    Functions.saveAs(item, area1, Start.this);
                if (items[i][3].length() > 0)
                    item.setIcon(new ImageIcon(items[i][3]));
                menu.add(item);
            }
            return menu;
        }

        Start() {
            super("Basic_GUI");
            setLayout(null);
            area1 = new JTextArea(35, 100);
            area1.setFont(new Font("Dialog", Font.PLAIN, 14));
            area1.setLineWrap(true);
            area1.setWrapStyleWord(true);
            JMenuBar menuBar = new JMenuBar();
            String[][] menuFile = {{"Файл", "Ф", "", ""},
                    {"Новый", "Н", "N", ""},
                    {"Открыть", "О", "O", ""},
                    {"Сохранить", "С", "S", ""},
                    {"Сохранить как", "shift S", "shift S", ""}};
            menuBar.add(createMenuItems(menuFile));
            menuBar.add(Box.createHorizontalGlue());

            setJMenuBar(menuBar);
            JPanel contents = new JPanel();
            contents.add(new JScrollPane(area1));
            setContentPane(contents);
            setSize(1150,750);
            setVisible(true);
        }
    }
}

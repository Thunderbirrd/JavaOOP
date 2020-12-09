package com.company.TextEditorGui;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Functions {
    private static String path;

    static void fileChooserCreation(JMenuItem menuItem, GUI.Start start, JTextArea area) {
        JFileChooser fileChooser = new JFileChooser();
        menuItem.addActionListener(e -> {
            fileChooser.setDialogTitle("Выбор файла");
            int result = fileChooser.showOpenDialog(start);
            if (result == JFileChooser.APPROVE_OPTION) {
                String path = fileChooser.getSelectedFile().getAbsolutePath();
                try {
                    FileReader in = new FileReader(path);
                    Scanner scan = new Scanner(in);
                    while (scan.hasNextLine()) {
                        area.append(scan.nextLine() + "\n");
                    }
                    in.close();
                    start.setTitle(fileChooser.getSelectedFile().getName());
                } catch (IOException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });
    }

    static void createNewTxt(JMenuItem menuItem, GUI.Start start) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(fileChooser.getCurrentDirectory(), "file.txt"));
        menuItem.addActionListener(e -> {
            fileChooser.setDialogTitle("Выбор директории");
            int result = fileChooser.showOpenDialog(start);
            if (result == JFileChooser.APPROVE_OPTION) {
                path = fileChooser.getSelectedFile().toString();
                File file = new File(path);
                try {
                    file.createNewFile();
                    start.setTitle(file.getName());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

    }

    static void saveChanges(JMenuItem menuItem, JTextArea area) {
        menuItem.addActionListener(e -> outFile(area));
    }

    private static void outFile(JTextArea area) {
        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter(path));
            area.write(outFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (outFile != null) {
                try {
                    try {
                        outFile.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    static void saveAs (JMenuItem menuItem, JTextArea area, GUI.Start start){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(fileChooser.getCurrentDirectory(), "savedFile.txt"));
        menuItem.addActionListener(e -> {
            fileChooser.setDialogTitle("Выбор директории");
            int result = fileChooser.showOpenDialog(start);
            if (result == JFileChooser.APPROVE_OPTION) {
                path = fileChooser.getSelectedFile().toString();
                File file = new File(path);
                try {
                    file.createNewFile();
                    outFile(area);
                    start.setTitle(file.getName());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

    }
}

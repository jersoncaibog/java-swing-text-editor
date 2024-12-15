import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.undo.UndoManager;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class SimpleTextEditor extends javax.swing.JFrame {

    private boolean isBold = false;
    private boolean isItalic = false;
    private boolean isUnderline = false;
    private UndoManager undoManager;
    
    public SimpleTextEditor() {
        initComponents();
        
        undoManager = new UndoManager();
        textArea.getDocument().addUndoableEditListener(e -> undoManager.addEdit(e.getEdit()));
        
        Arial.addActionListener(evt -> changeFontFamily("Arial"));
        Times_New_Roman.addActionListener(evt -> changeFontFamily("Times New Roman"));
        Courier_New.addActionListener(evt -> changeFontFamily("Courier New"));
        Algerian.addActionListener(evt -> changeFontFamily("Algerian"));
        Impact.addActionListener(evt -> changeFontFamily("Impact"));

        jMenuItem4.addActionListener(evt -> changeFontSize(9));  // Change to 9
        jMenuItem5.addActionListener(evt -> changeFontSize(10)); // Change to 10
        jMenuItem1.addActionListener(evt -> changeFontSize(11)); // Change to 11
        jMenuItem2.addActionListener(evt -> changeFontSize(12)); // Change to 12
        jMenuItem3.addActionListener(evt -> changeFontSize(14)); // Change to 14
        jMenuItem7.addActionListener(evt -> changeFontSize(16)); // Change to 16
        jMenuItem8.addActionListener(evt -> changeFontSize(18)); // Change to 18
        jMenuItem16.addActionListener(evt -> changeFontSize(20)); // Change to 30
        jMenuItem17.addActionListener(evt -> changeFontSize(25)); // Change to 30
        jMenuItem9.addActionListener(evt -> changeFontSize(30)); // Change to 30
        jMenuItem10.addActionListener(evt -> changeFontSize(40)); // Change to 40 
        jMenuItem18.addActionListener(evt -> changeFontSize(65)); // Change to 40 

        jMenuItem6.addActionListener(evt -> changeFontColor(Color.RED));
        jMenuItem12.addActionListener(evt -> changeFontColor(Color.BLACK));
        jMenuItem13.addActionListener(evt -> changeFontColor(Color.WHITE));
        jMenuItem11.addActionListener(evt -> changeFontColor(Color.BLUE));
        jMenuItem19.addActionListener(evt -> changeFontColor(Color.YELLOW));

        // Page color actions
        White.addActionListener(evt -> changePageColor(Color.WHITE));
        Black.addActionListener(evt -> changePageColor(Color.BLACK));
        Red.addActionListener(evt -> changePageColor(Color.RED));
        Blue.addActionListener(evt -> changePageColor(Color.BLUE));
        Green.addActionListener(evt -> changePageColor(Color.GREEN));
        
        // Text format actions
        jMenuItem14.addActionListener(evt -> toggleBold());
        Italic.addActionListener(evt -> toggleItalic());
        Underline.addActionListener(evt -> toggleUnderline());
        
        jMenuItem20.addActionListener(evt -> highlightText(Color.RED));
        jMenuItem21.addActionListener(evt -> highlightText(Color.ORANGE));
        jMenuItem22.addActionListener(evt -> highlightText(Color.YELLOW));
        jMenuItem23.addActionListener(evt -> highlightText(Color.GREEN));
        jMenuItem24.addActionListener(evt -> highlightText(Color.MAGENTA));
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem15 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newBtn = new javax.swing.JMenuItem();
        openBtn = new javax.swing.JMenuItem();
        saveBtn = new javax.swing.JMenuItem();
        exitBtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        fontSizeMenu = new javax.swing.JMenu();
        Arial = new javax.swing.JMenuItem();
        Times_New_Roman = new javax.swing.JMenuItem();
        Courier_New = new javax.swing.JMenuItem();
        Algerian = new javax.swing.JMenuItem();
        Impact = new javax.swing.JMenuItem();
        fontColorMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        fontFamilyMenu = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        Page_Color = new javax.swing.JMenu();
        White = new javax.swing.JMenuItem();
        Black = new javax.swing.JMenuItem();
        Red = new javax.swing.JMenuItem();
        Blue = new javax.swing.JMenuItem();
        Green = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        Italic = new javax.swing.JMenuItem();
        Underline = new javax.swing.JMenuItem();
        HighLight = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        copy = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        undo = new javax.swing.JMenuItem();
        Redo = new javax.swing.JMenuItem();

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(textArea);

        jMenu1.setText("File");

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });
        jMenu1.add(newBtn);

        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });
        jMenu1.add(openBtn);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jMenu1.add(saveBtn);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jMenu1.add(exitBtn);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Font Menu");

        fontSizeMenu.setText("Font Family");

        Arial.setText("Arial");
        fontSizeMenu.add(Arial);

        Times_New_Roman.setText("Times New Roman");
        fontSizeMenu.add(Times_New_Roman);

        Courier_New.setText("Courier New");
        fontSizeMenu.add(Courier_New);

        Algerian.setText("Algerian");
        fontSizeMenu.add(Algerian);

        Impact.setText("Impact");
        fontSizeMenu.add(Impact);

        jMenu2.add(fontSizeMenu);

        fontColorMenu.setText("Font Size");

        jMenuItem4.setText("9");
        fontColorMenu.add(jMenuItem4);

        jMenuItem5.setText("10");
        fontColorMenu.add(jMenuItem5);

        jMenuItem1.setText("11");
        fontColorMenu.add(jMenuItem1);

        jMenuItem2.setText("12");
        fontColorMenu.add(jMenuItem2);

        jMenuItem3.setText("14");
        fontColorMenu.add(jMenuItem3);

        jMenuItem7.setText("16");
        fontColorMenu.add(jMenuItem7);

        jMenuItem8.setText("18");
        fontColorMenu.add(jMenuItem8);

        jMenuItem16.setText("20");
        fontColorMenu.add(jMenuItem16);

        jMenuItem17.setText("25");
        fontColorMenu.add(jMenuItem17);

        jMenuItem9.setText("30");
        fontColorMenu.add(jMenuItem9);

        jMenuItem10.setText("40");
        fontColorMenu.add(jMenuItem10);

        jMenuItem18.setText("65");
        fontColorMenu.add(jMenuItem18);

        jMenu2.add(fontColorMenu);

        fontFamilyMenu.setText("Font Color");

        jMenuItem12.setText("Black");
        fontFamilyMenu.add(jMenuItem12);

        jMenuItem13.setText("White");
        fontFamilyMenu.add(jMenuItem13);

        jMenuItem6.setText("Red");
        fontFamilyMenu.add(jMenuItem6);

        jMenuItem11.setText("Blue");
        fontFamilyMenu.add(jMenuItem11);

        jMenuItem19.setText("Yellow");
        fontFamilyMenu.add(jMenuItem19);

        jMenu2.add(fontFamilyMenu);

        jMenuBar1.add(jMenu2);

        Page_Color.setText("Page Color");

        White.setText("White");
        Page_Color.add(White);

        Black.setText("Black");
        Page_Color.add(Black);

        Red.setText("Red");
        Page_Color.add(Red);

        Blue.setText("Blue");
        Page_Color.add(Blue);

        Green.setText("Green");
        Page_Color.add(Green);

        jMenuBar1.add(Page_Color);

        jMenu3.setText("Text Fomat");

        jMenuItem14.setText("Bold");
        jMenu3.add(jMenuItem14);

        Italic.setText("Italic");
        jMenu3.add(Italic);

        Underline.setText("Underline");
        jMenu3.add(Underline);

        HighLight.setText("High Light");

        jMenuItem20.setText("Red");
        HighLight.add(jMenuItem20);

        jMenuItem21.setText("Orange");
        HighLight.add(jMenuItem21);

        jMenuItem22.setText("Yellow");
        HighLight.add(jMenuItem22);

        jMenuItem23.setText("Green");
        HighLight.add(jMenuItem23);

        jMenuItem24.setText("Violet");
        HighLight.add(jMenuItem24);

        jMenu3.add(HighLight);

        jMenuBar1.add(jMenu3);

        Edit.setText("Edit");

        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        Edit.add(copy);

        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        Edit.add(Cut);

        Paste.setText("Paste");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        Edit.add(Paste);

        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        Edit.add(undo);

        Redo.setText("Redo");
        Redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoActionPerformed(evt);
            }
        });
        Edit.add(Redo);

        jMenuBar1.add(Edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        System.out.println("new");
        textArea.setText("");
    }//GEN-LAST:event_newBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        System.out.println("save");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                writer.write(textArea.getText());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open File");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                StringBuilder text = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(line).append("\n");
                }
                textArea.setText(text.toString());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_openBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.out.println("exit");
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        System.out.println("copy");
        
        String selectedText = textArea.getSelectedText();
        System.out.println(selectedText);
        if (selectedText != null) {
            StringSelection stringSelection = new StringSelection(selectedText);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        }
        
    }//GEN-LAST:event_copyActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        System.out.println("cut");
        String selectedText = textArea.getSelectedText();
        if (selectedText != null) {
            StringSelection stringSelection = new StringSelection(selectedText);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            textArea.replaceSelection("");
        }
    }//GEN-LAST:event_CutActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        System.out.println("paste");
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable transferable = clipboard.getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String clipboardText = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                textArea.replaceSelection(clipboardText);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PasteActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        System.out.println("undo");
        if (undoManager.canUndo()) {
            undoManager.undo();
        }
    }//GEN-LAST:event_undoActionPerformed

    private void RedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoActionPerformed
        System.out.println("redo");
        if (undoManager.canRedo()) {
            undoManager.redo();
        }
    }//GEN-LAST:event_RedoActionPerformed

    private void changeFontFamily(String fontName) {
        StyledDocument doc = textArea.getStyledDocument();
        int start = textArea.getSelectionStart();
        int end = textArea.getSelectionEnd();

        // If no text is selected, apply to the caret position
        if (start == end) {
            start = textArea.getCaretPosition() - 1;
            end = textArea.getCaretPosition();
        }

        // Get current attributes and create new attributes for font family
        AttributeSet currentAttributes = doc.getCharacterElement(start).getAttributes();
        SimpleAttributeSet newAttributes = new SimpleAttributeSet(currentAttributes);
        StyleConstants.setFontFamily(newAttributes, fontName);

        // Apply the new font family to selected text or caret position
        doc.setCharacterAttributes(start, end - start, newAttributes, false);
    }

    private void changeFontSize(int size) {
        StyledDocument doc = textArea.getStyledDocument();
        int start = textArea.getSelectionStart();
        int end = textArea.getSelectionEnd();

        // If no text is selected, apply to the caret position
        if (start == end) {
            start = textArea.getCaretPosition() - 1;
            end = textArea.getCaretPosition();
        }

        // Get current attributes and create new attributes for font size
        AttributeSet currentAttributes = doc.getCharacterElement(start).getAttributes();
        SimpleAttributeSet newAttributes = new SimpleAttributeSet(currentAttributes);
        StyleConstants.setFontSize(newAttributes, size);

        // Apply the new font size to selected text or caret position
        doc.setCharacterAttributes(start, end - start, newAttributes, false);
    }

    private void changeFontColor(Color color) {
        StyledDocument doc = textArea.getStyledDocument();
        int start = textArea.getSelectionStart();
        int end = textArea.getSelectionEnd();

        // If no text is selected, apply to the caret position
        if (start == end) {
            start = textArea.getCaretPosition() - 1;
            end = textArea.getCaretPosition();
        }

        // Get current attributes and apply the new font color
        AttributeSet currentAttributes = doc.getCharacterElement(start).getAttributes();
        SimpleAttributeSet newAttributes = new SimpleAttributeSet(currentAttributes);
        StyleConstants.setForeground(newAttributes, color);

        // Apply the new font color to selected text or caret position
        doc.setCharacterAttributes(start, end - start, newAttributes, false);
    }

    private void changePageColor(Color color) {
        textArea.setBackground(color); // Change the background color of the JTextArea
    }
    
    private void toggleBold() {
        StyledDocument doc = textArea.getStyledDocument();
        int start = textArea.getSelectionStart();
        int end = textArea.getSelectionEnd();

        // If no text is selected, apply to the caret position
        if (start == end) {
            start = textArea.getCaretPosition() - 1;
            end = textArea.getCaretPosition();
        }

        // Get current attributes and check if bold is already applied
        AttributeSet currentAttributes = doc.getCharacterElement(start).getAttributes();
        boolean isBold = StyleConstants.isBold(currentAttributes);

        // Create new attributes and toggle bold
        SimpleAttributeSet newAttributes = new SimpleAttributeSet(currentAttributes);
        StyleConstants.setBold(newAttributes, !isBold);

        // Apply bold to selected text or caret position
        doc.setCharacterAttributes(start, end - start, newAttributes, false);
    }
    
    private void toggleItalic() {
        StyledDocument doc = textArea.getStyledDocument();
        int start = textArea.getSelectionStart();
        int end = textArea.getSelectionEnd();

        // If no text is selected, apply to the caret position
        if (start == end) {
            start = textArea.getCaretPosition() - 1;
            end = textArea.getCaretPosition();
        }

        // Get current attributes and check if italic is already applied
        AttributeSet currentAttributes = doc.getCharacterElement(start).getAttributes();
        boolean isItalic = StyleConstants.isItalic(currentAttributes);

        // Create new attributes and toggle italic
        SimpleAttributeSet newAttributes = new SimpleAttributeSet(currentAttributes);
        StyleConstants.setItalic(newAttributes, !isItalic);

        // Apply italic to selected text or caret position
        doc.setCharacterAttributes(start, end - start, newAttributes, false);
    }
    
    private void highlightText(Color color) {
        int start = textArea.getSelectionStart();
        int end = textArea.getSelectionEnd();

        if (start != end) {
            // Set the background color of the selected text (highlight it)
            StyledDocument doc = textArea.getStyledDocument();
            SimpleAttributeSet attrs = new SimpleAttributeSet();
            StyleConstants.setBackground(attrs, color);
            doc.setCharacterAttributes(start, end - start, attrs, false);
        } else {
            // If no text is selected, you could display a message or handle it accordingly
            JOptionPane.showMessageDialog(this, "Please select text to highlight.");
        }
    }
    
    private void toggleUnderline() {
        // Get the StyledDocument and the caret position
        StyledDocument doc = textArea.getStyledDocument();
        int caretPosition = textArea.getCaretPosition();
        int start = textArea.getSelectionStart();
        int end = textArea.getSelectionEnd();

        // If there's no selection, toggle the caret position
        if (start == end) {
            start = caretPosition - 1;
            end = caretPosition;
        }

        // Get the current attributes
        AttributeSet currentAttributes = doc.getCharacterElement(start).getAttributes();
        boolean isUnderlined = StyleConstants.isUnderline(currentAttributes);

        // Create a new attribute set to toggle the underline
        SimpleAttributeSet newAttributes = new SimpleAttributeSet();
        StyleConstants.setUnderline(newAttributes, !isUnderlined);

        // Apply the new attribute set to the selected text or caret position
        doc.setCharacterAttributes(start, end - start, newAttributes, false);
    } 

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleTextEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Algerian;
    private javax.swing.JMenuItem Arial;
    private javax.swing.JMenuItem Black;
    private javax.swing.JMenuItem Blue;
    private javax.swing.JMenuItem Courier_New;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Green;
    private javax.swing.JMenu HighLight;
    private javax.swing.JMenuItem Impact;
    private javax.swing.JMenuItem Italic;
    private javax.swing.JMenu Page_Color;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Red;
    private javax.swing.JMenuItem Redo;
    private javax.swing.JMenuItem Times_New_Roman;
    private javax.swing.JMenuItem Underline;
    private javax.swing.JMenuItem White;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem exitBtn;
    private javax.swing.JMenu fontColorMenu;
    private javax.swing.JMenu fontFamilyMenu;
    private javax.swing.JMenu fontSizeMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newBtn;
    private javax.swing.JMenuItem openBtn;
    private javax.swing.JMenuItem saveBtn;
    private javax.swing.JTextPane textArea;
    private javax.swing.JMenuItem undo;
    // End of variables declaration//GEN-END:variables
}

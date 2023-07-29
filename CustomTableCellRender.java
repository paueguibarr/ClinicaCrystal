/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


/**
 *
 * @author paueguibar
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomTableCellRender extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // Set the background color based on the cell value
        String estatus = value.toString().toLowerCase();
        switch (estatus) {
            case "pre alta":
                cellComponent.setBackground(Color.decode("#FEFFBF"));
                break;
            case "alta":
                cellComponent.setBackground(Color.decode("#F48A94"));
                break;
            case "cerrada":
                cellComponent.setBackground(Color.decode("#B0F2C2"));
                break;
            default:
                cellComponent.setBackground(Color.decode("#B0EFEF"));
                break;
        }
        
        return cellComponent;
    }
}


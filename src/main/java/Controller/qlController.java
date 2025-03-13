/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.QLSVModel;
import Model.ThiSinh;
import Model.Tinh;
import View.QLSVView;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.Action;
import javax.swing.JOptionPane;

public class qlController implements Action {

    private QLSVView qlView;

    public qlController(QLSVView qlsvV) {
        this.qlView = qlsvV;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if ("Add".equals(src)) {
            this.qlView.clearForm();
            this.qlView.model.setLuaChon("Add");
        } else if ("Save".equals(src)) {
            try {
                ThiSinh ts = this.qlView.collectFormData();
                this.qlView.addOrUpdateTS(ts);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        } else if (src.equals("Update")) {
            this.qlView.showSelectedTS();
        } else if(src.equals("Remove")){
            this.qlView.removeTS();
        } else if(src.equals("Cancel")){
            this.qlView.clearForm();
        } else if(src.equals("Find")){
           this.qlView.Finding();
        } else if(src.equals("About Me")){
            this.qlView.AboutMe();
        } else if(src.equals("Exit")){
            this.qlView.Exit();
        } else if(src.equals("SaveFile")){
            this.qlView.SaveFile();
        } else if(src.equals("Open")){
            this.qlView.Open();
        }
    }

    @Override
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

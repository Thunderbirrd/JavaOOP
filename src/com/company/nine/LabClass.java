package com.company.nine;

public class LabClass {
    final private LabClassUI labClassUI;

    public LabClass() {
        this.labClassUI = new LabClassDriver();
    }

    public LabClassUI getLabClassUI() {
        return labClassUI;
    }

    @Override
    public String toString() {
        return labClassUI.toString();
    }
}

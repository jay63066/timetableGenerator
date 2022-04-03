package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.Kernel;
import java.nio.charset.StandardCharsets;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//need to allot temaparrsub1 and temaprrsub2 for remaining 6 classes so that sub of each hour gets stored in the resp. class sub arrays
//need to finish lab allocation process (have finished only for IIyear odd sem

public class Main implements ActionListener {

    JFrame oddoreven;
    JLabel choosesem;
    JRadioButton odd;
    JRadioButton even;
    ButtonGroup btngrp1;
    JButton next1;

    boolean IsOdd;
    int LabDetailTabRec=0;

    JFrame labframe1;
    JLabel facultyNameLabel;
    JTextField facultyName;
    JLabel facultyYearSec;
    JRadioButton IyrA;
    JRadioButton IyrB;
    JRadioButton IIyrA;
    JRadioButton IIyrB;
    JRadioButton IIIyrA;
    JRadioButton IIIyrB;
    JRadioButton IVyrA;
    JRadioButton IVyrB;
    ButtonGroup btngrp2;
    JLabel facultyLabSub;
    JRadioButton Python;
    JRadioButton DS;
    JRadioButton OOPS;
    JRadioButton OOAD;
    JRadioButton NETWORK;
    JRadioButton SECLa;
    JRadioButton CLDCOMP;
    JRadioButton C;
    JRadioButton OS;
    JRadioButton DBMS;
    JRadioButton MOBAPPDEV;
    JRadioButton INTPROG;
    ButtonGroup btngrp3;
    JButton next2;
    int taechersAssigned=0;
    boolarrayclasses boolarrclasses;
    prof[] prof1;


    JFrame theoryFrame1;
    JLabel facultyTheorySub;
    JTextField facultyTheorySubField;
    JLabel noofTheorySub;
    JTextField noofTheorySubField;
    JButton next3;
    JButton generateTT;

    JFrame TTMainframe;
    JButton[][] btns=new JButton[7][8];
    JButton[][] btns2=new JButton[20][4];
    JPanel mainPanel;
    JPanel subPanel1;
    JPanel subPanel2;
    JPanel subPanel3;
    JPanel subPanel4;
    JPanel subPanel5;
    JButton next4;
    JPanel wrapper;

    JLabel subCode;
    JTextField subCodeField;
    Main(){

        boolarrclasses=new boolarrayclasses();
        prof1=new prof[100];
        oddoreven=new JFrame("Tab to choose odd or even sem");                          //Frame to choose whether the sem is odd or even
        choosesem=new JLabel("Choose whether this is a/an even or odd semester");
        odd=new JRadioButton("Odd Sem");
        even=new JRadioButton("Even Sem");
        btngrp1=new ButtonGroup();
        next1=new JButton("Next");
        oddoreven.getContentPane().setLayout(null);
        choosesem.setFont(new Font(choosesem.getFont().getName(), choosesem.getFont().getStyle(), 20));
        odd.setFont(choosesem.getFont());
        even.setFont(choosesem.getFont());
        choosesem.setBounds(45,45,500,30);
        odd.setBounds(100,90,200,30);
        even.setBounds(100,120,200,30);
        next1.setBounds(130,160,60,23);

        btngrp1.add(odd);
        btngrp1.add(even);
        oddoreven.add(choosesem);
        oddoreven.add(odd);
        oddoreven.add(even);
        oddoreven.add(next1);
        next1.addActionListener(this);
        odd.addActionListener(this);
        even.addActionListener(this);
        oddoreven.setSize(1500,1000);
        oddoreven.setVisible(true);

    }

    public void getLabDetails(boolean IsOdd){
        labframe1=new JFrame("Lab details assigning Tab ");                             //Frame to choose about lab details
        facultyNameLabel=new JLabel("Enter the name of the faculty : ");
        facultyName=new JTextField(50);
        facultyYearSec=new JLabel("Choose the years and sec of the facutly : ");
        IyrA=new JRadioButton("IYearA");
        IyrB=new JRadioButton("IYearB");
        IIyrA=new JRadioButton("IIYearA");
        IIyrB=new JRadioButton("IIYearB");
        IIIyrA=new JRadioButton("IIIYearA");
        IIIyrB=new JRadioButton("IIIYearB");
        IVyrA=new JRadioButton("IVYearA");
        IVyrB=new JRadioButton("IVYearB");
        facultyLabSub=new JLabel("Choose the sub of the faculty : ");
        subCode=new JLabel("Enter the Respective Subject Code :");
        subCodeField=new JTextField(50);
        btngrp3=new ButtonGroup();


        facultyNameLabel.setFont(new Font(facultyNameLabel.getFont().getName(), facultyNameLabel.getFont().getStyle(), 16));
        facultyYearSec.setFont(facultyNameLabel.getFont());
        IyrA.setFont(facultyNameLabel.getFont());
        IyrB.setFont(facultyNameLabel.getFont());
        IIyrA.setFont(facultyNameLabel.getFont());
        IIyrB.setFont(facultyNameLabel.getFont());
        IIIyrA.setFont(facultyNameLabel.getFont());
        IIIyrB.setFont(facultyNameLabel.getFont());
        IVyrA.setFont(facultyNameLabel.getFont());
        IVyrB.setFont(facultyNameLabel.getFont());
        facultyLabSub.setFont(facultyNameLabel.getFont());
        subCode.setFont(facultyNameLabel.getFont());

        if(IsOdd) {                                                // check whether it is odd semester or even semester
            Python = new JRadioButton("Python");
            DS = new JRadioButton("DS");
            OOPS = new JRadioButton("OOPS");
            OOAD = new JRadioButton("OOAD");
            NETWORK = new JRadioButton("NETWORK");
            SECLa = new JRadioButton("SECLa");
            CLDCOMP = new JRadioButton("CLDCOMP");

            btngrp3.add(Python);
            btngrp3.add(DS);
            btngrp3.add(OOPS);
            btngrp3.add(OOAD);
            btngrp3.add(NETWORK);
            btngrp3.add(SECLa);
            btngrp3.add(CLDCOMP);

            Python.setFont(facultyNameLabel.getFont());
            DS.setFont(facultyNameLabel.getFont());
            OOPS.setFont(facultyNameLabel.getFont());
            OOAD.setFont(facultyNameLabel.getFont());
            NETWORK.setFont(facultyNameLabel.getFont());
            SECLa.setFont(facultyNameLabel.getFont());
            CLDCOMP.setFont(facultyNameLabel.getFont());
        }
        else {
            C = new JRadioButton("C");
            OS = new JRadioButton("OS");
            DBMS = new JRadioButton("DBMS");
            MOBAPPDEV = new JRadioButton("MOBAPPDEV");
            INTPROG = new JRadioButton("INTPROG");

            btngrp3.add(C);
            btngrp3.add(OS);
            btngrp3.add(DBMS);
            btngrp3.add(MOBAPPDEV);
            btngrp3.add(INTPROG);

            C.setFont(facultyNameLabel.getFont());
            OS.setFont(facultyNameLabel.getFont());
            DBMS.setFont(facultyNameLabel.getFont());
            MOBAPPDEV.setFont(facultyNameLabel.getFont());
            INTPROG.setFont(facultyNameLabel.getFont());
        }

        next2=new JButton("Next");


        facultyNameLabel.setBounds(45,45,500,30);
        facultyName.setBounds(350,45,200,30);
        facultyYearSec.setBounds(45,80,500,30);
        IyrA.setBounds(45,110,100,15);
        IyrB.setBounds(45,130,100,15);
        IIyrA.setBounds(45,150,100,15);
        IIyrB.setBounds(45,170,100,15);
        IIIyrA.setBounds(45,190,100,15);
        IIIyrB.setBounds(45,210,100,15);
        IVyrA.setBounds(45,230,100,15);
        IVyrB.setBounds(45,250,100,15);
        facultyLabSub.setBounds(45,275,500,20);


        if(IsOdd) {
            Python.setBounds(45, 295, 100, 30);
            DS.setBounds(45,330,100,15);
            OOPS.setBounds(45,355,100,15);
            OOAD.setBounds(45,380,100,15);
            SECLa.setBounds(45,405,100,15);
            NETWORK.setBounds(45,430,150,15);
            CLDCOMP.setBounds(45,455,150,15);
            labframe1.add(Python);
            labframe1.add(DS);
            labframe1.add(OOPS);
            labframe1.add(OOAD);
            labframe1.add(SECLa);
            labframe1.add(NETWORK);
            labframe1.add(CLDCOMP);
        }
        else{
            C.setBounds(45, 295, 100, 15);
            OS.setBounds(45,320,100,15);
            DBMS.setBounds(45,355,100,15);
            MOBAPPDEV.setBounds(45,380,150,15);
            INTPROG.setBounds(45,405,150,15);
            labframe1.add(C);
            labframe1.add(OS);
            labframe1.add(DBMS);
            labframe1.add(MOBAPPDEV);
            labframe1.add(INTPROG);
        }
        subCode.setBounds(45,480,300,30);
        subCodeField.setBounds(350,480,200,30);
        next2.setBounds(630,600,100,30);
        labframe1.getContentPane().setLayout(null);
        btngrp2=new ButtonGroup();
        btngrp2.add(IyrA);
        btngrp2.add(IyrB);
        btngrp2.add(IIyrA);
        btngrp2.add(IIyrB);
        btngrp2.add(IIIyrA);
        btngrp2.add(IIIyrB);
        btngrp2.add(IVyrA);
        btngrp2.add(IVyrB);
        labframe1.add(facultyNameLabel);
        labframe1.add(facultyName);
        labframe1.add(facultyYearSec);
        labframe1.add(IyrA);
        labframe1.add(IyrB);
        labframe1.add(IIyrA);
        labframe1.add(IIyrB);
        labframe1.add(IIIyrA);
        labframe1.add(IIIyrB);
        labframe1.add(IVyrA);
        labframe1.add(IVyrB);
        labframe1.add(facultyLabSub);
        labframe1.add(subCode);
        labframe1.add(subCodeField);
        labframe1.add(next2);

        next2.addActionListener(this);
        labframe1.setSize(1500,1000);
        labframe1.setVisible(true);
    }

    void passLabDetails(){
        boolean IsTeacherRegAlready=false;
        int i=0;
        for(int j=0;j<taechersAssigned;j++){
            if(facultyName.getText().equals(prof1[j].name)){
                i=j;
                IsTeacherRegAlready=true;
            }
        }

        if(!IsTeacherRegAlready){
            i=taechersAssigned;
            prof1[taechersAssigned++]=new prof(facultyName.getText());
        }

        if(IyrA.isSelected())
            prof1[i].yearsec[0][0]=true;
        else if(IyrB.isSelected())
            prof1[i].yearsec[0][1]=true;
        else if(IIyrA.isSelected())
            prof1[i].yearsec[1][0]=true;
        else if(IIyrB.isSelected())
            prof1[i].yearsec[1][1]=true;
        else if(IIIyrA.isSelected())
            prof1[i].yearsec[2][0]=true;
        else if(IIIyrB.isSelected())
            prof1[i].yearsec[2][1]=true;
        else if(IVyrA.isSelected())
            prof1[i].yearsec[3][0]=true;
        else
            prof1[i].yearsec[3][1]=true;

        if(prof1[i].labsub1 == null) {
            if (IsOdd) {
                if(Python.isSelected())
                    prof1[i].labsub1="Python";
                else if(DS.isSelected())
                    prof1[i].labsub1="DS";
                else if(OOPS.isSelected())
                    prof1[i].labsub1="OOPS";
                else if(OOAD.isSelected())
                    prof1[i].labsub1="OOAD";
                else if(NETWORK.isSelected())
                    prof1[i].labsub1="NETWORK";
                else if(SECLa.isSelected())
                    prof1[i].labsub1="SECLa";
                else if(CLDCOMP.isSelected())
                    prof1[i].labsub1="CLDCOMP";
            }
            else{
                if(C.isSelected())
                    prof1[i].labsub1="C";
                else if(OS.isSelected())
                    prof1[i].labsub1="OS";
                else if(DBMS.isSelected())
                    prof1[i].labsub1="DBMS";
                else if(MOBAPPDEV.isSelected())
                    prof1[i].labsub1="MOBAPPDEV";
                else if(INTPROG.isSelected())
                    prof1[i].labsub1="INTPROG";
            }
        }
        else {
            if (IsOdd) {
                if(Python.isSelected())
                    prof1[i].labsub2="Python";
                else if(DS.isSelected())
                    prof1[i].labsub2="DS";
                else if(OOPS.isSelected())
                    prof1[i].labsub2="OOPS";
                else if(OOAD.isSelected())
                    prof1[i].labsub2="OOAD";
                else if(NETWORK.isSelected())
                    prof1[i].labsub2="NETWORK";
                else if(SECLa.isSelected())
                    prof1[i].labsub2="SECLa";
                else if(CLDCOMP.isSelected())
                    prof1[i].labsub2="CLDCOMP";
            }
            else{
                if(C.isSelected())
                    prof1[i].labsub2="C";
                else if(OS.isSelected())
                    prof1[i].labsub2="OS";
                else if(DBMS.isSelected())
                    prof1[i].labsub2="DBMS";
                else if(MOBAPPDEV.isSelected())
                    prof1[i].labsub2="MOBAPPDEV";
                else if(INTPROG.isSelected())
                    prof1[i].labsub2="INTPROG";
            }
        }
        LabAllotment(IsOdd,boolarrclasses,prof1[i]);
        generatingTTSecPart(prof1[i],true);

    }

    void getTheoryDetails(){
        theoryFrame1=new JFrame("Theory Class Details Assgining Tab ");
        facultyNameLabel=new JLabel("Enter the name of the faculty :");
        facultyName=new JTextField(50);
        facultyYearSec=new JLabel("Choose the years and sec of the facutly :");
        IyrA=new JRadioButton("IYearA");
        IyrB=new JRadioButton("IYearB");
        IIyrA=new JRadioButton("IIYearA");
        IIyrB=new JRadioButton("IIYearB");
        IIIyrA=new JRadioButton("IIIYearA");
        IIIyrB=new JRadioButton("IIIYearB");
        IVyrA=new JRadioButton("IVYearA");
        IVyrB=new JRadioButton("IVYearB");
        facultyTheorySub=new JLabel("Enter the Theory Sub of the Faculty :");
        facultyTheorySubField=new JTextField(50);
        noofTheorySub=new JLabel("Enter the No.of.Theory classes assigned for the faculty :");
        noofTheorySubField=new JTextField(50);
        subCode=new JLabel("Enter the Respective Subject Code :");
        subCodeField=new JTextField(50);
        next3=new JButton("Next");
        generateTT=new JButton("Generate Schedule");

        facultyNameLabel.setFont(new Font(facultyNameLabel.getFont().getName(), facultyNameLabel.getFont().getStyle(), 16));
        facultyYearSec.setFont(facultyNameLabel.getFont());
        IyrA.setFont(facultyNameLabel.getFont());
        IyrB.setFont(facultyNameLabel.getFont());
        IIyrA.setFont(facultyNameLabel.getFont());
        IIyrB.setFont(facultyNameLabel.getFont());
        IIIyrA.setFont(facultyNameLabel.getFont());
        IIIyrB.setFont(facultyNameLabel.getFont());
        IVyrA.setFont(facultyNameLabel.getFont());
        IVyrB.setFont(facultyNameLabel.getFont());
        facultyTheorySub.setFont(facultyNameLabel.getFont());
        noofTheorySub.setFont(facultyNameLabel.getFont());
        subCode.setFont(facultyNameLabel.getFont());

        facultyNameLabel.setBounds(45,45,500,30);
        facultyName.setBounds(490,45,200,30);
        facultyYearSec.setBounds(45,80,500,30);
        IyrA.setBounds(45,110,100,15);
        IyrB.setBounds(45,130,100,15);
        IIyrA.setBounds(45,150,100,15);
        IIyrB.setBounds(45,170,100,15);
        IIIyrA.setBounds(45,190,100,15);
        IIIyrB.setBounds(45,210,100,15);
        IVyrA.setBounds(45,230,100,15);
        IVyrB.setBounds(45,250,100,15);
        facultyTheorySub.setBounds(45,280,500,20);
        facultyTheorySubField.setBounds(490,275,200,30);
        noofTheorySub.setBounds(45,315,500,30);
        noofTheorySubField.setBounds(490,315,200,30);
        subCode.setBounds(45,350,500,30);
        subCodeField.setBounds(490,350,200,30);
        next3.setBounds(560,600,100,30);
        generateTT.setBounds(670,600,150,30);
        theoryFrame1.getContentPane().setLayout(null);
        btngrp2=new ButtonGroup();
        btngrp2.add(IyrA);
        btngrp2.add(IyrB);
        btngrp2.add(IIyrA);
        btngrp2.add(IIyrB);
        btngrp2.add(IIIyrA);
        btngrp2.add(IIIyrB);
        btngrp2.add(IVyrA);
        btngrp2.add(IVyrB);
        theoryFrame1.add(facultyName);
        theoryFrame1.add(facultyYearSec);
        theoryFrame1.add(facultyNameLabel);
        theoryFrame1.add(IyrA);
        theoryFrame1.add(IyrB);
        theoryFrame1.add(IIyrA);
        theoryFrame1.add(IIyrB);
        theoryFrame1.add(IIIyrA);
        theoryFrame1.add(IIIyrB);
        theoryFrame1.add(IVyrA);
        theoryFrame1.add(IVyrB);
        theoryFrame1.add(facultyTheorySub);
        theoryFrame1.add(facultyTheorySubField);
        theoryFrame1.add(noofTheorySub);
        theoryFrame1.add(noofTheorySubField);
        theoryFrame1.add(subCode);
        theoryFrame1.add(subCodeField);
        theoryFrame1.add(next3);
        theoryFrame1.add(generateTT);
        next3.addActionListener(this);
        generateTT.addActionListener(this);
        theoryFrame1.setSize(1500,1000);
        theoryFrame1.setVisible(true);
    }

    void passTheoryDetails(){
        boolean IsTeacherRegAlready=false;
        int i=0;
        for(int j=0;j<taechersAssigned;j++){
            if(facultyName.getText().equals(prof1[j].name)){
                i=j;
                IsTeacherRegAlready=true;
            }
        }

        if(!IsTeacherRegAlready){
            i=taechersAssigned;
            prof1[taechersAssigned++]=new prof(facultyName.getText());
        }

        if(IyrA.isSelected())
            prof1[i].yearsec[0][0]=true;
        else if(IyrB.isSelected())
            prof1[i].yearsec[0][1]=true;
        else if(IIyrA.isSelected())
            prof1[i].yearsec[1][0]=true;
        else if(IIyrB.isSelected())
            prof1[i].yearsec[1][1]=true;
        else if(IIIyrA.isSelected())
            prof1[i].yearsec[2][0]=true;
        else if(IIIyrB.isSelected())
            prof1[i].yearsec[2][1]=true;
        else if(IVyrA.isSelected())
            prof1[i].yearsec[3][0]=true;
        else
            prof1[i].yearsec[3][1]=true;

        if(prof1[i].theorysub1==null){
            prof1[i].theorysub1=facultyTheorySubField.getText();
        }
        else{
            prof1[i].theorysub1=facultyTheorySubField.getText();
        }

        if(prof1[i].numoftheoryclass1 == -1){
            prof1[i].numoftheoryclass1=Integer.parseInt(noofTheorySubField.getText());
        }
        else{
            prof1[i].numoftheoryclass2=Integer.parseInt(noofTheorySubField.getText());
        }

        boolarrclasses.temparrays(prof1[i], false);
        ttgenerationTheory(prof1[i], boolarrclasses);
        boolarrclasses.temparrays(prof1[i], true);

        generatingTTSecPart(prof1[i],false);

        System.out.println("TimeTable of IIyearA: ");
        for (int m = 0; m < 6; m++) {
            for (int l = 0; l < 7; l++) {
                if (boolarrclasses.IIyearA[m][l]) {
                    System.out.print("      ");
                    System.out.print(boolarrclasses.IIyearASub[m][l]);
                }
                else{
                    System.out.print("     ");
                    System.out.print("NA   ");
                }

            }
            System.out.println();
        }
        System.out.println("TimeTable of IIyearB: ");
        for (int m = 0; m< 6; m++) {
            for (int l = 0; l < 7; l++) {
                if (boolarrclasses.IIyearB[m][l]) {
                    System.out.print("      ");
                    System.out.print(boolarrclasses.IIyearBSub[m][l]);
                } else {
                    System.out.print("      ");
                    System.out.print("NA   ");
                }
            }
            System.out.println();
        }

    }

    void displayTimeTable(boolean[][] boolYearSec,String[][] stringYearSec,String[] yearSecSubName,String[] yearSecSubCode,String[] yearSecFacName,int serialno) {
        TTMainframe = new JFrame("Displaying TimeTable");

        subPanel1=new JPanel();
        subPanel2=new JPanel();
        subPanel3=new JPanel();
        subPanel4=new JPanel();
        subPanel5=new JPanel();

        mainPanel=new JPanel();
        next4=new JButton("Next ");

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 && j == 0) {
                    btns[i][j] = new JButton("Dayorder/Period");
                } else if (i == 0 && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7)) {
                    btns[i][j] = new JButton("" + j);
                } else if (j == 0) {
                    btns[i][j] = new JButton("DayOrder " + i);
                } else if (boolYearSec[i - 1][j - 1]) {
                    btns[i][j] = new JButton("" + stringYearSec[i - 1][j - 1]);
                } else {
                    btns[i][j] = new JButton("NA");
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                subPanel1.add(btns[i][j]);
            }
        }
        subPanel1.setLayout(new GridLayout(7, 8));

        subPanel1.setVisible(true);

        for (int i = 0; i < serialno; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    btns2[0][0] = new JButton("Sl.No ");
                } else if (i == 0) {
                    btns2[0][1] = new JButton("SubCode");
                    btns2[0][2] = new JButton("Subject");
                    btns2[0][3] = new JButton("Staff handling the Subject");
                } else if (j == 0) {
                    btns2[i][0] = new JButton(" " + i);
                } else {
                    btns2[i][1] = new JButton(" " + yearSecSubCode[i - 1]);
                    btns2[i][2] = new JButton(" " + yearSecSubName[i - 1]);
                    btns2[i][3] = new JButton(" " + yearSecFacName[i - 1]);
                }
            }
        }

        for(int l=0;l<serialno;l++){
            for(int k=0;k<4;k++){
                subPanel2.add(btns2[l][k]);
            }
        }
        subPanel2.setLayout(new GridLayout(serialno,4));

        subPanel2.setVisible(true);


        subPanel3.add(next4);
        subPanel3.setVisible(true);

        JLabel className=new JLabel("Time Table for IIYear Cse A :");
        subPanel4.add(className);



        TTMainframe.add(mainPanel);
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints cst2 = new GridBagConstraints();


        cst2.gridx = 0;
        cst2.gridy = 0;
        mainPanel.add(subPanel4,cst2);


        cst2.gridx = 0;
        cst2.gridy = 1;
        cst2.weighty=0.2;
        mainPanel.add(subPanel1,cst2);

        cst2.gridx = 0;
        cst2.gridy = 2;

        mainPanel.add(subPanel2,cst2);

        cst2.gridx = 0;
        cst2.gridy = 3;

        mainPanel.add(subPanel3,cst2);

        TTMainframe.setSize(1500,1000);


        TTMainframe.setVisible(true);
    }

    public void generatingTTSecPart(prof prof1,boolean IsLab){
        int i=0;
        if(IyrA.isSelected()){
            while(boolarrclasses.IyearASubCode[i] != null){
                i++;
            }
            boolarrclasses.IyearASubCode[i]=subCodeField.getText();
            boolarrclasses.IyearAFacName[i]=facultyName.getText();
            if(!IsLab){
                boolarrclasses.IyearASubName[i]=facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IyearASubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IyearASubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
        else if(IyrB.isSelected()){
            while(boolarrclasses.IyearBSubCode[i] != null){
                i++;
            }
            boolarrclasses.IyearBSubCode[i]=subCodeField.getText();
            boolarrclasses.IyearBFacName[i]=facultyName.getText();
            if(!IsLab){
                boolarrclasses.IyearBSubName[i]=facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IyearBSubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IyearBSubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
        else if(IIyrA.isSelected()){
            while(boolarrclasses.IIyearASubCode[i] != null){
                i++;
            }
            boolarrclasses.IIyearASubCode[i]=subCodeField.getText();
            boolarrclasses.IIyearAFacName[i]=facultyName.getText();
            if(!IsLab){
                boolarrclasses.IIyearASubName[i]=facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IIyearASubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IIyearASubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
        else if(IIyrB.isSelected()){
            while(boolarrclasses.IIyearBSubCode[i] != null){
                i++;
            }
            boolarrclasses.IIyearBSubCode[i]=subCodeField.getText();
            boolarrclasses.IIyearBFacName[i]=facultyName.getText();
            if(!IsLab){
                boolarrclasses.IIyearBSubName[i]=facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IIyearBSubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IIyearBSubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
        else if(IIIyrA.isSelected()){
            while(boolarrclasses.IIIyearASubCode[i] != null){
                i++;
            }
            boolarrclasses.IIIyearASubCode[i]=subCodeField.getText();
            boolarrclasses.IIIyearAFacName[i]=facultyName.getText();
            if(!IsLab){
                boolarrclasses.IIIyearASubName[i]=facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IIIyearASubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IIIyearASubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
        else if(IIIyrB.isSelected()){
            while(boolarrclasses.IIIyearBSubCode[i] != null){
                i++;
            }
            boolarrclasses.IIIyearBSubCode[i]=subCodeField.getText();
            boolarrclasses.IIIyearBFacName[i]=facultyName.getText();
            if(!IsLab){
                boolarrclasses.IIIyearBSubName[i]=facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IIIyearBSubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IIIyearBSubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
        else if(IVyrA.isSelected()){
            while(boolarrclasses.IVyearASubCode[i] != null){
                i++;
            }
            boolarrclasses.IVyearASubCode[i]=subCodeField.getText();
            boolarrclasses.IVyearAFacName[i]=facultyName.getText();
            if(!IsLab){
                boolarrclasses.IVyearASubName[i]=facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IVyearASubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IVyearASubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
        else {
            while (boolarrclasses.IVyearBSubCode[i] != null) {
                i++;
            }
            boolarrclasses.IVyearBSubCode[i] = subCodeField.getText();
            boolarrclasses.IVyearBFacName[i] = facultyName.getText();
            if (!IsLab) {
                boolarrclasses.IVyearBSubName[i] = facultyTheorySubField.getText();
            }
            else{
                if(prof1.labsub2==null){
                    boolarrclasses.IVyearBSubName[i]=prof1.labsub1+"Lab";
                }
                else{
                    boolarrclasses.IVyearBSubName[i]= prof1.labsub2+"Lab";
                }
            }
        }
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==next1){
            if(odd.isSelected()){
                IsOdd=true;
                getLabDetails(IsOdd);
            }else if(even.isSelected()){
                IsOdd=false;

                getLabDetails(IsOdd);
            }
        }
        else if(e.getSource()==next2){
            if(IsOdd){
                if(LabDetailTabRec<2){
                    LabDetailTabRec++;
                    passLabDetails();
                    if(LabDetailTabRec<2) {
                        getLabDetails(IsOdd);
                    }
                    else{
                        getTheoryDetails();
                    }
                }
            }
            else{
                if(LabDetailTabRec<10) {
                    LabDetailTabRec++;
                    passLabDetails();
                    if(LabDetailTabRec<10) {
                        getLabDetails(IsOdd);
                    }
                    else{
                        getTheoryDetails();
                    }
                }
            }
        }
        else if(e.getSource() == next3){
            passTheoryDetails();
            getTheoryDetails();
        }
        else if(e.getSource()==generateTT){
            passTheoryDetails();
            int serialno=0;
            while (boolarrclasses.IIyearASubCode[serialno] != null) {
                serialno++;
            }
            serialno++;
            displayTimeTable(boolarrclasses.IIyearA, boolarrclasses.IIyearASub,boolarrclasses.IIyearASubName,boolarrclasses.IIyearASubCode,boolarrclasses.IIyearAFacName,serialno);
        }
    }

    public static void main(String[] args) {

        new Main();

        /*for(int a=0;a<3;a++){

            if(a==0) {
                prof1[a] = new prof("Sarala", "DS", "DS", "DS     ", "DS     ", 6, 6);
                proffassigning(prof1[a]);
                LabAllotment(true, boolarrclasses, prof1[a]);

            }
            if(a==1){
                prof1[a] = new prof("Padma", "OOPS", "OOPS", "OOPS   ", "OOPS   ", 6, 6);
                proffassigning(prof1[a]);
                LabAllotment(true, boolarrclasses, prof1[a]);
                System.out.println("lab allot finished");


            }
            if(a==2){

                prof1[a] = new prof("raghini", "DPSD", "DPSD", "DPSD   ", "DPSD   ", 6, 6);
                proffassigning(prof1[a]);
                LabAllotment(true, boolarrclasses, prof1[a]);
                System.out.println("lab allot finished");


            }

        }


        for (int a = 0; a < 7; a++) {
            if(a==0) {
                boolarrclasses.temparrays(prof1[a], false);
                ttgenerationTheory(prof1[a], boolarrclasses);
                boolarrclasses.temparrays(prof1[a], true);
            }
            if(a==1){


                boolarrclasses.temparrays(prof1[a], false);
                ttgenerationTheory(prof1[a], boolarrclasses);
                boolarrclasses.temparrays(prof1[a], true);

            }
            if(a==2){

                boolarrclasses.temparrays(prof1[a], false);
                ttgenerationTheory(prof1[a], boolarrclasses);
                boolarrclasses.temparrays(prof1[a], true);

            }
            if(a==3){

                prof1[a] = new prof("kavitha", "NIL", "NIL", "CE     ", "CE     ", 6, 6);
                proffassigning(prof1[a]);

                boolarrclasses.temparrays(prof1[a], false);
                ttgenerationTheory(prof1[a], boolarrclasses);
                boolarrclasses.temparrays(prof1[a], true);
            }
            if(a==4){

                prof1[a] = new prof("pitch", "NIL", "NIL", "DM     ", "DM     ", 6, 6);
                proffassigning(prof1[a]);

                boolarrclasses.temparrays(prof1[a], false);
                ttgenerationTheory(prof1[a], boolarrclasses);
                boolarrclasses.temparrays(prof1[a], true);
            }
            if(a==5){

                prof1[a] = new prof("Sakthi", "NIL", "NIL", "Place  ", "Place  ", 1, 1);
                proffassigning(prof1[a]);

                boolarrclasses.temparrays(prof1[a], false);
                ttgenerationTheory(prof1[a], boolarrclasses);
                boolarrclasses.temparrays(prof1[a], true);



            }
            if(a==6){

                prof1[a] = new prof("Raja", "NIL", "NIL", "Eng    ", "Eng    ", 2, 2);
                proffassigning(prof1[a]);

                boolarrclasses.temparrays(prof1[a], false);
                ttgenerationTheory(prof1[a], boolarrclasses);
                boolarrclasses.temparrays(prof1[a], true);
            }



        }

            System.out.println("TimeTable of IIyearA: ");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    if (boolarrclasses.IIyearA[i][j]) {
                        System.out.print("      ");
                        System.out.print(boolarrclasses.IIyearASub[i][j]);
                    }
                    else{
                        System.out.print("     ");
                        System.out.print("NA   ");
                    }

                }
                System.out.println();
            }
            System.out.println("TimeTable of IIyearB: ");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    if (boolarrclasses.IIyearB[i][j]) {
                        System.out.print("      ");
                        System.out.print(boolarrclasses.IIyearBSub[i][j]);
                    }
                    else{
                        System.out.print("      ");
                        System.out.print("NA   ");
                    }
                }
                System.out.println();
            }*/

    }

    /*static void proffassigning(prof profob) {
        System.out.println("Choose the year and section assigned to the professor(One by one): ");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1 for IyearA, Enter 2 for IyearB,Enter 3 for IIyearA,Enter 4 for IIyearB,Enter 5 for IIIyearA,Enter 6 for IIIyearB,Enter 7 for IVyearA,Enter 8 for IVyearB: ");
        int choice1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 1 for IyearA, Enter 2 for IyearB,Enter 3 for IIyearA,Enter 4 for IIyearB,Enter 5 for IIIyearA,Enter 6 for IIIyearB,Enter 7 for IVyearA,Enter 8 for IVyearB: ");
        int choice2 = sc2.nextInt();
        if (choice1 == 1 || choice2 == 1)
            profob.yearsec[0][0] = true;
        if (choice1 == 2 || choice2 == 2)
            profob.yearsec[0][1] = true;
        if (choice1 == 3 || choice2 == 3)
            profob.yearsec[1][0] = true;
        if (choice1 == 4 || choice2 == 4)
            profob.yearsec[1][1] = true;
        if (choice1 == 5 || choice2 == 5)
            profob.yearsec[2][0] = true;
        if (choice1 == 6 || choice2 == 6)
            profob.yearsec[2][1] = true;
        if (choice1 == 7 || choice2 == 7)
            profob.yearsec[3][0] = true;
        if (choice1 == 8 || choice2 == 8)
            profob.yearsec[3][1] = true;

    }*/


    static void ttgenerationTheory(prof prof1, boolarrayclasses boolarrclasses) {

        Random random = new Random();
        int excludedayorder = random.nextInt(6);
        int excludedayorderfor2 = random.nextInt(6);
        if (excludedayorder == excludedayorderfor2) {
            if (excludedayorder == 0)
                excludedayorderfor2 = 3;
            else if (excludedayorder == 1)
                excludedayorderfor2 = 4;
            else if (excludedayorder == 2)
                excludedayorderfor2 = 5;
            else if (excludedayorder == 3)
                excludedayorderfor2 = 6;
            else if (excludedayorder == 4)
                excludedayorderfor2 = 0;
            else if (excludedayorder == 5)
                excludedayorderfor2 = 1;
            else if (excludedayorder == 6)
                excludedayorderfor2 = 2;
        }


        boolean twoclassatoneday1=false;
        int twoclassday1=0;
        if(prof1.numoftheoryclass1 >= 6) {
            int i = random.nextInt(6);

            int noofclasses = 0;

            boolean boolexcludedayorder=false;
            boolean visited=false;

            int n=0;
            while(!twoclassatoneday1) {
                for (int j = 0; j <=6; j++) {
                    if (prof1.proffor1[i][j] || prof1.proffor2[i][j]) {
                        noofclasses++;
                    }
                }
                if(noofclasses>=2){
                    if(!boolexcludedayorder) {
                        excludedayorder = i;
                        boolexcludedayorder = true;
                    }
                    else {
                        excludedayorderfor2 = i;
                        twoclassatoneday1 = true;
                    }
                }
                if(!visited) {
                    if (noofclasses <= 0) {
                        twoclassday1 = i;
                        visited=true;
                    }
                }
                if(i==5){
                    i=0;
                }
                else{
                    i++;
                }
                noofclasses=0;
                n++;
                if(n>=6)
                    break;
            }
            System.out.println("two dayorder allot finished");
        }

        boolean twoclassesalloted=false;
        int classalottedfor1=0;
        boolean marked[]=new boolean[6];
        for(int i=0;i< marked.length;i++)
            marked[i]=false;

        for (int i = 0; i < 6; i++) {

            if(classalottedfor1==prof1.numoftheoryclass1)
                break;

            if (i == excludedayorder)
                continue;




                int j = random.nextInt(3);
                if (j == 0) {
                    j = random.nextInt(2);
                } else if (j == 1) {
                    int min = 2;
                    int max = 4;
                    j = random.nextInt(max - min) + min;
                } else {
                    int min = 4;
                    int max = 7;
                    j = random.nextInt(max - min) + min;
                }
                int count=0;
                boolean classassigned = false;
                boolean breakouterloop=false;
            while (!classassigned) {
                System.out.println("inside class1");
                    if (j == 0) {
                        if (!prof1.proffor1[i][j] && !prof1.proffor1[i][j + 1] && !prof1.proffor2[i][j] && !prof1.proffor2[i][j + 1]) {
                            if (!boolarrclasses.temparr1[i][j]) {
                                boolarrclasses.temparr1[i][j] = true;
                                boolarrclasses.temparrsub1[i][j] = prof1.theorysub1;
                                prof1.proffor1[i][j] = true;
                                classassigned = true;
                                classalottedfor1++;

                                if(!twoclassesalloted) {
                                    if (twoclassatoneday1) {
                                        if (i == twoclassday1) {
                                            classassigned=false;
                                            twoclassesalloted=true;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                        j++;
                    } else if (j == 6) {
                        if (!prof1.proffor1[i][j] && !prof1.proffor1[i][j - 1] && !prof1.proffor2[i][j] && !prof1.proffor2[i][j - 1]) {
                            if (!boolarrclasses.temparr1[i][j]) {
                                boolarrclasses.temparr1[i][j] = true;
                                boolarrclasses.temparrsub1[i][j] = prof1.theorysub1;
                                prof1.proffor1[i][j] = true;
                                classassigned = true;
                                classalottedfor1++;

                                if(!twoclassesalloted) {
                                    if (twoclassatoneday1) {
                                        if (i == twoclassday1) {
                                           classassigned=false;
                                            twoclassesalloted=true;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                        j = 0;
                    } else {
                        if (!prof1.proffor1[i][j] && !prof1.proffor1[i][j + 1] && !prof1.proffor1[i][j - 1] && !prof1.proffor2[i][j] && !prof1.proffor2[i][j + 1] && !prof1.proffor2[i][j - 1]) {
                            if (!boolarrclasses.temparr1[i][j]) {
                                boolarrclasses.temparr1[i][j] = true;
                                boolarrclasses.temparrsub1[i][j] = prof1.theorysub1;
                                prof1.proffor1[i][j] = true;
                                classassigned = true;
                                classalottedfor1++;

                                if(!twoclassesalloted) {
                                    if (twoclassatoneday1) {
                                        if (i == twoclassday1) {
                                            classassigned=false;
                                            twoclassesalloted=true;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                        j++;
                    }
                    count++;
                    if(count>=7){
                        count=0;
                        if(i<excludedayorder) {
                            excludedayorder = i;
                            breakouterloop=true;
                            break;

                        }
                        else{
                            System.out.println("inside count ");
                            int temp=excludedayorder;
                            excludedayorder=i;
                            i= random.nextInt(6);
                            while(i!=excludedayorder)
                                i= random.nextInt(6);
                            breakouterloop=true;
                            break;
                        }

                    }
                }

            if(i==5 && classalottedfor1 < prof1.numoftheoryclass1){
                i= random.nextInt(6);
            }

            if(classalottedfor1 == prof1.numoftheoryclass1){
                break;
            }
            if(breakouterloop){
                breakouterloop=false;
                continue;
            }



            }

        if(classalottedfor1< prof1.numoftheoryclass1){
            while(classalottedfor1<prof1.numoftheoryclass1){
                for(int i=0;i<6;i++){
                    for(int j=0;j<7;j++){
                        if(!boolarrclasses.temparr1[i][j] && !prof1.proffor1[i][j] && !prof1.proffor2[i][j] ){
                            if(classalottedfor1< prof1.numoftheoryclass1){
                                boolarrclasses.temparr1[i][j] = true;
                                boolarrclasses.temparrsub1[i][j] = prof1.theorysub1;
                                prof1.proffor1[i][j] = true;
                                classalottedfor1++;
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
            }
        }





        boolean twoclassatoneday2=false;
        int twoclassday2=0;
        if(prof1.numoftheoryclass2 >= 6) {
            int i = random.nextInt(6);

            int noofclasses2 = 0;


            int n=0;

            while(!twoclassatoneday2) {
                for (int j = 0; j < 6; j++) {
                    if (prof1.proffor1[i][j] || prof1.proffor2[i][j]) {
                        noofclasses2++;
                    }
                }
                if (noofclasses2 <= 1) {
                    twoclassatoneday2 = true;
                    twoclassday2=i;
                    break;
                }
                if(i==5){
                    i=0;
                }
                i++;
                noofclasses2=0;
                n++;
                if(n>=6)
                    break;
            }
            System.out.println("two dayorder allot finished");
        }

        boolean twoclassesalloted2=false;
        int classalottedfor2=0;
        boolean marked2[]=new boolean[6];
        for(int i=0;i< marked2.length;i++)
            marked2[i]=false;

        for (int i = 0; i < 6; i++) {

            if(classalottedfor2==prof1.numoftheoryclass2)
                break;

            if (i == excludedayorderfor2)
                continue;




            int j = random.nextInt(3);
            if (j == 0) {
                j = random.nextInt(2);
            } else if (j == 1) {
                int min = 2;
                int max = 4;
                j = random.nextInt(max - min) + min;
            } else {
                int min = 4;
                int max = 7;
                j = random.nextInt(max - min) + min;
            }

            int count2=0;
            boolean classassigned = false;
            boolean breakouterloop=false;
            while (!classassigned) {
                System.out.println("inside class2");

                if (j == 0) {
                    if (!prof1.proffor2[i][j] && !prof1.proffor2[i][j + 1] && !prof1.proffor1[i][j] && !prof1.proffor1[i][j + 1]) {
                        if (!boolarrclasses.temparr2[i][j]) {
                            boolarrclasses.temparr2[i][j] = true;
                            boolarrclasses.temparrsub2[i][j]=prof1.theorysub2;
                            prof1.proffor2[i][j] = true;
                            classassigned = true;
                            classalottedfor2++;

                            if(!twoclassesalloted2) {
                                if (twoclassatoneday2) {
                                    if (i == twoclassday2) {
                                        classassigned=false;
                                        twoclassesalloted2=true;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    j++;
                } else if (j == 6) {
                    if (!prof1.proffor2[i][j] && !prof1.proffor2[i][j - 1] && !prof1.proffor1[i][j] && !prof1.proffor1[i][j - 1]) {
                        if (!boolarrclasses.temparr2[i][j]) {
                            boolarrclasses.temparr2[i][j] = true;
                            boolarrclasses.temparrsub2[i][j]=prof1.theorysub2;
                            prof1.proffor2[i][j] = true;
                            classassigned = true;
                            classalottedfor2++;

                            if(!twoclassesalloted2) {
                                if (twoclassatoneday2) {
                                    if (i == twoclassday2) {
                                        classassigned=false;
                                        twoclassesalloted2=true;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    j = 0;
                } else {
                    if (!prof1.proffor2[i][j] && !prof1.proffor2[i][j + 1] && !prof1.proffor2[i][j - 1] && !prof1.proffor1[i][j] && !prof1.proffor1[i][j + 1] && !prof1.proffor1[i][j - 1]) {
                        if (!boolarrclasses.temparr2[i][j]) {
                            boolarrclasses.temparr2[i][j] = true;
                            boolarrclasses.temparrsub2[i][j]=prof1.theorysub2;
                            prof1.proffor2[i][j] = true;
                            classassigned = true;
                            classalottedfor2++;

                            if(!twoclassesalloted2) {
                                if (twoclassatoneday2) {
                                    if (i == twoclassday2) {
                                        classassigned=false;
                                        twoclassesalloted2=true;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    j++;
                }
                count2++;
                if(count2>=7){
                    count2=0;
                    if(i<excludedayorderfor2) {
                        excludedayorderfor2 = i;
                        breakouterloop=true;
                        break;
                    }
                    else{
                        System.out.println("inside count "+ excludedayorderfor2 +"i: " +i);
                        int temp=excludedayorderfor2;
                        excludedayorderfor2=i;
                        i= random.nextInt(6);
                        while(i!=excludedayorderfor2)
                            i= random.nextInt(6);
                        breakouterloop=true;
                        break;
                    }
                }
            }


            if(i==5 && classalottedfor2 < prof1.numoftheoryclass2){
                i= random.nextInt(6);
            }

            if(classalottedfor2 == prof1.numoftheoryclass2){
                break;
            }
            if(breakouterloop){
                breakouterloop=false;
                continue;
            }

        }


        if(classalottedfor2< prof1.numoftheoryclass2){
            while(classalottedfor2<prof1.numoftheoryclass2){
                for(int i=0;i<6;i++){
                    for(int j=0;j<7;j++){
                        if(!boolarrclasses.temparr2[i][j] && !prof1.proffor1[i][j] && !prof1.proffor2[i][j] ){
                            if(classalottedfor2< prof1.numoftheoryclass2){
                                boolarrclasses.temparr2[i][j] = true;
                                boolarrclasses.temparrsub2[i][j] = prof1.theorysub2;
                                prof1.proffor1[i][j] = true;
                                classalottedfor2++;
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
            }
        }


    }

    static void LabAllotment(boolean IsOddSemester, boolarrayclasses booleanarrays, prof prof1) {
        boolean temp1assigned=false;
        if (IsOddSemester) {
            if((prof1.labsub1 == "Python" || prof1.labsub2 == "Python") && prof1.yearsec[0][0]== true){
                for (int i = 2; i < 3; i++) {                               // python lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IyearA[i][j] = true;
                        booleanarrays.IyearASub[i][j] = "PythonLab";
                        prof1.proffor1[i][j]=true;
                        booleanarrays.Lab1[i][j]=true;
                        temp1assigned=true;
                    }
                }
            }

            if((prof1.labsub1 == "Python" || prof1.labsub2 == "Python") && prof1.yearsec[0][1]== true){
                for (int i = 5; i < 6; i++) {                               // python lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IyearB[i][j] = true;
                        booleanarrays.IyearBSub[i][j] = "PythonLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;

                        booleanarrays.Lab1[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "DS" || prof1.labsub2 == "DS" ) && prof1.yearsec[1][0]==true) {
                for (int i = 3; i < 4; i++) {                               // data structure lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IIyearA[i][j] = true;
                        booleanarrays.IIyearASub[i][j] = "DSLab  ";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab1[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "OOPS" || prof1.labsub2 == "OOPS") && prof1.yearsec[1][0]==true) {
                for (int i = 1; i < 2; i++) {                               // oops lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIyearA[i][j] = true;
                        booleanarrays.IIyearASub[i][j] = "OOPSLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "DS" || prof1.labsub2 == "DS") && prof1.yearsec[1][1]==true) {
                for (int i = 0; i < 1; i++) {                               //ds lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIyearB[i][j] = true;
                        booleanarrays.IIyearBSub[i][j] = "DSLab  ";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab1[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "OOPS" || prof1.labsub2 == "OOPS")&& prof1.yearsec[1][1]==true) {
                for (int i = 2; i < 3; i++) {                               //oops lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IIyearB[i][j] = true;
                        booleanarrays.IIyearBSub[i][j] = "OOPSLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "OOAD" || prof1.labsub2 == "OOAD") && prof1.yearsec[2][0]==true) {
                for (int i = 4; i < 5; i++) {                               //ooad lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IIIyearA[i][j] = true;
                        booleanarrays.IIIyearASub[i][j] = "OOADLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "OOAD" || prof1.labsub2 == "OOAD") && prof1.yearsec[2][1]==true) {
                for (int i = 3; i < 4; i++) {                               //ooadlab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIIyearB[i][j] = true;
                        booleanarrays.IIIyearBSub[i][j] = "OOADLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "NETWORK" || prof1.labsub2 == "NETWORK") && prof1.yearsec[2][0]==true) {
                for (int i = 0; i < 1; i++) {                               //NETWORK lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIIyearA[i][j] = true;
                        booleanarrays.IIIyearASub[i][j] = "NETWORKLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "NETWORK" || prof1.labsub2 == "NETWORK")&& prof1.yearsec[2][1]==true) {
                for (int i = 1; i < 2; i++) {                               //NETWORK lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIIyearB[i][j] = true;
                        booleanarrays.IIIyearBSub[i][j] = "NETWORKLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "SECLa" || prof1.labsub2 == "SECLa") && prof1.yearsec[3][0]==true) {
                for (int i = 5; i < 6; i++) {                               //sec la lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IVyearA[i][j] = true;
                        booleanarrays.IVyearASub[i][j] = "SECLaLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "SECLa" || prof1.labsub2 == "SECLa") && prof1.yearsec[3][1]==true) {
                for (int i = 2; i < 3; i++) {                               //sec la lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IVyearB[i][j] = true;
                        booleanarrays.IVyearBSub[i][j] = "SECLaLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "CLDCOMP" || prof1.labsub2 == "CLDCOMP") && prof1.yearsec[3][0]==true) {
                for (int i = 3; i < 4; i++) {                               //CLOUD COMPUTING lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IVyearA[i][j] = true;
                        booleanarrays.IVyearASub[i][j] = "CLDCOMPLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "CLDCOMP" || prof1.labsub2 == "CLDCOMP") && prof1.yearsec[3][1]==true) {               //DPSDLab
                for (int i = 4; i < 5; i++) {
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IVyearB[i][j] = true;
                        booleanarrays.IVyearBSub[i][j] = "CLDCOMPLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "DPSD" || prof1.labsub2 == "DPSD") && prof1.yearsec[1][0]==true) {                     //DPSDLab
                for (int i = 5; i < 6; i++) {                               //CLOUD COMPUTING lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIyearA[i][j] = true;
                        booleanarrays.IIyearASub[i][j] = "DPSDLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                    }
                }
            }

            if((prof1.labsub1 == "DPSD" || prof1.labsub2 == "DPSD") && prof1.yearsec[1][0]==true) {
                for (int i = 4; i < 5; i++) {                               //CLOUD COMPUTING lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIyearB[i][j] = true;
                        booleanarrays.IIyearBSub[i][j] = "DPSDLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                    }
                }
            }

        }
        else {

            if((prof1.labsub1 == "C" || prof1.labsub2 == "C") && prof1.yearsec[0][0]== true){
                for (int i = 3; i < 4; i++) {                               // C lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IyearA[i][j] = true;
                        booleanarrays.IyearASub[i][j] = "CLab";
                        prof1.proffor1[i][j]=true;
                        booleanarrays.Lab1[i][j]=true;
                        temp1assigned=true;
                    }
                }
            }

            if((prof1.labsub1 == "C" || prof1.labsub2 == "C") && prof1.yearsec[0][1]== true){
                for (int i = 0; i < 1; i++) {                               // C lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IyearB[i][j] = true;
                        booleanarrays.IyearBSub[i][j] = "CLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab1[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "OS" || prof1.labsub2 == "OS") && prof1.yearsec[1][0]== true){
                for (int i = 2; i < 3; i++) {                               // OS lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IIyearA[i][j] = true;
                        booleanarrays.IIyearASub[i][j] = "OSLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab1[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "OS" || prof1.labsub2 == "OS") && prof1.yearsec[1][1]== true){
                for (int i = 5; i < 6; i++) {                               // OS lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIyearB[i][j] = true;
                        booleanarrays.IIyearBSub[i][j] = "OSLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab1[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "DBMS" || prof1.labsub2 == "DBMS") && prof1.yearsec[1][0]== true){
                for (int i = 0; i < 1; i++) {                               // DBMS lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIyearA[i][j] = true;
                        booleanarrays.IIyearASub[i][j] = "DBMSLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "DBMS" || prof1.labsub2 == "DBMS") && prof1.yearsec[1][1]== true){
                for (int i = 3; i < 4; i++) {                               // DBMS lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IIyearB[i][j] = true;
                        booleanarrays.IIyearBSub[i][j] = "DBMSLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "MOBAPPDEV" || prof1.labsub2 == "MOBAPPDEV") && prof1.yearsec[2][0]== true){
                for (int i = 5; i < 6; i++) {                                // MOBAPPDEV lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIIyearA[i][j] = true;
                        booleanarrays.IIIyearASub[i][j] = "MOBAPPDEVLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "MOBAPPDEV" || prof1.labsub2 == "MOBAPPDEV") && prof1.yearsec[2][1]== true){
                for (int i = 2; i < 3; i++) {                                // MOBAPPDEV lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IIIyearB[i][j] = true;
                        booleanarrays.IIIyearBSub[i][j] = "MOBAPPDEVLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab2[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "INTPROG" || prof1.labsub2 == "INTPROG") && prof1.yearsec[2][0]== true){
                for (int i = 3; i < 4; i++) {                                // INTPROG lab
                    for (int j = 1; j < 4; j++) {
                        booleanarrays.IIIyearA[i][j] = true;
                        booleanarrays.IIIyearASub[i][j] = "INTPROGLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;

                    }
                }
            }

            if((prof1.labsub1 == "INTPROG" || prof1.labsub2 == "INTPROG") && prof1.yearsec[2][0]== true){
                for (int i = 0; i < 1; i++) {                                // INTPROG lab
                    for (int j = 4; j < 7; j++) {
                        booleanarrays.IIIyearB[i][j] = true;
                        booleanarrays.IIIyearBSub[i][j] = "INTPROGLab";
                        if(!temp1assigned) {
                            prof1.proffor1[i][j] = true;
                            temp1assigned = true;
                        }
                        else
                            prof1.proffor2[i][j]=true;
                        booleanarrays.Lab3[i][j]=true;

                    }
                }
            }

        }
    }

}

class boolarrayclasses{
    boolean[][] IyearA=new boolean[6][7];
    boolean[][] IyearB=new boolean[6][7];
    boolean[][] IIyearA=new boolean[6][7];
    boolean[][] IIyearB=new boolean[6][7];
    boolean[][] IIIyearA=new boolean[6][7];
    boolean[][] IIIyearB=new boolean[6][7];
    boolean[][] IVyearA=new boolean[6][7];
    boolean[][] IVyearB=new boolean[6][7];

    boolean[][] Lab1=new boolean[6][7];
    boolean[][] Lab2=new boolean[6][7];
    boolean[][] Lab3=new boolean[6][7];


    String[][] IyearASub=new String[6][7];
    String[][] IyearBSub=new String[6][7];
    String[][] IIyearASub=new String[6][7];
    String[][] IIyearBSub=new String[6][7];
    String[][] IIIyearASub=new String[6][7];
    String[][] IIIyearBSub=new String[6][7];
    String[][] IVyearASub=new String[6][7];
    String[][] IVyearBSub=new String[6][7];

    boolean[][] temparr1=new boolean[6][7];
    boolean[][] temparr2=new boolean[6][7];

    String[][] temparrsub1=new String[6][7];
    String[][] temparrsub2=new String[6][7];

    String[] IyearASubCode=new String[20];
    String[] IyearBSubCode=new String[20];
    String[] IIyearASubCode=new String[20];
    String[] IIyearBSubCode=new String[20];
    String[] IIIyearASubCode=new String[20];
    String[] IIIyearBSubCode=new String[20];
    String[] IVyearASubCode=new String[20];
    String[] IVyearBSubCode=new String[20];

    String[] IyearASubName=new String[20];
    String[] IyearBSubName=new String[20];
    String[] IIyearASubName=new String[20];
    String[] IIyearBSubName=new String[20];
    String[] IIIyearASubName=new String[20];
    String[] IIIyearBSubName=new String[20];
    String[] IVyearASubName=new String[20];
    String[] IVyearBSubName=new String[20];

    String[] IyearAFacName=new String[20];
    String[] IyearBFacName=new String[20];
    String[] IIyearAFacName=new String[20];
    String[] IIyearBFacName=new String[20];
    String[] IIIyearAFacName=new String[20];
    String[] IIIyearBFacName=new String[20];
    String[] IVyearAFacName=new String[20];
    String[] IVyearBFacName=new String[20];

    void temparrays(prof profob,boolean reasign){

        boolean temp1assigned=false;
        boolean temp1reassigned=false;

        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                if(profob.yearsec[i][j]){
                    if(i==0 && j==0){
                        if(!reasign) {
                            temparr1 = Arrays.copyOf(IyearA,IyearA.length);
                            temparrsub1=Arrays.copyOf(IyearASub,IyearASub.length);
                            temp1assigned = true;
                        }
                        else{
                            IyearA=Arrays.copyOf(temparr1,temparr1.length);
                            IyearASub=Arrays.copyOf(temparrsub1,temparrsub1.length);
                            temp1reassigned=true;
                        }
                    }
                    if(i==0 && j==1){
                        if(!reasign) {
                            if (!temp1assigned) {
                                temparr1 = Arrays.copyOf(IyearB, IyearB.length);
                                temparrsub1=Arrays.copyOf(IyearASub,IyearASub.length);
                                temp1assigned = true;
                            } else {
                                temparr2 = Arrays.copyOf(IyearB, IyearB.length);
                                temparrsub2=Arrays.copyOf(IyearBSub,IyearBSub.length);
                            }
                        }
                        else{
                            if(!temp1reassigned) {
                                IyearB = Arrays.copyOf(temparr1, temparr1.length);
                                IyearBSub=Arrays.copyOf(temparrsub1,temparrsub1.length);
                                temp1reassigned = true;
                            }
                            else{
                                IyearB= Arrays.copyOf(temparr2,temparr2.length);
                                IyearBSub=Arrays.copyOf(temparrsub2,temparrsub2.length);
                            }
                        }
                    }
                    if(i==1 && j==0){
                        if(!reasign) {
                            if (!temp1assigned) {
                                temparr1 = Arrays.copyOf(IIyearA, IIyearA.length);
                                temparrsub1=Arrays.copyOf(IIyearASub,IIyearASub.length);
                                temp1assigned = true;
                            } else {
                                temparr2 = Arrays.copyOf(IIyearA, IIyearA.length);
                                temparrsub2=Arrays.copyOf(IIyearASub,IIyearASub.length);
                            }
                        }
                        else{
                            if(!temp1reassigned) {
                                IIyearA = Arrays.copyOf(temparr1, temparr1.length);
                                IIyearASub=Arrays.copyOf(temparrsub1,temparrsub1.length);
                                temp1reassigned = true;
                            }
                            else{
                                IIyearA= Arrays.copyOf(temparr2,temparr2.length);
                                IIyearASub=Arrays.copyOf(temparrsub2,temparrsub2.length);
                            }
                        }
                    }
                    if(i==1 && j==1){
                        if(!reasign) {
                            if (!temp1assigned) {
                                temparr1 = Arrays.copyOf(IIyearB, IIyearB.length);
                                temparrsub1=Arrays.copyOf(IIyearBSub,IIyearBSub.length);
                                temp1assigned = true;
                            } else {
                                temparr2 = Arrays.copyOf(IIyearB,IIyearB.length);
                                temparrsub2=Arrays.copyOf(IIyearBSub,IIyearBSub.length);
                            }
                        }
                        else{
                            if(!temp1reassigned) {
                                IIyearB = Arrays.copyOf(temparr1, temparr1.length);
                                IIyearBSub=Arrays.copyOf(temparrsub1,temparrsub1.length);
                                temp1reassigned = true;
                            }
                            else{
                                IIyearB= Arrays.copyOf(temparr2,temparr2.length);
                                IIyearBSub=Arrays.copyOf(temparrsub2,temparrsub2.length);
                            }
                        }
                    }
                    if(i==2 && j==0){
                        if(!reasign) {
                            if (!temp1assigned) {
                                temparr1 = Arrays.copyOf(IIIyearA, IIIyearA.length);
                                temparrsub1=Arrays.copyOf(IIIyearASub,IIIyearASub.length);
                                temp1assigned = true;
                            } else {
                                temparr2 = Arrays.copyOf(IIIyearA, IIIyearA.length);
                                temparrsub2=Arrays.copyOf(IIIyearASub,IIIyearASub.length);
                            }
                        }
                        else{
                            if(!temp1reassigned) {
                                IIIyearA = Arrays.copyOf(temparr1, temparr1.length);
                                IIIyearASub=Arrays.copyOf(temparrsub1,temparrsub1.length);
                                temp1reassigned = true;
                            }
                            else{
                                IIIyearA= Arrays.copyOf(temparr2,temparr2.length);
                                IIIyearASub=Arrays.copyOf(temparrsub2,temparrsub2.length);
                            }
                        }
                    }
                    if(i==2 && j==1) {
                        if (!reasign) {
                            if (!temp1assigned) {
                                temparr1 = Arrays.copyOf(IIIyearB, IIIyearB.length);
                                temparrsub1=Arrays.copyOf(IIIyearBSub,IIIyearBSub.length);
                                temp1assigned = true;
                            } else {
                                temparr2 = Arrays.copyOf(IIIyearB,IIIyearB.length);
                                temparrsub2 =Arrays.copyOf(IIIyearBSub,IIIyearBSub.length);
                            }
                        }
                        else{
                            if(!temp1reassigned) {
                                IIIyearB = Arrays.copyOf(temparr1, temparr1.length);
                                IIIyearBSub=Arrays.copyOf(temparrsub1,temparrsub1.length);
                                temp1reassigned = true;
                            }
                            else{
                                IIIyearB= Arrays.copyOf(temparr2,temparr2.length);
                                IIIyearBSub=Arrays.copyOf(temparrsub2,temparrsub1.length);
                            }
                        }
                    }
                    if(i==3 && j==0) {
                        if (!reasign) {
                            if (!temp1assigned) {
                                temparr1 = Arrays.copyOf(IVyearA, IVyearA.length);
                                temparrsub1=Arrays.copyOf(IVyearASub,IVyearASub.length);
                                temp1assigned = true;
                            } else {
                                temparr2 = Arrays.copyOf(IVyearA, IVyearA.length);
                                temparrsub2=Arrays.copyOf(IVyearASub,IVyearASub.length);
                            }
                        }
                        else{
                            if(!temp1reassigned) {
                                IVyearA = Arrays.copyOf(temparr1, temparr1.length);
                                IVyearASub=Arrays.copyOf(temparrsub1,temparrsub1.length);
                                temp1reassigned = true;
                            }
                            else{
                                IVyearA= Arrays.copyOf(temparr2,temparr2.length);
                                IVyearASub=Arrays.copyOf(temparrsub2,temparrsub2.length);
                            }
                        }
                    }
                    if(i==3 && j==1) {
                        if (!reasign) {
                            temparr2 = Arrays.copyOf(IVyearB,IVyearB.length);
                            temparrsub2=Arrays.copyOf(IVyearBSub,IVyearBSub.length);
                        }
                        else{
                            IVyearB=Arrays.copyOf(temparr2,temparr2.length);
                            IVyearBSub=Arrays.copyOf(temparrsub2,temparrsub2.length);
                        }
                    }
                }
            }
        }
        temp1assigned=false;
        temp1reassigned=false;
    }

}

class prof{
    String name;
    boolean[][] yearsec=new boolean[4][2];
    boolean[][] proffor1 = new boolean[6][7];
    boolean[][] proffor2 = new boolean[6][7];
    String labsub1;
    String labsub2;
    String theorysub1;
    String theorysub2;
    int numoftheoryclass1=-1;
    int numoftheoryclass2;

    prof(String name){
        this.name=name;
    }

    prof(String name,String labsub1,String labsub2,String theorysub1,String theorysub2,int numoftheoryclass1,int numoftheoryclass2) {
       this.name=name;
       this.labsub1 = labsub1;
       this.labsub2=labsub2;
       this.theorysub1=theorysub1;
       this.theorysub2=theorysub2;
       this.numoftheoryclass1=numoftheoryclass1;
       this.numoftheoryclass2=numoftheoryclass2;
    }



}


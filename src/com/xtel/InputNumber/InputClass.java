/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtel.InputNumber;

import java.io.File;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author Administrator
 */
public class InputClass {
    Scanner sc;
    static Logger logger = LogManager.getLogger(InputClass.class);
    public InputClass() {
        sc = new Scanner(System.in);
        File fileXML = new File("./config/log4j.xml");
        DOMConfigurator.configureAndWatch(fileXML.getPath());
    }
    
    public double getNumber(){
        int number;
         String input = null;
        while (true) {            
            try {
                input= sc.nextLine();
                number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException e) {
               logger.error(e);
            }
        }
    }
}

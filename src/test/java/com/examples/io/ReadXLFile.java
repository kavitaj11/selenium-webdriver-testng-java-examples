package com.examples.io;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.xpath.SourceTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by janesh on 7/14/2015.
 */
public class ReadXLFile {


    public static void main(String[] args) {

        String fileName= "E:\\PTL\\scienceLand\\PIMS\\reports\\23May2015\\PIMS-OpenBugs-and-DSI-2015-05-23.xls";

        //Create a object file
        File file = new File(fileName);


        try {
            FileInputStream fileInputStream  = new FileInputStream(file);
            Workbook workbook = new HSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet("Sheet1");
            System.out.println("Get last number " + sheet.getLastRowNum());
            System.out.println("Get first number " + sheet.getFirstRowNum());




            System.out.println("DSI"  + sheet.getRow(sheet.getLastRowNum()).getCell(1).getNumericCellValue());

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }


    }
}





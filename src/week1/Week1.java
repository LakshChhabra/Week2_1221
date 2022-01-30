/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author sivagamasrinivasan
 */
public class Week1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     StudentDetail[] list = new StudentDetail[3];//array of object
    StudentDetail s1 = new StudentDetail();
    s1.setName("peter");
    s1.setMarks(20);
  
    StudentDetail s2 = new StudentDetail();
    s2.setName("peterjohn");
    s2.setMarks(21);
    StudentDetail s3 = new StudentDetail();
    s3.setName("siva");
    s3.setMarks(23);
    list[0]=s1; //assigned object to the array
    list[1]=s2;
    list[2]=s3;
    
    System.out.println(list[0].getName()+" " +list[0].getMarks()+" "+ list[1].getName()+" "+ list[1].getMarks());
    }
    
}

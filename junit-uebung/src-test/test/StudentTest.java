package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import daten.Student;


public class StudentTest {

       
        @Before
        public void setUp() throws Exception {
        }

     
        @After
        public void tearDown() throws Exception {
        }

     
        @Test
        public void testCompareTo() {
        		
                Student s11 = new Student("Max1","Muster",true,new Date(1996,5,3));
                Student s21 = new Student("Max2","Muster",true,new Date(1996,5,5));
                Student s31 = new Student("Jenny","Muster",true,new Date(1996,5,5));
                Student s41 = new Student("Michael","Jayckson",true,new Date(1996,5,5));
                Student s12 = new Student("Max1","Muster",true,new Date(1996,5,3));
                Student s22 = new Student("Max2","Muster",true,new Date(1996,5,5));
                /**
                 * Testen ob Gleichheit erkannt wird
                 */
                if(s11.compareTo(s12) != 0){
                        fail("Müsste 0 sein!");
                }
                
                if(s21.compareTo(s22) != 0){
                        fail("Müsste 0 sein!");
                }
                
               
                
                /**
                 * testen ob ungleichheit richtig erkannt wird
                 */
                if(s11.compareTo(s21)>0){
                        fail("Sollte kleiner 0 sein");
                }
                
                if(s11.compareTo(s21)==0){
                        fail("Sollte kleiner 0 sein");
                }
                
               
                
                if(s31.compareTo(s41)<0){
                        fail("Sollte größer 0 sein");
                }
                
                if(s31.compareTo(s41)==0){
                        fail("Sollte größer 0 sein");
                }
        }

}
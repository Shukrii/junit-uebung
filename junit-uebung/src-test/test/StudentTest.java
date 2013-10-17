package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import daten.Student;


public class StudentTest {

        /**
         * @throws java.lang.Exception
         */
        @Before
        public void setUp() throws Exception {
        }

        /**
         * @throws java.lang.Exception
         */
        @After
        public void tearDown() throws Exception {
        }

        /**
         * Test method for {@link daten.Student#compareTo(daten.Student)}.
         */
        @Test
        public void testCompareTo() {
        		@SuppressWarnings("deprecation")
				Student s111= new Student("Johny","English",true,new Date(1990,4,5));
                Student s11 = new Student("Max1","Muster",true,new Date(1996,5,3));
                Student s21 = new Student("Max2","Muster",true,new Date(1996,5,5));
                Student s31 = new Student("Max3","Muster",true,new Date(1996,5,5));
                Student s41 = new Student("Max4","Muster",true,new Date(1996,5,5));
                Student s12 = new Student("Max","Muster",true,new Date(1996,5,3));
                Student s22 = new Student("Max","Muster",true,new Date(1996,5,5));
                Student s32 = new Student("Maxi","Muster",true,new Date(1996,5,5));
                Student s42 = new Student("Max9","Musterman",true,new Date(1996,5,5));
                
                /**
                 * Testen ob Gleichheit erkannt wird
                 */
                if(s11.compareTo(s12) != 0){
                        fail("Müsste 0 sein!");
                }
                
                if(s21.compareTo(s22) != 0){
                        fail("Müsste 0 sein!");
                }
                
                if(s31.compareTo(s32) != 0){
                        fail("Müsste 0 sein!");
                }
                
                if(s41.compareTo(s42) != 0){
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
                
                if(s21.compareTo(s31)<0){
                        fail("Sollte größer 0 sein");
                }
                
                if(s21.compareTo(s31)==0){
                        fail("Sollte größer 0 sein");
                }
                
                if(s31.compareTo(s41)<0){
                        fail("Sollte größer 0 sein");
                }
                
                if(s31.compareTo(s41)==0){
                        fail("Sollte größer 0 sein");
                }
        }

}
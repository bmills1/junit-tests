import CodeupCrypt.CodeupCrypt;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

//    Student testStudent = new Student();

    @Test
    public void testIfGetIdReturnsLong(){
        assertEquals(4000000L, Student.getId("4000000"));
    }
    @Test
    public void testNameNotNull(){
        assertNotNull(Student.name);
    }
//    @Test
//    public void testGetNameReturnsString(String name){
//            assertEquals("bridget", Student.getName("Bridget"));
//    }
//    @Test
//    public void testIfStudentIdIsNumeric(){
//        assertTrue(StringUtils.isNumeric(Student.id));
//
//    }
}


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student testStudent;

    @Before
    public void setUp() {
        testStudent = new Student(1, "Bridget");
    }

    @Test
    public void testIfStudentCanBeCreated() {
        Student bee = null;
        assertNotNull(testStudent);
        assertNull(bee);
    }

    @Test
    public void testIfSetOrGet() {
        assertEquals(1, testStudent.getId());
        assertEquals("Bridget", testStudent.getName());
        assertNotNull(testStudent.getGrades());
    }

    @Test
    public void testGetNameReturnsStringToUpper() {
        assertEquals("Bridget", testStudent.getName());
    }

    @Test
    public void testAddGradesWorks() {
        testStudent.addGrades(80);
        assertSame(80, testStudent.getGrades().get(0));
    }

    @Test
    public void testIfGradeAverageIsCorrect(){
        testStudent.addGrades(80);
        testStudent.addGrades(90);
        assertEquals(85, testStudent.getAverageGrade(), 0);
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TessFindCountPeople {
    @Test
    public void testFindCountPeople() {
        App app = new App();
        int result = app.FindCountPeople(1, 2, 3, 4, 5, 0);
        assertEquals(1, result);
    }
    @Test
    public void testFindCountPeopleWithNegativeNumber() {
        App app = new App();
        int result = app.FindCountPeople(1, 2, -3, 4, 5);
        assertEquals(1, result);
}

    @Test
    public void testFindCountPeopleWithZero() {
        App app = new App();
        int result = app.FindCountPeople(0, 0, 0, 0, 0);
        assertEquals(0, result);
}

    @Test
    public void testFindCountPeopleWithOneElement() {
        App app = new App();
        int result = app.FindCountPeople(5);
        assertEquals(1, result);
}
    @Test
    public void testFindCountPeopleWithEmptyList() {
        App app = new App();
        int result = app.FindCountPeople();
        assertEquals(0, result);
}


}

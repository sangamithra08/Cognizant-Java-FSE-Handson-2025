import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Myservicetest {

    private Myservice service;

    // Setup method - runs before each test
    @BeforeEach
    public void setUp() {
        service = new Myservice();
        System.out.println("🛠️  Setting up test environment...");
    }

    // Teardown method - runs after each test
    @AfterEach
    public void tearDown() {
        System.out.println("🧹 Cleaning up after test...");
    }

    // Test 1: Addition
    @Test
    public void testAddition() {
        // Arrange
        int a = 4, b = 6;

        // Act
        int result = service.add(a, b);

        // Assert
        assertEquals(10, result, "Addition should be 10");
    }

    // Test 2: Subtraction
    @Test
    public void testSubtraction() {
        // Arrange
        int a = 9, b = 3;

        // Act
        int result = service.subtract(a, b);

        // Assert
        assertEquals(6, result, "Subtraction should be 6");
    }
}

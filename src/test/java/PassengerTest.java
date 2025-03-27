import ie.atu.week9.Passenger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    static Passenger passenger;

    @BeforeAll
    static void setup() {
        passenger = new Passenger("Mr", "Meike", "e Meike");
    }

    @Test
    void ConstructorSuccess() {
        assertEquals("Mr", passenger.getTitle());
        assertEquals("Meike", passenger.getFirstName());
        assertEquals("e Meike", passenger.getLastName());
    }
}

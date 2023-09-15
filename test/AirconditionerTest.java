import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirconditionerTest {
    @Test
    public void testThatAirConditionerCanBeOn(){
        AirConditioner myAc = new AirConditioner();
        myAc.turnOn();
        assertEquals(true,myAc.on());
    }
    @Test
    public void testThatAirConditionerCanBeOffWhenOn(){
        AirConditioner offAc = new AirConditioner();
        offAc.turnOn();
        offAc.turnOn();
        assertEquals(false,offAc.on());
    }


}

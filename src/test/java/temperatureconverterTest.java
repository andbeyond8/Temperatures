import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class temperatureconverterTest
{
    private temperatureconverter temp = new temperatureconverter();

    @Test
    void celsiustofahrenheit()
    {
        assertEquals(0.00, temp.celsiustofahrenheit(65.0));
    }

    @Test
    void fahrenheitTocelsius()
    {
        assertEquals(7.5,temp.fahrenheitTocelsius(45.0));
    }

    @Test
    void celsiusToKelvin()
    {
        assertEquals(4,temp.celsiusToKelvin(34));
    }

}
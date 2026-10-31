import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class temperatureconverterTest
{
    private temperatureconverter temp = new temperatureconverter();

    @Test
    void celsiustofahrenheit()
    {
        assertEquals(0.00, temp.celsiustofahrenheit(1));
    }

    @Test
    void fahrenheitTocelsius()
    {
        assertEquals(0.00,temp.fahrenheitTocelsius(33.0));
    }

    @Test
    void celsiusToKelvin()
    {
        assertEquals(0.00,temp.celsiusToKelvin(1));
    }

}
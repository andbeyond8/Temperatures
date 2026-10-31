public class temperatureconverter 
{
    public double celsiustofahrenheit (double celsius)
    {
        double fern = (celsius* (9.0/5.0));
        return fern;
    }
    public double fahrenheitTocelsius (double fah)
    {
        double cel = ((fah - 32)* (5.0/9.0) );
        return cel;
    }
    public double celsiusToKelvin (double cel)
    {
        double kel = (cel+ 273.15 );
        return kel;
    }
}

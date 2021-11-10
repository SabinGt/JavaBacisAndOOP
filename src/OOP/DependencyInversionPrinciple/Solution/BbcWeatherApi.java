package OOP.DependencyInversionPrinciple.Solution;

public class BbcWeatherApi implements WeatherSource{
    @Override
    public double getTemperatureCElcius() {
        return(toCelcius(getTemperatureFahrenheit())) ;
    }
    private double getTemperatureFahrenheit() {
        return 0; // stub method for the sake of the demo
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}

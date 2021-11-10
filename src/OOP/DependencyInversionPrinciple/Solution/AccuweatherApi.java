package OOP.DependencyInversionPrinciple.Solution;

public class AccuweatherApi implements WeatherSource {
    @Override
    public double getTemperatureCElcius() {
        return 30;
    }
}

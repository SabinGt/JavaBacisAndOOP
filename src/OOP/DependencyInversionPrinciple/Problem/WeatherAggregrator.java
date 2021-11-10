package OOP.DependencyInversionPrinciple.Problem;

public class WeatherAggregrator {
    private AccuweatherApi accuweatherApi= new AccuweatherApi();
    private BbcWeatherApi bbcWeatherApi = new BbcWeatherApi();

    private double getTemperature(){
        return (accuweatherApi.getTemperatureCelcius()+
                toCelcius(bbcWeatherApi.getTemperatureFahrenheit())) /2;
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit-32)/1.8f;
    }
}

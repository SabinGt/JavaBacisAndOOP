package OOP.DependencyInversionPrinciple.Solution;

import java.util.Arrays;

public class WeatherAggragrator {
    private WeatherSource[] weatherSources;
    private WeatherAggragrator(WeatherSource[] weatherSources){
        this.weatherSources=weatherSources;
    }
    private double getTemperature(){
        return Arrays.stream(weatherSources)
                .mapToDouble(WeatherSource::getTemperatureCElcius)
                .average()
                .getAsDouble();
    }
}

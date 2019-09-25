import observers.CurrentConditionsDisplay
import observers.ForecastDisplay
import observers.HeatIndexDisplay
import observers.StatisticsDisplay
import subjects.WeatherData

fun main(args: Array<String>) {
    val weatherData = WeatherData()
    CurrentConditionsDisplay(weatherData)
    StatisticsDisplay(weatherData)
    ForecastDisplay(weatherData)
    HeatIndexDisplay(weatherData)

    weatherData.changeMeasurements(80f, 65f, 30.4f)
    weatherData.changeMeasurements(82f, 70f, 29.6f)
    weatherData.changeMeasurements(78f, 90f, 29.2f)
}
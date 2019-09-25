package observers

import display.IDispalyElement
import subjects.ISubject
import subjects.WeatherData


class ForecastDisplay : IObserver, IDispalyElement {
    private lateinit var weatherData: ISubject
    private var humidity: Float = 0.0f

    constructor(weatherData: WeatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Humidity: $humidity")
    }

}
package observers

import display.IDispalyElement
import subjects.ISubject
import subjects.WeatherData

class StatisticsDisplay : IObserver, IDispalyElement {
    private var weatherData: ISubject
    private var temperature: Float = 0.0f

    constructor(weatherData: WeatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        display()
    }

    override fun display() {
        println("Average/Min/Max temperature: $temperature")
    }
}
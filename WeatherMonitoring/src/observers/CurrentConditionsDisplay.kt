package observers

import display.IDispalyElement
import subjects.ISubject


class CurrentConditionsDisplay : IObserver, IDispalyElement {
    private var weatherData: ISubject
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    constructor(weatherData: ISubject) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and ${humidity}% hummidity")
    }

}
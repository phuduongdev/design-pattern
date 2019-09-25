package subjects

import observers.IObserver

class WeatherData : ISubject {
    private var observers = mutableListOf<IObserver>()
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    override fun registerObserver(observer: IObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: IObserver) {
        if (observers.contains(observer)) observers.remove(observer)
    }

    override fun notifyObserver() {
        for (element in observers) {
            element.update(temperature, humidity, pressure)
        }
    }

    fun changeMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObserver()
    }

}
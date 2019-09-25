package subjects

import observers.IObserver

interface ISubject {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObserver()
}
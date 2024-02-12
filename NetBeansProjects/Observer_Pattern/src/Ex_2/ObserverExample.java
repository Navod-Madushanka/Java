/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_2;

/**
 *
 * @author Navod Madusanka
 */
import java.util.ArrayList;
import java.util.List;

// Subject (WeatherStation)
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject (WeatherStationImpl)
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer
interface Observer {
    void update(int temperature);
}

// Concrete Observer (DisplayDevice)
class DisplayDevice implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature updated: " + temperature);
    }
}

// Usage
public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DisplayDevice displayDevice1 = new DisplayDevice();
        DisplayDevice displayDevice2 = new DisplayDevice();

        weatherStation.addObserver(displayDevice1);
        weatherStation.addObserver(displayDevice2);

        weatherStation.setTemperature(25);
        // Output: Temperature updated: 25

        weatherStation.setTemperature(30);
        // Output: Temperature updated: 30
        // Output: Temperature updated: 30

        weatherStation.removeObserver(displayDevice1);

        weatherStation.setTemperature(35);
        // Output: Temperature updated: 35
    }
}


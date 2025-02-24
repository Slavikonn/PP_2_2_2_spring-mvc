package web.model;

import java.time.LocalDate;

public class Car {
    private String model;
    private int series;
    private LocalDate release;

    public Car(String model, int series, LocalDate release) {
        this.model = model;
        this.series = series;
        this.release = release;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "model '" + model +
                "', series " + series +
                ", release " + release;
    }
}

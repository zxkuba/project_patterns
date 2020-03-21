package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("Food", "Meet", 36.6);
            case PAINTING:
                return new PaintingTask("Refresh", "Black", "Wall");
            case DRIVING:
                return new DrivingTask("Delivery", "Warszawa", "Truck");
            default:
                return null;
        }

    }
}

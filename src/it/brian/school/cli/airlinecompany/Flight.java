package it.brian.school.cli.airlinecompany;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Flight {
    private Aircraft aircraft;
    private List<Passenger> passengers;
    private Queue<Passenger> queue;

    public Flight(Aircraft aircraft) {
        this.aircraft = aircraft;
        passengers = new ArrayList<>();
        queue = new PriorityQueue<>();
    }

    public void bookSeat(Passenger passenger) {
        if (passengers.size() <= aircraft.getSeats()) {
            if (!passengers.contains(passenger)) {
                passengers.add(passenger);
            } else {
                System.out.println("Passenger already in this flight");
            }
        } else {
            if (!queue.contains(passenger)) {
                queue.offer(passenger);
            } else {
                System.out.println("Passenger already in queue");
            }
        }
    }

    public void cancelSeat(Passenger passenger) {
        if (passengers.remove(passenger)) {
            System.out.println("Passenger cancelled from flight");
            Passenger poll = queue.poll();
            if (poll != null) {
                passengers.add(poll);
            }
        } else if (queue.remove(passenger)) {
            System.out.println("Passenger cancelled from queue");
        } else {
            System.out.println("Can't find passenger in this flight");
        }
    }

}

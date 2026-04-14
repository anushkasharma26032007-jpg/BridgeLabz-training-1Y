package com.gla.Generics.JavaCollection;
import java.util.*;



class RideRequest {
    String name;
    int priority;

    RideRequest(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return name.equals(d.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class Ride {
    String driver;
    String rider;

    Ride(String driver, String rider) {
        this.driver = driver;
        this.rider = rider;
    }

    public String toString() {
        return driver + " -> " + rider;
    }
}

  public class RideSharingDispatchSystem {
    public static void main(String[] args) {

        Queue<RideRequest> pending = new LinkedList<>();
        pending.add(new RideRequest("R1", 2));
        pending.add(new RideRequest("R2", 5));
        pending.add(new RideRequest("R3", 3));

        PriorityQueue<RideRequest> pq =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);
        pq.addAll(pending);

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("D1"));
        drivers.add(new Driver("D2"));
        drivers.add(new Driver("D3"));

        List<Ride> completed = new ArrayList<>();

        Iterator<Driver> it = drivers.iterator();

        while (!pq.isEmpty() && it.hasNext()) {
            RideRequest req = pq.poll();
            Driver d = it.next();

            Ride ride = new Ride(d.name, req.name);
            completed.add(ride);

            System.out.println("Assigned: " + ride);
        }

        System.out.println("Completed:");
        for (Ride r : completed) {
            System.out.println(r);
        }
    }

}

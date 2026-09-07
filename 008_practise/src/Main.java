class InvalidTicketException extends Exception {

    InvalidTicketException(String message) {
        super(message);
    }
}

class Cinema {

    int availableSeats = 20;

    void bookTickets(int tickets) throws InvalidTicketException {

        if (tickets <= 0) {
            throw new InvalidTicketException(
                    "Invalid ticket number: " + tickets
            );
        }

        availableSeats = availableSeats - tickets;

        System.out.println(tickets + " ticket(s) booked successfully.");
    }
}

public class Main {

    public static void main(String[] args) {

        Cinema c = new Cinema();

        int[] requests = {5, -2, 8, 0};

        for (int i = 0; i < requests.length; i++) {

            try {

                c.bookTickets(requests[i]);

            } catch (InvalidTicketException e) {

                System.out.println(e.getMessage());

            } finally {

                System.out.println("Booking attempt completed.");
            }
        }

        System.out.println("Remaining seats: " + c.availableSeats);
    }
}
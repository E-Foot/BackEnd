package emsi.efoot.services;

import emsi.efoot.entities.Reservation;

import java.util.List;

public interface ReservationService {

    // save operation
    Reservation saveReservation(Reservation reservation);

    // Read operation
    List<Reservation> listReservations();

    // Update operation
    Reservation updateReservation(Reservation reservation, int reservationId);

    // Delete operation
    void deleteReservationById(int reservationId);

}

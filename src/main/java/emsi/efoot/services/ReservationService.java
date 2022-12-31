package emsi.efoot.services;

import emsi.efoot.entities.Proprietaire;
import emsi.efoot.entities.Reservation;

import java.util.List;

public interface ReservationService {

    // save operation
    Reservation saveReservation(Reservation reservation);

    // Read operation
    List<Reservation> listReservations();

    // Update operation
    void updateReservation(Reservation reservation, int reservationId);
    List<Reservation> getAnnonces();
    // Delete operation
    void deleteReservationById(int reservationId);

    List<Reservation> findByProprietaireId(int proprietaireId);

}

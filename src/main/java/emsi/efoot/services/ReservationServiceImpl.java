package emsi.efoot.services;

import emsi.efoot.entities.Reservation;
import emsi.efoot.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {


    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> listReservations() {

        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation, int reservationId) {
        return null;
    }

    @Override
    public void deleteReservationById(int reservationId) {
        reservationRepository.deleteById(reservationId);
    }
}

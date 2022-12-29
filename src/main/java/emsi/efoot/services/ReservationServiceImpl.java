package emsi.efoot.services;

import emsi.efoot.entities.Proprietaire;
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
        if(reservation.getNbr_j_m()==0){
            reservation.setAnonceIschecked(true);
        }else reservation.setAnonceIschecked(false);


        return reservationRepository.save(reservation);
    }
    @Override
    public List<Reservation> getAnnonces() {
        return reservationRepository.getAnnonces();
    }
    @Override
    public List<Reservation> listReservations() {

        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public void updateReservation(Reservation reservation, int reservationId) {

        Reservation reservation1 = reservationRepository.getById(reservationId);
        if (reservation1 != null){
            reservation1.setDateReservation(reservation.getDateReservation());
            reservation1.setHeureReservation(reservation.getHeureReservation());
            reservation1.setId(reservation.getId());
            reservation1.setPrix(reservation.getPrix());
            reservation1.setDuree(reservation.getDuree());
            reservation1.setStade(reservation.getStade());
            reservation.setAnonceIschecked(reservation.isAnonceIschecked());
            reservation.setNbr_j_m(reservation.getNbr_j_m());




            reservationRepository.save(reservation1);



    }

    }



    @Override
    public void deleteReservationById(int reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public List<Reservation> findByProprietaireId(int proprietaireId) {
        return reservationRepository.findByProprietaireId(proprietaireId);
    }
}


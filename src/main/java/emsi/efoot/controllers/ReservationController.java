package emsi.efoot.controllers;

import emsi.efoot.entities.Reservation;
import emsi.efoot.entities.Stade;
import emsi.efoot.services.ReservationService;
import emsi.efoot.services.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @Autowired
    private StadeService stadeService;

    // Save operation

    @PostMapping("/reservations/save")

    public Reservation saveReservations(@RequestBody Reservation reservation /*,Stade stade*/ ) {
       // reservation.setStade(stade);
        return reservationService.saveReservation(reservation);
    }




    // Read operation
    @GetMapping("/reservations")

    public List<Reservation> listReservations() {
        return reservationService.listReservations();
    }

    // Delete operation
    @DeleteMapping("/reservations/{id}")

    public String deleteReservationById(@PathVariable("id") int reservationId) {
        reservationService.deleteReservationById(reservationId);
        return "Deleted Successfully";
    }

}

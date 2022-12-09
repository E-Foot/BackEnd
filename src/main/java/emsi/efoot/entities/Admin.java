package emsi.efoot.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("admin")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Admin extends Utilisateur {
}

package servini.dao.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Administrateur")
public class Administrateur extends Personne {

	private static final long serialVersionUID = 1L;

}

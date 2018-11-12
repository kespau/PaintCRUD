package lt.paintcrud.Server.model;

import javax.persistence.*;

@Entity
@Table(name = "kiekiai")

public class Kiekiai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public Integer receptai_id;
    public Integer Spalvu_id;
    public Float Kiekis;
    public String baze;
}

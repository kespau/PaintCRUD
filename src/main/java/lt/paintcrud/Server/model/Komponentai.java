package lt.paintcrud.Server.model;

import javax.persistence.*;

@Entity
@Table(name = "komponentai")

public class Komponentai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String Pavadinimas;
    public String gamintojas;
    public Integer gamintojo_id;
    public Float Price_colorant;
}

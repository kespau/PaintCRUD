package lt.paintcrud.Server.model;

import javax.persistence.*;

@Entity
@Table(name = "receptai")

public class Receptai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer paintcrud_id;
    public String kodas;
    public String date;
    public String client;
    public Float Price_recepto;
    public String pastaba;
    public Integer id;
}

import javax.persistence.*;

@Entity
@Table(name = "mosque")
public class Mosque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mosqueId;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    // Other attributes

    // Getters and setters
}

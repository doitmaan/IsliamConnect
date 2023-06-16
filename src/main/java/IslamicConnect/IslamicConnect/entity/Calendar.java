import javax.persistence.*;

@Entity
@Table(name = "calendar")
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calendarId;

    @ManyToOne
    @JoinColumn(name = "mosque_id", nullable = false)
    private Mosque mosque;

    @Column(nullable = false, name="created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false, name="updated_at")
    private LocalDateTime updatedAt;

    // Getters and setters
}

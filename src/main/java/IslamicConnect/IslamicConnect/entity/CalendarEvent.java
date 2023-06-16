import javax.persistence.*;

@Entity
@Table(name = "calendar_event")
public class CalendarEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @ManyToOne
    @JoinColumn(name = "calendar_id", nullable = false)
    private Calendar calendar;

    @Column(nullable = false, name ="event_type")
    private String eventType;

    @Column(nullable = false, name="start_date_time")
    private LocalDateTime startDateTime;

    @Column(nullable = false, name="end_date_time")
    private LocalDateTime endDateTime;

    @Column(nullable = false)
    private String location;

    @Column
    private String description;

    @Column(nullable = false, name="created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false, name="updated_at")
    private LocalDateTime updatedAt;

    // Getters and setters
}

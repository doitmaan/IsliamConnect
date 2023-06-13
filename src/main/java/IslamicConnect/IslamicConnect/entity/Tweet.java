import javax.persistence.*;

@Entity
@Table(name = "tweet")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tweetId;

    @ManyToOne
    @JoinColumn(name = "mosque_id", nullable = false)
    private Mosque mosque;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String content;

    // Other attributes

    // Getters and setters
}

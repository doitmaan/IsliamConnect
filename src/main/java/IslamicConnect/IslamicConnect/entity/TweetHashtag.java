import javax.persistence.*;

@Entity
@Table(name = "tweet_hashtag")
public class TweetHashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hashtag_id")
    private Long tweetHashtagId;

    @ManyToOne
    @JoinColumn(name = "tweet_id", nullable = false)
    private Tweet tweet;

    @ManyToOne
    @JoinColumn(name = "hashtag_id", nullable = false)
    private Hashtag hashtag;

    @Column(nullable = false, name="created_at")
    private LocalDateTime createdAt;

    @Column(nullable = false, name="updated_at")
    private LocalDateTime updatedAt;

    // Getters and setters
}

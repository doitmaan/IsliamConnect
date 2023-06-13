import javax.persistence.*;

@Entity
@Table(name = "tweet_hashtag")
public class TweetHashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tweetHashtagId;

    @ManyToOne
    @JoinColumn(name = "tweet_id", nullable = false)
    private Tweet tweet;

    @ManyToOne
    @JoinColumn(name = "hashtag_id", nullable = false)
    private Hashtag hashtag;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Getters and setters
}

Entities
The schema consists of the following entities:

Mosque: Represents a mosque or Islamic center. It includes attributes such as the mosque ID, name, location, description, and contact information.

Review: Represents a user review of a mosque. It contains information such as the review ID, user ID, mosque ID, rating, comments, and timestamps.

User: Represents a user of the application. Users have associated information like user ID, username, email, and profile details.

Tweet: Represents a tweet or an update related to a mosque. It includes the tweet ID, mosque ID, user ID, content, and timestamps for creation and updates.

Follower: Represents the follower relationship between a user and a mosque. It includes the follower ID, user ID, mosque ID, and timestamps.

Hashtag: Represents a hashtag used in tweets. It contains the hashtag ID and name.

TweetHashtag: Represents the relationship between a tweet and a hashtag. It includes the tweet-hashtag ID, tweet ID, hashtag ID, and timestamps.

Feed: Represents a feed item in a user's feed. It includes the feed ID, user ID, tweet ID, and timestamps.

Calendar: Represents a calendar associated with a mosque. It contains the calendar ID, mosque ID, and timestamps.

CalendarEvent: Represents an event on a mosque's calendar. It includes the event ID, calendar ID, event type, start and end datetimes, location, description, and timestamps.

Image: Represents an image associated with a tweet. It includes the image ID, tweet ID, image URL, and timestamps.

Tag: Represents a tag or label used in tweets or other entities. It contains the tag ID and name.

UserFollow: Represents the follower relationship between two users. It includes the user-follow ID, follower ID, followee ID, and timestamps.

Notification: Represents a notification sent to a user. It includes the notification ID, user ID, content, read status, and timestamps.

![Schema](https://github.com/doitmaan/IsliamConnect/src/main/resources/db/init/schema.png?raw=true)

# Meent's Architecture

## Domain, our entities
First things first, let's talk about the entities / classes from our application.

- **User**: entity responsible to hold information about the logged user;
- **Mentor**: entity responsible to hold information about a user who wants to mentor another developers;
- **Mentee**: entity responsible to hold information about a user who wants to be mentored by another developer;
- **Mentorship**: entity responsible to hold information about a mentorship between a mentor and a mentee;
- **MentorshipSession**: entity responsible to hold information about a specific session from a mentorship;
- **MentorshipActivities**: entity responsible to hold activities from a mentorship session between the mentee and 
- mentor;
- **MentorshipSubmission**: entity responsible to hold information about a subscription from a mentee to a mentorship;
- **Rating**: entity responsible to hold mentorship ratings from mentee/mentor to each other;
- **Skill**: entity responsible to hold available skills inside the application;
- **Notification**: entity responsible to hold information about a notification that was sent to a specific user.

```mermaid
classDiagram
    class User {
        -String id
        -String first_name
        -String last_name
        -String email
        -String biography
        -Date birth_date
        -String title
        -String interests
        -List skills
        -String twitter
        -String devto
        -String linkedin
        -String github
        -Enum gender
        -Enum minority
    }
    class Mentor {
        -String id
        -String user_id
        -String description
        -List subjects
        -Int duration_length
        -Enum duration_type
        -Int mentees_count
        -Int mentees_limit
    }
    class Mentee {
        -String id
        -String user_id
        -String mentor_id
    }
    class Mentorship {
        -String id
        -String mentor_id
        -String mentored_id
        -Date started_at
        -Date ended_at
        -Enum type
    }
    class MentorshipSession {
        -String id
        -String mentorship_id
        -Date scheduled_date
        -Enum status
        -String subjects
        -String mentor_comment
        -String mentee_comment
        -String activity_id
    }
    class MentorshipActivity {
        -String id
        -String mentorship_id
        -String description
        -Enum status
        -Date due_date
    }
    class MentorshipSubmission {
        -String id
        -String mentor_id
        -String mentee_id
        -Enum status
        -String intent_text
        -Date submission_date
    }
    class Rating {
        -String id
        -String user_id
        -String feedback
        -Int stars
        -Enum user_type
    }
    class Skill {
        -String id
        -String skill_name
        -Enum type
    }
    class Notification {
        -String id
        -String user_id
        -String subject
        -String content
        -Date sent_at
        -Enum status
        -Enum type
    }
    User "1" o-- "1" Mentor
    User "1" o-- "1" Mentee
    User "1" -- "*" Notification
    User "1" -- "*" Skill
    User "1" o-- "*" Rating
    Mentee "1" <-- "0..1" Mentor
    Mentor "1" <-- "*" Mentorship
    Mentor "*" <-- "*" MentorshipSubmission
    Mentee "1" <-- "*" Mentorship
    Mentee "1" <-- "*" MentorshipSubmission
    Mentorship "*" o-- "0..*" MentorshipSession
    Mentorship "1" o-- "0..*" MentorshipActivity
```
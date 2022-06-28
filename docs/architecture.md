# Mintsu's Architecture

## Domain, our entities
First things first, let's talk about the entities / classes from our application.

- **User**: entity responsible to hold information about the logged user;
- **Mentor**: entity responsible to hold information about an user who wants to mentor another developers;
- **Mentored**: entity responsible to hold information about an user who wants to be mentored by another developer;
- **Mentorship**: entity responsible to hold information about a mentorship between a mentor and a mentored.

```mermaid
classDiagram
    class User {
        -String id
        -String name
        -String lastName
        -String email
        -String bio
    }
    class Mentor {
        -String id
        -String userId
    }
    class Mentored {
        -String id
        -String userId
        -String mentorId
    }
    class Mentorship {
        -String id
        -String mentorId
        -String mentoredId
    }
    User "1" o-- "1" Mentor
    User "1" o-- "1" Mentored
    Mentor "0..1" <-- "1" Mentored
    Mentor "1" <-- "*" Mentorship
    Mentored "1" <-- "*" Mentorship
```
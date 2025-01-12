# JD2-Section1-Project

## Movie Library Project

This project implements a movie library system with the following features and functionality.

---

## Requirements

1. **Movie Class**:
   - Represents a movie with the following attributes:
     - `id`: Unique identifier for the movie.
     - `title`: Title of the movie.
     - `director`: Director of the movie.
     - `actors`: List of actors in the movie.
     - `date`: Release date of the movie.
     - `description`: Short description or synopsis.
     - `genre`: Genre of the movie.

2. **User Class**:
   - Represents a user with the following attributes:
     - `id`: Unique identifier for the user.
     - `name`: Name of the user.
     - `password`: Password for the user's account.
     - `email`: Email address of the user.

3. **Movie Manager**:
   - A manager class to handle movie-related operations such as:
     - Adding movies.
     - Deleting movies.
     - Searching for movies.
     - Listing all movies.

4. **User Manager**:
   - A manager class to handle user account operations such as:
     - Creating user accounts.
     - Deleting user accounts.
     - Searching for users.
     - Listing all users.

5. **Main Menu**:
   - Provides a user interface to access the following features:
     - **Movie Management**:
       - Search movies.
       - Add movies.
       - Delete movies.
       - List all movies.
     - **User Account Management**:
       - Create user accounts.
       - Delete user accounts.
       - Search for users.
       - List all users.
     - **User Authentication**:
       - Login and logout.

---

## Design Guidelines

- Follow consistent **naming conventions** (e.g., camelCase for variables and methods, PascalCase for classes).
- Avoid Turkish words in class, variable, or method names.
- Ensure **CodeStyle** standards by formatting your code using IDE-specific shortcuts.
- Avoid creating unnecessary object references (e.g., do not reinitialize `Scanner` multiple times in loops).
- Do not use structures or features that were not previously covered in the course.

---

## Prerequisites

- **Java 17 or later**
- An IDE like IntelliJ IDEA or Eclipse

---

## Project Setup and Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository-link.git
   cd movie-library-project

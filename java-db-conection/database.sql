CREATE DATABASE sirmaInternshipProject;
USE sirmaInternshipProject;

CREATE TABLE users(
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE tickets(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    ticket_price INT
);

CREATE TABLE users_tickets(
    users_id INT NOT NULL,
    tickets_id INT NOT NULL,
     FOREIGN KEY (users_id) REFERENCES users(id),
     FOREIGN KEY (tickets_id) REFERENCES tickets(id)
);


INSERT INTO users (username, password) VALUES
('user1', 'pass1'),
('user2', 'pass2'),
('user3', 'pass3');
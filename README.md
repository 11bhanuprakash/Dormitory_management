🏠 Dormitory Management System

This project was developed as part of the Software Engineering course in the Master’s program in Digital Engineering.

The objective of this assignment was to design and implement a structured, modular dormitory management system following software engineering principles such as:

Modular design

Separation of concerns

Object-oriented programming

Code reusability

Maintainability

📌 Project Overview

The Dormitory Management System is designed to manage students, rooms, and administrative operations in a dormitory.

The system allows:

Student registration

Room allocation

Room availability tracking

Check-in / Check-out management

Administrative record handling

The project demonstrates how real-world dormitory operations can be translated into structured software components.

🏗️ System Architecture

The system follows a modular and object-oriented design.

Main Components:

Student Module

Handles student information

Stores details like ID, name, contact information

Manages room assignments

Room Module

Maintains room data

Tracks occupancy

Checks availability

Updates room status

Management Module

Connects students and rooms

Assigns rooms to students

Handles check-in/check-out operations

Maintains overall dormitory records

⚙️ How the Code Works
1️⃣ Object-Oriented Structure

The system is structured using classes:

A Student class that defines student attributes and behaviors.

A Room class that defines room properties and occupancy logic.

A main controller/manager class that coordinates the interaction between students and rooms.

Each class encapsulates its own data and methods.

2️⃣ Student Registration

When a new student is added:

A student object is created.

The student is stored in a list or data structure.

The system checks room availability before assignment.

3️⃣ Room Allocation Logic

When assigning a room:

The system searches for available rooms.

It checks capacity constraints.

If space is available:

The student is assigned to the room.

The room occupancy is updated.

If not:

The system displays an appropriate message.

4️⃣ Check-Out Process

When a student checks out:

The student is removed from the room.

The room occupancy count is updated.

The room becomes available if capacity allows.

5️⃣ Data Handling

The system uses internal data structures (such as lists or dictionaries depending on your implementation) to:

Store student records

Track room assignments

Maintain current dormitory state

This ensures fast lookups and consistent data handling.

🛠️ Technologies Used

Programming Language: (Specify here — Python / Java / etc.)

Object-Oriented Programming (OOP)

Basic data structures (Lists, Dictionaries, Arrays, etc.)

Version control using Git & GitHub

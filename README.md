<div align="center">

#  Breast Cancer Screening — Java Desktop Application
### A Java Swing GUI Simulating an End-to-End Screening Management Workflow

*Login → Hospital → Examination → Confirmation — a clean, multi-window desktop flow built to demonstrate real OOP and event-driven GUI design.*

[![Language](https://img.shields.io/badge/language-Java-orange)]()
[![GUI](https://img.shields.io/badge/GUI-Java%20Swing-blue)]()
[![IDE](https://img.shields.io/badge/IDE-NetBeans-red)]()
[![Type](https://img.shields.io/badge/type-desktop%20application-lightgrey)]()

</div>

---

##  Overview

This is a **Java Swing desktop application** that simulates a breast cancer screening management system — the kind of internal tool a clinic or hospital network might use to move a patient through the screening process step by step. It walks the user through **login, hospital selection, initial patient examination, and a confirmation screen**, all through a proper multi-window GUI rather than a single monolithic form.

The point of the project isn't a production medical system — it's a focused demonstration of **object-oriented design, event-driven programming, and multi-window desktop GUI development in Java**, built and run through NetBeans.

---

##  Application Workflow

```
Login Screen
     │
     ▼
Main Interface
     │
     ▼
Hospital Selection
     │
     ▼
Initial Examination
     │
     ▼
Confirmation Screen
```

Each stage is its own window/class, wired together through event handling rather than one giant form — which is the actual point of the exercise: practicing how independent GUI components talk to each other cleanly.

| Step | Screen | Screenshot |
|---|---|---|
| 1 | User Login | `login.jpg` |
| 2 | Main Interface | `step1.jpg`–`step2.jpg` |
| 3 | Hospital Selection | `Hospitals.jpg` |
| 4 | Initial Examination | `step3.jpg`–`step5.jpg` |
| 5 | Patient Messaging | `Pmassege.jpg` |
| 6 | Confirmation | `Confirmation.jpg`, `step6.jpg` |

*(Screenshot-to-step mapping is inferred from filenames — adjust the table if a couple land on the wrong row.)*

---

##  Features

-  Secure user login interface
-  Interactive, event-driven GUI (Java Swing)
- Hospital selection screen
-  Initial patient examination workflow
-  Confirmation and navigation screens
-  True multi-window desktop application (not a single-form app)
-  Image-based interface components

---

##  Tech Stack

| | |
|---|---|
| **Language** | Java |
| **GUI Framework** | Java Swing |
| **Paradigm** | Object-Oriented Programming (OOP) |
| **IDE** | NetBeans |

---

## Repository Structure

```
.
├── login.java                  # Login screen — authentication entry point
├── Interface.java              # Main application interface / navigation hub
├── Hospitals.java              # Hospital selection screen
├── InaitialExaminetion.java    # Initial patient examination screen
├── Confirmation.java           # Confirmation / summary screen
│
├── login.jpg                   # Screenshot — login screen
├── Hospitals.jpg                # Screenshot — hospital selection screen
├── Pmassege.jpg                 # Screenshot — patient messaging screen
├── Confirmation.jpg             # Screenshot — confirmation screen
├── step1.jpg … step6.jpg        # Screenshots — full workflow walkthrough
│
└── README.md
```

---

##  Running the Project

1. Open the project folder in **NetBeans** (or any Java IDE that supports Swing form editing).
2. Ensure `login.java` is set as the **main class / entry point**.
3. Build and run — the application opens on the login screen and proceeds through the workflow above.

If you're running outside an IDE:

```bash
javac *.java
java login
```

*(Adjust the entry-point class name if the actual `main()` method lives in `Interface.java` instead of `login.java`.)*

---

##  Learning Outcomes

This project was built as hands-on practice with:

- Core Java programming
- Object-Oriented Programming (encapsulation, class design, multi-class coordination)
- Java Swing GUI development
- Event handling (button clicks, screen transitions, form submission)
- Multi-window desktop application architecture
- Basic UI/UX flow design for a task-oriented workflow

---

##  Future Improvements

-  **Database integration** (MySQL) — persist patients, hospitals, and examination records instead of in-memory state
-  **Real user authentication** — hashed credentials, session handling, role-based access (staff vs. admin)
-  **Patient record management** — searchable history across visits, not just a single screening pass
-  **Appointment scheduling** — calendar-based booking tied to hospital availability
-  **Report generation** — exportable screening summaries (PDF/CSV)
-  **Refreshed UI** — modernized layout and styling beyond the default Swing look

---

<div align="center">

*A small project, built to get the fundamentals — login flow, screen handoffs, event handling — genuinely right.*

</div>

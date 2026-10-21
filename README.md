# Student Management System

A desktop GUI application for managing student records, built with Java Swing.

> [!NOTE]
> This project is in **early development**. The UI form is partially built; data persistence and CRUD operations are not yet implemented.

![Java](https://img.shields.io/badge/Java-21%2B-orange)
![Status](https://img.shields.io/badge/status-work--in--progress-yellow)

## Features

- **Student form UI** — input fields for Student ID, First Name, and Last Name ([`App.java`](src/App.java#L18-L42))
- **Gender selection** — radio button group for Male / Female ([`App.java`](src/App.java#L45-L52))
- **Standalone window** — 850 × 550 px `JFrame` with absolute positioning ([`App.java`](src/App.java#L11-L13))

## Tech Stack

| Layer | Technology | Notes |
|-------|------------|-------|
| Language | Java | 21+ (uses [JEP 463](https://openjdk.org/jeps/463) implicitly declared class & `void main()`) |
| GUI | Java Swing (`javax.swing`) | JFrame, JLabel, JTextField, JRadioButton |
| Build | None (VS Code Java project) | Compile & run with `javac` / `java` directly |

## Project Structure

```text
Student Management System/
├── src/
│   └── App.java        # Entry point — builds the Swing form
├── bin/
│   └── App.class        # Compiled output (generated)
└── README.md
```

## Getting Started

### Prerequisites

- **Java JDK 21 or later** — the source uses `void main()` (implicitly declared classes), which requires JDK 21+ with preview features or JDK 23+ where it is a standard feature.

### Running

**Option A — VS Code (recommended for this project)**

1. Open the folder in VS Code with the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) installed.
2. Open `src/App.java` and click **Run** above the `main` method.

**Option B — Command line**

```bash
# Compile (from project root)
javac -d bin src/App.java --enable-preview --source 21

# Run
java --enable-preview -cp bin App
```

<!-- TODO: Confirm the exact --source version and preview flags needed for the JDK you're targeting. JDK 23+ may not require --enable-preview for void main(). -->

> [!TIP]
> On JDK 23+, implicitly declared classes are a standard feature — you can drop the `--enable-preview` and `--source` flags.

## Roadmap / Known Limitations

The following items are evident from the current source code:

- [ ] **Incomplete gender radio button** — the `female` `JRadioButton` is declared but never finished ([`App.java` L52](src/App.java#L52))
- [ ] **No `ButtonGroup`** — male/female radio buttons aren't grouped, so both can be selected simultaneously
- [ ] **No event handling** — no buttons for Save, Delete, Update, or Search
- [ ] **No data persistence** — no database, file I/O, or in-memory data store
- [ ] **No input validation**
- [ ] **Null layout** — uses absolute positioning; will not adapt to different screen sizes or DPI

## Contributing

Contributions are welcome! Since this is an early-stage project, feel free to open an issue or submit a pull request for any of the roadmap items above.

## License

<!-- TODO: Add a LICENSE file (e.g., MIT, Apache-2.0) to the repository root. -->

No license file found. Please add one before sharing or distributing this project.

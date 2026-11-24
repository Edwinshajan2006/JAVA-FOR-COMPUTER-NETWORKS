# Java for Computer Networks

<div align="center">

### Practical Java programs for TCP and UDP networking labs

[![Java](https://img.shields.io/badge/Language-Java-111827?style=flat-square&logo=openjdk)](https://www.java.com/)
[![Networking](https://img.shields.io/badge/Topic-Computer%20Networks-14532d?style=flat-square)](https://github.com/Edwinshajan2006/JAVA-FOR-COMPUTER-NETWORKS)

A collection of Java networking lab programs and practice exercises covering socket-based communication, client-server patterns and common data-processing tasks.

## Topics covered

- TCP client-server programs using Java sockets and stream-based input / output.
- UDP communication using datagram sockets and packets.
- Basic request-response patterns.
- String and number processing exercises.
- File-transfer and multi-user communication experiments.

The repository contains both source files and some compiled `.class` files. Prefer compiling from the Java source so the output matches the local Java version.

## Requirements

- JDK 8 or later
- A terminal or Java IDE
- Two terminals for client-server programs running on the same machine, or two reachable machines on a network

Check the installed version:

```bash
java -version
javac -version
```

## Run a program

Navigate to the folder containing the required `.java` files. Compile the server and client:

```bash
javac Server.java Client.java
```

Start the server first:

```bash
java Server
```

Then open another terminal and run the client:

```bash
java Client
```

Use the port and class names specified by the individual program. Some exercises are standalone snippets or notes rather than a paired client-server application.

## Repository structure

```text
JAVA-FOR-COMPUTER-NETWORKS/
├── TCP CODES/       # TCP exercises and related files
├── Client.java      # Root-level networking example
├── Server.java      # Root-level networking example
└── *.txt            # Supporting code / exercise notes
```

## Notes

- Run the server before the client when the program uses a server socket.
- Ensure the client connects to the correct host and port.
- A firewall may block incoming connections on the selected port.
- Do not commit compiled output when source code is sufficient; consider adding `.class` to `.gitignore`.
- File names and capitalization matter on Linux.

## Roadmap

- [ ] Organize TCP and UDP exercises into separate folders
- [ ] Add a short description and run command for every exercise
- [ ] Remove generated `.class` files from source control
- [ ] Add a consistent client / server example structure
- [ ] Add screenshots or terminal output for selected programs

---

<div align="center">

**Learn networking by building it.**

</div>

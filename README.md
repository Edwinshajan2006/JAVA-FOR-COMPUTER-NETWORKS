# Java for Computer Networks

<div align="center">

<img src="./profile-banner.svg" width="100%" alt="JAVA NETWORKING LAB project banner" />

</div>

<div align="center">

### Practical Java programs for TCP and UDP networking labs

[![Java](https://img.shields.io/badge/Language-Java-111827?style=flat-square&logo=openjdk)](https://www.java.com/)
[![Networking](https://img.shields.io/badge/Topic-Computer%20Networks-14532d?style=flat-square)](https://github.com/Edwinshajan2006/JAVA-FOR-COMPUTER-NETWORKS)

A collection of Java networking lab programs and practice exercises, organized by transport protocol and individual experiment.

</div>

## Repository structure

```text
JAVA-FOR-COMPUTER-NETWORKS/
├── TCP/
│   ├── File-Server/
│   ├── Library/
│   ├── Factorial/
│   ├── Matrix/
│   ├── Multi-User-Chat/
│   └── ... one folder per experiment
├── UDP/
│   ├── Abbreviation/
│   ├── Factorial/
│   ├── Prime/
│   ├── Remove-Spaces/
│   ├── Uppercase/
│   ├── Vowel-Counter/
│   └── Word-Count/
└── README.md
```

## TCP

Connection-oriented programs using Java `Socket`, `ServerSocket`, `DataInputStream` and `DataOutputStream`.

## UDP

Datagram programs using `DatagramSocket` and `DatagramPacket`.

## Running a program

1. Open the folder for the experiment.
2. For paired Java source files, compile them:

   ```bash
   javac Server.java Client.java
   ```

3. Start the server first:

   ```bash
   java Server
   ```

4. Open another terminal and run the client:

   ```bash
   java Client
   ```

Use the port and class names specified by each program. Some exercises remain in `.txt` files containing client and server examples; copy the relevant code into Java source files before compiling.

## Notes

- Each experiment is kept separate, not combined into a menu-driven program.
- Check the host address and port before running a client.
- Existing compiled `.class` files are retained; compile from source when possible.
- File names and capitalization matter on Linux.

---

<div align="center">

**Learn networking by building it.**

</div>

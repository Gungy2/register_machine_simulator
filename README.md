# Register Machine Simulator
A simple implementation of a register machine executor, implemented using Kotlin and ANTLRv4.

The program expects a file (or if not provided with one it reads from STDIN), that contains command with the following format (for examples, look in the examples/ directory):
  - HALT command: Li : HALT
  - INCREASE command: Li : Rj -> Lk
  - DECREASE command: Li : Rj -> Lk, Lm
  
The program prints the state after the execution of every command.

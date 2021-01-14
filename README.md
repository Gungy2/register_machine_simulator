# Register Machine Simulator

Usage: register-machine-cli [OPTIONS]

A simple implementation of a register machine executor

Options:

- -f, --File PATH File to execute
- -r, --registers TEXT Initial values of the registers (in order) separated by ','
- -s, --start INT Starting label
- -h, --help Show this message and exit

The program expects a file (or if not provided with one it reads from STDIN), that contains command with the following
format (for examples, look in the examples/ directory):

- HALT command: Li : HALT
- INCREASE command: Li : Rj -> Lk
- DECREASE command: Li : Rj -> Lk, Lm

The program prints the state after the execution of every command.

# Othello Project

Author: Tomas Ekholm

The Othello lab will be produced in four sprints.

## Eclipse IDE setup

We will use eclipse to develop our project.

- Configure a save action in order to format the source code
  automatically when saving files. Use the standard built-in formatter
  and modify the line wrapper for comments and code to be 120.

- Install the plugin infinitest to run the unit tests automatically
  when files are modified. Do not forget to use filters to avoid
  running integration and system tests for each save.

- Use Mockito to mock objects in the tests.

## How to develop the code

When building the application the team needs to take all aspects of
the course material into account. For example

- The code must be unit tested
- APIs must hide implementation details
- Implement needed design patterns
- Satisfy the open-closed principle
- Satisfy the single responsibility principle
- The code must be documented using standard technics

## Useful literature

"Clean code", Robert C. Martin
"Effective Java", Joshua Bloch
"Agile Software Development, principles patterns and practices", Robert C. Martin
"Design patterns", Gamma, Helm, Johnson, Vlissides (The gang of four)


# Sprint 1

Requirements

Create the model of the game Othello. The requirements are that one
should be able to

- Access the board.
- Start a game with two players. Each player is either human or computer.
- Get the nodes that will be swapped if played at a specific node.
- Make moves with the human players when they are in turn.
- Determine when the game has finished.
- Know which player is in turn.
- Know if a player can move.
- Make moves for the players.
- Access the players of the game.

Use the interface Othello.java as a public API of the module. The
board should consist of a list of nodes, where each node has a two
dimensional coordinate. Use the interface Board.java andNode.java for
these components. Here is a link to the code base.

## Demo 1

Show that two computer players can start a game and determine who has
won.

## Demo 2

Show that the model allows for one computer and one human to play
against each other some moves, at least four.

## When and how to demo

Send a zip file of the code base including the unit and system tests
to tomase@kth.se. Please do not include the configuration of the IDE.


# Sprint 2

Requirements

We would like to be able to

- Change the strategy that a computer use in order to move during a
  game. At least three different strategies.

- Access the score of the game.

  - A way to do this is making the Nodes observable and letting the
    Score observe changes, i.e. use inversion of control.

- Be able to customize the board into any 2-dimensional shape of nodes
  with any number of players.

- Another development team has constructed a factory creating
  boards. In order to communicate a NodeData class has been added for
  you to transfer data. In this way they can help your team creating a
  lot of boards independently of your development process.

New entities are
- the package `kth.game.othello.board.factory` package,
- the class `kth.game.othello.player.movestrategy.MoveStrategy`,
- the package `kth.game.othello.score`

The interfaces from sprint 1 has some new features (nothing is
removed).

Good luck in your process of producing clean code.

## Demo 4

1. Start a computer game with two computers.
2. Make ten moves with each player.
3. Change the strategy for one of the players.
4. Go to step 2 until one of the computers won.

## Demo 5

1. Start a human against human game.
2. Make four moves for each player.
3. Show the score.

## Demo 6

1. Create three computers.
2. Use the diamond board from the board factory.
3. Play the game and show the result.


# Sprint 3

Requirements

- We would like to be able to use a view in order to play. Another
  team has provided a view.

- The view has an undo button that we would like to support. Thus we
  need to an undo method in our contract.

- In the development process of the view they found that they needed
  some more information. Hence, the Othello and Board interface is
  extended with some methods. We hope that your code will manage the
  additional methods on the contract.

- We would also like to have another module, a Tournament module on a
  classical board. This module should rank the different move
  strategies that exists. We would like to be able to choose between
  the following. Either just present the result in the console or see
  the games with the provided view and then present the result in the
  console.  In the tournament each move strategy should meet the other
  strategies twice and starting the game exactly once. At least four
  strategies should be included.

Good luck in your process of producing clean code!

## How to use the view

You can use the view in the following way.

```
OthelloView othelloView = OthelloViewFactory.create(othello, timeBetweenSwaps, timeBetweenMoves);
othelloView.start(); or othelloView.start(String playerId);
```

Time is given in ms.

## Code base

The only API breaking change is that we no longer take the Othello as
an argument to our move strategies.


# Sprint 4

## Feedback on a codebase

Imagine that your boss would like a recommendation to buy an Othello
code base. He needs feedback on the momentum of the code, i.e. the
complexity of the code. The code base will be sent to your team via
email.

Check the following:

1. Is the code working according to the requirements?

2. Give feedback on the code based on the principles given in this
   course. Do not forget to comment on the

   - Modularization and encapsulation

   - Are logic misplaced?

   - unit testing and the ability of building readable and atomic
     tests that mocks all dependencies

   - naming things, including the test methods

   - readability

   - design of API

   - information hiding

3. Make the following changes to the code and reflect on the quality
   of the code base.

   - Change how the score works, so that each time a player can’t
     move, the player will get -2 points as a penalty.

   - Change so that one cannot swap diagonally.

   - Change so that if a node is at the boundary the score will be
     double from that node.

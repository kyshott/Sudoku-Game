<div align="center">

# Java Sudoku

### Project Title: Sudoku Game

### DOWNLOADS:

[Windows Application](https://github.com/kyshott/Sudoku-Game/releases/tag/v1.0.0)

#### Description:
Our project generates, solves, and desplays a sudoku game. We use JavaFX along with SceneBuilder to build a game board. The user can then input numbers into the board using our numberpad to fill in the empty spaces to solve the puzzle.

#### How to Play:
To play all you have to do is run the program in an IDE or download the .zip file (above), extract, and run the application. The rules of sudoku are simple. The board is split into 9 columns, 9 rows, and 9 3x3 boxes. You can only have numbers 1-9 in any given box, row, or column. 

The game will give you live feedback on whether or not your input was correct; if the number appears green, it is the correct input; if it is red, then it is incorrect. This does make it much easier, but demonstrates the program's ability to solve the board.

![sudoku](https://github.com/user-attachments/assets/edc594d4-0c96-4b52-9815-738a8971d57a)

</div>

#### Challenges:
A few of the complex chalenges we faced were the solving algorithm and the board generating algorithm. To generate the board you have to make sure that it is solvable with the clues given and that enough clues are given so there are no guesses. The solver was especially difficult before we learned about recursion. The issue we encountered was that it would leave spaces empty in the solution. After debugging we found the source of the issue and decided recursion was the right way to go.

#### Achievments:
We are quite proud of the way the game came out. We are especially proud of the solving and generating of valid sudoku boards.

#### What we leanred:
We each learned a lot about JavaFX, the JFC, and how use OOP to seperate our project into different part that all come together.

#### Credit:
This project was contributed to by Joseph Mulligan, Kyle Shott, and Nicholas Ramond.
This project was completed as part of WIT Computer Science II class 04/2023





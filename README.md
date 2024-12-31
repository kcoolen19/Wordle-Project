# Wordle Project 

## Project Description <br />
This mini project is focused on recreating the Wordle game. A player will obtain 6 attempts to correctly guess a 5-letter word. After each guess, the player will receive feedback on whether the input answer is correct or not. Each letter of the input word will have one of three colors as background as output to indicate to the player if the input answer is correct or not.

The game continues until one of two scenarios occurs: <br />
1) The player correctly guesses the 5-letter word. <br />
2) The player uses up all of the 6 attempts provided.

## Game Features <br />
**Word Selection**: <br />
The word is selected at random using the `Random()` function from a pre-defined list of words found in `WordleList.java`

**Input Validation**: <br />
* Only alphabetic characters are allowed in the composition of the words.
* The length of each word is fixed at 5 letters.
* The player has a maximum of 6 tries to correctly guess the answer.

**Word Check**: <br />
The word input by the player is checked after each try. Three colors are used to denote the process of checking each letter in the guess word. The three colors are explained below: <br />
* Green: The letter is in the correct position.
* Yellow: The letter is present in the correct word but is placed in the wrong position.
* Grey: The letter is not present in the correct word.

## Classes
1. `WordleGame.java` <br />
* The game logic is stored in this class and contains the method which will run the game.
* It connects all the other classes together and their subsequent functions are: <br />
  * It prompts the player for guesses.
  * It provides feedback after each guess about whether the guess word contains the correct letters.
  * It tracks the number of attempts for the player.

2. `WordCheck.java` <br />
* Will compare each letter in the word input by the player with the correct word obtained from an array of words.
* Will implement different colored backgrounds based on the letter's accuracy.
  
3. `WordValidator.java` <br />
* Will check if the player's input is a 5-letter word and consists of alphabetic characters.
* Will output a message in case any of these conditions is not satisfied.

4. `WordleList.java` <br />
* Contains a list of words in an array
* Contains a method that returns the array in another class where the word is picked as the cho

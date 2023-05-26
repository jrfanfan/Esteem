import java.util.Scanner

var head: String = """This program is an implementation of the Rosenberg
Self-Esteem Scale. This program will show you ten
statements that you could possibly apply to yourself.
Please rate how much you agree with each of the
statements by responding with one of these four letters:"""

var ChoiceMains: String = """D means you strongly disagree with the statement.
d means you disagree with the statement.
a means you agree with the statement.
A means you strongly agree with the statement."""

fun ask_positive_question(statement: String) : Int {
    /*  Display one statement to the user and get the user's response.
    Then determine the score for the response and return the score.

    Parameters
        statement: The statement to show the user.
        pos_or_neg: Either the constant POSITIVE or NEGATIVE.
    Return: the score from the user's response to the statement.
    */

    println(statement)

    val input = Scanner(System.`in`)
    print("   Enter D, d, a, or A: ")
    val answer = input.next()
    var score = 0
    if ( answer == "D")
        score = 0
    else if (answer == "d")
        score = 1
    else if (answer == "a")
        score = 2
    else if (answer == "A")
        score = 3

    return score

}

fun ask_negative_question(statement: String) : Int {
    /* Display one statement to the user and get the user's response.
    Then determine the score for the response and return the score.

    Parameters
        statement: The statement to show the user.
        pos_or_neg: Either the constant POSITIVE or NEGATIVE.
    Return: the score from the user's response to the statement. */
    println(statement)
    val input = Scanner(System.`in`)
    print("   Enter D, d, a, or A: ")
    val answer = input.next()
    var score = 0
    if (answer == "D")
        score = 3
    else if (answer == "d")
        score = 2
    else if (answer == "a")
        score = 1
    else if (answer == "A")
        score = 0
    return score
}

fun main() {
    println(head)
    println()
    println(ChoiceMains)
    println()
    var score = 0
    score += ask_positive_question("1. I feel that I am a person of worth," +
            " at least on an equal plane with others.")
    score += ask_positive_question("2. I feel that I have a number of good qualities.")
    score += ask_negative_question("3. All in all, I am inclined to feel that I am a failure.")
    score += ask_positive_question("4. I am able to do things as well as most other people.")
    score += ask_negative_question("5. I feel I do not have much to be proud of.")
    score += ask_positive_question("6. I take a positive attitude toward myself.")
    score += ask_positive_question("7. On the whole, I am satisfied with myself.")
    score += ask_negative_question("8. I wish I could have more respect for myself.")
    score += ask_negative_question("9. I certainly feel useless at times.")
    score += ask_negative_question("10. At times I think I am no good at all.")
    println("Your score is $score.")
    println("The scale ranges from 0-30. Scores between 15 and 25 are within normal range;" +
            " scores below 15 suggest low self-esteem.")

}

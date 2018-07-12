

fun main(args: Array<String>) {
val op: OperationType = OperationType.Add
    println(op)
}

enum class OperationType {
    Add, Subtract, Multiple, Divide
}

data class Equation(val operand1:Int, val operand2:Int, val operation:OperationType) {
    val answer: Int = findOperation()

    private fun findOperation(): Int{
        return when(operation) {
            OperationType.Add -> operand1 + operand2
            OperationType.Subtract -> operand1 - operand2
            OperationType.Divide -> operand1 / operand2 // make operand 1 large divisor
            OperationType.Multiple -> operand1 * operand2

        }
    }
}

class CreateEquations(val numberOfEquations:Int){
    val equationList = ArrayList<Equation>()
    var numberRight = 0

    //TODO: Finish me
    /*
    * Functions
    * =========
    * get Operation (use rand number )
    *   based on operation ( add in choose of all operations or selection)
    *   determine operand 1 and 2
    *   check answer against user answer (decouple for future gui)
    *   Tally right answers and score...
    * */
}
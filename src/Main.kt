import java.util.*

fun main(args: Array<String>) {
    //TODO: Create main menu, create way to add varied operations
    val eqList = ArrayList<Equation>()
    for(i in 1..20) {
        val eq = CreateEquation(listOf(OperationType.Add, OperationType.Subtract, OperationType.Multiply, OperationType.Divide))
        eqList.add(eq.createEquation())
    }
    for(i in 0..19){
        print("${eqList[i].operand1} ${eqList[i].operation} ${eqList[i].operand2} = ")
        val myAnswer = readLine()!!.toInt()
        if(myAnswer == eqList[i].answer)
            println("Right!! Good job!!")
        else
            println("Oops. Incorrect answer was ${eqList[i].answer}")
    }
}

enum class OperationType {
    Add, Subtract, Multiply, Divide
}

data class Equation(val operand1:Int, val operand2:Int, val operation:OperationType) {
    val answer: Int = findOperation()

    private fun findOperation(): Int{
        return when(operation) {
            OperationType.Add -> operand1 + operand2
            OperationType.Subtract -> operand1 - operand2
            OperationType.Divide -> operand1 / operand2 // make operand 1 large divisor
            OperationType.Multiply -> operand1 * operand2

        }
    }

}

class CreateEquation(val ListOfPossibleOperations: List<OperationType>) {
    private val random = Random()
    private val operationSign = ListOfPossibleOperations[random.nextInt(ListOfPossibleOperations.size)]
    var leftOperand: Int = 0
    var rightOperand: Int = 0

    init {
        when (operationSign) {
            OperationType.Add -> {
                leftOperand = (random.nextInt(100) + 1)
                rightOperand = (random.nextInt(100) + 1)
            }

            OperationType.Subtract -> {
                leftOperand = (random.nextInt(100) + 1)
                rightOperand = (random.nextInt(100) + 1)
            }

            OperationType.Multiply -> {
                leftOperand = (random.nextInt(12) + 2)
                rightOperand = (random.nextInt(12) + 2)
            }

            OperationType.Divide -> {
                leftOperand = (random.nextInt(12) + 2)
                rightOperand = (random.nextInt(12) + 2)
                leftOperand = leftOperand * rightOperand
            }

        }

    }

    fun createEquation() = Equation(leftOperand, rightOperand, operationSign)
}
// TODO: Figure out how you will add operation list to this
class EquationList(val numberOfEquations: Int = 20, val operationList: List<OperationType>){
    val equationlist = ArrayList<Equation>()
    init {
        for(i in 1..numberOfEquations){
            //val createEquation = CreateEquation(/*TODO: Fill me in*/)
                // used to fill up equation list for game
        }
    }
}
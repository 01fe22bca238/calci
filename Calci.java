/**
 * The Calci class is a simple calculator that performs addition, subtraction,
 * multiplication, and
 * division operations on two float operands.
 */
class Calci {
    float addition(float operand_1, float operand_2) {
        return operand_1 + operand_2;
    }

    float substraction(float operand_1, float operand_2) {
        return operand_1 - operand_2;
    }

    float multiplication(float operand_1, float operand_2) {
        return operand_1 * operand_2;
    }

    /**
     * The division function takes two float operands and returns their quotient.
     * 
     * @param operand_1 The first operand of the division operation. It is a float
     *                  data type.
     * @param operand_2 The second operand in the division operation.
     * @return the result of dividing operand_1 by operand_2.
     */
    float division(float operand_1, float operand_2) {
        return operand_1 / operand_2;
    }

    float square(float operand_1) {
        return (operand_1 * operand_1);
    }

    float cube(float operand_1) {
        return ((operand_1 * operand_1) * operand_1);
    }

    public static void main(String[] args) {
        float operand_1 = 10;
        float operand_2 = 5;
        Calci c = new Calci();
        float add_result = c.addition(operand_1, operand_2);
        System.out.println("Result of Additon: " + add_result);
        float sub_result = c.substraction(operand_1, operand_2);
        System.out.println("Result of Substraction: " + sub_result);
        float mul_result = c.multiplication(operand_1, operand_2);
        System.out.println("Result of Multipliction: " + mul_result);
        float div_result = c.division(operand_1, operand_2);
        System.out.println("Result of Division: " + div_result);
        float squr_result = c.square(operand_1);
        System.out.println("Result of square: " + squr_result);
        float cbe_result = c.cube(operand_1);
        System.out.println("Result of cube: " + cbe_result);
    }
}

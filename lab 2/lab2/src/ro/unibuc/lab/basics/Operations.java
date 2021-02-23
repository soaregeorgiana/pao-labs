package ro.unibuc.lab.basics;

/**
 * The Arithmetic Operators
 * -    +  Additive operator (also used for String concatenation)
 * -    -  Subtraction operator
 * -    *  Multiplication operator
 * -    /  Division operator
 * -    %  Remainder operator
 * <p>
 * The Unary Operators -> require only one operand
 * -    +  Unary plus operator; indicates positive value (numbers are positive without this, however)
 * -    -  Unary minus operator; negates an expression
 * -    ++ Increment operator; increments a value by 1
 * -    -- Decrement operator; decrements a value by 1
 * -    ! Logical complement operator; inverts the value of a boolean
 * <p>
 * The Equality and Relational Operators:
 * -    == equal to
 * -    != not equal to
 * -    >  greater than
 * -    >= greater than or equal to
 * -    <  less than
 * -    <= less than or equal to
 * Obs: They are used in decision-making instructions
 * * <p>
 * The Conditional Operators
 * -    && Conditional-AND ("short-circuiting" behavior, which means that the second operand is evaluated only if needed)
 * -    || Conditional-OR
 * <p>
 * Instructions:
 * -decision-making: if-else, switch
 * -looping: for, while, do-while
 * -branching: break
 */
public class Operations {

    public static void main(String[] args) {

        // decision-making
        /** if - else
         *
         * Checks if a condition is true and executes the if body if true, or the else body if false.
         * The if expression must be of type boolean.
         */

        int x = 11;
        if (x % 2 != 0) {
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }
        System.out.println("This will always be executed!");


        /** switch
         *
         * checks if a value supplied in the switch matches any of the cases within. If it does, it moves the execution
         * to that point and starts running them until either the end of the switch is reached or a break instruction is
         * met. if there's no case that matches and the default case exists, the instructions from default case are executed.
         * if there is no default case and there is no case that matches, no instructions in the switch are executed.
         */
        int someValue = 1;
        switch (someValue) {
            case 1:
                System.out.println("Sth for 1");
            case 2:
                System.out.println("Sth for 2");
                break;
            case 3:
                System.out.println("Sth for 3");
            case 4:
                System.out.println("Sth for 4");
                break;
            default:
                System.out.println("Sth for default");
        }

        // looping
        /** for
         *
         * Has 3 sections separated by a semicolon (;) and a body. Any of the 3 sections can be left empty. Upon execution,
         * it declares and initialises any variables in the first block (if multiple values are initialised, they are
         * separated by a comma (,)), checks the boolean condition in the second block (if any) and if true, executes the
         * body. At the end of each body execution, it runs the steps in the final section.
         */

//        for (int i = 1, j = 2; i <= 5; i++) {
//            System.out.print(i + " ");
//            //i++ = i = i + 1
//        }

        /** while
         *
         * checks if the boolean condition in the while is true. If so, it executes the body and goes to the start,
         * reevaluating the expression and rerunning if necessary.
         */

        int counter = 1;
//        while (counter < 11) {
//            System.out.println("counter: " + counter);
//            counter++;
//        }

//        while (true){
//
//        }


        /** do - while
         *
         * Similar to the while, the difference being that it first runs the body and evaluates the expression at the end, therefore
         * the statements within the do block are always executed at least once
         */

        do {
            System.out.println("counter: " + counter);
            counter++;
        } while (counter < 11);

//        do {
//            System.out.println("At least one");
//        } while (2<1);
    }
}

package org.learning.java8.Recursion;

import static java.lang.Character.isDigit;
import static java.lang.Integer.valueOf;

class Parser {

    static int eval(String expr) {

        if (expr.startsWith("(") && expr.endsWith(")") &&
                !(expr.substring(1, expr.length()-1).contains("(") || expr.substring(1, expr.length()-1).contains(")"))) {
                return eval(expr.substring(1, expr.length() - 1));
        } else if (expr.startsWith("(")) {
            int braceNumber = 1;
            int bracePosition = 0;
            do {
                bracePosition++;
                if (expr.charAt(bracePosition) == '(') {
                    braceNumber++;
                } else if (expr.charAt(bracePosition) == ')') {
                    braceNumber--;
                }
            } while (braceNumber != 0 && bracePosition < expr.length());
            int leftOperand = eval(expr.substring(1, bracePosition));
            char operation = (bracePosition != (expr.length() - 1)) ? expr.charAt(bracePosition + 1) : ' ';
            if (operation != ' ') {
                int rightOperand = eval(expr.substring(bracePosition + 2));
                switch (operation) {
                    case '+':
                        return leftOperand + rightOperand;
                    case '-':
                        return leftOperand - rightOperand;
                    case '*':
                        return leftOperand * rightOperand;
                    case '/':
                        return leftOperand / rightOperand;
                }
            }
        } else {
            int pos = 0;
            while (pos < expr.length()) {
                if (isDigit(expr.charAt(pos))) {
                    pos++;
                } else {
                    int leftOperand = valueOf(expr.substring(0, pos));
                    char operation = expr.charAt(pos);
                    int rightOperand = eval(expr.substring(pos + 1));

                    switch (operation) {
                        case '+': return leftOperand + rightOperand;
                        case '-': return leftOperand - rightOperand;
                        case '*': return leftOperand * rightOperand;
                        case '/': return leftOperand / rightOperand;
                    }
                }
            }
        }
        return valueOf(expr);
    }
}

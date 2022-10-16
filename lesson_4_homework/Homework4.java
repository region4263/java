package lesson_4_homework;

import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        String tokens = "(2^3 * (10 / (5 - 3)))^(Sin(Pi))";  // точный ответ 1.2240488756475503
//        String tokens = "2^2 + cos(60)";  // 2^2 = 4; cos(60) = 0.5  -> 4.5
        System.out.println("result - " + infixToPostfix(tokens));
    }

    public static double infixToPostfix(String tokens) {
        Map<String, Integer> priorityOp = Map.of(
                "(", 0,
                "+", 1,
                "-", 1,
                "*", 2,
                "/", 2,
                "^", 3);

        Map<String, Integer> trigonomFunc = Map.of(
                "sin", 0,
                "cos", 1,
                "tg", 2,
                "ctg", 3);

        List<String> exp = convertExpression(tokens);
        Deque<String> stack = new ArrayDeque<>();
        List<String> postfix = new ArrayList<>();

        int flag = 0;  // чтобы определить работаем или нет с тригонометрической функцией
        int func = 0;
        for (String token : exp) {
            if (trigonomFunc.containsKey(token)) {
                func = trigonomFunc.get(token);
                flag = 1;  // встретилась тригонометрическая функция
                continue;
            }

            // если есть тригоном.функция, то работаем в этой ветке;
            if (flag == 1) {
                if (token.equals("(")) {
                    stack.addLast(token);
                    continue;
                }
                double degrees = Double.parseDouble(token);
                double radians = Math.toRadians(degrees);
                if (func == 0) {
                    postfix.add(String.valueOf(Math.sin(radians)));
                } else if (func == 1) {
                    postfix.add(String.valueOf(Math.cos(radians)));
                } else if (func == 2) {
                    postfix.add(String.valueOf(Math.tan(radians)));
                } else {
                    postfix.add(String.valueOf(1 / Math.tan(radians)));
                }
                flag = 0;  // тригонометрическую функцию обработали, флаг обнуляем
            } else {
                if (token.equals("(")) {
                    stack.addLast(token);
                } else if (token.equals(")")) {
                    while (!stack.peekLast().equals("(")) {
                        postfix.add(stack.pollLast());
                    }
                    stack.pollLast();
                } else if (priorityOp.containsKey(token)) {
                    if (!stack.isEmpty() && priorityOp.get(stack.peekLast()) >= priorityOp.get(token)) {
                        postfix.add(stack.pollLast());
                    }
                    stack.addLast(token);
                } else {
                    postfix.add(token);
                }
            }
        }
        while (!stack.isEmpty()) {
            postfix.add(stack.pollLast());
        }
        return evaluateExpression(postfix);
    }

    private static double evaluateExpression(List<String> postfix) {
        double result = 0;
        Deque<Double> stack = new ArrayDeque<>();
        Set<String> operators = Set.of("(", "+", "-", "*", "/", "^");

        for (String s : postfix) {
            if (operators.contains(s)) {
                double op2 = stack.pollLast();
                double op1 = stack.pollLast();
                stack.addLast(calculate(s, op1, op2));
            } else {
                stack.addLast(Double.valueOf(s));
            }
        }
        result = stack.pollLast();
        return result;
    }

    private static double calculate(String operator, double op1, double op2) {
        double result = 0;
        switch (operator) {
            case "+" -> result = op1 + op2;
            case "-" -> result = op1 - op2;
            case "*" -> result = op1 * op2;
            case "/" -> result = op1 / op2;
            case "^" -> result = Math.pow(op1, op2);
            default -> result = 0;
        }
        return result;
    }

    public static List<String> convertExpression(String tokens) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tokens.length(); i++) {
            char currentSymbol = tokens.charAt(i);
            if (currentSymbol == ' ') {
                continue;
            } else if (Character.isDigit(currentSymbol)) {
                sb.append(currentSymbol);
                if (!((i < tokens.length() - 1) && Character.isDigit(tokens.charAt(i + 1)))) {
                    result.add(sb.toString());
                    sb.setLength(0);
                }
            } else if (Character.isLetter(currentSymbol)) {
                sb.append(currentSymbol);
                if (!(Character.isLetter(tokens.charAt(i + 1)))) {
                    if (sb.toString().equals("Pi")) {
                        result.add(String.valueOf(Math.PI));
                    } else {
                        result.add(sb.toString().toLowerCase());
                    }
                    sb.setLength(0);  // сброс стрингбилдера
                }
            } else {
                result.add(String.valueOf(currentSymbol));
            }
        }
        return result;
    }
}

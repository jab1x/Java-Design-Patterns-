import java.io.*;
import java.util.*;



abstract class Equation {
    public abstract List<Double> solve();
}

class LinearEquation extends Equation {
    private double b, c;

    public LinearEquation(double b, double c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public List<Double> solve() {
        if (b == 0) {
            return c == 0 ? List.of(Double.POSITIVE_INFINITY) : Collections.emptyList();
        }
        return List.of(-c / b);
    }
}

class QuadraticEquation extends Equation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public List<Double> solve() {
        if (a == 0) {
            return new LinearEquation(b, c).solve();
        }
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return Collections.emptyList();
        } else if (D == 0) {
            return List.of(-b / (2 * a));
        } else {
            double sqrtD = Math.sqrt(D);
            return List.of((-b + sqrtD) / (2 * a), (-b - sqrtD) / (2 * a));
        }
    }
}

class BiQuadraticEquation extends Equation {
    private double a, b, c;

    public BiQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public List<Double> solve() {
        List<Double> quadraticSolutions = new QuadraticEquation(a, b, c).solve();
        Set<Double> solutions = new TreeSet<>();
        for (double sol : quadraticSolutions) {
            if (sol >= 0) {
                solutions.add(Math.sqrt(sol));
                solutions.add(-Math.sqrt(sol));
            }
        }
        return new ArrayList<>(solutions);
    }
}

public class EquationSolver {

    public static List<double[]> readEquationsFromFile(String fileName) throws IOException {
        List<double[]> equations = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();  

                if (!line.isEmpty()) {  
                    double[] coefficients = Arrays.stream(line.split("\\s+"))
                            .mapToDouble(Double::parseDouble)
                            .toArray();
                    equations.add(coefficients);
                }
            }
        }

        return equations;
    }

    public static void main(String[] args) {
        try {
            List<double[]> equations = readEquationsFromFile("input01.txt");
    
            Map<Integer, Integer> solutionCounts = new HashMap<>();
            List<Double> oneRootSolutions = new ArrayList<>();
    
            for (double[] eq : equations) {
                System.out.println("Equation: " + Arrays.toString(eq));
                Equation equation = createEquation(eq);
                List<Double> solutions = equation.solve();
                System.out.println("Solutions: " + solutions);
    
                int solutionCount = (solutions.contains(Double.POSITIVE_INFINITY)) ? -1 : solutions.size();
                solutionCounts.put(solutionCount, solutionCounts.getOrDefault(solutionCount, 0) + 1);
    
                if (solutionCount == 1) {
                    oneRootSolutions.add(solutions.get(0));
                }
            }
    
            printResults(solutionCounts, oneRootSolutions);
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    



    private static void printResults(Map<Integer, Integer> solutionCounts, List<Double> oneRootSolutions) {
        for (Map.Entry<Integer, Integer> entry : solutionCounts.entrySet()) {
            String key = (entry.getKey() == -1) ? "∞" : String.valueOf(entry.getKey());
            System.out.println("equations with " + key + " solutions: " + entry.getValue());
        }

        if (!oneRootSolutions.isEmpty()) {
            double minRoot = Collections.min(oneRootSolutions);
            double maxRoot = Collections.max(oneRootSolutions);
            System.out.println("min solution: " + minRoot);
            System.out.println("max solution: " + maxRoot);
        }
    }

    private static Equation createEquation(double[] coefficients) {
        int n = coefficients.length - 1;
        if (n == 1) {
            return new LinearEquation(coefficients[0], coefficients[1]);
        } else if (n == 2) {
            return new QuadraticEquation(coefficients[0], coefficients[1], coefficients[2]);
        } else if (n == 4) {
            return new BiQuadraticEquation(coefficients[0], coefficients[2], coefficients[4]);
        } else {
            throw new IllegalArgumentException("Error equation: " + Arrays.toString(coefficients));
        }
    }
    
}

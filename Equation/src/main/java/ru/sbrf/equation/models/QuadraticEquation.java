package ru.sbrf.equation.models;

import ru.sbrf.equation.exceptions.InputException;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
    private Double coefficientA;
    private Double coefficientB;
    private Double coefficientC;
    private List<Double> roots = new ArrayList();

    public QuadraticEquation(Double varA, Double varB, Double varC) {
        this.coefficientA = varA;
        this.coefficientB = varB;
        this.coefficientC = varC;
    }

    public QuadraticEquation(String varA, String varB, String varC) {
        try {
            this.coefficientA = Double.parseDouble(varA);
            this.coefficientB = Double.parseDouble(varB);
            this.coefficientC = Double.parseDouble(varC);
            throw new InputException("aaaaaa");
        } catch (InputException i) {
            System.out.printf("inputtt");
        }
    }

    public Double getCoefficientA() {
        return coefficientA;
    }

    public Double getCoefficientB() {
        return coefficientB;
    }

    public Double getCoefficientC() {
        return coefficientC;
    }

    public List<Double> getRoots() {
        return roots;
    }

    public void setRoots(List<Double> roots) {
        this.roots = roots;
    }
}

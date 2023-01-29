package ru.sbrf.equation.services;

import ru.sbrf.equation.models.QuadraticEquation;

import java.util.ArrayList;
import java.util.List;

public interface QuadraticEquationResolver {

    List<Double> roots = new ArrayList();

    void setRoots(QuadraticEquation quadraticEquation);
    void getRoots();

}

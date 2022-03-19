package com.example.lambdas.interfacesfuncionales.comparator;

import com.example.domain.Framework;
import com.example.domain.FrameworkComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Framework> frameworks = new ArrayList<>();
        frameworks.add(new Framework("Mockito"));
        frameworks.add(new Framework("TestNG"));
        frameworks.add(new Framework("Spring"));
        frameworks.add(new Framework("Hibernate"));
        frameworks.add(new Framework("JUnit"));


        // Opción 1: crear una implementación
        Collections.sort(frameworks, new FrameworkComparator());
        System.out.println(frameworks);

        frameworks.sort(new FrameworkComparator());

        // Opción 2: clase anónima
        frameworks.sort(new Comparator<Framework>() {
            @Override
            public int compare(Framework framework1, Framework framework2) {
                return framework1.getName().compareTo(framework2.getName());
            }
        });

        // Opción 3: lambdas
        frameworks.sort((f1, f2) -> f1.getName().compareTo(f2.getName()));

        System.out.println(frameworks);

    }
}

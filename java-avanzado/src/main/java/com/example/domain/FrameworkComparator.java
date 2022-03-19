package com.example.domain;

import java.util.Comparator;

public class FrameworkComparator implements Comparator<Framework> {
    @Override
    public int compare(Framework framework1, Framework framework2) {
        return framework1.getName().compareTo(framework2.getName());
    }
}

package com.epam.task1;

import com.epam.task1.Exercise10.Exercise10;
import com.epam.task1.Exercise7.Exercise7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        try {
            for (String s:Exercise7.calculationValues(2,5,0.2)) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

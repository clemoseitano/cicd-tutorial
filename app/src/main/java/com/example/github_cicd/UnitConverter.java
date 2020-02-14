package com.example.github_cicd;

public class UnitConverter {
    public static double metresToCentimeters(double metres) {
        return metres * 100;
    }

    public static double fahrToDeg(double fahr) {
        return (fahr - 32) / 1.8;
    }
}

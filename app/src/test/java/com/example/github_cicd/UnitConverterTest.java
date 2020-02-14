package com.example.github_cicd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Copyright (c) 2020 Farmerline LTD. All rights reserved.
 * Created by Clement Osei Tano K on 14/02/2020.
 */
public class UnitConverterTest {

    @Test
    public void metresToCentimeters() {
        assertEquals(180.0, UnitConverter.metresToCentimeters(1.8));
    }

    @Test
    public void fahrToDeg() {
        assertEquals(0 * 1.0, UnitConverter.fahrToDeg(32));
    }
}
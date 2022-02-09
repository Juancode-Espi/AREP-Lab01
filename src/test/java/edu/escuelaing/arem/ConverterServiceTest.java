package edu.escuelaing.arem;


import junit.framework.TestCase;


public class ConverterServiceTest extends TestCase{

    ConverterService converter;

    public ConverterService getConverterMock(String type) {
        converter = new ConverterImpl(type);
        return converter;
    }

    public void testConvertFromCelsiusToFahrenheit(){
        String expectedOutput = "50.00";
        float in = 122;
        ConverterService mock = this.getConverterMock("Fahrenheit");
        assertEquals(mock.parse(in),expectedOutput);
    }
    public void testConvertFromFahrenheitToCelsius(){
        String expectedOutput = "122.00";
        float in = 50;
        ConverterService mock = this.getConverterMock("Celsius");
        assertEquals(mock.parse(in),expectedOutput);
    }
    public void testShouldBeNegative(){
        float in = 24;
        ConverterService mock = this.getConverterMock("Fahrenheit");
        assertTrue(Float.parseFloat(mock.parse(in)) < 0);
    }
}

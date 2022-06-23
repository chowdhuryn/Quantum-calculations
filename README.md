# Quantum calculations

An implementation of a special calculator built to showcase an advanced futuristic technology based on Quantum calculations, which in some cases skews the result due to a small quantum error.
The attached folder contains a Calculator Java class implementation of a basic naive calculator [Calculator.java] ​with the following public methods:

1. public​ ​double​ add(Double a, Double b)
2. public​ ​double​ subtract(Double a, Double b)
   The name of the calculator is passed as an attribute of the constructor when an instance is created.
   Background Story:
   This implementation of the calculator is built to showcase an advanced futuristic technology based on Quantum calculations, which in some cases skews the result due to a small quantum error.
   The accuracy of the calculations is derived from the type of crystal that is used to store the Qbits.

In order to test the accuracy of each calculator, 20 pairs of random numbers should be generated. An accurate result should be considered a “Successful Calculation” and a skewed result should be considered an “Error”.
At the end of the 20 samples, each calculator test should produce a “Success Rate” calculated as N umber of Successf ul calculations .
20
The output of the program should print the calculations, whether they are correct or an error, the success rates of the calculators and which Crystal is better to be used (the one with the higher success rate) to the console (see example below for 10 samples):

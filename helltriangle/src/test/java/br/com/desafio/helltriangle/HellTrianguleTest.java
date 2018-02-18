package br.com.desafio.helltriangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HellTrianguleTest extends TestCase {

	MelhorCaminhoTriangle melhorCaminho = new MelhorCaminhoTriangle();

	/**
	 * Create the test case
	 *
	 * @param testName  name of the test case
	 */
	public HellTrianguleTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(HellTrianguleTest.class);
	}

	public void somaMaiorCaminhoTest() {
		int[][] triangle = { { 45 }, { 2, 23 }, { 65, 5, 32 }, { 2, 5, 2, 8 } };
		int soma = melhorCaminho.somaMaiorCaminho(triangle);
		assertEquals(108, soma);
	}
}

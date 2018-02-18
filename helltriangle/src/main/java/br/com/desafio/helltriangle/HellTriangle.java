package br.com.desafio.helltriangle;

/**
 * 
 * @author Adeilson Pereira
 *
 */
public class HellTriangle {
    
	private int[][] triangulo;
	private Integer quantidadeNiveis;
	private Integer somaMaiorCaminho = 0;
	
	
	public int[][] getTriangulo() {
		return triangulo;
	}
	
	public void setTriangulo(int[][] triangulo) {
		this.triangulo = triangulo;
	}
	
	public Integer getQuantidadeNiveis() {
		return quantidadeNiveis;
	}
	
	public void setQuantidadeNiveis(Integer quantidadeNiveis) {
		this.quantidadeNiveis = quantidadeNiveis;
	}

	public Integer getSomaMaiorCaminho() {
		return somaMaiorCaminho;
	}

	public void setSomaMaiorCaminho(Integer somaMaiorCaminho) {
		
		this.somaMaiorCaminho += somaMaiorCaminho;
	}
	
	
	
}

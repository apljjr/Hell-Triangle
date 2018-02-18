package br.com.desafio.helltriangle;

/**
 * 
 * @author Adeilson Pereira
 *
 */
public class MelhorCaminhoTriangle {

	/**
	 * 
	 * @return Soma dos elementos de maior caminho. A verificação é feita andando de
	 *         niveis e colunas do triangulo
	 */
	public Integer somaMaiorCaminho(int[][] value) {

		HellTriangle triangulo_obj = new HellTriangle();

		triangulo_obj.setTriangulo(value);
		triangulo_obj.setQuantidadeNiveis(value.length);
		triangulo_obj.setSomaMaiorCaminho(value[0][0]);

		int[][] triangulo = triangulo_obj.getTriangulo();
		Integer elemento;

		for (int nivelAtual = 0, colunaAtual = 0; nivelAtual < triangulo_obj.getQuantidadeNiveis() - 1; nivelAtual++) {

			Integer filho1 = triangulo[colunaAtual + 1][colunaAtual];
			Integer filho2 = triangulo[colunaAtual + 1][colunaAtual + 1];
			elemento = Math.max(filho1, filho2);
			triangulo_obj.setSomaMaiorCaminho(elemento);
			if (filho1 <= filho2) {
				colunaAtual++;
			}

		}

		return triangulo_obj.getSomaMaiorCaminho();
	}

}

package com.huristic.solutions;

import com.huristic.solutions.islands.IslandsAlgorithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IslandsApplicationTests {

	@Resource(name = "dfs")
	private IslandsAlgorithm dfsAlgorithm;

	@Test
	public void emptyMatrix() {

		int[][] matrix = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};

		int expected = 0;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void fullMatrix() {

		int[][] matrix = {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
		};

		int expected = 1;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void oneIslandsMatrixVariant1() {

		int[][] matrix = {
				{1,1,0,1},
				{0,0,1,0},
				{1,1,0,1},
				{1,1,0,1}
		};

		int expected = 1;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void oneIslandsMatrixVariant2() {

		int[][] matrix = {
				{1,0,0,1},
				{1,0,1,0},
				{1,1,0,1},
				{0,1,0,1}
		};

		int expected = 1;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void oneIslandsMatrixVariant3() {

		int[][] matrix = {
				{1,1,1,1},
				{1,1,1,0},
				{1,1,1,1},
				{0,1,1,1}
		};

		int expected = 1;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void oneIslandsMatrixVariant4() {

		int[][] matrix = {
				{0,0,0,0},
				{0,1,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};

		int expected = 1;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void oneIslandsMatrixVariant5() {

		int[][] matrix = {
				{1,0,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1}
		};

		int expected = 1;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void oneIslandsMatrixVariant6() {

		int[][] matrix = {
				{1,0,0,1},
				{0,1,1,0},
				{0,1,1,0},
				{1,0,0,1}
		};

		int expected = 1;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void twoIslandsMatrix() {

		int[][] matrix = {
				{1,1,1,1},
				{0,0,0,0},
				{1,1,1,1},
				{1,1,1,1}
		};

		int expected = 2;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void threeIslandsMatrix() {

		int[][] matrix = {
				{1,1,0,1},
				{0,0,0,0},
				{1,1,1,1},
				{1,1,1,1}
		};

		int expected = 3;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void fourIslandsMatrixVariant1() {

		int[][] matrix = {
				{1,1,0,1},
				{0,0,0,0},
				{1,1,0,1},
				{1,1,0,1}
		};

		int expected = 4;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}

	@Test
	public void fourIslandsMatrixVariant2() {

		int[][] matrix = {
				{1,0,0,1},
				{0,0,0,0},
				{0,0,0,0},
				{1,0,0,1}
		};

		int expected = 4;
		int actual = dfsAlgorithm.findIslandsCount(matrix);

		assertEquals(expected, actual);
	}
}

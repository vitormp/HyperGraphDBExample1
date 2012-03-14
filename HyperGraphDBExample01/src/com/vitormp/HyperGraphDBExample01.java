package com.vitormp;

import org.hypergraphdb.HyperGraph;

public class HyperGraphDBExample01 {

	public static void main(String[] args) {
		String databaseDirectory = "db/";

		HyperGraph hyperGraph = null;
		try {
			hyperGraph = new HyperGraph(databaseDirectory);
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			hyperGraph.close();
		}
		System.out.println("Success!!!");
	}
}

package com.vitormp;

import org.hypergraphdb.HGEnvironment;
import org.hypergraphdb.HyperGraph;

import com.vitormp.person.Person;

public class HyperGraphDBExample01 {

	public static void main(String[] args) {
		String databaseDirectory = "db/";

		HyperGraph hyperGraph = null;
		try {
			hyperGraph = HGEnvironment.get(databaseDirectory);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			hyperGraph.close();
		}
		System.out.println("Success!!!");
	}
}

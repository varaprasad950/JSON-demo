package com.demo;

import java.io.File;
import java.io.IOException;

import com.github.mfatihercik.dsb.DSM;
import com.github.mfatihercik.dsb.DSMBuilder;
import com.github.mfatihercik.dsb.Node;
import com.github.mfatihercik.dsb.function.FunctionExecutor;
import com.github.mfatihercik.dsb.function.Params;

public class DSMParserDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * DSMBuilder builder = new DSMBuilder(new File("target.yaml")); DSM dsm =
		 * builder.setType(DSMBuilder.TYPE.XML).create(); Object obh = dsm.toObject(new
		 * File("test.json"));
		 */

		// Pet pet = (Pet)dsm.toObject(new File("xmlFile.xml")); // read data from xml
		// file

		// dsm = builder.setType(DSMBuilder.JSON).create();
		// pet = dsm.toObject(new File("path/to/jsonFile.json"),Pet.class); // read data
		// from json file
		DSMBuilder builder = new DSMBuilder(new File("D://path//target.yaml")).setType(DSMBuilder.TYPE.XML);
		
		FunctionExecutor processStuff=new FunctionExecutor() {

			@Override
			public void execute(Params params) {
				Node node = params.getCurrentNode();
                // deserialize to your class
				//Pet p=node.toObject(pet.class);
                //or
                // directly access data
                System.out.println(node.getData());				
			}			
		};
		// register processStuff Function
		builder.registerFunction("processStuff",processStuff);
		
		DSM dsm = builder.create();
		//Object object = dsm.toObject(new File("path/to/jsonFile.json"));
	}
}



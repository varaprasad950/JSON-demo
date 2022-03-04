package com.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import com.github.mfatihercik.dsb.DSM;
import com.github.mfatihercik.dsb.DSMBuilder;

public class ParseXML {

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DSMBuilder builder = new DSMBuilder(new File("D://path//mapping.yaml"))
				.setType(DSMBuilder.TYPE.JSON);
		DSM dsm= builder.create();
		FunctionExecutor processStuff=new FunctionExecutor(){
            @Override
            public void execute(Params params) {
                // directly serialize Stuff class
                //Stuff stuff=params.getCurrentNode().toObject(Stuff.class);

				
				  Map<String,Object> stuff= (Map<String,Object>)params.
				  getCurrentNode().toObject();
				 
                Node node = params.getCurrentNode();
                // deserialize to your class
                //Stuff stuff=node.toObject(Stuff.class);
                
                
                System.out.println(stuff);
                // process stuff ; save to db. call service etc.
            }
        };
     // register processStuff Function
        builder.registerFunction("processStuff",processStuff);
        Object object =  dsm.toObject(new File("D://path//company.json"));

	}*/
	public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {

	    String titleSearchKey="JavaScript";
	    
	    DSMBuilder builder = new DSMBuilder(new File("D://path//mapping1.yaml"));
	    builder.registerFunction("processBook", params->System.out.println(params.getCurrentNode().getData()));
	        builder.getParams().put("title", titleSearchKey);
	    DSM dsm = builder.create();
	    // process json data
	    Object object = dsm.toObject(new File("D://path//books.json"));
	    
	    
	}

}

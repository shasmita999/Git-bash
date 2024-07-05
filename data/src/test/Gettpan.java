package test;

import java.util.Iterator;
import java.util.List;
import com.hcl.products.onetest.datasets.DataSetRow;
import com.ibm.rational.test.lt.kernel.services.IDataSetController;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
/**
 * @author unknown
 */
public class Gettpan implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {


	

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Gettpan() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) 
	{
		// the name of the dataset is the same as what is shown in the test. The dataset must be added to the test in order
		// to get a controller for it.
		String w = args[0];
		        IDataSetController control = tes.getDataSetController("/datasetimpl/val.csv");
		        try {
	                // once you have the controller you can get a row
	                DataSetRow row;
	              
	                List<String> column = control.getColumnHeaders();
					Iterator<java.lang.String> iterator = column.iterator();
	                if (iterator.next().contains("EID"))
	                {
	                	String eid []=  new String[3];
	                	for (int j =1; j<=eid.length;j++)
	                	{
	                		int q = control.getNextRow().getRowNumber();
		                    row = control.getRow(q);
	                    	row.changeValue("pan", w);
	                    	System.out.println("current row" + q);
	 	                    List<String> id =  row.getValues();
	 	                    control.writeRow(q, id, true);
	                    }
	                    //System.out.println("Current row"+q);
	                    
	                   
	                    }
	                // you can also write a new row to the dataset
	                // -1 means append to the end
	                // alternatively you can specify a row number and whether to overwrite that row or to insert a new row at the spot
	            //    control.writeRow(-1, Arrays.asList("a", "b", "c"), false);
	        return null;
	    }
	                catch (Exception e) {
	                    /*tes.getTestLogManager().alwaysReportMessage( e.toString());
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();*/

	                    System.out.println("fail");
	               }
	                return "PASS";

	}

	}
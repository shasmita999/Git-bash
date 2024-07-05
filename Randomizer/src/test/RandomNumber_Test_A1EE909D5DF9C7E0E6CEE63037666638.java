/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.AssignVariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.BuiltInCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.custom.IBuiltInDataSource;
import com.ibm.rational.test.lt.kernel.dc.IKDCCoreVar;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.Arrays;

@SuppressWarnings("all")
public class RandomNumber_Test_A1EE909D5DF9C7E0E6CEE63037666638 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	
	private DataVar[] vars = new DataVar[2];
	    private BuiltInCorrelationVar[] builtInDCVars = new BuiltInCorrelationVar[2];
    
 
    { builtInDCVars[0] = new BuiltInCorrelationVar(new com.ibm.rational.test.lt.kernel.custom.impl.RandomDataSource(getVirtualUser()), true, this, "randNo");
        builtInDCVars[0].setProperty(1, "false");
    builtInDCVars[0].setProperty(2, "%d");
    builtInDCVars[0].setProperty(3, "com.ibm.rational.test.lt.models.behavior.property.dist_uniform");
    builtInDCVars[0].setProperty(4, "0");
    builtInDCVars[0].setProperty(5, "100");
    builtInDCVars[0].setProperty(6, "true~0~100~false~1.0~1.0~false~1.0~true~true~false~4~false~10~false~false~false"); }


 
    { builtInDCVars[1] = new BuiltInCorrelationVar(new com.ibm.rational.test.lt.kernel.custom.impl.TimeStampDataSource(), true, this, "1701472159807");
        builtInDCVars[1].setProperty(1, "2");
    builtInDCVars[1].setProperty(2, "left"); }


    
    
	
	public RandomNumber_Test_A1EE909D5DF9C7E0E6CEE63037666638(IContainer container, String invocationId) {
		super(container, "RandomNumber", invocationId, "A1EE909D5DF9C7E0E6CEE63037666638");
		setArmEnabled(true);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(varAction_1(this));
		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(Arrays.asList((IKDCCoreVar)builtInDCVars[1],(IKDCCoreVar)builtInDCVars[0]));
		
			
	    } catch (Throwable e) {
		     log("Test Execution: RandomNumber_Test_A1EE909D5DF9C7E0E6CEE63037666638 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EE909D5E37E256E6CEE63037666638");	
			vars[0] = new DataVar("randomNumber", "0", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("truncatedTime", "0", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop1",
				 "A1EE909DBC825F70E6CEE63037666638",
				 0,
				 0,
				 0,
				 5,
				 1,
				 true, 
				 false,
				 null) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(dataVarAssign_1(this));
	this.add(dataVarAssign_2(this));
		KDelay delay_1 = new KDelay(this, "Delay (1234 ms.)", "A1EE909F96352850E6CEE63037666638", 1234, 1);
		this.add(delay_1);
		
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}

private AssignVariableAction dataVarAssign_1(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EE909DE9406200E6CEE63037666638");

	varAction.add(vars[0] , builtInDCVars[0]);

	return varAction;
}

private AssignVariableAction dataVarAssign_2(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EE909E228C8110E6CEE63037666638");

	varAction.add(vars[1] , builtInDCVars[1]);

	return varAction;
}

}

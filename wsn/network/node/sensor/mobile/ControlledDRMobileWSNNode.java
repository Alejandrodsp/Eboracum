package eboracum.wsn.network.node.sensor.mobile;

import eboracum.wsn.agent.BasicAgent;
import ptolemy.actor.NoTokenException;
import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;

public abstract class ControlledDRMobileWSNNode extends DynamicReorganizedMobileWSNNode{

	private static final long serialVersionUID = 1L;
	public BasicAgent myAgent; 
	   
	public ControlledDRMobileWSNNode(CompositeEntity container, String name) throws IllegalActionException, NameDuplicationException {
		super(container, name);
	}
	   
	protected boolean eventSensedManager(String tempEvent) throws NoTokenException, IllegalActionException{
   		return this.myAgent.eventSensed(tempEvent);
   	}

}

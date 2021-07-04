package com.adap;

import com.friend.PilotPen;

public class School {
//	PilotPen pp=new PilotPen();
	Pen p=new PenAdaptor();
	AssignmentWork aw=new AssignmentWork();
//	aw.setP(pp);
	aw.setP(p);
	aw.writeAssignment("I don't like to write assignment");
}

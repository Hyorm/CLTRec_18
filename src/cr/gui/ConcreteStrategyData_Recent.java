package cr.gui;
  
import cr.algorithm.*;
import cr.usr.*;
import cr.closet.*;
import cr.main.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class ConcreteStrategyData_Recent implements ConcreteStrategyData{

	public String[] setBoardData(int flag, int closetFlag, String fetureN, String keyword){
		
		GenericRecommend gr = new ConcreteNew(new ConcreteStrategyCloset_dataCloset());

		gr.setCloset();

		return gr.getPathImagList();

	}
}

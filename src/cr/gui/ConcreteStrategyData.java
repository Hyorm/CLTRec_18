package cr.gui;
  
import cr.algorithm.*;
import cr.usr.*;
import cr.closet.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public interface ConcreteStrategyData{

	public String[] setBoardData(int flag, int closetFlag, String fetureN, String keyword);

}

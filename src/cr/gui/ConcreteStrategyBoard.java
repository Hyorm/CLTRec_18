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

public interface ConcreteStrategyBoard{

	public JScrollPane getDisplayBoard(String[] closetPIDlist, int x, int y);

}

package cr.algorithm;

import cr.gui.*;
import cr.usr.*;
import cr.closet.*;
import cr.main.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class ConcreteStrategyCloset_userCloset implements ConcreteStrategyCloset{

	public Closet setCloset(){

		Closet thisCLo = new Closet();

		thisCLo = Main.userCloset;

		return thisCLo;
	}
}

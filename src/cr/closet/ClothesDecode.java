package cr.closet;

import cr.*;

import java.util.*;
import java.awt.*;

public class ClothesDecode{
	public ClothesDecode(){}
	public ClothesDecode(String type, String category, String gender, String color, String season, String style){
		Type temp_type = Type.type;
		Category temp_category = Category.category;
		Gender temp_gender = Gender.gender;
		Color temp_color = Colr.color;
		Season temp_season = Season.season;
		Style temp_style = Style.style;

		feature[0] = temp_type.ordinal();
		feature[1] = temp_category.ordinal();
		feature[2] = temp_gender.ordinal();
		feature[3] = temp_color.ordinal();
		feature[4] = temp_season.ordinal();
		feature[5] = temp_style.ordinal();
		
		return feature;
	}
	int[] feature = new int[6];
}

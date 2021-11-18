package mymule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream; 
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.yaml.snakeyaml.Yaml;


public class FormatChecker {
	private static Map<String, String> checkClassMaster = null;
	
	static {
		try {
			System.out.println("*****************************Static Block init.");
			InputStream inputStream = new FileInputStream(new File("C:\\Users\\yanhui.b.liu\\AnypointStudio\\studio-workspace\\mymule\\src\\main\\resources\\checkclass-master.yaml"));
			Yaml yaml = new Yaml();
			checkClassMaster = yaml.load(inputStream);
		}catch(Exception e) {
			checkClassMaster = null;
			e.printStackTrace();
		}
	}
	
	
}

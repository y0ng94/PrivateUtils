package yn.minor.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;

/**
 * @author	: y0ng94
 * @version	: 1.1
 * @JDK		: 1.6
 */
public class CommonUtil {

	/*
	 * List Util Start
	 */

	/**
	 * Remove the part in List2 from List1.
	 * @param list1
	 * @param list2
	 * @return List<String>
	 */
	public static List<String> getListDiff(List<String> list1, List<String> list2) {
		List<String> copyList1 = new ArrayList<String>(list1);
		if (copyList1.removeAll(new ArrayList<String>(list2)))
			return copyList1;
		else
			return list1;
	}

	/*
	 * List Util End
	 */

	/*
	 * Map Util Start
	 */

	/**
	 * Remove the part in Map2 from Map1.
	 * @param list1
	 * @param list2
	 * @return List<String>
	 */
	public static Map<String, Object> getMapDiff(Map<String, Object> map1, Map<String, Object> map2) {
		Map<String, Object> retMap = new HashMap<String, Object>(map1);
		
		for (Map.Entry<String,Object> entry : map1.entrySet()) {
			if (entry.getValue().equals(map2.get(entry.getKey())))
				retMap.remove(entry.getKey());
		}
		
		return retMap;
	}

	/*
	 * Map Util End
	 */
	
	/*
	 * Number Util Start
	 */

	/**
	 * Calculates the time elapsed
	 * @param time
	 * @return double
	 */
	public static double getTimeElapsed(long time) {
		return (double)(System.currentTimeMillis() - time)/(1000.0);
	}

	/**
	 * Divide the numerator by denominator.
	 * @param numerator
	 * @param denominator
	 * @return double
	 */
	public static double getDivision(int numerator, int denominator) {
		if (numerator == 0) { return 0.00; }
		return (((double)numerator / (double)denominator));
	}

	/**
	 * Divide the numerator by denominator.
	 * @param numerator
	 * @param denominator
	 * @return double
	 */
	public static double getDivision(int numerator, double denominator) {
		if (numerator == 0) { return 0.00; }
		return (((double)numerator / denominator));
	}

	/**
	 * Divide the numerator by denominator.
	 * @param numerator
	 * @param denominator
	 * @return double
	 */
	public static double getDivision(int numerator, long denominator) {
		if (numerator == 0) { return 0.00; }
		return (((double)numerator / denominator));
	}

	/**
	 * Divide the numerator by denominator.
	 * @param numerator
	 * @param denominator
	 * @return double
	 */
	public static double getDivision(double numerator, double denominator) {
		if (numerator == 0) { return 0.00; }
		return ((numerator / denominator));
	}
	
	/**
	 * Divide the numerator by denominator and return it in percentage form.
	 * @param numerator
	 * @param denominator
	 * @return double
	 */
	public static double getPercent(int numerator, int denominator) {
		if (numerator == 0) { return 0.00; }
		return (((double)numerator * 100.0 / (double)denominator));
	}
	
	/**
	 * Divide the numerator by denominator and return it in percentage form.
	 * @param numerator
	 * @param denominator
	 * @return double
	 */
	public static double getPercent(int numerator, double denominator) {
		if (numerator == 0) { return 0.00; }
		return (((double)numerator * 100.0 / denominator));
	}
	
	/**
	 * Divide the numerator by denominator and return it in percentage form.
	 * @param numerator
	 * @param denominator
	 * @return double
	 */
	public static double getPercent(double numerator, double denominator) {
		if (numerator == 0) { return 0.00; }
		return ((numerator * 100.0 / denominator));
	}

	/**
	 * Returns the specified maximum values, the minimum value to the meantime, that's random.
	 * @param min
	 * @param max
	 * @return int
	 */
	public static int getRandom(int min, int max) {
		return new Random().nextInt(max + 1 - min) + min;
	}
	
	/*
	 * Number Util End
	 */

	/*
	 * Date Util Start
	 */

	/**
	 * Returns the current date in the form of a string.
	 * @param pattern
	 * @return String
	 */
	public static String getCurrentDate(String pattern) {
		return new SimpleDateFormat(pattern).format(new Date());
	}

	/**
	 * Returns the current date in the form of a string.
	 * @param pattern
	 * @return String
	 */
	public static String getCurrentDate() {
		return getCurrentDate("yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * Calculates and returns D-Day in the form of a string.
	 * @param day
	 * @param pattern
	 * @return String
	 */
	public static String getDDay(int day, String pattern) {
		Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+09:00"), Locale.KOREA);
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, day);
		Date date = calendar.getTime();
		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * Calculates and returns D-Day in the form of a string.
	 * @param day
	 * @param pattern
	 * @return String
	 */
	public static String getDDay(int day) {
		return getDDay(day, "yyyy-MM-dd HH:mm:ss");
	}

	/*
	 * Date Util End
	 */

	/*
	 * String Util Start
	 */

	/**
	 * Check the string is empty
	 * @param str
	 * @return boolean
	 */
	public static boolean isEmpty(String str) {
		return (str == null || str == "");
	}

	/**
	 * Remove both spaces
	 * @param str
	 * @return String
	 */
	public static String trim(String str) {
		return str == null ? "" : str.trim();
	}

	/**
	 * Fill the left side with Char until the number of sizes is reached
	 * @param str
	 * @param size
	 * @param c
	 * @return String
	 */
	public static String leftPad(String str, int size, String c) {
		if (str == null || c == null || c == "")
			return str;

		int strSize = str.length();

		if (strSize < size) {
			String returnStr = str;
			String addStr = "";

			while (returnStr.length() + addStr.length() != size) {
				if (returnStr.length() + addStr.length() + c.length() <= size)
					addStr += c;
				else
					addStr += c.substring(0, size - (returnStr.length() + addStr.length()));
			}

			return addStr + returnStr;
		} else {
			return str.substring(0, size);
		}
	}


	/**
	 * Fill the right side with Char until the number of sizes is reached
	 * @param str
	 * @param size
	 * @param c
	 * @return String
	 */
	public static String rightPad(String str, int size, String c) {
		if (str == null || c == null || c == "")
			return str;

		int strSize = str.length();

		if (strSize < size) {
			String returnStr = str;

			while (returnStr.length() <= size)
				returnStr += c;

			return (returnStr.length() > size) ? returnStr.substring(0, size) : returnStr;
		} else {
			return str.substring(0, size);
		}
	}

	/*
	 * String Util End
	 */

	/*
	 * File Util Start
	 */

	/**
	 * Return fileName with a backup string.
	 * @param fileName
	 * @param postFix
	 * @return String
	 */
	public static String makeBackFileName(String fileName, String postFix) {
		int pointIndex = 0;
		int pointIndex1 = fileName.lastIndexOf("\\.");
		int pointIndex2 = fileName.lastIndexOf(".");

		if (pointIndex1 == -1 && pointIndex2 != -1)
			pointIndex = pointIndex2;
		else if (pointIndex1 != -1 && pointIndex2 == -1)
			pointIndex = pointIndex1;
		else if (pointIndex1 != -1 && pointIndex2 != -1)
			pointIndex = pointIndex1 > pointIndex2 ? pointIndex1 : pointIndex2;
		else
			return fileName + postFix;

		int pathIndex = 0;
		int pathIndex1 = fileName.lastIndexOf("\\");
		int pathIndex2 = fileName.lastIndexOf("/");

		if (pathIndex1 == -1 && pathIndex2 != -1)
			pathIndex = pathIndex2;
		else if (pathIndex1 != -1 && pathIndex2 == -1)
			pathIndex = pathIndex1;
		else if (pathIndex1 != -1 && pathIndex2 != -1) {
			pathIndex = pathIndex1 > pathIndex2 ? pathIndex1 : pathIndex2;
		} else
			return fileName + postFix;

		if (pathIndex > pointIndex)
			return fileName + postFix;
		else
			return fileName.substring(0, pointIndex) + postFix + fileName.substring(pointIndex);
	}

	/**
	 * Returns all directories in the path. (Excluding own path)
	 * @param dirFile
	 * @return List<File>
	 */
	public static List<File> getDirList(File dirFile) {
		List<File> dirList = new ArrayList<File>();

		for (File listFile : dirFile.listFiles()) {
			if (listFile.isDirectory()) {
				dirList.add(listFile);
				dirList.addAll(getDirList(listFile));
			}
		}

		return dirList;
	}

	/**
	 * Returns all directories in the path. (Excluding own path)
	 * @param dirFile
	 * @return List<File>
	 */
	public static List<File> getDirList(String dir) {
		return getDirList(new File(dir));
	}

	/**
	 * Returns all files in the path.
	 * @param dirFile
	 * @return List<File>
	 */
	public static List<File> getFileList(File dirFile) {
		List<File> fileList = new ArrayList<File>();

		for (File listFile : dirFile.listFiles()) {
			if (listFile.isFile())
				fileList.add(listFile);
			else
				fileList.addAll(getFileList(listFile));
		}

		return fileList;
	}

	/**
	 * Returns all files in the path.
	 * @param dir
	 * @return List<File>
	 */
	public static List<File> getFileList(String dir) {
		return getFileList(new File(dir));
	}

	/**
	 * Compare all the files received as arguments.
	 * @param file
	 * @return boolean
	 * @throws IOException
	 */
	public static boolean compareFile(File... file) {
		if (file != null && file.length > 1) {
			for (int i=0; i<file.length; i++) {
				for (int j=0; j<file.length; j++) {
					if (i != j && (file[i] != file[j]))
						return false;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	/*
	 * File Util End
	 */
}

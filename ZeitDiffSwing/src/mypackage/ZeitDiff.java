package mypackage;

public class ZeitDiff {
	
	public static int calculateDiff(String start, String end) {
		int startsec = 0;
		int endsec = 0;
		String[] startArray = (start != null ? start : "").split(":|\\.");
		String[] endArray = (end != null ? end : "").split(":|\\.");
		for (int i = 0; i < startArray.length; i++) {
			startsec = startsec*60 
					+ (startArray[i] != null && startArray[i].trim().length()>0 
					? Integer.parseInt(startArray[i]) : 0);
		}
		for (String s : endArray) {
			endsec = endsec * 60
					+ (isStringNotEmpty(s) ? Integer.parseInt(s) : 0);
		}
		return endsec - startsec;
	}
	
	private static boolean isStringNotEmpty(String s) {
		return s != null && s.trim().length() > 0;
	}
}

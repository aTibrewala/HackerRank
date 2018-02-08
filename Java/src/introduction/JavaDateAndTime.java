/*
 * @author: Alok Tibrewala
 */

package introduction;

import java.time.LocalDate;

public class JavaDateAndTime {
	public static String getDay(String day, String month, String year) {

		LocalDate ld = LocalDate.parse(year + "-" + month + "-" + day);
		return ld.getDayOfWeek().toString();
	}
}

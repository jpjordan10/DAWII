package pe.edu.cibertec.proyemp.util;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class UtilFormat {
	
	public static Date getFecha(LocalDate localDate) {
		return Date.from(
				localDate.atStartOfDay(
						ZoneId.systemDefault()).toInstant());
	}

	public static Date getFecha(int year, Month month, int day) {
		LocalDate fecha = LocalDate.of(year, month, day);
		return getFecha(fecha);
	}
}

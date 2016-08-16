import java.util.Calendar;
import java.util.TimeZone;

public class Class68 {
	static Class94_Sub1 aClass94_Sub1_571;
	static String[][] aStringArrayArray574 = new String[][] {
			{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
			{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };
	static String[] aStringArray572 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static Calendar aCalendar573;

	static {
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		aCalendar573 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	static void method300(final int var0, final int var1, final int var2, final Def6 var3,
			final int var4) {
		final Class124_Sub13 var5 = new Class124_Sub13();
		var5.anInt1057 = var0;
		var5.anInt1058 = var1 * 128;
		var5.anInt1065 = var2 * 128;
		int var7 = var3.anInt1401;
		int var6 = var3.anInt1432;
		if ((var4 == 1) || (var4 == 3)) {
			var7 = var3.anInt1432;
			var6 = var3.anInt1401;
		}

		var5.anInt1066 = (var7 + var1) * 128;
		var5.anInt1063 = (var6 + var2) * 128;
		var5.anInt1060 = var3.anInt1430;
		var5.anInt1062 = var3.anInt1431 * 128;
		var5.anInt1059 = var3.anInt1407;
		var5.anInt1061 = var3.anInt1433;
		var5.anIntArray1067 = var3.anIntArray1421;
		if (var3.anIntArray1427 != null) {
			var5.aClass124_Sub22_Sub6_1070 = var3;
			var5.method540();
		}

		Class124_Sub13.aClass111_1069.method424(var5);
		if (null != var5.anIntArray1067)
			var5.anInt1068 = var5.anInt1059 + (int) (Math.random() * (var5.anInt1061 - var5.anInt1059));

	}

	public static String method301(final byte[] var0) {
		final int var1 = var0.length;
		final StringBuilder var3 = new StringBuilder();

		for (int var2 = 0; var2 < (var1 + 0); var2 += 3) {
			final int var5 = var0[var2] & 255;
			var3.append(Class77.aCharArray621[var5 >>> 2]);
			if (var2 < (var1 - 1)) {
				final int var6 = var0[var2 + 1] & 255;
				var3.append(Class77.aCharArray621[((var5 & 3) << 4) | (var6 >>> 4)]);
				if (var2 < (var1 - 2)) {
					final int var7 = var0[var2 + 2] & 255;
					var3.append(Class77.aCharArray621[((var6 & 15) << 2) | (var7 >>> 6)])
							.append(Class77.aCharArray621[var7 & 63]);
				} else
					var3.append(Class77.aCharArray621[(var6 & 15) << 2]).append("=");
			} else
				var3.append(Class77.aCharArray621[(var5 & 3) << 4]).append("==");
		}

		final String var4 = var3.toString();
		return var4;
	}
}

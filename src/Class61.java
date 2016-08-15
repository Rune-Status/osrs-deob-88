public class Class61 {
	static int anInt546;

	public static String method273(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if (0L == (var0 % 37L))
				return null;
			else {
				int var6 = 0;

				for (long var4 = var0; 0L != var4; var4 /= 37L)
					++var6;

				StringBuilder var2;
				char var3;
				for (var2 = new StringBuilder(var6); var0 != 0L; var2.append(var3)) {
					final long var7 = var0;
					var0 /= 37L;
					var3 = Class85.aCharArray688[(int) (var7 - (var0 * 37L))];
					if (var3 == 95) {
						final int var9 = var2.length() - 1;
						var2.setCharAt(var9, Character.toUpperCase(var2.charAt(var9)));
						var3 = 160;
					}
				}

				var2.reverse();
				var2.setCharAt(0, Character.toUpperCase(var2.charAt(0)));
				return var2.toString();
			}
		} else
			return null;
	}

	static int method274(final int var0, final int var1) {
		final Class124_Sub10 var2 = (Class124_Sub10) Class124_Sub10.aClass107_1034.method409(var0);
		return null != var2 ? ((var1 >= 0) && (var1 < var2.anIntArray1031.length) ? var2.anIntArray1031[var1] : 0) : 0;
	}
}

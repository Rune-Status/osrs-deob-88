public class Class58 {
	public static long method269(final CharSequence var0) {
		long var1 = 0L;
		final int var5 = var0.length();

		for (int var4 = 0; var4 < var5; ++var4) {
			var1 *= 37L;
			final char var3 = var0.charAt(var4);
			if ((var3 >= 65) && (var3 <= 90))
				var1 += (var3 + 1) - 65;
			else if ((var3 >= 97) && (var3 <= 122))
				var1 += (var3 + 1) - 97;
			else if ((var3 >= 48) && (var3 <= 57))
				var1 += (27 + var3) - 48;

			if (var1 >= 177917621779460413L)
				break;
		}

		while (((var1 % 37L) == 0L) && (0L != var1))
			var1 /= 37L;

		return var1;
	}

	static void method270(final Class94_Sub1 var0, final int var1) {
		if (null != Class124_Sub6.aClass124_Sub14_1007) {
			Class124_Sub6.aClass124_Sub14_1007.anInt1075 = 5 + (var1 * 8);
			final int var3 = Class124_Sub6.aClass124_Sub14_1007.method562(-1904775071);
			final int var2 = Class124_Sub6.aClass124_Sub14_1007.method562(-1772859908);
			var0.method617(var3, var2);
		} else {
			Class102.method403((Class94_Sub1) null, 255, 255, 0, (byte) 0, true);
			Class92.aClass94_Sub1Array729[var1] = var0;
		}
	}
}

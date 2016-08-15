public class Class34 implements Interface3 {
	static Class34 aClass34_368 = new Class34(0);
	static Class34 aClass34_370 = new Class34(1);
	static Class34 aClass34_369 = new Class34(2);
	int anInt371;

	public static String method186(final CharSequence var0, final Class117 var1) {
		if (var0 == null)
			return null;
		else {
			int var4 = 0;

			int var2;
			char var3;
			boolean var5;
			for (var2 = var0.length(); var4 < var2; ++var4) {
				var3 = var0.charAt(var4);
				var5 = (var3 == 160) || (var3 == 32) || (var3 == 95) || (var3 == 45);
				if (!var5)
					break;
			}

			while (var2 > var4) {
				var3 = var0.charAt(var2 - 1);
				var5 = (var3 == 160) || (var3 == 32) || (var3 == 95) || (var3 == 45);
				if (!var5)
					break;

				--var2;
			}

			final int var10 = var2 - var4;
			if ((var10 >= 1) && (var10 <= Class124_Sub5.method514(var1))) {
				final StringBuilder var7 = new StringBuilder(var10);

				for (int var6 = var4; var6 < var2; ++var6) {
					final char var8 = var0.charAt(var6);
					if (Class78.method321(var8)) {
						final char var9 = Class7.method34(var8);
						if (var9 != 0)
							var7.append(var9);
					}
				}

				if (var7.length() == 0)
					return null;
				else
					return var7.toString();
			} else
				return null;
		}
	}

	Class34(final int var1) {
		anInt371 = var1;
	}

	static int method187() {
		return client.aBool2196 ? 2 : 1;
	}

	public static Class124_Sub22_Sub1 method188(final int var0, final int var1) {
		Class124_Sub22_Sub1 var2 = (Class124_Sub22_Sub1) Class124_Sub22_Sub1.aClass113_1316.method434(var0);
		if (var2 != null)
			return var2;
		else {
			final byte[] var3 = Class124_Sub22_Sub1.aClass94_1328.method377(9, var0);
			var2 = new Class124_Sub22_Sub1();
			var2.anInt1318 = var0;
			if (var3 != null)
				var2.method642(new Class124_Sub14(var3));

			var2.method638();
			Class124_Sub22_Sub1.aClass113_1316.method435(var2, var0);
			return var2;
		}
	}

	@Override
	public int method11(final int var1) {
		return anInt371;
	}
}

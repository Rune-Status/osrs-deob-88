public class Class32 {
	static Class53 aClass53_337;
	String aString338;
	int anInt339;
	int anInt340;
	boolean aBool341;
	boolean aBool342;
	static Widget aClass124_Sub17_343;
	String aString344;
	static Class79 aClass79_345;

	static final void clearchilds(final int hash) {
		if (Class89.loadwidget(hash)) {
			final Widget[] var2 = Def10.widgets[hash];

			for (final Widget element : var2) {
				final Widget var1 = element;
				if (var1 != null) {
					var1.anInt1273 = 0;
					var1.anInt1274 = 0;
				}
			}

		}
	}

	public static int strConvert(final CharSequence var0, final int var1, final int var2, final byte[] var3,
			final int var4) {
		final int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			final char var7 = var0.charAt(var1 + var6);
			if (((var7 > 0) && (var7 < 128)) || ((var7 >= 160) && (var7 <= 255)))
				var3[var4 + var6] = (byte) var7;
			else if (var7 == 8364)
				var3[var4 + var6] = -128;
			else if (var7 == 8218)
				var3[var4 + var6] = -126;
			else if (var7 == 402)
				var3[var4 + var6] = -125;
			else if (var7 == 8222)
				var3[var6 + var4] = -124;
			else if (var7 == 8230)
				var3[var6 + var4] = -123;
			else if (var7 == 8224)
				var3[var4 + var6] = -122;
			else if (var7 == 8225)
				var3[var6 + var4] = -121;
			else if (var7 == 710)
				var3[var4 + var6] = -120;
			else if (var7 == 8240)
				var3[var6 + var4] = -119;
			else if (var7 == 352)
				var3[var6 + var4] = -118;
			else if (var7 == 8249)
				var3[var6 + var4] = -117;
			else if (var7 == 338)
				var3[var6 + var4] = -116;
			else if (var7 == 381)
				var3[var4 + var6] = -114;
			else if (var7 == 8216)
				var3[var6 + var4] = -111;
			else if (var7 == 8217)
				var3[var4 + var6] = -110;
			else if (var7 == 8220)
				var3[var4 + var6] = -109;
			else if (var7 == 8221)
				var3[var4 + var6] = -108;
			else if (var7 == 8226)
				var3[var4 + var6] = -107;
			else if (var7 == 8211)
				var3[var4 + var6] = -106;
			else if (var7 == 8212)
				var3[var6 + var4] = -105;
			else if (var7 == 732)
				var3[var6 + var4] = -104;
			else if (var7 == 8482)
				var3[var6 + var4] = -103;
			else if (var7 == 353)
				var3[var6 + var4] = -102;
			else if (var7 == 8250)
				var3[var4 + var6] = -101;
			else if (var7 == 339)
				var3[var6 + var4] = -100;
			else if (var7 == 382)
				var3[var4 + var6] = -98;
			else if (var7 == 376)
				var3[var4 + var6] = -97;
			else
				var3[var4 + var6] = 63;
		}

		return var5;
	}

	public static Def14 method185(final int var0) {
		Def14 var1 = (Def14) Def14.aClass113_1509.forId(var0);
		if (null == var1) {
			final byte[] var2 = Def14.aClass94_1508.decode(14, var0);
			var1 = new Def14();
			if (var2 != null)
				var1.method725(new RSBuf(var2));

			Def14.aClass113_1509.map(var1, var0);
			return var1;
		} else
			return var1;
	}
}

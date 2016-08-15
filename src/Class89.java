public class Class89 {
	static Class56 aClass56_704;
	static Class124_Sub22_Sub16_Sub2 aClass124_Sub22_Sub16_Sub2_706;
	public static boolean[] aBoolArray707 = new boolean[] { true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	public static int[] anIntArray705 = new int[99];

	public static Class124_Sub22_Sub17 method345(final Class94 var0, final Class94 var1, final int var2,
			final boolean var3) {
		boolean var4 = true;
		final int[] var5 = var0.method372(var2);

		for (final int element : var5) {
			final byte[] var7 = var0.method380(var2, element);
			if (var7 == null)
				var4 = false;
			else {
				final int var8 = ((var7[0] & 255) << 8) | (var7[1] & 255);
				final byte[] var9 = var1.method380(var8, 0);
				if (var9 == null)
					var4 = false;
			}
		}

		if (!var4)
			return null;
		else
			try {
				return new Class124_Sub22_Sub17(var0, var1, var2, var3);
			} catch (final Exception var11) {
				return null;
			}
	}

	static {
		int var2 = 0;

		for (int var0 = 0; var0 < 99; ++var0) {
			final int var1 = 1 + var0;
			final int var3 = (int) (var1 + (300.0D * Math.pow(2.0D, var1 / 7.0D)));
			var2 += var3;
			anIntArray705[var0] = var2 / 4;
		}

	}

	public static boolean method346(final int var0) {
		System.out.printf("load %d %n", var0);
		if (Class124_Sub17.aBoolArray1267[var0])
			return true;
		else if (!Class124_Sub17.aClass94_1145.method375(var0))
			return false;
		else {
			final int var1 = Class124_Sub17.aClass94_1145.method382(var0);
			System.out.printf("%d len %d %n", var0, var1);
			if (var1 == 0) {
				Class124_Sub17.aBoolArray1267[var0] = true;
				return true;
			} else {
				if (null == Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0])
					Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0] = new Class124_Sub17[var1];

				for (int var2 = 0; var2 < var1; ++var2)
					if (null == Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0][var2]) {
						final byte[] var3 = Class124_Sub17.aClass94_1145.method377(var0, var2);
						if (null != var3) {
							Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0][var2] = new Class124_Sub17();
							Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0][var2].anInt1284 = (var0 << 16)
									+ var2;
							if (var3[0] == -1)
								Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0][var2]
										.method621(new Class124_Sub14(var3));
							else
								Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0][var2]
										.method620(new Class124_Sub14(var3));
						}
					}

				Class124_Sub17.aBoolArray1267[var0] = true;
				return true;
			}
		}
	}
}

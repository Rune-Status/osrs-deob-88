public class Class89 {
	static Class56 aClass56_704;
	static Class124_Sub22_Sub16_Sub2 aClass124_Sub22_Sub16_Sub2_706;
	public static boolean[] aBoolArray707 = new boolean[] { true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	public static int[] anIntArray705 = new int[99];

	public static Class124_Sub22_Sub17 method345(final CacheArch var0, final CacheArch var1, final int var2,
			final boolean var3) {
		boolean var4 = true;
		final int[] var5 = var0.method372(var2);

		for (final int element : var5) {
			final byte[] var7 = var0.decode2(var2, element);
			if (var7 == null)
				var4 = false;
			else {
				final int var8 = ((var7[0] & 255) << 8) | (var7[1] & 255);
				final byte[] var9 = var1.decode2(var8, 0);
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

	public static boolean loadwidget(final int var0) {
		System.out.printf("load %d %n", var0);
		if (Widget.widgetLoaded[var0])
			return true;
		else if (!Widget.aClass94_1145.validWidget(var0))
			return false;
		else {
			final int var1 = Widget.aClass94_1145.widgetLen(var0);
			System.out.printf("%d len %d %n", var0, var1);
			if (var1 == 0) {
				Widget.widgetLoaded[var0] = true;
				return true;
			} else {
				if (null == Def10.widgets[var0])
					Def10.widgets[var0] = new Widget[var1];

				for (int var2 = 0; var2 < var1; ++var2)
					if (null == Def10.widgets[var0][var2]) {
						final byte[] var3 = Widget.aClass94_1145.decode(var0, var2);
						if (null != var3) {
							Def10.widgets[var0][var2] = new Widget();
							Def10.widgets[var0][var2].anInt1284 = (var0 << 16)
									+ var2;
							if (var3[0] == -1)
								Def10.widgets[var0][var2]
										.method621(new RSBuf(var3));
							else
								Def10.widgets[var0][var2]
										.method620(new RSBuf(var3));
						}
					}

				Widget.widgetLoaded[var0] = true;
				return true;
			}
		}
	}
}

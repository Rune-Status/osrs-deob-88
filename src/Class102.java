public class Class102 {
	public static int[] anIntArray789 = new int[] { 8, 0, 2, 0, 0, 0, -2, -2, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, 12, 0, 0,
			0, 0, 0, 6, 0, 0, 0, -2, 5, 5, 0, 0, 0, 0, 0, 3, 0, 0, 1, 10, -1, 0, 0, 6, 0, 0, -2, 4, 0, 8, -2, 1, 0, 2,
			0, 2, 0, 2, 6, 8, 6, 6, -2, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 28, 0, 0, 0, 0, 4,
			0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 5, 0, 0, 0, 0, 0,
			-2, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 6, 0, 0,
			0, -2, 7, 0, 0, 0, 8, -2, 0, 0, 2, 0, 0, -2, 0, 0, 0, -2, 0, 0, 4, 0, 0, 15, 0, -2, 10, 3, 0, 0, 0, 0, 0, 0,
			2, -1, 0, 0, 20, 4, 0, -1, 0, 0, 0, 14, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0,
			0, 2, 4, 0, 0, 0, 4, 0, 0, 0, 0, 0, 5, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 4 };

	static void method403(final Class94_Sub1 var0, final int var1, final int var2, final int var3, final byte var4,
			final boolean var5) {
		final long var6 = var2 + (var1 << 16);
		Class124_Sub22_Sub21 var8 = (Class124_Sub22_Sub21) Class92.aClass107_718.method409(var6);
		if (var8 == null) {
			var8 = (Class124_Sub22_Sub21) Class92.aClass107_730.method409(var6);
			if (var8 == null) {
				var8 = (Class124_Sub22_Sub21) Class92.aClass107_728.method409(var6);
				if (null != var8) {
					if (var5) {
						var8.method637();
						Class92.aClass107_718.method412(var8, var6);
						--Class92.anInt723;
						++Class92.anInt719;
					}

				} else {
					if (!var5) {
						var8 = (Class124_Sub22_Sub21) Class92.aClass107_724.method409(var6);
						if (var8 != null)
							return;
					}

					var8 = new Class124_Sub22_Sub21();
					var8.aClass94_Sub1_1651 = var0;
					var8.anInt1648 = var3;
					var8.aByte1650 = var4;
					if (var5) {
						Class92.aClass107_718.method412(var8, var6);
						++Class92.anInt719;
					} else {
						Class92.aClass108_722.method416(var8);
						Class92.aClass107_728.method412(var8, var6);
						++Class92.anInt723;
					}

				}
			}
		}
	}

	public static boolean method404(final CharSequence var0) {
		return Class55.method262(var0, 10, true);
	}
}

import java.io.File;
import java.util.Comparator;

final class Class25 implements Comparator {
	static File aFile278;
	static Class94_Sub1 aClass94_Sub1_279;
	// $FF: synthetic field
	boolean val$preferOwnWorld;

	public static void method159(final int var0, final CacheArch var1, final int var2, final int var3, final int var4,
			final boolean var5) {
		Class96.anInt770 = 1;
		Class96.aClass94_767 = var1;
		Class96.anInt768 = var2;
		Class105.anInt805 = var3;
		Class80.anInt644 = var4;
		Class124_Sub22_Sub19_Sub3_Sub1.aBool1938 = var5;
		Class96.anInt766 = var0;
	}

	int method160(final Class120 var1, final Class120 var2) {
		if (var2.anInt851 == var1.anInt851)
			return 0;
		else {
			if (val$preferOwnWorld) {
				if (var1.anInt851 == client.anInt2079)
					return -1;

				if (client.anInt2079 == var2.anInt851)
					return 1;
			}

			return var1.anInt851 >= var2.anInt851 ? 1 : -1;
		}
	}

	@Override
	public boolean equals(final Object var1) {
		return super.equals(var1);
	}

	@Override
	public int compare(final Object var1, final Object var2) {
		return method160((Class120) var1, (Class120) var2);
	}

	Class25(final boolean var1) {
		val$preferOwnWorld = var1;
	}

	static void method161(final Widget var0, final int var1, final int var2, final boolean var3) {
		final int var4 = var0.anInt1168;
		final int var5 = var0.anInt1169;
		if (var0.anInt1210 == 0)
			var0.anInt1168 = var0.anInt1257;
		else if (var0.anInt1210 == 1)
			var0.anInt1168 = var1 - var0.anInt1257;
		else if (var0.anInt1210 == 2)
			var0.anInt1168 = (var0.anInt1257 * var1) >> 14;

		if (var0.anInt1161 == 0)
			var0.anInt1169 = var0.anInt1165;
		else if (var0.anInt1161 == 1)
			var0.anInt1169 = var2 - var0.anInt1165;
		else if (var0.anInt1161 == 2)
			var0.anInt1169 = (var2 * var0.anInt1165) >> 14;

		if (var0.anInt1210 == 4)
			var0.anInt1168 = (var0.anInt1170 * var0.anInt1169) / var0.anInt1171;

		if (var0.anInt1161 == 4)
			var0.anInt1169 = (var0.anInt1171 * var0.anInt1168) / var0.anInt1170;

		if (client.aBool2021 && (var0.anInt1191 == 0))
			if ((var0.anInt1169 < 5) && (var0.anInt1168 < 5)) {
				var0.anInt1169 = 5;
				var0.anInt1168 = 5;
			} else {
				if (var0.anInt1169 <= 0)
					var0.anInt1169 = 5;

				if (var0.anInt1168 <= 0)
					var0.anInt1168 = 5;
			}

		if (var0.anInt1157 == 1337)
			client.aClass124_Sub17_2154 = var0;

		if (var3 && (var0.anObjectArray1184 != null) && ((var4 != var0.anInt1168) || (var5 != var0.anInt1169))) {
			final Class124_Sub6 var6 = new Class124_Sub6();
			var6.aClass124_Sub17_994 = var0;
			var6.anObjectArray995 = var0.anObjectArray1184;
			client.aClass111_2181.method424(var6);
		}

	}
}

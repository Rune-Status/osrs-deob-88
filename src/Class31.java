import java.awt.Component;
import java.util.Date;

public class Class31 implements Interface2 {
	static Widget aClass124_Sub17_335;
	int anInt332 = 0;
	Class111 aClass111_330 = new Class111();
	double aDouble333 = 1.0D;
	int anInt334 = 128;
	Class94 aClass94_329;
	int anInt331;
	Class124_Sub8[] aClass124_Sub8Array336;

	@Override
	public int[] method9(final int var1, final int var2) {
		final Class124_Sub8 var3 = aClass124_Sub8Array336[var1];
		if (null != var3) {
			if (null != var3.anIntArray1015) {
				aClass111_330.method425(var3);
				var3.aBool1024 = true;
				return var3.anIntArray1015;
			}

			final boolean var5 = var3.method529(aDouble333, anInt334, aClass94_329);
			if (var5) {
				if (anInt332 != 0)
					--anInt332;
				else {
					final Class124_Sub8 var4 = (Class124_Sub8) aClass111_330.method432();
					var4.method530();
				}

				aClass111_330.method425(var3);
				var3.aBool1024 = true;
				return var3.anIntArray1015;
			}
		}

		return null;
	}

	public Class31(final Class94 var1, final Class94 var2, final int var3, final double var4, final int var6) {
		aClass94_329 = var2;
		anInt331 = var3;
		anInt332 = anInt331;
		aDouble333 = var4;
		anInt334 = var6;
		final int[] var9 = var1.method372(0);
		final int var8 = var9.length;
		aClass124_Sub8Array336 = new Class124_Sub8[var1.widgetLen(0)];

		for (int var7 = 0; var7 < var8; ++var7) {
			final RSBuf var10 = new RSBuf(var1.decode(0, var9[var7]));
			aClass124_Sub8Array336[var9[var7]] = new Class124_Sub8(var10);
		}

	}

	public void method176(final double var1) {
		aDouble333 = var1;
		method177();
	}

	@Override
	public boolean method8(final int var1, final int var2) {
		return anInt334 == 64;
	}

	public void method177() {
		for (final Class124_Sub8 element : aClass124_Sub8Array336)
			if (null != element)
				element.method530();

		aClass111_330 = new Class111();
		anInt332 = anInt331;
	}

	public void method178(final int var1) {
		for (final Class124_Sub8 element : aClass124_Sub8Array336) {
			final Class124_Sub8 var3 = element;
			if ((null != var3) && (var3.anInt1022 != 0) && var3.aBool1024) {
				var3.method531(var1);
				var3.aBool1024 = false;
			}
		}

	}

	static final int method179(final int var0, int var1, final int var2) {
		if (var2 > 179)
			var1 /= 2;

		if (var2 > 192)
			var1 /= 2;

		if (var2 > 217)
			var1 /= 2;

		if (var2 > 243)
			var1 /= 2;

		final int var3 = (var2 / 2) + ((var1 / 32) << 7) + ((var0 / 4) << 10);
		return var3;
	}

	static void method180() {
		if (client.aBool2137) {
			final Widget var1 = RuntimeException_Sub1.method1010(Class124_Sub10.anInt1033, client.anInt2138,
					172659367);
			if ((var1 != null) && (var1.anObjectArray1243 != null)) {
				final Class124_Sub6 var0 = new Class124_Sub6();
				var0.aClass124_Sub17_994 = var1;
				var0.anObjectArray995 = var1.anObjectArray1243;
				Class124_Sub22_Sub19_Sub3_Sub2.method1048(var0);
			}

			client.aBool2137 = false;
			Class124_Sub22_Sub10.method723(var1);
		}
	}

	@Override
	public boolean method7(final int var1, final int var2) {
		return aClass124_Sub8Array336[var1].aBool1019;
	}

	@Override
	public int method10(final int var1, final int var2) {
		return aClass124_Sub8Array336[var1] != null ? aClass124_Sub8Array336[var1].anInt1017 : 0;
	}

	public static String method181(final long var0) {
		Class68.aCalendar573.setTime(new Date(var0));
		final int var7 = Class68.aCalendar573.get(7);
		final int var3 = Class68.aCalendar573.get(5);
		final int var5 = Class68.aCalendar573.get(2);
		final int var2 = Class68.aCalendar573.get(1);
		final int var4 = Class68.aCalendar573.get(11);
		final int var6 = Class68.aCalendar573.get(12);
		final int var8 = Class68.aCalendar573.get(13);
		return Class68.aStringArray572[var7 - 1] + ", " + (var3 / 10) + (var3 % 10) + "-"
				+ Class68.aStringArrayArray574[0][var5] + "-" + var2 + " " + (var4 / 10) + (var4 % 10) + ":"
				+ (var6 / 10) + (var6 % 10) + ":" + (var8 / 10) + (var8 % 10) + " GMT";
	}

	public static void method182(final Component var0) {
		var0.removeKeyListener(Class84.aClass84_683);
		var0.removeFocusListener(Class84.aClass84_683);
		Class84.anInt682 = -1;
	}
}

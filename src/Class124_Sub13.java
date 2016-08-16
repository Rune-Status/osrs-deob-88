import java.awt.Container;
import java.awt.Insets;

import netscape.javascript.JSObject;

public final class Class124_Sub13 extends Node {
	Class124_Sub4_Sub1 aClass124_Sub4_Sub1_1056;
	int anInt1057;
	int anInt1058;
	int anInt1063;
	int anInt1065;
	int anInt1066;
	int anInt1068;
	Def6 aClass124_Sub22_Sub6_1070;
	static int anInt1071;
	public static int anInt1072;
	int anInt1060;
	int anInt1062;
	int anInt1059;
	int anInt1061;
	int[] anIntArray1067;
	Class124_Sub4_Sub1 aClass124_Sub4_Sub1_1064;
	static Class111 aClass111_1069 = new Class111();

	void method540() {
		final int var1 = anInt1060;
		final Def6 var2 = aClass124_Sub22_Sub6_1070.method683();
		if (var2 != null) {
			anInt1060 = var2.anInt1430;
			anInt1062 = var2.anInt1431 * 128;
			anInt1059 = var2.anInt1407;
			anInt1061 = var2.anInt1433;
			anIntArray1067 = var2.anIntArray1421;
		} else {
			anInt1060 = -1;
			anInt1062 = 0;
			anInt1059 = 0;
			anInt1061 = 0;
			anIntArray1067 = null;
		}

		if ((var1 != anInt1060) && (aClass124_Sub4_Sub1_1064 != null)) {
			Class56_Sub2.aClass124_Sub4_Sub2_1078.method822(aClass124_Sub4_Sub1_1064);
			aClass124_Sub4_Sub1_1064 = null;
		}

	}

	static void method541(final int var0, final int var1) {
		final Class3 var2 = Class84.aClass3_674;
		Class57.method267(var2.anInt21, var2.anInt16, var2.anInt18, var2.anInt20, var2.aString19, var2.aString19, var0,
				var1);
		Class84.aClass3_674 = null;
	}

	static void method542() {
		final client var0 = Class80.aclient645;
		synchronized (var0) {
			final Container var1 = Class80.aclient645.method1059();
			if (var1 != null) {
				Class124_Sub5.anInt989 = Math.max(var1.getSize().width, Class51.anInt489);
				Class124_Sub22_Sub19_Sub1.anInt1664 = Math.max(var1.getSize().height, Def3.anInt1356);
				Insets var2;
				if (var1 == Class69.aFrame578) {
					var2 = Class69.aFrame578.getInsets();
					Class124_Sub5.anInt989 -= var2.right + var2.left;
					Class124_Sub22_Sub19_Sub1.anInt1664 -= var2.top + var2.bottom;
				}

				if (Class124_Sub5.anInt989 <= 0)
					Class124_Sub5.anInt989 = 1;

				if (Class124_Sub22_Sub19_Sub1.anInt1664 <= 0)
					Class124_Sub22_Sub19_Sub1.anInt1664 = 1;

				if (Class34.method187() == 1) {
					Class56_Sub2.anInt1083 = client.anInt2071;
					Class81.anInt662 = client.anInt2198 * 503;
				} else {
					Class56_Sub2.anInt1083 = Math.min(Class124_Sub5.anInt989, 7680);
					Class81.anInt662 = Math.min(Class124_Sub22_Sub19_Sub1.anInt1664, 2160);
				}

				Applet_Sub1.anInt1973 = (Class124_Sub5.anInt989 - Class56_Sub2.anInt1083) / 2;
				Applet_Sub1.anInt1974 = 0;
				Class124_Sub5.aCanvas990.setSize(Class56_Sub2.anInt1083, Class81.anInt662);
				Class64.aClass9_558 = Def8.method701(Class56_Sub2.anInt1083, Class81.anInt662,
						Class124_Sub5.aCanvas990);
				if (Class69.aFrame578 == var1) {
					var2 = Class69.aFrame578.getInsets();
					Class124_Sub5.aCanvas990.setLocation(Applet_Sub1.anInt1973 + var2.left,
							Applet_Sub1.anInt1974 + var2.top);
				} else
					Class124_Sub5.aCanvas990.setLocation(Applet_Sub1.anInt1973, Applet_Sub1.anInt1974);

				int var3 = Class56_Sub2.anInt1083;
				int var4 = Class81.anInt662;
				if (Class124_Sub5.anInt989 < var3)
					var3 = Class124_Sub5.anInt989;

				if (Class124_Sub22_Sub19_Sub1.anInt1664 < var4)
					var4 = Class124_Sub22_Sub19_Sub1.anInt1664;

				if (Class57.aClass22_538 != null)
					try {
						final client var5 = Class80.aclient645;
						final Object[] var6 = new Object[] { Integer.valueOf(Class34.method187()) };
						JSObject.getWindow(var5).call("resize", var6);
					} catch (final Throwable var8) {
						;
					}

				if (client.anInt2142 != -1)
					Class122.method449(client.anInt2142, Class56_Sub2.anInt1083, Class81.anInt662, true);

				Class124_Sub22_Sub19_Sub1.method885();
			}
		}
	}

	static int method543(char var0) {
		int var1 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var1 = (var0 << 4) + 1;
		}

		return var1;
	}
}

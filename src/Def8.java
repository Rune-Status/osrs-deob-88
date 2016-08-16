import java.awt.Component;

public class Def8 extends Class124_Sub22 {
	static Class94 aClass94_1444;
	static String aString1452;
	static Class113 aClass113_1443 = new Class113(64);
	public String aString1446 = "null";
	public int anInt1447 = 0;
	public char aChar1449;
	public char aChar1445;
	public int anInt1442;
	public int[] anIntArray1448;
	public String[] aStringArray1450;
	public int[] anIntArray1451;

	static void method698() {
		client.aClass124_Sub14_Sub1_2024.method837(140);
		client.aClass124_Sub14_Sub1_2024.writeByte(Class34.method187());
		client.aClass124_Sub14_Sub1_2024.writeShort(Class56_Sub2.anInt1083);
		client.aClass124_Sub14_Sub1_2024.writeShort(Class81.anInt662);
	}

	void method699(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method558();
			if (var2 == 0)
				return;

			method702(var1, var2);
		}
	}

	public static int method700(final byte[] var0, final int var1) {
		return Class41.method213(var0, 0, var1);
	}

	public static Class9 method701(final int var0, final int var1, final Component var2) {
		try {
			final Class9_Sub2 var3 = new Class9_Sub2();
			var3.method51(var0, var1, var2, 1489831030);
			return var3;
		} catch (final Throwable var5) {
			final Class9_Sub1 var4 = new Class9_Sub1();
			var4.method51(var0, var1, var2, 1489831030);
			return var4;
		}
	}

	void method702(final RSBuf var1, final int var2) {
		if (var2 == 1)
			aChar1449 = (char) var1.method558();
		else if (var2 == 2)
			aChar1445 = (char) var1.method558();
		else if (var2 == 3)
			aString1446 = var1.method597();
		else if (var2 == 4)
			anInt1442 = var1.method562(-1021237136);
		else {
			int var3;
			if (var2 == 5) {
				anInt1447 = var1.method560();
				anIntArray1448 = new int[anInt1447];
				aStringArray1450 = new String[anInt1447];

				for (var3 = 0; var3 < anInt1447; ++var3) {
					anIntArray1448[var3] = var1.method562(-2147263524);
					aStringArray1450[var3] = var1.method597();
				}
			} else if (var2 == 6) {
				anInt1447 = var1.method560();
				anIntArray1448 = new int[anInt1447];
				anIntArray1451 = new int[anInt1447];

				for (var3 = 0; var3 < anInt1447; ++var3) {
					anIntArray1448[var3] = var1.method562(659503051);
					anIntArray1451[var3] = var1.method562(1118405470);
				}
			}
		}

	}

	public static int method703(final CharSequence var0) {
		final int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			final char var4 = var0.charAt(var3);
			if (var4 <= 127)
				++var2;
			else if (var4 <= 2047)
				var2 += 2;
			else
				var2 += 3;
		}

		return var2;
	}
}

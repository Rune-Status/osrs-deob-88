public class Class124_Sub22_Sub12 extends Class124_Sub22 {
	int anInt1517;
	static Class94 aClass94_1526;
	int anInt1528;
	public int anInt1519 = -1;
	int anInt1516 = 128;
	int anInt1524 = 128;
	int anInt1525 = 0;
	int anInt1523 = 0;
	int anInt1527 = 0;
	short[] aShortArray1520;
	short[] aShortArray1521;
	short[] aShortArray1514;
	short[] aShortArray1522;
	public static Class113 aClass113_1515 = new Class113(64);
	public static Class113 aClass113_1518 = new Class113(30);

	void method731(final Class124_Sub14 var1) {
		while (true) {
			final int var2 = var1.method558();
			if (var2 == 0)
				return;

			method732(var1, var2);
		}
	}

	void method732(final Class124_Sub14 var1, final int var2) {
		if (var2 == 1)
			anInt1528 = var1.method560();
		else if (var2 == 2)
			anInt1519 = var1.method560();
		else if (var2 == 4)
			anInt1516 = var1.method560();
		else if (var2 == 5)
			anInt1524 = var1.method560();
		else if (var2 == 6)
			anInt1525 = var1.method560();
		else if (var2 == 7)
			anInt1523 = var1.method558();
		else if (var2 == 8)
			anInt1527 = var1.method558();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var4 = var1.method558();
				aShortArray1520 = new short[var4];
				aShortArray1521 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1520[var3] = (short) var1.method560();
					aShortArray1521[var3] = (short) var1.method560();
				}
			} else if (var2 == 41) {
				var4 = var1.method558();
				aShortArray1514 = new short[var4];
				aShortArray1522 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1514[var3] = (short) var1.method560();
					aShortArray1522[var3] = (short) var1.method560();
				}
			}
		}

	}

	public final Class124_Sub22_Sub19_Sub7 method733(final int var1) {
		Class124_Sub22_Sub19_Sub7 var2 = (Class124_Sub22_Sub19_Sub7) aClass113_1518.method434(anInt1517);
		if (var2 == null) {
			final Class124_Sub22_Sub19_Sub4 var3 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1526, anInt1528, 0);
			if (var3 == null)
				return null;

			int var4;
			if (null != aShortArray1520)
				for (var4 = 0; var4 < aShortArray1520.length; ++var4)
					var3.method951(aShortArray1520[var4], aShortArray1521[var4]);

			if (null != aShortArray1514)
				for (var4 = 0; var4 < aShortArray1514.length; ++var4)
					var3.method939(aShortArray1514[var4], aShortArray1522[var4]);

			var2 = var3.method945(anInt1523 + 64, anInt1527 + 850, -30, -50, -30);
			aClass113_1518.method435(var2, anInt1517);
		}

		Class124_Sub22_Sub19_Sub7 var5;
		if ((anInt1519 != -1) && (var1 != -1))
			var5 = Class124_Sub22_Sub14.method750(anInt1519).method743(var2, var1);
		else
			var5 = var2.method1004(true);

		if ((anInt1516 != 128) || (anInt1524 != 128))
			var5.method1002(anInt1516, anInt1524, anInt1516);

		if (anInt1525 != 0) {
			if (anInt1525 == 90)
				var5.method994();

			if (anInt1525 == 180) {
				var5.method994();
				var5.method994();
			}

			if (anInt1525 == 270) {
				var5.method994();
				var5.method994();
				var5.method994();
			}
		}

		return var5;
	}

	static void method734(final String var0, final String var1, final String var2) {
		Class4.aString41 = var0;
		Class4.aString32 = var1;
		Class4.aString47 = var2;
	}

	static void method735(final int var0) {
		client.aLong2195 = 0L;
		if (var0 >= 2)
			client.aBool2196 = true;
		else
			client.aBool2196 = false;

		Class124_Sub13.method542();
		if (client.anInt1992 >= 25)
			Class124_Sub22_Sub8.method698();

		Applet_Sub1.aBool1968 = true;
	}

	public static Class124_Sub22_Sub6 method736(final int var0) {
		Class124_Sub22_Sub6 var1 = (Class124_Sub22_Sub6) Class124_Sub22_Sub6.aClass113_1410.method434(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class124_Sub22_Sub6.aClass94_1426.method377(6, var0);
			var1 = new Class124_Sub22_Sub6();
			var1.anInt1434 = var0;
			if (var2 != null)
				var1.method685(new Class124_Sub14(var2));

			var1.method686();
			if (var1.aBool1425) {
				var1.anInt1403 = 0;
				var1.aBool1436 = false;
			}

			Class124_Sub22_Sub6.aClass113_1410.method435(var1, var0);
			return var1;
		}
	}

	static final void method737(final int var0, final int var1) {
		int var2 = Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1018("Choose Option");

		int var3;
		for (var3 = 0; var3 < client.anInt2124; ++var3) {
			final Class124_Sub22_Sub16_Sub4_Sub1 var4 = Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407;
			String var5;
			if (client.aStringArray2130[var3].length() > 0)
				var5 = client.aStringArray2129[var3] + " " + client.aStringArray2130[var3];
			else
				var5 = client.aStringArray2129[var3];

			final int var7 = var4.method1018(var5);
			if (var7 > var2)
				var2 = var7;
		}

		var2 += 8;
		var3 = 22 + (client.anInt2124 * 15);
		int var8 = var0 - (var2 / 2);
		if ((var2 + var8) > Class56_Sub2.anInt1083)
			var8 = Class56_Sub2.anInt1083 - var2;

		if (var8 < 0)
			var8 = 0;

		int var6 = var1;
		if ((var3 + var1) > Class81.anInt662)
			var6 = Class81.anInt662 - var3;

		if (var6 < 0)
			var6 = 0;

		client.aBool2240 = true;
		Class117.anInt831 = var8;
		Class60.anInt541 = var6;
		Class124_Sub11.anInt1051 = var2;
		Class22.anInt253 = 22 + (client.anInt2124 * 15);
	}
}

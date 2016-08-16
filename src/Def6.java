public class Def6 extends Node2 {
	static Class94 aClass94_1387;
	public static char aChar1394;
	static Class94 aClass94_1426;
	public int anInt1434;
	static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array1435;
	public String aString1396 = "null";
	int[] anIntArray1385;
	int[] anIntArray1414;
	public int anInt1401 = 1;
	public int anInt1432 = 1;
	public int anInt1403 = 2;
	public boolean aBool1436 = true;
	public int anInt1405 = -1;
	int anInt1406 = -1;
	boolean aBool1388 = false;
	public boolean aBool1408 = false;
	public int anInt1409 = -1;
	public int anInt1423 = 16;
	int anInt1411 = 0;
	int anInt1412 = 0;
	short[] aShortArray1397;
	short[] aShortArray1398;
	short[] aShortArray1393;
	short[] aShortArray1404;
	public int anInt1390 = -1;
	boolean aBool1416 = false;
	public boolean aBool1417 = true;
	int anInt1418 = 128;
	int anInt1419 = 128;
	int anInt1420 = 128;
	public int anInt1402 = -1;
	int anInt1399 = 0;
	int anInt1422 = 0;
	int anInt1424 = 0;
	public boolean aBool1415 = false;
	boolean aBool1425 = false;
	public int anInt1386 = -1;
	int anInt1395 = -1;
	public int anInt1430 = -1;
	public int anInt1431 = 0;
	int anInt1429 = -1;
	public int anInt1407 = 0;
	public int anInt1433 = 0;
	public int[] anIntArray1421;
	public int[] anIntArray1427;
	public String[] aStringArray1413 = new String[5];
	static boolean aBool1400 = false;
	static Class113 aClass113_1410 = new Class113(64);
	public static Class113 aClass113_1389 = new Class113(500);
	static Class113 aClass113_1428 = new Class113(30);
	static Class113 aClass113_1391 = new Class113(30);
	static Class124_Sub22_Sub19_Sub4[] aClass124_Sub22_Sub19_Sub4Array1392 = new Class124_Sub22_Sub19_Sub4[4];

	void method678(final RSBuf var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readByteU();
			if (var3 > 0)
				if ((anIntArray1414 != null) && !aBool1400)
					var1.pos += var3 * 3;
				else {
					anIntArray1385 = new int[var3];
					anIntArray1414 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						anIntArray1414[var4] = var1.readShortU();
						anIntArray1385[var4] = var1.readByteU();
					}
				}
		} else if (var2 == 2)
			aString1396 = var1.readStr2();
		else if (var2 == 5) {
			var3 = var1.readByteU();
			if (var3 > 0)
				if ((anIntArray1414 != null) && !aBool1400)
					var1.pos += 2 * var3;
				else {
					anIntArray1385 = null;
					anIntArray1414 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4)
						anIntArray1414[var4] = var1.readShortU();
				}
		} else if (var2 == 14)
			anInt1401 = var1.readByteU();
		else if (var2 == 15)
			anInt1432 = var1.readByteU();
		else if (var2 == 17) {
			anInt1403 = 0;
			aBool1436 = false;
		} else if (var2 == 18)
			aBool1436 = false;
		else if (var2 == 19)
			anInt1405 = var1.readByteU();
		else if (var2 == 21)
			anInt1406 = 0;
		else if (var2 != 22) {
			if (var2 != 23) {
				if (var2 == 24) {
					anInt1409 = var1.readShortU();
					if (anInt1409 == '\uffff')
						anInt1409 = -1;
				} else if (var2 == 27)
					anInt1403 = 1;
				else if (var2 == 28)
					anInt1423 = var1.readByteU();
				else if (var2 == 29)
					anInt1411 = var1.readByte();
				else if (var2 == 39)
					anInt1412 = var1.readByte() * 25;
				else if ((var2 >= 30) && (var2 < 35)) {
					aStringArray1413[var2 - 30] = var1.readStr2();
					if (aStringArray1413[var2 - 30].equalsIgnoreCase("Hidden"))
						aStringArray1413[var2 - 30] = null;
				} else if (var2 == 40) {
					var3 = var1.readByteU();
					aShortArray1397 = new short[var3];
					aShortArray1398 = new short[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						aShortArray1397[var4] = (short) var1.readShortU();
						aShortArray1398[var4] = (short) var1.readShortU();
					}
				} else if (var2 == 41) {
					var3 = var1.readByteU();
					aShortArray1393 = new short[var3];
					aShortArray1404 = new short[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						aShortArray1393[var4] = (short) var1.readShortU();
						aShortArray1404[var4] = (short) var1.readShortU();
					}
				} else if (var2 == 60)
					anInt1390 = var1.readShortU();
				else if (var2 == 62)
					aBool1416 = true;
				else if (var2 == 64)
					aBool1417 = false;
				else if (var2 == 65)
					anInt1418 = var1.readShortU();
				else if (var2 == 66)
					anInt1419 = var1.readShortU();
				else if (var2 == 67)
					anInt1420 = var1.readShortU();
				else if (var2 == 68)
					anInt1402 = var1.readShortU();
				else if (var2 == 69)
					var1.readByteU();
				else if (var2 == 70)
					anInt1399 = var1.readShort();
				else if (var2 == 71)
					anInt1422 = var1.readShort();
				else if (var2 == 72)
					anInt1424 = var1.readShort();
				else if (var2 == 73)
					aBool1415 = true;
				else if (var2 == 74)
					aBool1425 = true;
				else if (var2 == 75)
					anInt1386 = var1.readByteU();
				else if (var2 == 77) {
					anInt1395 = var1.readShortU();
					if (anInt1395 == '\uffff')
						anInt1395 = -1;

					anInt1429 = var1.readShortU();
					if (anInt1429 == '\uffff')
						anInt1429 = -1;

					var3 = var1.readByteU();
					anIntArray1427 = new int[var3 + 1];

					for (var4 = 0; var4 <= var3; ++var4) {
						anIntArray1427[var4] = var1.readShortU();
						if (anIntArray1427[var4] == '\uffff')
							anIntArray1427[var4] = -1;
					}
				} else if (var2 == 78) {
					anInt1430 = var1.readShortU();
					anInt1431 = var1.readByteU();
				} else if (var2 == 79) {
					anInt1407 = var1.readShortU();
					anInt1433 = var1.readShortU();
					anInt1431 = var1.readByteU();
					var3 = var1.readByteU();
					anIntArray1421 = new int[var3];

					for (var4 = 0; var4 < var3; ++var4)
						anIntArray1421[var4] = var1.readShortU();
				} else if (var2 == 81)
					anInt1406 = var1.readByteU() * 256;
			} else
				aBool1408 = true;
		} else
			aBool1388 = true;

	}

	public final boolean method679(final int var1) {
		if (null != anIntArray1385) {
			for (int var4 = 0; var4 < anIntArray1385.length; ++var4)
				if (var1 == anIntArray1385[var4])
					return aClass94_1387.valid(anIntArray1414[var4] & '\uffff', 0);

			return true;
		} else if (anIntArray1414 == null)
			return true;
		else if (var1 != 10)
			return true;
		else {
			boolean var3 = true;

			for (final int element : anIntArray1414)
				var3 &= aClass94_1387.valid(element & '\uffff', 0);

			return var3;
		}
	}

	public final boolean method680() {
		if (null == anIntArray1414)
			return true;
		else {
			boolean var2 = true;

			for (final int element : anIntArray1414)
				var2 &= aClass94_1387.valid(element & '\uffff', 0);

			return var2;
		}
	}

	public final Class124_Sub22_Sub19 method681(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var9;
		if (anIntArray1385 == null)
			var9 = var2 + (anInt1434 << 10);
		else
			var9 = var2 + (anInt1434 << 10) + (var1 << 3);

		Object var8 = aClass113_1428.method434(var9);
		if (null == var8) {
			final Class124_Sub22_Sub19_Sub4 var7 = method687(var1, var2);
			if (null == var7)
				return null;

			if (!aBool1388)
				var8 = var7.method945(64 + anInt1411, 768 + anInt1412, -50, -10, -50);
			else {
				var7.aShort1778 = (short) (anInt1411 + 64);
				var7.aShort1779 = (short) (768 + anInt1412);
				var7.method950();
				var8 = var7;
			}

			aClass113_1428.method435((Node2) var8, var9);
		}

		if (aBool1388)
			var8 = ((Class124_Sub22_Sub19_Sub4) var8).method930();

		if (anInt1406 >= 0)
			if (var8 instanceof Class124_Sub22_Sub19_Sub7)
				var8 = ((Class124_Sub22_Sub19_Sub7) var8).method1008(var3, var4, var5, var6, true, anInt1406);
			else if (var8 instanceof Class124_Sub22_Sub19_Sub4)
				var8 = ((Class124_Sub22_Sub19_Sub4) var8).method931(var3, var4, var5, var6, true, anInt1406);

		return (Class124_Sub22_Sub19) var8;
	}

	public final Class124_Sub22_Sub19_Sub7 method682(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6) {
		long var9;
		if (null == anIntArray1385)
			var9 = var2 + (anInt1434 << 10);
		else
			var9 = (anInt1434 << 10) + (var1 << 3) + var2;

		Class124_Sub22_Sub19_Sub7 var7 = (Class124_Sub22_Sub19_Sub7) aClass113_1391.method434(var9);
		if (null == var7) {
			final Class124_Sub22_Sub19_Sub4 var8 = method687(var1, var2);
			if (var8 == null)
				return null;

			var7 = var8.method945(64 + anInt1411, anInt1412 + 768, -50, -10, -50);
			aClass113_1391.method435(var7, var9);
		}

		if (anInt1406 >= 0)
			var7 = var7.method1008(var3, var4, var5, var6, true, anInt1406);

		return var7;
	}

	public final Def6 method683() {
		int var1 = -1;
		if (anInt1395 == -1) {
			if (anInt1429 != -1)
				var1 = Class91.anIntArray711[anInt1429];
		} else
			var1 = Class74.method315(anInt1395, (byte) 0);

		return (var1 >= 0) && (var1 < anIntArray1427.length) && (anIntArray1427[var1] != -1)
				? Def13.method736(anIntArray1427[var1]) : null;
	}

	public final Class124_Sub22_Sub19_Sub7 method684(final int var1, final int var2, final int[][] var3, final int var4,
			final int var5, final int var6, final Def12 var7, final int var8) {
		long var9;
		if (null == anIntArray1385)
			var9 = (anInt1434 << 10) + var2;
		else
			var9 = (var1 << 3) + (anInt1434 << 10) + var2;

		Class124_Sub22_Sub19_Sub7 var11 = (Class124_Sub22_Sub19_Sub7) aClass113_1391.method434(var9);
		if (var11 == null) {
			final Class124_Sub22_Sub19_Sub4 var12 = method687(var1, var2);
			if (var12 == null)
				return null;

			var11 = var12.method945(anInt1411 + 64, anInt1412 + 768, -50, -10, -50);
			aClass113_1391.method435(var11, var9);
		}

		if ((null == var7) && (anInt1406 == -1))
			return var11;
		else {
			if (var7 != null)
				var11 = var7.method738(var11, var8, var2);
			else
				var11 = var11.method987(true);

			if (anInt1406 >= 0)
				var11 = var11.method1008(var3, var4, var5, var6, false, anInt1406);

			return var11;
		}
	}

	void method685(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readByteU();
			if (var2 == 0)
				return;

			method678(var1, var2);
		}
	}

	void method686() {
		if (anInt1405 == -1) {
			anInt1405 = 0;
			if ((anIntArray1414 != null) && ((anIntArray1385 == null) || (anIntArray1385[0] == 10)))
				anInt1405 = 1;

			for (int var1 = 0; var1 < 5; ++var1)
				if (aStringArray1413[var1] != null)
					anInt1405 = 1;
		}

		if (anInt1386 == -1)
			anInt1386 = anInt1403 != 0 ? 1 : 0;

	}

	final Class124_Sub22_Sub19_Sub4 method687(final int var1, int var2) {
		Class124_Sub22_Sub19_Sub4 var3 = null;
		int var4;
		boolean var5;
		int var8;
		if (null == anIntArray1385) {
			if (var1 != 10)
				return null;

			if (anIntArray1414 == null)
				return null;

			var5 = aBool1416;
			if ((var1 == 2) && (var2 > 3))
				var5 = !var5;

			var4 = anIntArray1414.length;

			for (int var7 = 0; var7 < var4; ++var7) {
				var8 = anIntArray1414[var7];
				if (var5)
					var8 += 65536;

				var3 = (Class124_Sub22_Sub19_Sub4) aClass113_1389.method434(var8);
				if (null == var3) {
					var3 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1387, var8 & '\uffff', 0);
					if (null == var3)
						return null;

					if (var5)
						var3.method940();

					aClass113_1389.method435(var3, var8);
				}

				if (var4 > 1)
					aClass124_Sub22_Sub19_Sub4Array1392[var7] = var3;
			}

			if (var4 > 1)
				var3 = new Class124_Sub22_Sub19_Sub4(aClass124_Sub22_Sub19_Sub4Array1392, var4);
		} else {
			int var9 = -1;

			for (var4 = 0; var4 < anIntArray1385.length; ++var4)
				if (anIntArray1385[var4] == var1) {
					var9 = var4;
					break;
				}

			if (var9 == -1)
				return null;

			var4 = anIntArray1414[var9];
			final boolean var11 = aBool1416 ^ (var2 > 3);
			if (var11)
				var4 += 65536;

			var3 = (Class124_Sub22_Sub19_Sub4) aClass113_1389.method434(var4);
			if (var3 == null) {
				var3 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1387, var4 & '\uffff', 0);
				if (var3 == null)
					return null;

				if (var11)
					var3.method940();

				aClass113_1389.method435(var3, var4);
			}
		}

		if ((anInt1418 == 128) && (anInt1419 == 128) && (anInt1420 == 128))
			var5 = false;
		else
			var5 = true;

		boolean var10;
		if ((anInt1399 == 0) && (anInt1422 == 0) && (anInt1424 == 0))
			var10 = false;
		else
			var10 = true;

		final Class124_Sub22_Sub19_Sub4 var6 = new Class124_Sub22_Sub19_Sub4(var3, (var2 == 0) && !var5 && !var10,
				null == aShortArray1397, null == aShortArray1393, true);
		if ((var1 == 4) && (var2 > 3)) {
			var6.method936(256);
			var6.method937(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1)
			var6.method933();
		else if (var2 == 2)
			var6.method934();
		else if (var2 == 3)
			var6.method935();

		if (null != aShortArray1397)
			for (var8 = 0; var8 < aShortArray1397.length; ++var8)
				var6.method951(aShortArray1397[var8], aShortArray1398[var8]);

		if (aShortArray1393 != null)
			for (var8 = 0; var8 < aShortArray1393.length; ++var8)
				var6.method939(aShortArray1393[var8], aShortArray1404[var8]);

		if (var5)
			var6.method941(anInt1418, anInt1419, anInt1420);

		if (var10)
			var6.method937(anInt1399, anInt1422, anInt1424);

		return var6;
	}

	public static int method688(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	public boolean method689() {
		if (anIntArray1427 == null)
			return (anInt1430 != -1) || (null != anIntArray1421);
		else {
			for (final int element : anIntArray1427)
				if (element != -1) {
					final Def6 var2 = Def13.method736(element);
					if ((var2.anInt1430 != -1) || (var2.anIntArray1421 != null))
						return true;
				}

			return false;
		}
	}

	public static Def16 method690(final int var0) {
		Def16 var1 = (Def16) Def16.aClass113_1373.method434(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Def16.aClass94_1375.decode(16, var0);
			var1 = new Def16();
			if (var2 != null)
				var1.method669(new RSBuf(var2));

			Def16.aClass113_1373.method435(var1, var0);
			return var1;
		}
	}

	static boolean method691(final String var0, final boolean var1) {
		if (null == var0)
			return false;
		else {
			final String var3 = Class34.method186(var0, Class49.aClass117_488);

			for (int var2 = 0; var2 < client.anInt2056; ++var2)
				if (var3.equalsIgnoreCase(
						Class34.method186(client.aClass32Array2098[var2].aString344, Class49.aClass117_488))
						&& (!var1 || (client.aClass32Array2098[var2].anInt339 != 0)))
					return true;

			if (var3.equalsIgnoreCase(
					Class34.method186(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956, Class49.aClass117_488)))
				return true;
			else
				return false;
		}
	}

	static final void method692(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7) {
		System.out.printf("%d, %d %n", var0 >> 16, var0 & 0xff);
		if (Class89.loadwidget(var0)) {
			Class2.aClass124_Sub17Array12 = null;
			Class27.method165(Class124_Sub22_Sub10.widgets[var0], -1, var1, var2, var3, var4,
					var5, var6, var7);
			if (Class2.aClass124_Sub17Array12 != null) {
				Class27.method165(Class2.aClass124_Sub17Array12, -1412584499, var1, var2, var3, var4, Class48.anInt478,
						Class87.anInt691, var7);
				Class2.aClass124_Sub17Array12 = null;
			}

		} else if (var7 != -1)
			client.aBoolArray2061[var7] = true;
		else
			for (int var8 = 0; var8 < 100; ++var8)
				client.aBoolArray2061[var8] = true;
	}

	public static int method693(final int var0, final int var1, int var2) {
		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 : 7 - var1));
	}
}

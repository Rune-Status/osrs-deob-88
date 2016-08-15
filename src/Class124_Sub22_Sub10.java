public class Class124_Sub22_Sub10 extends Class124_Sub22 {
	public static Class94 aClass94_1459;
	public static Class94 aClass94_1460;
	static int[][] anIntArrayArray1466;
	public static Class124_Sub17[][] aClass124_Sub17ArrayArray1507;
	int anInt1465;
	public String aString1472 = "null";
	public int anInt1470 = 2000;
	public int anInt1500 = 0;
	public int anInt1474 = 0;
	public int anInt1477 = 0;
	public int anInt1475 = 0;
	public int anInt1480 = 0;
	public int anInt1458 = 1;
	public boolean aBool1478 = false;
	int anInt1481 = -1;
	int anInt1491 = 0;
	int anInt1482 = -1;
	int anInt1483 = -1;
	int anInt1485 = 0;
	int anInt1498 = -1;
	short[] aShortArray1467;
	short[] aShortArray1471;
	short[] aShortArray1468;
	short[] aShortArray1469;
	public boolean aBool1502 = false;
	int anInt1486 = -1;
	int anInt1487 = -1;
	int anInt1484 = -1;
	int anInt1505 = -1;
	int anInt1489 = -1;
	int anInt1476 = -1;
	public int anInt1473 = 0;
	public int anInt1506 = -1;
	public int anInt1495 = -1;
	int anInt1461 = 128;
	int[] anIntArray1492;
	int[] anIntArray1493;
	int anInt1497 = 128;
	int anInt1490 = 128;
	public int anInt1499 = 0;
	public int anInt1496 = 0;
	public int anInt1501 = 0;
	int anInt1503 = -1;
	int anInt1504 = -1;
	static Class113 aClass113_1494 = new Class113(64);
	static Class113 aClass113_1462 = new Class113(50);
	public static Class113 aClass113_1463 = new Class113(200);
	public String[] aStringArray1479 = new String[] { null, null, "Take", null, null };
	public String[] aStringArray1488 = new String[] { null, null, null, null, "Drop" };
	public int anInt1464;

	public final Class124_Sub22_Sub19_Sub4 method710(final boolean var1) {
		int var2 = anInt1481;
		int var5 = anInt1482;
		int var3 = anInt1486;
		if (var1) {
			var2 = anInt1483;
			var5 = anInt1498;
			var3 = anInt1487;
		}

		if (var2 == -1)
			return null;
		else {
			Class124_Sub22_Sub19_Sub4 var4 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1460, var2, 0);
			if (var5 != -1) {
				final Class124_Sub22_Sub19_Sub4 var7 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1460, var5, 0);
				if (var3 != -1) {
					final Class124_Sub22_Sub19_Sub4 var8 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1460, var3, 0);
					final Class124_Sub22_Sub19_Sub4[] var9 = new Class124_Sub22_Sub19_Sub4[] { var4, var7, var8 };
					var4 = new Class124_Sub22_Sub19_Sub4(var9, 3);
				} else {
					final Class124_Sub22_Sub19_Sub4[] var10 = new Class124_Sub22_Sub19_Sub4[] { var4, var7 };
					var4 = new Class124_Sub22_Sub19_Sub4(var10, 2);
				}
			}

			if (!var1 && (anInt1491 != 0))
				var4.method937(0, anInt1491, 0);

			if (var1 && (anInt1485 != 0))
				var4.method937(0, anInt1485, 0);

			int var6;
			if (null != aShortArray1467)
				for (var6 = 0; var6 < aShortArray1467.length; ++var6)
					var4.method951(aShortArray1467[var6], aShortArray1471[var6]);

			if (aShortArray1468 != null)
				for (var6 = 0; var6 < aShortArray1468.length; ++var6)
					var4.method939(aShortArray1468[var6], aShortArray1469[var6]);

			return var4;
		}
	}

	void method711() {
	}

	void method712(final Class124_Sub14 var1) {
		while (true) {
			final int var2 = var1.method558();
			if (var2 == 0)
				return;

			method713(var1, var2);
		}
	}

	void method713(final Class124_Sub14 var1, final int var2) {
		if (var2 == 1)
			anInt1465 = var1.method560();
		else if (var2 == 2)
			aString1472 = var1.method597();
		else if (var2 == 4)
			anInt1470 = var1.method560();
		else if (var2 == 5)
			anInt1500 = var1.method560();
		else if (var2 == 6)
			anInt1474 = var1.method560();
		else if (var2 == 7) {
			anInt1477 = var1.method560();
			if (anInt1477 > 32767)
				anInt1477 -= 65536;
		} else if (var2 == 8) {
			anInt1475 = var1.method560();
			if (anInt1475 > 32767)
				anInt1475 -= 65536;
		} else if (var2 == 11)
			anInt1480 = 1;
		else if (var2 == 12)
			anInt1458 = var1.method562(951157368);
		else if (var2 == 16)
			aBool1478 = true;
		else if (var2 == 23) {
			anInt1481 = var1.method560();
			anInt1491 = var1.method558();
		} else if (var2 == 24)
			anInt1482 = var1.method560();
		else if (var2 == 25) {
			anInt1483 = var1.method560();
			anInt1485 = var1.method558();
		} else if (var2 == 26)
			anInt1498 = var1.method560();
		else if ((var2 >= 30) && (var2 < 35)) {
			aStringArray1479[var2 - 30] = var1.method597();
			if (aStringArray1479[var2 - 30].equalsIgnoreCase("Hidden"))
				aStringArray1479[var2 - 30] = null;
		} else if ((var2 >= 35) && (var2 < 40))
			aStringArray1488[var2 - 35] = var1.method597();
		else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.method558();
				aShortArray1467 = new short[var3];
				aShortArray1471 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1467[var4] = (short) var1.method560();
					aShortArray1471[var4] = (short) var1.method560();
				}
			} else if (var2 == 41) {
				var3 = var1.method558();
				aShortArray1468 = new short[var3];
				aShortArray1469 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					aShortArray1468[var4] = (short) var1.method560();
					aShortArray1469[var4] = (short) var1.method560();
				}
			} else if (var2 == 65)
				aBool1502 = true;
			else if (var2 == 78)
				anInt1486 = var1.method560();
			else if (var2 == 79)
				anInt1487 = var1.method560();
			else if (var2 == 90)
				anInt1484 = var1.method560();
			else if (var2 == 91)
				anInt1505 = var1.method560();
			else if (var2 == 92)
				anInt1489 = var1.method560();
			else if (var2 == 93)
				anInt1476 = var1.method560();
			else if (var2 == 95)
				anInt1473 = var1.method560();
			else if (var2 == 97)
				anInt1506 = var1.method560();
			else if (var2 == 98)
				anInt1495 = var1.method560();
			else if ((var2 >= 100) && (var2 < 110)) {
				if (null == anIntArray1492) {
					anIntArray1492 = new int[10];
					anIntArray1493 = new int[10];
				}

				anIntArray1492[var2 - 100] = var1.method560();
				anIntArray1493[var2 - 100] = var1.method560();
			} else if (var2 == 110)
				anInt1461 = var1.method560();
			else if (var2 == 111)
				anInt1497 = var1.method560();
			else if (var2 == 112)
				anInt1490 = var1.method560();
			else if (var2 == 113)
				anInt1499 = var1.method559();
			else if (var2 == 114)
				anInt1496 = var1.method559() * 5;
			else if (var2 == 115)
				anInt1501 = var1.method558();
			else if (var2 == 139)
				anInt1503 = var1.method560();
			else if (var2 == 140)
				anInt1504 = var1.method560();
		}

	}

	public static int method714(int var0) {
		int var1 = 0;
		if ((var0 < 0) || (var0 >= 65536)) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var1 + var0;
	}

	public final Class124_Sub22_Sub19_Sub4 method715(final int var1) {
		int var3;
		if ((null != anIntArray1492) && (var1 > 1)) {
			int var4 = -1;

			for (var3 = 0; var3 < 10; ++var3)
				if ((var1 >= anIntArray1493[var3]) && (anIntArray1493[var3] != 0))
					var4 = anIntArray1492[var3];

			if (var4 != -1)
				return method724(var4).method715(1);
		}

		final Class124_Sub22_Sub19_Sub4 var2 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1460, anInt1465, 0);
		if (var2 == null)
			return null;
		else {
			if ((anInt1461 != 128) || (anInt1497 != 128) || (anInt1490 != 128))
				var2.method941(anInt1461, anInt1497, anInt1490);

			if (null != aShortArray1467)
				for (var3 = 0; var3 < aShortArray1467.length; ++var3)
					var2.method951(aShortArray1467[var3], aShortArray1471[var3]);

			if (null != aShortArray1468)
				for (var3 = 0; var3 < aShortArray1468.length; ++var3)
					var2.method939(aShortArray1468[var3], aShortArray1469[var3]);

			return var2;
		}
	}

	public final boolean method716(final boolean var1) {
		int var2 = anInt1481;
		int var4 = anInt1482;
		int var3 = anInt1486;
		if (var1) {
			var2 = anInt1483;
			var4 = anInt1498;
			var3 = anInt1487;
		}

		if (var2 == -1)
			return true;
		else {
			boolean var5 = true;
			if (!aClass94_1460.method366(var2, 0))
				var5 = false;

			if ((var4 != -1) && !aClass94_1460.method366(var4, 0))
				var5 = false;

			if ((var3 != -1) && !aClass94_1460.method366(var3, 0))
				var5 = false;

			return var5;
		}
	}

	public Class124_Sub22_Sub10 method717(final int var1) {
		if ((anIntArray1492 != null) && (var1 > 1)) {
			int var3 = -1;

			for (int var2 = 0; var2 < 10; ++var2)
				if ((var1 >= anIntArray1493[var2]) && (anIntArray1493[var2] != 0))
					var3 = anIntArray1492[var2];

			if (var3 != -1)
				return method724(var3);
		}

		return this;
	}

	public final Class124_Sub22_Sub19_Sub4 method718(final boolean var1) {
		int var2 = anInt1484;
		int var5 = anInt1489;
		if (var1) {
			var2 = anInt1505;
			var5 = anInt1476;
		}

		if (var2 == -1)
			return null;
		else {
			Class124_Sub22_Sub19_Sub4 var4 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1460, var2, 0);
			if (var5 != -1) {
				final Class124_Sub22_Sub19_Sub4 var6 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1460, var5, 0);
				final Class124_Sub22_Sub19_Sub4[] var7 = new Class124_Sub22_Sub19_Sub4[] { var4, var6 };
				var4 = new Class124_Sub22_Sub19_Sub4(var7, 2);
			}

			int var3;
			if (null != aShortArray1467)
				for (var3 = 0; var3 < aShortArray1467.length; ++var3)
					var4.method951(aShortArray1467[var3], aShortArray1471[var3]);

			if (null != aShortArray1468)
				for (var3 = 0; var3 < aShortArray1468.length; ++var3)
					var4.method939(aShortArray1468[var3], aShortArray1469[var3]);

			return var4;
		}
	}

	public final boolean method719(final boolean var1) {
		int var2 = anInt1484;
		int var4 = anInt1489;
		if (var1) {
			var2 = anInt1505;
			var4 = anInt1476;
		}

		if (var2 == -1)
			return true;
		else {
			boolean var3 = true;
			if (!aClass94_1460.method366(var2, 0))
				var3 = false;

			if ((var4 != -1) && !aClass94_1460.method366(var4, 0))
				var3 = false;

			return var3;
		}
	}

	public final Class124_Sub22_Sub19_Sub7 method720(final int var1) {
		if ((anIntArray1492 != null) && (var1 > 1)) {
			int var5 = -1;

			for (int var2 = 0; var2 < 10; ++var2)
				if ((var1 >= anIntArray1493[var2]) && (anIntArray1493[var2] != 0))
					var5 = anIntArray1492[var2];

			if (var5 != -1)
				return method724(var5).method720(1);
		}

		Class124_Sub22_Sub19_Sub7 var3 = (Class124_Sub22_Sub19_Sub7) aClass113_1462.method434(anInt1464);
		if (var3 != null)
			return var3;
		else {
			final Class124_Sub22_Sub19_Sub4 var6 = Class124_Sub22_Sub19_Sub4.method943(aClass94_1460, anInt1465, 0);
			if (null == var6)
				return null;
			else {
				if ((anInt1461 != 128) || (anInt1497 != 128) || (anInt1490 != 128))
					var6.method941(anInt1461, anInt1497, anInt1490);

				int var4;
				if (null != aShortArray1467)
					for (var4 = 0; var4 < aShortArray1467.length; ++var4)
						var6.method951(aShortArray1467[var4], aShortArray1471[var4]);

				if (null != aShortArray1468)
					for (var4 = 0; var4 < aShortArray1468.length; ++var4)
						var6.method939(aShortArray1468[var4], aShortArray1469[var4]);

				var3 = var6.method945(anInt1499 + 64, 768 + anInt1496, -50, -10, -50);
				var3.aBool1861 = true;
				aClass113_1462.method435(var3, anInt1464);
				return var3;
			}
		}
	}

	void method721(final Class124_Sub22_Sub10 var1, final Class124_Sub22_Sub10 var2) {
		anInt1465 = var1.anInt1465;
		anInt1470 = var1.anInt1470;
		anInt1500 = var1.anInt1500;
		anInt1474 = var1.anInt1474;
		anInt1473 = var1.anInt1473;
		anInt1477 = var1.anInt1477;
		anInt1475 = var1.anInt1475;
		aShortArray1467 = var1.aShortArray1467;
		aShortArray1471 = var1.aShortArray1471;
		aShortArray1468 = var1.aShortArray1468;
		aShortArray1469 = var1.aShortArray1469;
		aString1472 = var2.aString1472;
		aBool1478 = var2.aBool1478;
		anInt1458 = var2.anInt1458;
		anInt1480 = 1;
	}

	void method722(final Class124_Sub22_Sub10 var1, final Class124_Sub22_Sub10 var2) {
		anInt1465 = var1.anInt1465;
		anInt1470 = var1.anInt1470;
		anInt1500 = var1.anInt1500;
		anInt1474 = var1.anInt1474;
		anInt1473 = var1.anInt1473;
		anInt1477 = var1.anInt1477;
		anInt1475 = var1.anInt1475;
		aShortArray1467 = var2.aShortArray1467;
		aShortArray1471 = var2.aShortArray1471;
		aShortArray1468 = var2.aShortArray1468;
		aShortArray1469 = var2.aShortArray1469;
		aString1472 = var2.aString1472;
		aBool1478 = var2.aBool1478;
		anInt1480 = var2.anInt1480;
		anInt1481 = var2.anInt1481;
		anInt1482 = var2.anInt1482;
		anInt1486 = var2.anInt1486;
		anInt1483 = var2.anInt1483;
		anInt1498 = var2.anInt1498;
		anInt1487 = var2.anInt1487;
		anInt1484 = var2.anInt1484;
		anInt1489 = var2.anInt1489;
		anInt1505 = var2.anInt1505;
		anInt1476 = var2.anInt1476;
		anInt1501 = var2.anInt1501;
		aStringArray1479 = var2.aStringArray1479;
		aStringArray1488 = new String[5];
		if (var2.aStringArray1488 != null)
			for (int var3 = 0; var3 < 4; ++var3)
				aStringArray1488[var3] = var2.aStringArray1488[var3];

		aStringArray1488[4] = "Discard";
		anInt1458 = 0;
	}

	static void method723(final Class124_Sub17 var0) {
		if (var0.anInt1283 == client.anInt2216)
			client.aBoolArray2061[var0.anInt1239] = true;

	}

	public static Class124_Sub22_Sub10 method724(final int var0) {
		Class124_Sub22_Sub10 var1 = (Class124_Sub22_Sub10) aClass113_1494.method434(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = aClass94_1459.method377(10, var0);
			var1 = new Class124_Sub22_Sub10();
			var1.anInt1464 = var0;
			if (var2 != null)
				var1.method712(new Class124_Sub14(var2));

			var1.method711();
			if (var1.anInt1495 != -1)
				var1.method721(method724(var1.anInt1495), method724(var1.anInt1506));

			if (var1.anInt1504 != -1)
				var1.method722(method724(var1.anInt1504), method724(var1.anInt1503));

			if (!Class124_Sub22_Sub21.aBool1649 && var1.aBool1478) {
				var1.aString1472 = "Members object";
				var1.aBool1502 = false;
				var1.aStringArray1479 = null;
				var1.aStringArray1488 = null;
				var1.anInt1501 = 0;
			}

			aClass113_1494.method435(var1, var0);
			return var1;
		}
	}
}

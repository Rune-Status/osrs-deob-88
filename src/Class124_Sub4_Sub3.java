public class Class124_Sub4_Sub3 extends Class124_Sub4 {
	int anInt1636 = 256;
	boolean aBool1634;
	long aLong1618;
	int anInt1619;
	int anInt1635;
	long aLong1637;
	int anInt1614 = 1000000;
	int[] anIntArray1615 = new int[16];
	int[] anIntArray1633 = new int[16];
	int[] anIntArray1617 = new int[16];
	int[] anIntArray1613 = new int[16];
	int[] anIntArray1632 = new int[16];
	int[] anIntArray1620 = new int[16];
	int[] anIntArray1616 = new int[16];
	int[] anIntArray1622 = new int[16];
	int[] anIntArray1623 = new int[16];
	int[] anIntArray1624 = new int[16];
	int[] anIntArray1625 = new int[16];
	int[] anIntArray1626 = new int[16];
	int[] anIntArray1627 = new int[16];
	int[] anIntArray1612 = new int[16];
	int[] anIntArray1629 = new int[16];
	Class124_Sub16[][] aClass124_Sub16ArrayArray1628 = new Class124_Sub16[16][128];
	Class124_Sub16[][] aClass124_Sub16ArrayArray1621 = new Class124_Sub16[16][128];
	Class93 aClass93_1631 = new Class93();
	Class124_Sub4_Sub4 aClass124_Sub4_Sub4_1638 = new Class124_Sub4_Sub4(this);
	Class107 aClass107_1630 = new Class107(128);

	public synchronized void method846(final int var1) {
		anInt1636 = var1;
	}

	void method847(final int var1, final int var2) {
		if (var2 != anIntArray1632[var1]) {
			anIntArray1632[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3)
				aClass124_Sub16ArrayArray1621[var1][var3] = null;
		}

	}

	synchronized boolean method848(final Class124_Sub20 var1, final CacheArch var2, final Class10 var3, final int var4) {
		var1.method636();
		boolean var5 = true;
		final int[] var10 = new int[] { var4 };

		for (Class124_Sub23 var7 = (Class124_Sub23) var1.aClass107_1301
				.method411(); var7 != null; var7 = (Class124_Sub23) var1.aClass107_1301.method413()) {
			final int var8 = (int) var7.aLong874;
			Class124_Sub18 var9 = (Class124_Sub18) aClass107_1630.method409(var8);
			if (null == var9) {
				var9 = Class124_Sub22_Sub19_Sub3_Sub1.method1042(var2, var8);
				if (null == var9) {
					var5 = false;
					continue;
				}

				aClass107_1630.method412(var9, var8);
			}

			if (!var9.method632(var3, var7.aByteArray1305, var10))
				var5 = false;
		}

		if (var5)
			var1.method635();

		return var5;
	}

	synchronized void method849() {
		for (Class124_Sub18 var1 = (Class124_Sub18) aClass107_1630
				.method411(); var1 != null; var1 = (Class124_Sub18) aClass107_1630.method413())
			var1.method633();

	}

	synchronized void method850(final Class124_Sub20 var1, final boolean var2) {
		method868();
		aClass93_1631.method348(var1.aByteArray1300);
		aBool1634 = var2;
		aLong1618 = 0L;
		final int var4 = aClass93_1631.method350();

		for (int var3 = 0; var3 < var4; ++var3) {
			aClass93_1631.method351(var3);
			aClass93_1631.method352(var3);
			aClass93_1631.method362(var3);
		}

		anInt1619 = aClass93_1631.method361();
		anInt1635 = aClass93_1631.anIntArray739[anInt1619];
		aLong1637 = aClass93_1631.method360(anInt1635);
	}

	void method851() {
		method858(-1);
		method855(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1632[var1] = anIntArray1613[var1];

		for (var1 = 0; var1 < 16; ++var1)
			anIntArray1620[var1] = anIntArray1613[var1] & -128;

	}

	public synchronized boolean method852() {
		return aClass93_1631.method358();
	}

	public synchronized void method853(final int var1, final int var2) {
		method854(var1, var2);
	}

	void method854(final int var1, final int var2) {
		anIntArray1613[var1] = var2;
		anIntArray1620[var1] = var2 & -128;
		method847(var1, var2);
	}

	void method855(int var1) {
		if (var1 >= 0) {
			anIntArray1615[var1] = 12800;
			anIntArray1633[var1] = 8192;
			anIntArray1617[var1] = 16383;
			anIntArray1616[var1] = 8192;
			anIntArray1622[var1] = 0;
			anIntArray1623[var1] = 8192;
			method860(var1);
			method861(var1);
			anIntArray1624[var1] = 0;
			anIntArray1625[var1] = 32767;
			anIntArray1626[var1] = 256;
			anIntArray1627[var1] = 0;
			method862(var1, 8192);
		} else
			for (var1 = 0; var1 < 16; ++var1)
				method855(var1);
	}

	public synchronized void method856() {
		for (Class124_Sub18 var1 = (Class124_Sub18) aClass107_1630
				.method411(); null != var1; var1 = (Class124_Sub18) aClass107_1630.method413())
			var1.method450();

	}

	void method857() {
	}

	void method858(final int var1) {
		for (Class124_Sub16 var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
				.method428(); var2 != null; var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640.method430())
			if ((var1 < 0) || (var2.anInt1136 == var1)) {
				if (null != var2.aClass124_Sub4_Sub1_1140) {
					var2.aClass124_Sub4_Sub1_1140.method794(Class8.anInt94 / 100);
					if (var2.aClass124_Sub4_Sub1_1140.method814())
						aClass124_Sub4_Sub4_1638.aClass124_Sub4_Sub2_1641.method828(var2.aClass124_Sub4_Sub1_1140);

					var2.method619();
				}

				if (var2.anInt1127 < 0)
					aClass124_Sub16ArrayArray1628[var2.anInt1136][var2.anInt1125] = null;

				var2.method450();
			}

	}

	void method859(final int var1, final int var2) {
		anIntArray1616[var1] = var2;
	}

	void method860(final int var1) {
		if ((anIntArray1624[var1] & 2) != 0)
			for (Class124_Sub16 var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
					.method428(); var2 != null; var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
							.method430())
				if ((var1 == var2.anInt1136) && (null == aClass124_Sub16ArrayArray1628[var1][var2.anInt1125])
						&& (var2.anInt1127 < 0))
					var2.anInt1127 = 0;

	}

	void method861(final int var1) {
		if ((anIntArray1624[var1] & 4) != 0)
			for (Class124_Sub16 var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
					.method428(); var2 != null; var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
							.method430())
				if (var1 == var2.anInt1136)
					var2.anInt1142 = 0;

	}

	void method862(final int var1, final int var2) {
		anIntArray1612[var1] = var2;
		anIntArray1629[var1] = (int) ((2097152.0D * Math.pow(2.0D, var2 * 5.4931640625E-4D)) + 0.5D);
	}

	int method863(final Class124_Sub16 var1) {
		int var2 = var1.anInt1134 + ((var1.anInt1132 * var1.anInt1141) >> 12);
		var2 += ((anIntArray1616[var1.anInt1136] - 8192) * anIntArray1626[var1.anInt1136]) >> 12;
		final Class103 var4 = var1.aClass103_1135;
		int var5;
		if ((var4.anInt797 > 0) && ((var4.anInt796 > 0) || (anIntArray1622[var1.anInt1136] > 0))) {
			var5 = var4.anInt796 << 2;
			final int var3 = var4.anInt795 << 1;
			if (var1.anInt1138 < var3)
				var5 = (var1.anInt1138 * var5) / var3;

			var5 += anIntArray1622[var1.anInt1136] >> 7;
			final double var6 = Math.sin(0.01227184630308513D * (var1.anInt1139 & 511));
			var2 += (int) (var5 * var6);
		}

		var5 = (int) (((256 * var1.aClass124_Sub2_Sub1_1124.anInt1590 * Math.pow(2.0D, var2 * 3.255208333333333E-4D))
				/ Class8.anInt94) + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	int method864(final Class124_Sub16 var1) {
		final Class103 var2 = var1.aClass103_1135;
		int var4 = ((anIntArray1615[var1.anInt1136] * anIntArray1617[var1.anInt1136]) + 4096) >> 13;
		var4 = (16384 + (var4 * var4)) >> 15;
		var4 = ((var1.anInt1128 * var4) + 16384) >> 15;
		var4 = (128 + (anInt1636 * var4)) >> 8;
		if (var2.anInt792 > 0)
			var4 = (int) ((var4 * Math.pow(0.5D, var1.anInt1133 * 1.953125E-5D * var2.anInt792)) + 0.5D);

		int var3;
		int var5;
		int var6;
		int var7;
		if (var2.aByteArray790 != null) {
			var6 = var1.anInt1131;
			var7 = var2.aByteArray790[var1.anInt1130 + 1];
			if (var1.anInt1130 < (var2.aByteArray790.length - 2)) {
				var5 = (var2.aByteArray790[var1.anInt1130] & 255) << 8;
				var3 = (var2.aByteArray790[2 + var1.anInt1130] & 255) << 8;
				var7 += ((var2.aByteArray790[3 + var1.anInt1130] - var7) * (var6 - var5)) / (var3 - var5);
			}

			var4 = ((var4 * var7) + 32) >> 6;
		}

		if ((var1.anInt1127 > 0) && (var2.aByteArray791 != null)) {
			var6 = var1.anInt1127;
			var7 = var2.aByteArray791[var1.anInt1137 + 1];
			if (var1.anInt1137 < (var2.aByteArray791.length - 2)) {
				var5 = (var2.aByteArray791[var1.anInt1137] & 255) << 8;
				var3 = (var2.aByteArray791[var1.anInt1137 + 2] & 255) << 8;
				var7 += ((var6 - var5) * (var2.aByteArray791[var1.anInt1137 + 3] - var7)) / (var3 - var5);
			}

			var4 = (32 + (var4 * var7)) >> 6;
		}

		return var4;
	}

	int method865(final Class124_Sub16 var1) {
		final int var2 = anIntArray1633[var1.anInt1136];
		return var2 >= 8192 ? 16384 - ((((128 - var1.anInt1129) * (16384 - var2)) + 32) >> 6)
				: (32 + (var1.anInt1129 * var2)) >> 6;
	}

	@Override
	protected synchronized Class124_Sub4 method505() {
		return aClass124_Sub4_Sub4_1638;
	}

	@Override
	protected synchronized Class124_Sub4 method509() {
		return null;
	}

	@Override
	protected synchronized int method507() {
		return 0;
	}

	@Override
	protected synchronized void method511(final int[] var1, int var2, int var3) {
		if (aClass93_1631.method358()) {
			final int var4 = (aClass93_1631.anInt738 * anInt1614) / Class8.anInt94;

			do {
				final long var5 = ((long) var3 * (long) var4) + aLong1618;
				if ((aLong1637 - var5) >= 0L) {
					aLong1618 = var5;
					break;
				}

				final int var7 = (int) ((((aLong1637 - aLong1618) + var4) - 1L) / var4);
				aLong1618 += (long) var4 * (long) var7;
				aClass124_Sub4_Sub4_1638.method511(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				method872();
			} while (aClass93_1631.method358());
		}

		aClass124_Sub4_Sub4_1638.method511(var1, var2, var3);
	}

	@Override
	protected synchronized void method506(int var1) {
		if (aClass93_1631.method358()) {
			final int var2 = (aClass93_1631.anInt738 * anInt1614) / Class8.anInt94;

			do {
				final long var3 = ((long) var1 * (long) var2) + aLong1618;
				if ((aLong1637 - var3) >= 0L) {
					aLong1618 = var3;
					break;
				}

				final int var5 = (int) ((((aLong1637 - aLong1618) + var2) - 1L) / var2);
				aLong1618 += (long) var2 * (long) var5;
				aClass124_Sub4_Sub4_1638.method506(var5);
				var1 -= var5;
				method872();
			} while (aClass93_1631.method358());
		}

		aClass124_Sub4_Sub4_1638.method506(var1);
	}

	boolean method866(final Class124_Sub16 var1) {
		if (null == var1.aClass124_Sub4_Sub1_1140) {
			if (var1.anInt1127 >= 0) {
				var1.method450();
				if ((var1.anInt1126 > 0) && (var1 == aClass124_Sub16ArrayArray1621[var1.anInt1136][var1.anInt1126]))
					aClass124_Sub16ArrayArray1621[var1.anInt1136][var1.anInt1126] = null;
			}

			return true;
		} else
			return false;
	}

	void method867(final int var1, final int var2, final int var3) {
		method871(var1, var2);
		if ((anIntArray1624[var1] & 2) != 0)
			for (Class124_Sub16 var5 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
					.method429(); null != var5; var5 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
							.method426())
				if ((var5.anInt1136 == var1) && (var5.anInt1127 < 0)) {
					aClass124_Sub16ArrayArray1628[var1][var5.anInt1125] = null;
					aClass124_Sub16ArrayArray1628[var1][var2] = var5;
					final int var6 = ((var5.anInt1132 * var5.anInt1141) >> 12) + var5.anInt1134;
					var5.anInt1134 += (var2 - var5.anInt1125) << 8;
					var5.anInt1141 = var6 - var5.anInt1134;
					var5.anInt1132 = 4096;
					var5.anInt1125 = var2;
					return;
				}

		final Class124_Sub18 var9 = (Class124_Sub18) aClass107_1630.method409(anIntArray1632[var1]);
		if (var9 != null) {
			final Class124_Sub2_Sub1 var8 = var9.aClass124_Sub2_Sub1Array1286[var2];
			if (null != var8) {
				final Class124_Sub16 var4 = new Class124_Sub16();
				var4.anInt1136 = var1;
				var4.aClass124_Sub18_1123 = var9;
				var4.aClass124_Sub2_Sub1_1124 = var8;
				var4.aClass103_1135 = var9.aClass103Array1287[var2];
				var4.anInt1126 = var9.aByteArray1292[var2];
				var4.anInt1125 = var2;
				var4.anInt1128 = (1024 + (var9.aByteArray1288[var2] * var9.anInt1291 * var3 * var3)) >> 11;
				var4.anInt1129 = var9.aByteArray1289[var2] & 255;
				var4.anInt1134 = (var2 << 8) - (var9.aShortArray1290[var2] & 32767);
				var4.anInt1133 = 0;
				var4.anInt1131 = 0;
				var4.anInt1130 = 0;
				var4.anInt1127 = -1;
				var4.anInt1137 = 0;
				if (anIntArray1627[var1] == 0)
					var4.aClass124_Sub4_Sub1_1140 = Class124_Sub4_Sub1.method783(var8, method863(var4), method864(var4),
							method865(var4));
				else {
					var4.aClass124_Sub4_Sub1_1140 = Class124_Sub4_Sub1.method783(var8, method863(var4), 0,
							method865(var4));
					method875(var4, var9.aShortArray1290[var2] < 0);
				}

				if (var9.aShortArray1290[var2] < 0)
					var4.aClass124_Sub4_Sub1_1140.method812(-1);

				if (var4.anInt1126 >= 0) {
					final Class124_Sub16 var7 = aClass124_Sub16ArrayArray1621[var1][var4.anInt1126];
					if ((var7 != null) && (var7.anInt1127 < 0)) {
						aClass124_Sub16ArrayArray1628[var1][var7.anInt1125] = null;
						var7.anInt1127 = 0;
					}

					aClass124_Sub16ArrayArray1621[var1][var4.anInt1126] = var4;
				}

				aClass124_Sub4_Sub4_1638.aClass111_1640.method424(var4);
				aClass124_Sub16ArrayArray1628[var1][var2] = var4;
			}
		}
	}

	public Class124_Sub4_Sub3() {
		method851();
	}

	public synchronized void method868() {
		aClass93_1631.method349();
		method851();
	}

	void method869() {
	}

	public int method870() {
		return anInt1636;
	}

	void method871(final int var1, final int var2) {
		final Class124_Sub16 var3 = aClass124_Sub16ArrayArray1628[var1][var2];
		if (var3 != null) {
			aClass124_Sub16ArrayArray1628[var1][var2] = null;
			if ((anIntArray1624[var1] & 2) != 0) {
				for (Class124_Sub16 var4 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
						.method428(); var4 != null; var4 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
								.method430())
					if ((var3.anInt1136 == var4.anInt1136) && (var4.anInt1127 < 0) && (var4 != var3)) {
						var3.anInt1127 = 0;
						break;
					}
			} else
				var3.anInt1127 = 0;

		}
	}

	void method872() {
		int var1 = anInt1619;
		int var4 = anInt1635;

		long var2;
		for (var2 = aLong1637; var4 == anInt1635; var2 = aClass93_1631.method360(var4)) {
			while (aClass93_1631.anIntArray739[var1] == var4) {
				aClass93_1631.method351(var1);
				final int var5 = aClass93_1631.method353(var1);
				if (var5 == 1) {
					aClass93_1631.method359();
					aClass93_1631.method362(var1);
					if (aClass93_1631.method356()) {
						if (!aBool1634 || (var4 == 0)) {
							method851();
							aClass93_1631.method349();
							return;
						}

						aClass93_1631.method357(var2);
					}
					break;
				}

				if ((var5 & 128) != 0)
					method873(var5);

				aClass93_1631.method352(var1);
				aClass93_1631.method362(var1);
			}

			var1 = aClass93_1631.method361();
			var4 = aClass93_1631.anIntArray739[var1];
		}

		anInt1619 = var1;
		anInt1635 = var4;
		aLong1637 = var2;
	}

	void method873(final int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			method871(var3, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			if (var4 > 0)
				method867(var3, var5, var4);
			else
				method871(var3, var5);

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			method857();
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			var4 = (var1 >> 16) & 127;
			if (var5 == 0)
				anIntArray1620[var3] = (var4 << 14) + (anIntArray1620[var3] & -2080769);

			if (var5 == 32)
				anIntArray1620[var3] = (anIntArray1620[var3] & -16257) + (var4 << 7);

			if (var5 == 1)
				anIntArray1622[var3] = (var4 << 7) + (anIntArray1622[var3] & -16257);

			if (var5 == 33)
				anIntArray1622[var3] = (anIntArray1622[var3] & -128) + var4;

			if (var5 == 5)
				anIntArray1623[var3] = (anIntArray1623[var3] & -16257) + (var4 << 7);

			if (var5 == 37)
				anIntArray1623[var3] = (anIntArray1623[var3] & -128) + var4;

			if (var5 == 7)
				anIntArray1615[var3] = (anIntArray1615[var3] & -16257) + (var4 << 7);

			if (var5 == 39)
				anIntArray1615[var3] = var4 + (anIntArray1615[var3] & -128);

			if (var5 == 10)
				anIntArray1633[var3] = (anIntArray1633[var3] & -16257) + (var4 << 7);

			if (var5 == 42)
				anIntArray1633[var3] = var4 + (anIntArray1633[var3] & -128);

			if (var5 == 11)
				anIntArray1617[var3] = (anIntArray1617[var3] & -16257) + (var4 << 7);

			if (var5 == 43)
				anIntArray1617[var3] = var4 + (anIntArray1617[var3] & -128);

			if (var5 == 64)
				if (var4 >= 64)
					anIntArray1624[var3] |= 1;
				else
					anIntArray1624[var3] &= -2;

			if (var5 == 65)
				if (var4 >= 64)
					anIntArray1624[var3] |= 2;
				else {
					method860(var3);
					anIntArray1624[var3] &= -3;
				}

			if (var5 == 99)
				anIntArray1625[var3] = (anIntArray1625[var3] & 127) + (var4 << 7);

			if (var5 == 98)
				anIntArray1625[var3] = var4 + (anIntArray1625[var3] & 16256);

			if (var5 == 101)
				anIntArray1625[var3] = (anIntArray1625[var3] & 127) + 16384 + (var4 << 7);

			if (var5 == 100)
				anIntArray1625[var3] = var4 + 16384 + (anIntArray1625[var3] & 16256);

			if (var5 == 120)
				method858(var3);

			if (var5 == 121)
				method855(var3);

			if (var5 == 123)
				method877(var3);

			int var6;
			if (var5 == 6) {
				var6 = anIntArray1625[var3];
				if (var6 == 16384)
					anIntArray1626[var3] = (anIntArray1626[var3] & -16257) + (var4 << 7);
			}

			if (var5 == 38) {
				var6 = anIntArray1625[var3];
				if (var6 == 16384)
					anIntArray1626[var3] = (anIntArray1626[var3] & -128) + var4;
			}

			if (var5 == 16)
				anIntArray1627[var3] = (anIntArray1627[var3] & -16257) + (var4 << 7);

			if (var5 == 48)
				anIntArray1627[var3] = (anIntArray1627[var3] & -128) + var4;

			if (var5 == 81)
				if (var4 >= 64)
					anIntArray1624[var3] |= 4;
				else {
					method861(var3);
					anIntArray1624[var3] &= -5;
				}

			if (var5 == 17)
				method862(var3, (anIntArray1612[var3] & -16257) + (var4 << 7));

			if (var5 == 49)
				method862(var3, var4 + (anIntArray1612[var3] & -128));

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			method847(var3, var5 + anIntArray1620[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var5 = (var1 >> 8) & 127;
			method869();
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var5 = ((var1 >> 9) & 16256) + ((var1 >> 8) & 127);
			method859(var3, var5);
		} else {
			var2 = var1 & 255;
			if (var2 == 255)
				method851();
		}
	}

	static String method874(final int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	void method875(final Class124_Sub16 var1, final boolean var2) {
		int var3 = var1.aClass124_Sub2_Sub1_1124.aByteArray1586.length;
		int var4;
		if (var2 && var1.aClass124_Sub2_Sub1_1124.aBool1589) {
			final int var5 = (var3 + var3) - var1.aClass124_Sub2_Sub1_1124.anInt1588;
			var4 = (int) (((long) var5 * (long) anIntArray1627[var1.anInt1136]) >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = (var3 + var3) - 1 - var4;
				var1.aClass124_Sub4_Sub1_1140.method790(true);
			}
		} else
			var4 = (int) (((long) anIntArray1627[var1.anInt1136] * (long) var3) >> 6);

		var1.aClass124_Sub4_Sub1_1140.method789(var4);
	}

	boolean method876(final Class124_Sub16 var1, final int[] var2, final int var3, final int var4) {
		var1.anInt1143 = Class8.anInt94 / 100;
		if ((var1.anInt1127 < 0)
				|| ((var1.aClass124_Sub4_Sub1_1140 != null) && !var1.aClass124_Sub4_Sub1_1140.method819())) {
			int var6 = var1.anInt1132;
			if (var6 > 0) {
				var6 -= (int) ((16.0D * Math.pow(2.0D, anIntArray1623[var1.anInt1136] * 4.921259842519685E-4D)) + 0.5D);
				if (var6 < 0)
					var6 = 0;

				var1.anInt1132 = var6;
			}

			var1.aClass124_Sub4_Sub1_1140.method795(method863(var1));
			final Class103 var5 = var1.aClass103_1135;
			boolean var7 = false;
			++var1.anInt1138;
			var1.anInt1139 += var5.anInt797;
			final double var8 = (((var1.anInt1132 * var1.anInt1141) >> 12) + ((var1.anInt1125 - 60) << 8))
					* 5.086263020833333E-6D;
			if (var5.anInt792 > 0)
				if (var5.anInt799 > 0)
					var1.anInt1133 += (int) ((128.0D * Math.pow(2.0D, var8 * var5.anInt799)) + 0.5D);
				else
					var1.anInt1133 += 128;

			if (null != var5.aByteArray790) {
				if (var5.anInt793 > 0)
					var1.anInt1131 += (int) ((128.0D * Math.pow(2.0D, var8 * var5.anInt793)) + 0.5D);
				else
					var1.anInt1131 += 128;

				while ((var1.anInt1130 < (var5.aByteArray790.length - 2))
						&& (var1.anInt1131 > ((var5.aByteArray790[var1.anInt1130 + 2] & 255) << 8)))
					var1.anInt1130 += 2;

				if (((var5.aByteArray790.length - 2) == var1.anInt1130)
						&& (var5.aByteArray790[1 + var1.anInt1130] == 0))
					var7 = true;
			}

			if ((var1.anInt1127 >= 0) && (var5.aByteArray791 != null) && ((anIntArray1624[var1.anInt1136] & 1) == 0)
					&& ((var1.anInt1126 < 0)
							|| (var1 != aClass124_Sub16ArrayArray1621[var1.anInt1136][var1.anInt1126]))) {
				if (var5.anInt798 > 0)
					var1.anInt1127 += (int) ((128.0D * Math.pow(2.0D, var8 * var5.anInt798)) + 0.5D);
				else
					var1.anInt1127 += 128;

				while ((var1.anInt1137 < (var5.aByteArray791.length - 2))
						&& (var1.anInt1127 > ((var5.aByteArray791[2 + var1.anInt1137] & 255) << 8)))
					var1.anInt1137 += 2;

				if ((var5.aByteArray791.length - 2) == var1.anInt1137)
					var7 = true;
			}

			if (var7) {
				var1.aClass124_Sub4_Sub1_1140.method794(var1.anInt1143);
				if (var2 != null)
					var1.aClass124_Sub4_Sub1_1140.method511(var2, var3, var4);
				else
					var1.aClass124_Sub4_Sub1_1140.method506(var4);

				if (var1.aClass124_Sub4_Sub1_1140.method814())
					aClass124_Sub4_Sub4_1638.aClass124_Sub4_Sub2_1641.method828(var1.aClass124_Sub4_Sub1_1140);

				var1.method619();
				if (var1.anInt1127 >= 0) {
					var1.method450();
					if ((var1.anInt1126 > 0) && (var1 == aClass124_Sub16ArrayArray1621[var1.anInt1136][var1.anInt1126]))
						aClass124_Sub16ArrayArray1621[var1.anInt1136][var1.anInt1126] = null;
				}

				return true;
			} else {
				var1.aClass124_Sub4_Sub1_1140.method815(var1.anInt1143, method864(var1), method865(var1));
				return false;
			}
		} else {
			var1.method619();
			var1.method450();
			if ((var1.anInt1126 > 0) && (aClass124_Sub16ArrayArray1621[var1.anInt1136][var1.anInt1126] == var1))
				aClass124_Sub16ArrayArray1621[var1.anInt1136][var1.anInt1126] = null;

			return true;
		}
	}

	void method877(final int var1) {
		for (Class124_Sub16 var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640
				.method428(); var2 != null; var2 = (Class124_Sub16) aClass124_Sub4_Sub4_1638.aClass111_1640.method430())
			if (((var1 < 0) || (var2.anInt1136 == var1)) && (var2.anInt1127 < 0)) {
				aClass124_Sub16ArrayArray1628[var2.anInt1136][var2.anInt1125] = null;
				var2.anInt1127 = 0;
			}

	}
}

import java.io.File;
import java.io.IOException;

public final class Class124_Sub22_Sub19_Sub5 extends Class124_Sub22_Sub19 {
	boolean aBool1805 = false;
	double aDouble1802;
	double aDouble1804;
	double aDouble1791;
	double aDouble1809;
	int anInt1811;
	int anInt1812;
	int anInt1815 = 0;
	int anInt1814 = 0;
	double aDouble1806;
	double aDouble1807;
	double aDouble1808;
	double aDouble1810;
	int anInt1801;
	int anInt1792;
	int anInt1799;
	int anInt1793;
	int anInt1795;
	int anInt1803;
	int anInt1798;
	int anInt1794;
	int anInt1800;
	int anInt1797;
	int anInt1796;
	Def12 aClass124_Sub22_Sub13_1813;

	final void method952(final int var1) {
		aBool1805 = true;
		aDouble1802 += var1 * aDouble1806;
		aDouble1804 += aDouble1807 * var1;
		aDouble1791 += (0.5D * aDouble1810 * var1 * var1) + (aDouble1809 * var1);
		aDouble1809 += aDouble1810 * var1;
		anInt1811 = ((int) (Math.atan2(aDouble1806, aDouble1807) * 325.949D) + 1024) & 2047;
		anInt1812 = (int) (Math.atan2(aDouble1809, aDouble1808) * 325.949D) & 2047;
		if (null != aClass124_Sub22_Sub13_1813) {
			anInt1815 += var1;

			while (true) {
				do {
					do {
						if (anInt1815 <= aClass124_Sub22_Sub13_1813.anIntArray1529[anInt1814])
							return;

						anInt1815 -= aClass124_Sub22_Sub13_1813.anIntArray1529[anInt1814];
						++anInt1814;
					} while (anInt1814 < aClass124_Sub22_Sub13_1813.anIntArray1536.length);

					anInt1814 -= aClass124_Sub22_Sub13_1813.anInt1538;
				} while ((anInt1814 >= 0) && (anInt1814 < aClass124_Sub22_Sub13_1813.anIntArray1536.length));

				anInt1814 = 0;
			}
		}
	}

	final void method953(final int var1, final int var2, final int var3, final int var4) {
		double var9;
		if (!aBool1805) {
			var9 = var1 - anInt1799;
			final double var5 = var2 - anInt1793;
			final double var7 = Math.sqrt((var5 * var5) + (var9 * var9));
			aDouble1802 = ((anInt1800 * var9) / var7) + anInt1799;
			aDouble1804 = ((var5 * anInt1800) / var7) + anInt1793;
			aDouble1791 = anInt1795;
		}

		var9 = (1 + anInt1798) - var4;
		aDouble1806 = (var1 - aDouble1802) / var9;
		aDouble1807 = (var2 - aDouble1804) / var9;
		aDouble1808 = Math.sqrt((aDouble1806 * aDouble1806) + (aDouble1807 * aDouble1807));
		if (!aBool1805)
			aDouble1809 = -aDouble1808 * Math.tan(0.02454369D * anInt1794);

		aDouble1810 = (2.0D * (var3 - aDouble1791 - (var9 * aDouble1809))) / (var9 * var9);
	}

	static final void method954(final Class124_Sub22_Sub19_Sub3 var0, final int var1) {
		Class80.method327(var0.anInt1690, var0.anInt1697, var1);
	}

	static void method955(final int var0) {
		final Class124_Sub10 var1 = (Class124_Sub10) Class124_Sub10.aClass107_1034.method409(var0);
		if (null != var1)
			for (int var2 = 0; var2 < var1.anIntArray1030.length; ++var2) {
				var1.anIntArray1030[var2] = -1;
				var1.anIntArray1031[var2] = 0;
			}
	}

	Class124_Sub22_Sub19_Sub5(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, final int var10, final int var11) {
		anInt1801 = var1;
		anInt1792 = var2;
		anInt1799 = var3;
		anInt1793 = var4;
		anInt1795 = var5;
		anInt1803 = var6;
		anInt1798 = var7;
		anInt1794 = var8;
		anInt1800 = var9;
		anInt1797 = var10;
		anInt1796 = var11;
		aBool1805 = false;
		final int var12 = Class43.method217(anInt1801).anInt1519;
		if (var12 != -1)
			aClass124_Sub22_Sub13_1813 = Def15.method750(var12);
		else
			aClass124_Sub22_Sub13_1813 = null;

	}

	static void method956(final int var0, final boolean var1, final int var2, final boolean var3) {
		if (null != Class23.aClass23Array256)
			Class124_Sub7.method525(0, Class23.aClass23Array256.length - 1, var0, var1, var2, var3);

	}

	static void method957(final Applet_Sub1 var0) {
		if ((Class81.anInt650 == 1) || (!Class7.aBool71 && (Class81.anInt650 == 4))) {
			final int var1 = 280 + Class4.anInt22;
			if ((Class81.anInt658 >= var1) && (Class81.anInt658 <= (var1 + 14)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(0, 0);
				return;
			}

			if ((Class81.anInt658 >= (15 + var1)) && (Class81.anInt658 <= (var1 + 80)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(0, 1);
				return;
			}

			final int var2 = Class4.anInt22 + 390;
			if ((Class81.anInt658 >= var2) && (Class81.anInt658 <= (14 + var2)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(1, 0);
				return;
			}

			if ((Class81.anInt658 >= (15 + var2)) && (Class81.anInt658 <= (var2 + 80)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(1, 1);
				return;
			}

			final int var3 = Class4.anInt22 + 500;
			if ((Class81.anInt658 >= var3) && (Class81.anInt658 <= (14 + var3)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(2, 0);
				return;
			}

			if ((Class81.anInt658 >= (var3 + 15)) && (Class81.anInt658 <= (var3 + 80)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(2, 1);
				return;
			}

			final int var5 = 610 + Class4.anInt22;
			if ((Class81.anInt658 >= var5) && (Class81.anInt658 <= (var5 + 14)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(3, 0);
				return;
			}

			if ((Class81.anInt658 >= (15 + var5)) && (Class81.anInt658 <= (var5 + 80)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt655 <= 18)) {
				Class97.method389(3, 1);
				return;
			}

			if ((Class81.anInt658 >= (708 + Class4.anInt22)) && (Class81.anInt655 >= 4)
					&& (Class81.anInt658 <= (Class4.anInt22 + 708 + 50)) && (Class81.anInt655 <= 20)) {
				Class4.aBool50 = false;
				Class4.aClass124_Sub22_Sub16_Sub1_40.method917(Class4.anInt22, 0);
				Class4.aClass124_Sub22_Sub16_Sub1_27.method917(382 + Class4.anInt22, 0);
				Class4.aClass124_Sub22_Sub16_Sub2_28
						.method926((382 + Class4.anInt22) - (Class4.aClass124_Sub22_Sub16_Sub2_28.anInt1738 / 2), 18);
				return;
			}

			if (Class4.anInt52 != -1) {
				final Class23 var4 = Class23.aClass23Array256[Class4.anInt52];
				Class124_Sub22_Sub19.method835(var4);
				Class4.aBool50 = false;
				Class4.aClass124_Sub22_Sub16_Sub1_40.method917(Class4.anInt22, 0);
				Class4.aClass124_Sub22_Sub16_Sub1_27.method917(382 + Class4.anInt22, 0);
				Class4.aClass124_Sub22_Sub16_Sub2_28
						.method926((Class4.anInt22 + 382) - (Class4.aClass124_Sub22_Sub16_Sub2_28.anInt1738 / 2), 18);
				return;
			}
		}

	}

	@Override
	protected final Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		final Def13 var2 = Class43.method217(anInt1801);
		final Class124_Sub22_Sub19_Sub7 var3 = var2.method733(anInt1814);
		if (null == var3)
			return null;
		else {
			var3.method996(anInt1812);
			return var3;
		}
	}

	static final boolean method958(final int var0, int var1) {
		final Def6 var2 = Def13.method736(var0);
		if (var1 == 11)
			var1 = 10;

		if ((var1 >= 5) && (var1 <= 8))
			var1 = 4;

		return var2.method679(var1);
	}

	static final void method959(final boolean var0) {
		client.anInt2108 = 0;
		client.anInt2029 = 0;
		client.aClass124_Sub14_Sub1_2026.method842();
		int var1 = client.aClass124_Sub14_Sub1_2026.method839(8);
		int var2;
		if (var1 < client.anInt2022)
			for (var2 = var1; var2 < client.anInt2022; ++var2)
				client.anIntArray2109[++client.anInt2108 - 1] = client.anIntArray2023[var2];

		if (var1 > client.anInt2022)
			throw new RuntimeException("");
		else {
			client.anInt2022 = 0;

			int var4;
			int var5;
			int var6;
			int var8;
			for (var2 = 0; var2 < var1; ++var2) {
				final int var7 = client.anIntArray2023[var2];
				final Class124_Sub22_Sub19_Sub3_Sub1 var9 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var7];
				var5 = client.aClass124_Sub14_Sub1_2026.method839(1);
				if (var5 == 0) {
					client.anIntArray2023[++client.anInt2022 - 1] = var7;
					var9.anInt1716 = client.anInt2158;
				} else {
					var8 = client.aClass124_Sub14_Sub1_2026.method839(2);
					if (var8 == 0) {
						client.anIntArray2023[++client.anInt2022 - 1] = var7;
						var9.anInt1716 = client.anInt2158;
						client.anIntArray2104[++client.anInt2029 - 1] = var7;
					} else if (var8 == 1) {
						client.anIntArray2023[++client.anInt2022 - 1] = var7;
						var9.anInt1716 = client.anInt2158;
						var6 = client.aClass124_Sub14_Sub1_2026.method839(3);
						var9.method892(var6, false);
						var4 = client.aClass124_Sub14_Sub1_2026.method839(1);
						if (var4 == 1)
							client.anIntArray2104[++client.anInt2029 - 1] = var7;
					} else if (var8 == 2) {
						client.anIntArray2023[++client.anInt2022 - 1] = var7;
						var9.anInt1716 = client.anInt2158;
						var6 = client.aClass124_Sub14_Sub1_2026.method839(3);
						var9.method892(var6, true);
						var4 = client.aClass124_Sub14_Sub1_2026.method839(3);
						var9.method892(var4, true);
						final int var11 = client.aClass124_Sub14_Sub1_2026.method839(1);
						if (var11 == 1)
							client.anIntArray2104[++client.anInt2029 - 1] = var7;
					} else if (var8 == 3)
						client.anIntArray2109[++client.anInt2108 - 1] = var7;
				}
			}

			Class124_Sub22_Sub19_Sub3_Sub1 var3;
			int var10;
			while (client.aClass124_Sub14_Sub1_2026.method843(client.anInt2027) >= 27) {
				var1 = client.aClass124_Sub14_Sub1_2026.method839(15);
				if (var1 == 32767)
					break;

				boolean var12 = false;
				if (null == client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var1]) {
					client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var1] = new Class124_Sub22_Sub19_Sub3_Sub1();
					var12 = true;
				}

				var3 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var1];
				client.anIntArray2023[++client.anInt2022 - 1] = var1;
				var3.anInt1716 = client.anInt2158;
				if (var0) {
					var10 = client.aClass124_Sub14_Sub1_2026.method839(8);
					if (var10 > 127)
						var10 -= 256;
				} else {
					var10 = client.aClass124_Sub14_Sub1_2026.method839(5);
					if (var10 > 15)
						var10 -= 32;
				}

				if (var0) {
					var5 = client.aClass124_Sub14_Sub1_2026.method839(8);
					if (var5 > 127)
						var5 -= 256;
				} else {
					var5 = client.aClass124_Sub14_Sub1_2026.method839(5);
					if (var5 > 15)
						var5 -= 32;
				}

				var3.aClass124_Sub22_Sub1_1941 = Class34.method188(client.aClass124_Sub14_Sub1_2026.method839(14),
						1713192620);
				var8 = client.anIntArray2168[client.aClass124_Sub14_Sub1_2026.method839(3)];
				if (var12)
					var3.anInt1718 = var3.anInt1672 = var8;

				var6 = client.aClass124_Sub14_Sub1_2026.method839(1);
				var4 = client.aClass124_Sub14_Sub1_2026.method839(1);
				if (var4 == 1)
					client.anIntArray2104[++client.anInt2029 - 1] = var1;

				var3.anInt1674 = var3.aClass124_Sub22_Sub1_1941.anInt1320;
				var3.anInt1724 = var3.aClass124_Sub22_Sub1_1941.anInt1343;
				if (var3.anInt1724 == 0)
					var3.anInt1672 = 0;

				var3.anInt1712 = var3.aClass124_Sub22_Sub1_1941.anInt1326;
				var3.anInt1679 = var3.aClass124_Sub22_Sub1_1941.anInt1327;
				var3.anInt1680 = var3.aClass124_Sub22_Sub1_1941.anInt1334;
				var3.anInt1681 = var3.aClass124_Sub22_Sub1_1941.anInt1329;
				var3.anInt1719 = var3.aClass124_Sub22_Sub1_1941.anInt1323;
				var3.anInt1676 = var3.aClass124_Sub22_Sub1_1941.anInt1324;
				var3.anInt1677 = var3.aClass124_Sub22_Sub1_1941.anInt1325;
				var3.method893(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0] + var10,
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0] + var5, var6 == 1);
			}

			client.aClass124_Sub14_Sub1_2026.method840();

			for (var1 = 0; var1 < client.anInt2029; ++var1) {
				var2 = client.anIntArray2104[var1];
				var3 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2];
				var10 = client.aClass124_Sub14_Sub1_2026.readByteU();
				if ((var10 & 8) != 0) {
					var5 = client.aClass124_Sub14_Sub1_2026.readUShort();
					if (var5 == '\uffff')
						var5 = -1;

					var8 = client.aClass124_Sub14_Sub1_2026.readByteU();
					if ((var3.anInt1699 == var5) && (var5 != -1)) {
						var6 = Def15.method750(var5).anInt1546;
						if (var6 == 1) {
							var3.anInt1700 = 0;
							var3.anInt1687 = 0;
							var3.anInt1673 = var8;
							var3.anInt1703 = 0;
						}

						if (var6 == 2)
							var3.anInt1703 = 0;
					} else if ((var5 == -1) || (var3.anInt1699 == -1) || (Def15
							.method750(var5).anInt1531 >= Def15.method750(var3.anInt1699).anInt1531)) {
						var3.anInt1699 = var5;
						var3.anInt1700 = 0;
						var3.anInt1687 = 0;
						var3.anInt1673 = var8;
						var3.anInt1703 = 0;
						var3.anInt1726 = var3.anInt1721;
					}
				}

				if ((var10 & 32) != 0) {
					var3.anInt1671 = client.aClass124_Sub14_Sub1_2026.readUShort();
					var3.anInt1728 = client.aClass124_Sub14_Sub1_2026.readShortU();
				}

				if ((var10 & 128) != 0) {
					var3.aString1683 = client.aClass124_Sub14_Sub1_2026.readStr2();
					var3.anInt1685 = 100;
				}

				if ((var10 & 64) != 0) {
					var3.anInt1710 = client.aClass124_Sub14_Sub1_2026.method582();
					var5 = client.aClass124_Sub14_Sub1_2026.readInt2(-895942306);
					var3.anInt1678 = var5 >> 16;
					var3.anInt1707 = (var5 & '\uffff') + client.anInt2158;
					var3.anInt1705 = 0;
					var3.anInt1706 = 0;
					if (var3.anInt1707 > client.anInt2158)
						var3.anInt1705 = -1;

					if (var3.anInt1710 == '\uffff')
						var3.anInt1710 = -1;
				}

				if ((var10 & 4) != 0) {
					var5 = client.aClass124_Sub14_Sub1_2026.method604();
					var8 = client.aClass124_Sub14_Sub1_2026.readByteU();
					var3.method894(var5, var8, client.anInt2158);
					var3.anInt1691 = 300 + client.anInt2158;
					var3.anInt1692 = client.aClass124_Sub14_Sub1_2026.readShortU();
					var3.anInt1693 = client.aClass124_Sub14_Sub1_2026.method583();
				}

				if ((var10 & 16) != 0) {
					var3.aClass124_Sub22_Sub1_1941 = Class34.method188(client.aClass124_Sub14_Sub1_2026.readUShort(),
							2041359585);
					var3.anInt1674 = var3.aClass124_Sub22_Sub1_1941.anInt1320;
					var3.anInt1724 = var3.aClass124_Sub22_Sub1_1941.anInt1343;
					var3.anInt1712 = var3.aClass124_Sub22_Sub1_1941.anInt1326;
					var3.anInt1679 = var3.aClass124_Sub22_Sub1_1941.anInt1327;
					var3.anInt1680 = var3.aClass124_Sub22_Sub1_1941.anInt1334;
					var3.anInt1681 = var3.aClass124_Sub22_Sub1_1941.anInt1329;
					var3.anInt1719 = var3.aClass124_Sub22_Sub1_1941.anInt1323;
					var3.anInt1676 = var3.aClass124_Sub22_Sub1_1941.anInt1324;
					var3.anInt1677 = var3.aClass124_Sub22_Sub1_1941.anInt1325;
				}

				if ((var10 & 1) != 0) {
					var5 = client.aClass124_Sub14_Sub1_2026.readByteN();
					var8 = client.aClass124_Sub14_Sub1_2026.method594();
					var3.method894(var5, var8, client.anInt2158);
					var3.anInt1691 = 300 + client.anInt2158;
					var3.anInt1692 = client.aClass124_Sub14_Sub1_2026.method583();
					var3.anInt1693 = client.aClass124_Sub14_Sub1_2026.method583();
				}

				if ((var10 & 2) != 0) {
					var3.anInt1694 = client.aClass124_Sub14_Sub1_2026.readUShort();
					if (var3.anInt1694 == '\uffff')
						var3.anInt1694 = -1;
				}
			}

			for (var1 = 0; var1 < client.anInt2108; ++var1) {
				var2 = client.anIntArray2109[var1];
				if (client.anInt2158 != client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2].anInt1716) {
					client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2].aClass124_Sub22_Sub1_1941 = null;
					client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2] = null;
				}
			}

			if (client.aClass124_Sub14_Sub1_2026.pos != client.anInt2027)
				throw new RuntimeException(client.aClass124_Sub14_Sub1_2026.pos + "," + client.anInt2027);
			else
				for (var1 = 0; var1 < client.anInt2022; ++var1)
					if (client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[client.anIntArray2023[var1]] == null)
						throw new RuntimeException(var1 + "," + client.anInt2022);
		}
	}

	public static Class127 method960(final String var0, final String var1, final boolean var2) {
		final File var3 = new File(Class25.aFile278, "preferences" + var0 + ".dat");
		if (var3.exists())
			try {
				final Class127 var10 = new Class127(var3, "rw", 10000L);
				return var10;
			} catch (final IOException var9) {
				;
			}

		String var4 = "";
		if (Class73.anInt607 == 33)
			var4 = "_rc";
		else if (Class73.anInt607 == 34)
			var4 = "_wip";

		final File var5 = new File(Class73.aString606, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		Class127 var6;
		if (!var2 && var5.exists())
			try {
				var6 = new Class127(var5, "rw", 10000L);
				return var6;
			} catch (final IOException var8) {
				;
			}

		try {
			var6 = new Class127(var3, "rw", 10000L);
			return var6;
		} catch (final IOException var7) {
			throw new RuntimeException();
		}
	}
}

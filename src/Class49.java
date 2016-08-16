import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Iterator;

import netscape.javascript.JSObject;

public class Class49 {
	static int anInt482;
	static Class124_Sub15 aClass124_Sub15_484;
	static String aString485;
	static int anInt486;
	static Class117 aClass117_488;
	static BigInteger aBigInteger487 = new BigInteger("10001", 16);
	static BigInteger aBigInteger483 = new BigInteger(
			"8928901f212acc11b11a9402404596de8826a6a669dac93b98995174f6792f8d7559322ee4dcf2691cb2b430b03c6ee076ba951a3e664a1c99a4f2f7a9dde8d0ad78d880be99aeb8af642543095ab7349fbef5c6bee4c7ae4889d121514e6fc121904e696f6a898e0eeb963e239e857355306664570703b2fa7286ea59f94eab",
			16);

	static final void method235() {
		try {
			if (client.anInt2016 == 0) {
				if (Class73.aClass78_609 != null) {
					Class73.aClass78_609.method324();
					Class73.aClass78_609 = null;
				}

				Class32.aClass79_345 = null;
				client.aBool2115 = false;
				client.anInt1999 = 0;
				client.anInt2016 = 1;
			}

			if (client.anInt2016 == 1) {
				if (Class32.aClass79_345 == null)
					Class32.aClass79_345 = Class27.aClass82_303.method332(Def8.aString1452,
							Class124_Sub22_Sub5.anInt1381);

				if (Class32.aClass79_345.anInt642 == 2)
					throw new IOException();

				if (Class32.aClass79_345.anInt642 == 1) {
					Class73.aClass78_609 = new Class78((Socket) Class32.aClass79_345.anObject638, Class27.aClass82_303);
					Class32.aClass79_345 = null;
					client.anInt2016 = 2;
				}
			}

			if (client.anInt2016 == 2) {
				client.aClass124_Sub14_Sub1_2024.pos = 0;
				client.aClass124_Sub14_Sub1_2024.writeByte(14);
				Class73.aClass78_609.method323(client.aClass124_Sub14_Sub1_2024.backing, 0, 1);
				client.aClass124_Sub14_Sub1_2026.pos = 0;
				client.anInt2016 = 3;
			}

			int var0;
			if (client.anInt2016 == 3) {
				if (client.aClass8_2224 != null)
					client.aClass8_2224.method47();

				if (null != Class124_Sub22_Sub19_Sub2.aClass8_1668)
					Class124_Sub22_Sub19_Sub2.aClass8_1668.method47();

				var0 = Class73.aClass78_609.method319();
				if (null != client.aClass8_2224)
					client.aClass8_2224.method47();

				if (null != Class124_Sub22_Sub19_Sub2.aClass8_1668)
					Class124_Sub22_Sub19_Sub2.aClass8_1668.method47();

				if (var0 != 0) {
					Class117.method441(var0);
					return;
				}

				client.aClass124_Sub14_Sub1_2026.pos = 0;
				client.anInt2016 = 5;
			}

			int var2;
			int var3;
			if (client.anInt2016 == 5) {
				final int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D) };
				client.aClass124_Sub14_Sub1_2024.pos = 0;
				client.aClass124_Sub14_Sub1_2024.writeByte(1);
				client.aClass124_Sub14_Sub1_2024.writeByte(Class4.aClass72_48.method11(2069700366));
				client.aClass124_Sub14_Sub1_2024.method548(var1[0]);
				client.aClass124_Sub14_Sub1_2024.method548(var1[1]);
				client.aClass124_Sub14_Sub1_2024.method548(var1[2]);
				client.aClass124_Sub14_Sub1_2024.method548(var1[3]);
				switch (Class4.aClass72_48.anInt596) {
				case 0:
				case 1:
					client.aClass124_Sub14_Sub1_2024.method547(Class84.anInt673);
					client.aClass124_Sub14_Sub1_2024.pos += 5;
					break;
				case 2:
					client.aClass124_Sub14_Sub1_2024.method548(((Integer) Class57.aClass22_538.aLinkedHashMap252
							.get(Integer.valueOf(Class47.method232(Class4.aString44)))).intValue());
					client.aClass124_Sub14_Sub1_2024.pos += 4;
					break;
				case 3:
					client.aClass124_Sub14_Sub1_2024.pos += 8;
				}

				client.aClass124_Sub14_Sub1_2024.method550(Class4.aString45);
				client.aClass124_Sub14_Sub1_2024.dorsa(aBigInteger487, aBigInteger483);
				client.aClass124_Sub14_Sub1_2167.pos = 0;
				if (client.anInt1992 == 40)
					client.aClass124_Sub14_Sub1_2167.writeByte(18);
				else
					client.aClass124_Sub14_Sub1_2167.writeByte(16);

				client.aClass124_Sub14_Sub1_2167.writeShort(0);
				var2 = client.aClass124_Sub14_Sub1_2167.pos;
				client.aClass124_Sub14_Sub1_2167.method548(88);
				client.aClass124_Sub14_Sub1_2167.method568(client.aClass124_Sub14_Sub1_2024.backing, 0,
						client.aClass124_Sub14_Sub1_2024.pos);
				var3 = client.aClass124_Sub14_Sub1_2167.pos;
				client.aClass124_Sub14_Sub1_2167.method550(Class4.aString44);
				client.aClass124_Sub14_Sub1_2167
						.writeByte(((client.aBool2196 ? 1 : 0) << 1) | (client.aBool1989 ? 1 : 0));
				client.aClass124_Sub14_Sub1_2167.writeShort(Class56_Sub2.anInt1083);
				client.aClass124_Sub14_Sub1_2167.writeShort(Class81.anInt662);
				final Class124_Sub14_Sub1 var4 = client.aClass124_Sub14_Sub1_2167;
				final byte[] var5 = new byte[24];

				int var6;
				try {
					Class73.aClass132_600.method474(0L);
					Class73.aClass132_600.method476(var5);

					for (var6 = 0; (var6 < 24) && (var5[var6] == 0); ++var6)
						;

					if (var6 >= 24)
						throw new IOException();
				} catch (final Exception var13) {
					for (int var8 = 0; var8 < 24; ++var8)
						var5[var8] = -1;
				}

				var4.method568(var5, 0, 24);
				client.aClass124_Sub14_Sub1_2167.method550(client.aString1991);
				client.aClass124_Sub14_Sub1_2167.method548(Class61.anInt546);
				final RSBuf var19 = new RSBuf(aClass124_Sub15_484.method609());
				aClass124_Sub15_484.method610(var19);
				client.aClass124_Sub14_Sub1_2167.method568(var19.backing, 0, var19.backing.length);
				client.aClass124_Sub14_Sub1_2167.writeByte(Class76.anInt620);
				client.aClass124_Sub14_Sub1_2167.method548(Class82.aClass94_Sub1_671.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class45.aClass94_Sub1_450.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class43.aClass94_Sub1_431.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class9.aClass94_Sub1_100.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class39.aClass94_Sub1_399.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class125.aClass94_Sub1_883.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class5.aClass94_Sub1_58.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class66.aClass94_Sub1_562.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class124_Sub11.aClass94_Sub1_1047.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class65.aClass94_Sub1_561.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class124_Sub22_Sub20.aClass94_Sub1_1647.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class68.aClass94_Sub1_571.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class88.aClass94_Sub1_695.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class25.aClass94_Sub1_279.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Class70.aClass94_Sub1_585.anInt756);
				client.aClass124_Sub14_Sub1_2167.method548(Somet2.aClass94_Sub1_1604.anInt756);
				client.aClass124_Sub14_Sub1_2167.method573(var1, var3, client.aClass124_Sub14_Sub1_2167.pos);
				client.aClass124_Sub14_Sub1_2167.method554(client.aClass124_Sub14_Sub1_2167.pos - var2);
				Class73.aClass78_609.method323(client.aClass124_Sub14_Sub1_2167.backing, 0,
						client.aClass124_Sub14_Sub1_2167.pos);
				client.aClass124_Sub14_Sub1_2024.method836(var1);

				for (var6 = 0; var6 < 4; ++var6)
					var1[var6] += 50;

				client.aClass124_Sub14_Sub1_2026.method836(var1);
				client.anInt2016 = 6;
			}

			if ((client.anInt2016 == 6) && (Class73.aClass78_609.method322() > 0)) {
				var0 = Class73.aClass78_609.method319();
				if ((var0 == 21) && (client.anInt1992 == 20))
					client.anInt2016 = 7;
				else if (var0 == 2)
					client.anInt2016 = 9;
				else {
					if ((var0 == 15) && (client.anInt1992 == 40)) {
						client.aClass124_Sub14_Sub1_2024.pos = 0;
						client.aClass124_Sub14_Sub1_2026.pos = 0;
						client.anInt2028 = -1;
						client.anInt2017 = 1;
						client.anInt2032 = -1;
						client.anInt2086 = -1;
						client.anInt2027 = 0;
						client.anInt2193 = 0;
						client.anInt2001 = 0;
						client.anInt2124 = 0;
						client.aBool2240 = false;
						client.anInt2218 = 0;
						client.anInt2194 = 0;

						for (var2 = 0; var2 < client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100.length; ++var2)
							if (client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var2] != null)
								client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var2].anInt1694 = -1;

						for (var2 = 0; var2 < client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254.length; ++var2)
							if (client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2] != null)
								client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2].anInt1694 = -1;

						method241();
						Class124_Sub5.method516(30);

						for (var2 = 0; var2 < 100; ++var2)
							client.aBoolArray2061[var2] = true;

						Def8.method698();
						return;
					}

					if ((var0 == 23) && (client.anInt2018 < 1)) {
						++client.anInt2018;
						client.anInt2016 = 0;
					} else {
						if (var0 != 29) {
							Class117.method441(var0);
							return;
						}

						client.anInt2016 = 11;
					}
				}
			}

			if ((client.anInt2016 == 7) && (Class73.aClass78_609.method322() > 0)) {
				client.anInt2019 = (Class73.aClass78_609.method319() + 3) * 60;
				client.anInt2016 = 8;
			}

			if (client.anInt2016 == 8) {
				client.anInt1999 = 0;
				Def13.method734("You have only just left another world.",
						"Your profile will be transferred in:", (client.anInt2019 / 60) + " seconds.");
				if (--client.anInt2019 <= 0)
					client.anInt2016 = 0;

			} else {
				if ((client.anInt2016 == 9) && (Class73.aClass78_609.method322() >= 13)) {
					final boolean var15 = Class73.aClass78_609.method319() == 1;
					Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.backing, 0, 4);
					client.aClass124_Sub14_Sub1_2026.pos = 0;
					if (var15) {
						var2 = client.aClass124_Sub14_Sub1_2026.method838() << 24;
						var2 |= client.aClass124_Sub14_Sub1_2026.method838() << 16;
						var2 |= client.aClass124_Sub14_Sub1_2026.method838() << 8;
						var2 |= client.aClass124_Sub14_Sub1_2026.method838();
						var3 = Class47.method232(Class4.aString44);
						if ((Class57.aClass22_538.aLinkedHashMap252.size() >= 10)
								&& !Class57.aClass22_538.aLinkedHashMap252.containsKey(Integer.valueOf(var3))) {
							final Iterator var18 = Class57.aClass22_538.aLinkedHashMap252.entrySet().iterator();
							var18.next();
							var18.remove();
						}

						Class57.aClass22_538.aLinkedHashMap252.put(Integer.valueOf(var3), Integer.valueOf(var2));
						Class62.method281();
					}

					client.anInt2149 = Class73.aClass78_609.method319();
					client.aBool2151 = Class73.aClass78_609.method319() == 1;
					client.anInt2106 = Class73.aClass78_609.method319();
					client.anInt2106 <<= 8;
					client.anInt2106 += Class73.aClass78_609.method319();
					client.anInt2107 = Class73.aClass78_609.method319();
					Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.backing, 0, 1);
					client.aClass124_Sub14_Sub1_2026.pos = 0;
					client.anInt2028 = client.aClass124_Sub14_Sub1_2026.method838();
					Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.backing, 0, 2);
					client.aClass124_Sub14_Sub1_2026.pos = 0;
					client.anInt2027 = client.aClass124_Sub14_Sub1_2026.method560();
					client var9;
					if (client.anInt2107 == 1)
						try {
							var9 = Class80.aclient645;
							JSObject.getWindow(var9).call("zap", (Object[]) null);
						} catch (final Throwable var12) {
							;
						}
					else
						try {
							var9 = Class80.aclient645;
							JSObject.getWindow(var9).call("unzap", (Object[]) null);
						} catch (final Throwable var11) {
							;
						}

					client.anInt2016 = 10;
				}

				if (client.anInt2016 == 10) {
					if (Class73.aClass78_609.method322() >= client.anInt2027) {
						client.aClass124_Sub14_Sub1_2026.pos = 0;
						Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.backing, 0,
								client.anInt2027);
						Class62.method276();
						Class124_Sub13.anInt1071 = -1;
						Class124_Sub5.method515(false);
						client.anInt2028 = -1;
					}

				} else {
					if ((client.anInt2016 == 11) && (Class73.aClass78_609.method322() >= 2)) {
						client.aClass124_Sub14_Sub1_2026.pos = 0;
						Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.backing, 0, 2);
						client.aClass124_Sub14_Sub1_2026.pos = 0;
						Class54.anInt504 = client.aClass124_Sub14_Sub1_2026.method560();
						client.anInt2016 = 12;
					}

					if ((client.anInt2016 == 12) && (Class73.aClass78_609.method322() >= Class54.anInt504)) {
						client.aClass124_Sub14_Sub1_2026.pos = 0;
						Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.backing, 0,
								Class54.anInt504);
						client.aClass124_Sub14_Sub1_2026.pos = 0;
						final String var16 = client.aClass124_Sub14_Sub1_2026.method597();
						final String var10 = client.aClass124_Sub14_Sub1_2026.method597();
						final String var20 = client.aClass124_Sub14_Sub1_2026.method597();
						Def13.method734(var16, var10, var20);
						Class124_Sub5.method516(10);
					}

					++client.anInt1999;
					if (client.anInt1999 > 2000)
						if (client.anInt2018 < 1) {
							if (client.anInt2020 == Class124_Sub22_Sub5.anInt1381)
								Class124_Sub22_Sub5.anInt1381 = Class124_Sub15.anInt1106;
							else
								Class124_Sub22_Sub5.anInt1381 = client.anInt2020;

							++client.anInt2018;
							client.anInt2016 = 0;
						} else
							Class117.method441(-3);
				}
			}
		} catch (final IOException var14) {
			if (client.anInt2018 < 1) {
				if (client.anInt2020 == Class124_Sub22_Sub5.anInt1381)
					Class124_Sub22_Sub5.anInt1381 = Class124_Sub15.anInt1106;
				else
					Class124_Sub22_Sub5.anInt1381 = client.anInt2020;

				++client.anInt2018;
				client.anInt2016 = 0;
			} else
				Class117.method441(-2);
		}
	}

	static final void method236(final Class124_Sub22_Sub19_Sub3 var0) {
		var0.aBool1708 = false;
		Def12 var1;
		if (var0.anInt1675 != -1) {
			var1 = Def15.method750(var0.anInt1675);
			if ((var1 != null) && (null != var1.anIntArray1536)) {
				++var0.anInt1698;
				if ((var0.anInt1695 < var1.anIntArray1536.length)
						&& (var0.anInt1698 > var1.anIntArray1529[var0.anInt1695])) {
					var0.anInt1698 = 1;
					++var0.anInt1695;
					Class124_Sub22_Sub19_Sub1.method887(var1, var0.anInt1695, var0.anInt1690, var0.anInt1697);
				}

				if (var0.anInt1695 >= var1.anIntArray1536.length) {
					var0.anInt1698 = 0;
					var0.anInt1695 = 0;
					Class124_Sub22_Sub19_Sub1.method887(var1, var0.anInt1695, var0.anInt1690, var0.anInt1697);
				}
			} else
				var0.anInt1675 = -1;
		}

		if ((var0.anInt1710 != -1) && (client.anInt2158 >= var0.anInt1707)) {
			if (var0.anInt1705 < 0)
				var0.anInt1705 = 0;

			final int var2 = Class43.method217(var0.anInt1710).anInt1519;
			if (var2 != -1) {
				final Def12 var3 = Def15.method750(var2);
				if ((null != var3) && (var3.anIntArray1536 != null)) {
					++var0.anInt1706;
					if ((var0.anInt1705 < var3.anIntArray1536.length)
							&& (var0.anInt1706 > var3.anIntArray1529[var0.anInt1705])) {
						var0.anInt1706 = 1;
						++var0.anInt1705;
						Class124_Sub22_Sub19_Sub1.method887(var3, var0.anInt1705, var0.anInt1690, var0.anInt1697);
					}

					if ((var0.anInt1705 >= var3.anIntArray1536.length)
							&& ((var0.anInt1705 < 0) || (var0.anInt1705 >= var3.anIntArray1536.length)))
						var0.anInt1710 = -1;
				} else
					var0.anInt1710 = -1;
			} else
				var0.anInt1710 = -1;
		}

		if ((var0.anInt1699 != -1) && (var0.anInt1673 <= 1)) {
			var1 = Def15.method750(var0.anInt1699);
			if ((var1.anInt1544 == 1) && (var0.anInt1726 > 0) && (var0.anInt1713 <= client.anInt2158)
					&& (var0.anInt1714 < client.anInt2158)) {
				var0.anInt1673 = 1;
				return;
			}
		}

		if ((var0.anInt1699 != -1) && (var0.anInt1673 == 0)) {
			var1 = Def15.method750(var0.anInt1699);
			if ((var1 != null) && (var1.anIntArray1536 != null)) {
				++var0.anInt1687;
				if ((var0.anInt1700 < var1.anIntArray1536.length)
						&& (var0.anInt1687 > var1.anIntArray1529[var0.anInt1700])) {
					var0.anInt1687 = 1;
					++var0.anInt1700;
					Class124_Sub22_Sub19_Sub1.method887(var1, var0.anInt1700, var0.anInt1690, var0.anInt1697);
				}

				if (var0.anInt1700 >= var1.anIntArray1536.length) {
					var0.anInt1700 -= var1.anInt1538;
					++var0.anInt1703;
					if (var0.anInt1703 >= var1.anInt1548)
						var0.anInt1699 = -1;
					else if ((var0.anInt1700 >= 0) && (var0.anInt1700 < var1.anIntArray1536.length))
						Class124_Sub22_Sub19_Sub1.method887(var1, var0.anInt1700, var0.anInt1690, var0.anInt1697);
					else
						var0.anInt1699 = -1;
				}

				var0.aBool1708 = var1.aBool1537;
			} else
				var0.anInt1699 = -1;
		}

		if (var0.anInt1673 > 0)
			--var0.anInt1673;

	}

	public static void method237(final Class94 var0) {
		Def19.aClass94_1441 = var0;
	}

	static void method238(final int var0, final String var1, final String var2, final String var3) {
		Class5 var4 = (Class5) Class47.aMap471.get(Integer.valueOf(var0));
		if (var4 == null) {
			var4 = new Class5();
			Class47.aMap471.put(Integer.valueOf(var0), var4);
		}

		final Class124_Sub22_Sub5 var5 = var4.method27(var0, var1, var2, var3);
		Class47.aClass116_474.method439(var5, var5.anInt1383);
		Class47.aClass119_469.method444(var5);
		client.anInt2097 = client.anInt2067;
	}

	static final void method239(final String var0) {
		if (null != Class124_Sub14_Sub1.aClass124_Sub9Array1609) {
			client.aClass124_Sub14_Sub1_2024.method837(22);
			client.aClass124_Sub14_Sub1_2024.writeByte(Class54.method258(var0));
			client.aClass124_Sub14_Sub1_2024.method550(var0);
		}
	}

	static final Class124_Sub7 method240(final int var0, final int var1, final int var2) {
		final Class124_Sub7 var3 = new Class124_Sub7();
		var3.anInt1012 = var1;
		var3.anInt1008 = var2;
		client.aClass107_2143.method412(var3, var0);
		Class32.method183(var1);
		final Widget var4 = Class10.method55(var0);
		Class124_Sub22_Sub10.method723(var4);
		if (null != client.aClass124_Sub17_2042) {
			Class124_Sub22_Sub10.method723(client.aClass124_Sub17_2042);
			client.aClass124_Sub17_2042 = null;
		}

		Class51.method247();
		Somet2.method831(Class124_Sub22_Sub10.widgets[var0 >> 16], var4, false);
		Class3.method20(var1);
		if (client.anInt2142 != -1)
			Class3.method23(client.anInt2142, 1);

		return var3;
	}

	static void method241() {
		Class124_Sub10.aClass107_1034 = new Class107(32);
	}
}

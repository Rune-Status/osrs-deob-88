import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.Clipboard;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;

public final class client extends Applet_Sub1 {
	/**
	 *
	 */
	private static final long serialVersionUID = 1018430280467017164L;
	static Class8 aClass8_2224;
	static int anInt2158 = 0;
	static int anInt2183;
	static long aLong2195;
	static int anInt2038;
	static int anInt2040;
	static int anInt2216;
	static int anInt2172;
	static int anInt2132;
	static int anInt2185;
	static int anInt2111;
	static int anInt1992 = 0;
	static int anInt2014;
	static int anInt2013;
	static int anInt2015;
	static Class88 aClass88_1987;
	static int anInt2079 = 1;
	static String aString1991;
	static int anInt2080 = 0;
	static int anInt1984 = 0;
	static int anInt2058 = 0;
	static boolean aBool1988 = false;
	static Class71 aClass71_2005;
	static boolean aBool2174 = true;
	static boolean aBool1989 = false;
	static boolean aBool1993 = true;
	static long aLong1995 = -1L;
	static int anInt1996 = -1;
	static int anInt1997 = -1;
	static int anInt1998 = -1;
	static boolean aBool2212 = true;
	static boolean aBool2000 = false;
	static int anInt2001 = 0;
	static int anInt2171 = 0;
	static int anInt2003 = 0;
	static int anInt2004 = 0;
	static int anInt2186 = 0;
	static int anInt2144 = 0;
	static int anInt2191 = 0;
	static int anInt2008 = 0;
	static int anInt2009 = 0;
	static RSBuf aClass124_Sub14_2146 = new RSBuf(new byte[5000]);
	static Class34 aClass34_2011;
	static int anInt2012;
	static int anInt2016;
	static int anInt1999;
	static int anInt2018;
	static int anInt2019;
	static Class124_Sub22_Sub19_Sub3_Sub1[] aClass124_Sub22_Sub19_Sub3_Sub1Array2254;
	static int anInt2022;
	static int[] anIntArray2023;
	static Outbuf secbuf;
	static Outbuf loginbuf;
	static Outbuf aClass124_Sub14_Sub1_2026;
	static int anInt2027;
	static int anInt2028;
	static int anInt2193;
	static int anInt2025;
	static int anInt2017;
	static int anInt2032;
	static int anInt2086;
	static int anInt2034;
	static boolean aBool2115;
	static int anInt2006;
	static int anInt2037;
	static int anInt2039;
	static int anInt2113;
	static Class130[] aClass130Array2192;
	static boolean aBool2043;
	static int[][][] anIntArrayArrayArray1994;
	static int[] anIntArray2045;
	static int anInt2046;
	static int anInt2047;
	static int anInt2048;
	static int anInt2049;
	static int anInt2050;
	static int anInt2051;
	static int anInt2052;
	static int anInt2053;
	static int anInt2164;
	static int anInt2055;
	static int anInt2207;
	static int anInt2057;
	static int anInt2263;
	static int anInt2102;
	static int anInt2105;
	static int anInt2062;
	static boolean aBool2156;
	static int anInt2064;
	static int anInt2076;
	static int anInt2255;
	static int anInt2197;
	static int anInt2068;
	static int anInt2069;
	static int anInt2070;
	static int anInt2101;
	static boolean aBool2044;
	static int anInt2187;
	static int anInt2074;
	static int anInt2116;
	static int[] anIntArray2033;
	static int[] anIntArray2077;
	static int[] anIntArray2078;
	static int[] anIntArray2103;
	static int[] anIntArray2119;
	static int[] anIntArray2081;
	static int[] anIntArray1982;
	static String[] aStringArray2243;
	static int[][] anIntArrayArray2083;
	static int anInt2084;
	static int anInt2085;
	static int anInt2152;
	static int anInt2087;
	static int anInt2088;
	static int anInt2089;
	static int anInt2141;
	static int anInt2010;
	static int anInt2092;
	static int anInt2093;
	static int anInt2094;
	static int anInt2095;
	static int anInt2075;
	static boolean aBool1985;
	static int anInt2133;
	static int anInt2099;
	static Class124_Sub22_Sub19_Sub3_Sub2[] aClass124_Sub22_Sub19_Sub3_Sub2Array2100;
	static int anInt2090;
	static int[] anIntArray2128;
	static int anInt2029;
	static int[] anIntArray2104;
	static RSBuf[] aClass124_Sub14Array2256;
	static int anInt2106;
	static int anInt2107;
	static int anInt2108;
	static int[] anIntArray2109;
	static int[] anIntArray2110;
	static String[] aStringArray2166;
	static boolean[] aBoolArray2112;
	static int[] anIntArray2168;
	static int anInt2114;
	static Class111[][][] aClass111ArrayArrayArray2073;
	static Class111 aClass111_2262;
	static Class111 aClass111_2117;
	static Class111 aClass111_2118;
	static int[] anIntArray2126;
	static int[] anIntArray2030;
	static int[] anIntArray2121;
	static int anInt2122;
	static boolean aBool2240;
	static int anInt2124;
	static int[] anIntArray2125;
	static int[] anIntArray2063;
	static int[] anIntArray2127;
	static int[] anIntArray2140;
	static String[] aStringArray2129;
	static String[] aStringArray2130;
	static int anInt2041;
	static int anInt2134;
	static int anInt2135;
	static String aString2136;
	static boolean aBool2137;
	static int anInt2138;
	static int anInt2082;
	static String aString1983;
	static String aString2035;
	static int anInt2142;
	static Class107 aClass107_2143;
	static int anInt2131;
	static int anInt2036;
	static Widget aClass124_Sub17_2042;
	static int anInt2147;
	static int anInt2148;
	static int anInt2149;
	static int anInt2150;
	static boolean aBool2151;
	static boolean aBool2021;
	static boolean aBool2153;
	static Widget aClass124_Sub17_2154;
	static Widget aClass124_Sub17_2155;
	static Widget aClass124_Sub17_2199;
	static int anInt2157;
	static int anInt2145;
	static Widget aClass124_Sub17_2159;
	static boolean aBool2160;
	static int anInt2161;
	static int anInt2162;
	static boolean aBool2163;
	static int anInt2200;
	static int anInt2165;
	static boolean aBool2233;
	static int anInt2067;
	static int[] anIntArray2246;
	static int anInt2169;
	static int[] anIntArray2170;
	static int anInt2060;
	static int[] anIntArray2072;
	static int anInt2173;
	static int anInt2097;
	static int anInt2175;
	static int anInt2176;
	static int anInt2177;
	static int anInt2178;
	static int anInt2179;
	static Class111 aClass111_2181;
	static Class111 aClass111_2182;
	static Class111 aClass111_2139;
	static Class107 aClass107_2184;
	static boolean[] aBoolArray2061;
	static boolean[] aBoolArray2188;
	static boolean[] aBoolArray2189;
	static int[] anIntArray2190;
	static int[] anIntArray2223;
	static int[] anIntArray2209;
	static int[] anIntArray2222;
	static int anInt1990;
	static boolean aBool2196;
	static int anInt2071;
	static int anInt2198;
	static int[] anIntArray2096;
	static int anInt2066;
	static int anInt2201;
	static String aString2202;
	static long[] aLongArray2203;
	static int anInt2204;
	static int anInt2205;
	static int[] anIntArray2059;
	static int[] anIntArray2241;
	static long aLong2208;
	static String aString2120;
	static String aString2210;
	static int anInt2211;
	static int anInt2065;
	static int[] anIntArray2213;
	static int[] anIntArray2214;
	static Class124_Sub22_Sub16_Sub1[] aClass124_Sub22_Sub16_Sub1Array2244;
	static int anInt2194;
	static int anInt2217;
	static int anInt2218;
	static int anInt2219;
	static int anInt2220;
	static boolean aBool2221;
	static int anInt2239;
	static int anInt2206;
	static int anInt2225;
	static int[] anIntArray2226;
	static int[] anIntArray2227;
	static int[] anIntArray2228;
	static int[] anIntArray2229;
	static Class12[] aClass12Array2230;
	static boolean aBool2231;
	static boolean[] aBoolArray2232;
	static int[] anIntArray2123;
	static int[] anIntArray2054;
	static int[] anIntArray2235;
	static int[] anIntArray2236;
	static short aShort2237;
	static short aShort2031;
	static short aShort2180;
	static short aShort2091;
	static short aShort2251;
	static short aShort2242;
	static short aShort2234;
	static short aShort2007;
	static int anInt2245;
	static int anInt2238;
	static int anInt2247;
	static int anInt2248;
	static int anInt2249;
	static int anInt2056;
	static int anInt2215;
	static Class32[] aClass32Array2098;
	static Class106 aClass106_2253;
	static int anInt2252;
	static Class35[] aClass35Array1986;
	static Class100 aClass100_2250;
	static int anInt2257;
	static int anInt2258;
	static Class125[] aClass125Array2259;
	static long aLong2260;
	static long aLong2261;
	static int anInt2020;
	static Clipboard aClipboard2002;
	static Class124_Sub9[] aClass124_Sub9Array1609;

	@Override
	protected final void method1055(final int var1) {
		++anInt2158;
		method1064();

		while (true) {
			final Class111 var2 = Class99.aClass111_776;
			Class124_Sub19 var3;
			synchronized (var2) {
				var3 = (Class124_Sub19) Class99.aClass111_775.method427();
			}

			if (null == var3) {
				int var5;
				try {
					if (Class96.anInt770 == 1) {
						var5 = Class77.aClass124_Sub4_Sub3_624.method870();
						if ((var5 > 0) && Class77.aClass124_Sub4_Sub3_624.method852()) {
							var5 -= Class96.anInt766;
							if (var5 < 0)
								var5 = 0;

							Class77.aClass124_Sub4_Sub3_624.method846(var5);
						} else {
							Class77.aClass124_Sub4_Sub3_624.method868();
							Class77.aClass124_Sub4_Sub3_624.method856();
							if (null != Class96.aClass94_767)
								Class96.anInt770 = 2;
							else
								Class96.anInt770 = 0;

							Class96.aClass124_Sub20_769 = null;
							ISAAC.aClass10_570 = null;
						}
					}
				} catch (final Exception var7) {
					var7.printStackTrace();
					Class77.aClass124_Sub4_Sub3_624.method868();
					Class96.anInt770 = 0;
					Class96.aClass124_Sub20_769 = null;
					ISAAC.aClass10_570 = null;
					Class96.aClass94_767 = null;
				}

				Def15.method751();
				Class57.method268();
				Class124_Sub22_Sub19_Sub6.method968();
				if (Class47.aClass66_473 != null) {
					var5 = Class47.aClass66_473.method292(-1757587329);
					anInt2183 = var5;
				}

				if (anInt1992 == 0) {
					Class72.method311();
					Class42.method215();
				} else if (anInt1992 == 5) {
					Class62.method279(this);
					Class72.method311();
					Class42.method215();
				} else if ((anInt1992 != 10) && (anInt1992 != 11)) {
					if (anInt1992 == 20) {
						Class62.method279(this);
						Class49.method235();
					} else if (anInt1992 == 25)
						Class9_Sub1.method494();
				} else
					Class62.method279(this);

				if (anInt1992 == 30)
					Somet2.method832();
				else if ((anInt1992 == 40) || (anInt1992 == 45))
					Class49.method235();

				return;
			}

			var3.aClass94_Sub1_1297.method614(var3.aClass69_1296, (int) var3.aLong874, var3.aByteArray1298, false);
		}
	}

	@Override
	protected final void method1056(final byte var1) {
		final boolean var2 = Def16.method672();
		if (var2 && aBool2221 && (null != aClass8_2224))
			aClass8_2224.method38();

		if ((anInt1992 == 10) || (anInt1992 == 20) || (anInt1992 == 30))
			if ((aLong2195 != 0L) && (Class74.method316(-563847615) > aLong2195))
				Def13.method735(Class34.method187());
			else if (aBool1963)
				client.method605(-611232372);

		final Dimension var3 = method1060();
		if ((var3.width != Class124_Sub5.anInt989) || (var3.height != Class124_Sub22_Sub19_Sub1.anInt1664)
				|| aBool1976) {
			Class124_Sub13.method542();
			aLong2195 = Class74.method316(-1227489551) + 500L;
			aBool1976 = false;
		}

		boolean var4 = false;
		int var5;
		if (aBool1968) {
			aBool1968 = false;
			var4 = true;

			for (var5 = 0; var5 < 100; ++var5)
				aBoolArray2061[var5] = true;
		}

		if (var4)
			Class124_Sub22_Sub19_Sub1.method885();

		int var12;
		if (anInt1992 == 0) {
			var5 = Class4.anInt38;
			final String var6 = Class4.aString39;
			Color var7 = null;

			try {
				final Graphics var8 = Class124_Sub5.aCanvas990.getGraphics();
				if (null == Class41.aFont406) {
					Class41.aFont406 = new Font("Helvetica", 1, 13);
					Class4.aFontMetrics53 = Class124_Sub5.aCanvas990.getFontMetrics(Class41.aFont406);
				}

				if (var4) {
					var8.setColor(Color.black);
					var8.fillRect(0, 0, Class56_Sub2.anInt1083, Class81.anInt662);
				}

				if (null == var7)
					var7 = new Color(140, 17, 17);

				try {
					if (Class46.anImage456 == null)
						Class46.anImage456 = Class124_Sub5.aCanvas990.createImage(304, 34);

					final Graphics var9 = Class46.anImage456.getGraphics();
					var9.setColor(var7);
					var9.drawRect(0, 0, 303, 33);
					var9.fillRect(2, 2, 3 * var5, 30);
					var9.setColor(Color.black);
					var9.drawRect(1, 1, 301, 31);
					var9.fillRect(2 + (var5 * 3), 2, 300 - (3 * var5), 30);
					var9.setFont(Class41.aFont406);
					var9.setColor(Color.white);
					var9.drawString(var6, (304 - Class4.aFontMetrics53.stringWidth(var6)) / 2, 22);
					var8.drawImage(Class46.anImage456, (Class56_Sub2.anInt1083 / 2) - 152, (Class81.anInt662 / 2) - 18,
							(ImageObserver) null);
				} catch (final Exception var15) {
					final int var10 = (Class56_Sub2.anInt1083 / 2) - 152;
					final int var11 = (Class81.anInt662 / 2) - 18;
					var8.setColor(var7);
					var8.drawRect(var10, var11, 303, 33);
					var8.fillRect(2 + var10, 2 + var11, 3 * var5, 30);
					var8.setColor(Color.black);
					var8.drawRect(var10 + 1, 1 + var11, 301, 31);
					var8.fillRect((var5 * 3) + var10 + 2, 2 + var11, 300 - (var5 * 3), 30);
					var8.setFont(Class41.aFont406);
					var8.setColor(Color.white);
					var8.drawString(var6, var10 + ((304 - Class4.aFontMetrics53.stringWidth(var6)) / 2), var11 + 22);
				}
			} catch (final Exception var16) {
				Class124_Sub5.aCanvas990.repaint();
			}
		} else if (anInt1992 == 5)
			Class64.method287(Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407, Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260,
					Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714, var4);
		else if ((anInt1992 != 10) && (anInt1992 != 11)) {
			if (anInt1992 == 20)
				Class64.method287(Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407,
						Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260, Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714, var4);
			else if (anInt1992 == 25) {
				if (anInt2113 == 1) {
					if (anInt2037 > anInt2038)
						anInt2038 = anInt2037;

					var5 = ((anInt2038 * 50) - (anInt2037 * 50)) / anInt2038;
					Class124_Sub7.method523("Loading - please wait." + "<br>" + " (" + var5 + "%" + ")", false);
				} else if (anInt2113 == 2) {
					if (anInt2039 > anInt2040)
						anInt2040 = anInt2039;

					var5 = 50 + (((anInt2040 * 50) - (anInt2039 * 50)) / anInt2040);
					Class124_Sub7.method523("Loading - please wait." + "<br>" + " (" + var5 + "%" + ")", false);
				} else
					Class124_Sub7.method523("Loading - please wait.", false);
			} else if (anInt1992 == 30) {
				if (anInt2142 != -1)
					Class124_Sub10.method536(anInt2142);

				for (var5 = 0; var5 < anInt2185; ++var5) {
					if (aBoolArray2061[var5])
						aBoolArray2188[var5] = true;

					aBoolArray2189[var5] = aBoolArray2061[var5];
					aBoolArray2061[var5] = false;
				}

				anInt2216 = anInt2158;
				anInt2172 = -1;
				anInt2132 = -1;
				Def9.aClass124_Sub17_1352 = null;
				if (anInt2142 != -1) {
					anInt2185 = 0;
					Def6.method692(anInt2142, 0, 0, Class56_Sub2.anInt1083, Class81.anInt662, 0, 0, -1);
				}

				Class124_Sub22_Sub16.method763();
				if (!aBool2240) {
					if (anInt2172 != -1) {
						var5 = anInt2172;
						var12 = anInt2132;
						if ((anInt2124 >= 2) || (anInt2135 != 0) || aBool2137) {
							String var19;
							if ((anInt2135 == 1) && (anInt2124 < 2))
								var19 = "Use" + " " + aString2136 + " " + "->";
							else if (aBool2137 && (anInt2124 < 2))
								var19 = aString1983 + " " + aString2035 + " " + "->";
							else {
								final int var13 = anInt2124 - 1;
								String var20;
								if (aStringArray2130[var13].length() > 0)
									var20 = aStringArray2129[var13] + " " + aStringArray2130[var13];
								else
									var20 = aStringArray2129[var13];

								var19 = var20;
							}

							if (anInt2124 > 2)
								var19 = var19 + Class124_Sub4_Sub3.method874(16777215) + " " + '\u002f' + " "
										+ (anInt2124 - 2) + " more options";

							Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1024(var19, var5 + 4, var12 + 15,
									16777215, 0, anInt2158 / 1000);
						}
					}
				} else
					Class36.method196();

				if (anInt1990 == 3)
					for (var5 = 0; var5 < anInt2185; ++var5)
						if (aBoolArray2189[var5])
							Class124_Sub22_Sub16.method767(anIntArray2190[var5], anIntArray2223[var5],
									anIntArray2209[var5], anIntArray2222[var5], 16711935, 128);
						else if (aBoolArray2188[var5])
							Class124_Sub22_Sub16.method767(anIntArray2190[var5], anIntArray2223[var5],
									anIntArray2209[var5], anIntArray2222[var5], 16711680, 128);

				Class124_Sub22_Sub19_Sub3_Sub2.method1047(Class134.anInt906,
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690,
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697, anInt2111);
				anInt2111 = 0;
			} else if (anInt1992 == 40)
				Class124_Sub7.method523("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			else if (anInt1992 == 45)
				Class124_Sub7.method523("Please wait...", false);
		} else
			Class64.method287(Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407, Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260,
					Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714, var4);

		Graphics var14;
		if ((anInt1992 == 30) && (anInt1990 == 0) && !var4)
			try {
				var14 = Class124_Sub5.aCanvas990.getGraphics();

				for (var12 = 0; var12 < anInt2185; ++var12)
					if (aBoolArray2188[var12]) {
						Class64.aClass9_558.method53(var14, anIntArray2190[var12], anIntArray2223[var12],
								anIntArray2209[var12], anIntArray2222[var12], 1687102755);
						aBoolArray2188[var12] = false;
					}
			} catch (final Exception var18) {
				Class124_Sub5.aCanvas990.repaint();
			}
		else if (anInt1992 > 0)
			try {
				var14 = Class124_Sub5.aCanvas990.getGraphics();
				Class64.aClass9_558.method52(var14, 0, 0, (byte) 7);

				for (var12 = 0; var12 < anInt2185; ++var12)
					aBoolArray2188[var12] = false;
			} catch (final Exception var17) {
				Class124_Sub5.aCanvas990.repaint();
			}

	}

	@Override
	protected final void method1057(final int var1) {
		if (Class124_Sub6.aClass41_1006.method210())
			Class124_Sub6.aClass41_1006.method207();

		if (null != Class47.aClass29_467)
			Class47.aClass29_467.aBool317 = false;

		Class47.aClass29_467 = null;
		if (Class73.aClass78_609 != null) {
			Class73.aClass78_609.method324();
			Class73.aClass78_609 = null;
		}

		if (Class84.aClass84_683 != null) {
			final Class84 var2 = Class84.aClass84_683;
			synchronized (var2) {
				Class84.aClass84_683 = null;
			}
		}

		Class124_Sub22_Sub19_Sub3_Sub2.method1045(-883692049);
		Class47.aClass66_473 = null;
		if (null != aClass8_2224)
			aClass8_2224.method48();

		if (Class124_Sub22_Sub19_Sub2.aClass8_1668 != null)
			Class124_Sub22_Sub19_Sub2.aClass8_1668.method48();

		Class124_Sub22_Sub19_Sub3_Sub1.method1041();
		final Object var10 = Class99.anObject774;
		synchronized (var10) {
			if (Class99.anInt773 != 0) {
				Class99.anInt773 = 1;

				try {
					Class99.anObject774.wait();
				} catch (final InterruptedException var6) {
					;
				}
			}
		}

		try {
			Class73.aClass132_605.method479();

			for (int var5 = 0; var5 < Class73.anInt602; ++var5)
				Class73.aClass132Array604[var5].method479();

			Class73.aClass132_601.method479();
			Class73.aClass132_600.method479();
		} catch (final Exception var8) {
			;
		}

	}

	void method1064() {
		if (anInt1992 != 1000) {
			final long var1 = Class74.method316(1069889988);
			int var3 = (int) (var1 - Class92.aLong717);
			Class92.aLong717 = var1;
			if (var3 > 200)
				var3 = 200;

			Class92.anInt715 += var3;
			boolean var4;
			if ((Class92.anInt725 == 0) && (Class92.anInt716 == 0) && (Class92.anInt723 == 0)
					&& (Class92.anInt719 == 0))
				var4 = true;
			else if (null == Class92.aClass78_732)
				var4 = false;
			else
				try {
					label205: {
						if (Class92.anInt715 > 30000)
							throw new IOException();

						Class124_Sub22_Sub21 var5;
						RSBuf var6;
						while ((Class92.anInt716 < 20) && (Class92.anInt719 > 0)) {
							var5 = (Class124_Sub22_Sub21) Class92.aClass107_718.method411();
							var6 = new RSBuf(4);
							var6.writeByte(1);
							var6.writeTrib((int) var5.aLong874);
							Class92.aClass78_732.method323(var6.backing, 0, 4);
							Class92.aClass107_730.method412(var5, var5.aLong874);
							--Class92.anInt719;
							++Class92.anInt716;
						}

						while ((Class92.anInt725 < 20) && (Class92.anInt723 > 0)) {
							var5 = (Class124_Sub22_Sub21) Class92.aClass108_722.method417();
							var6 = new RSBuf(4);
							var6.writeByte(0);
							var6.writeTrib((int) var5.aLong874);
							Class92.aClass78_732.method323(var6.backing, 0, 4);
							var5.method637();
							Class92.aClass107_724.method412(var5, var5.aLong874);
							--Class92.anInt723;
							++Class92.anInt725;
						}

						for (int var7 = 0; var7 < 100; ++var7) {
							final int var8 = Class92.aClass78_732.method322();
							if (var8 < 0)
								throw new IOException();

							if (var8 == 0)
								break;

							Class92.anInt715 = 0;
							byte var9 = 0;
							if (Class28.aClass124_Sub22_Sub21_311 == null)
								var9 = 8;
							else if (Class92.anInt727 == 0)
								var9 = 1;

							int var10;
							int var11;
							int var12;
							int var14;
							if (var9 > 0) {
								var10 = var9 - Class92.aClass124_Sub14_726.pos;
								if (var10 > var8)
									var10 = var8;

								Class92.aClass78_732.method320(Class92.aClass124_Sub14_726.backing,
										Class92.aClass124_Sub14_726.pos, var10);
								if (Class92.aByte733 != 0)
									for (var11 = 0; var11 < var10; ++var11)
										Class92.aClass124_Sub14_726.backing[var11
												+ Class92.aClass124_Sub14_726.pos] ^= Class92.aByte733;

								Class92.aClass124_Sub14_726.pos += var10;
								if (Class92.aClass124_Sub14_726.pos < var9)
									break;

								if (Class28.aClass124_Sub22_Sub21_311 == null) {
									Class92.aClass124_Sub14_726.pos = 0;
									var11 = Class92.aClass124_Sub14_726.readByteU();
									var12 = Class92.aClass124_Sub14_726.readShortU();
									final int var13 = Class92.aClass124_Sub14_726.readByteU();
									var14 = Class92.aClass124_Sub14_726.readInt2(1462322338);
									final long var15 = var12 + (var11 << 16);
									Class124_Sub22_Sub21 var17 = (Class124_Sub22_Sub21) Class92.aClass107_730
											.method409(var15);
									Class45.aBool447 = true;
									if (null == var17) {
										var17 = (Class124_Sub22_Sub21) Class92.aClass107_724.method409(var15);
										Class45.aBool447 = false;
									}

									if (null == var17)
										throw new IOException();

									final int var18 = var13 == 0 ? 5 : 9;
									Class28.aClass124_Sub22_Sub21_311 = var17;
									ISAAC.buf = new RSBuf(
											Class28.aClass124_Sub22_Sub21_311.aByte1650 + var14 + var18);
									ISAAC.buf.writeByte(var13);
									ISAAC.buf.writeInt(var14);
									Class92.anInt727 = 8;
									Class92.aClass124_Sub14_726.pos = 0;
								} else if (Class92.anInt727 == 0)
									if (Class92.aClass124_Sub14_726.backing[0] == -1) {
										Class92.anInt727 = 1;
										Class92.aClass124_Sub14_726.pos = 0;
									} else
										Class28.aClass124_Sub22_Sub21_311 = null;
							} else {
								var10 = ISAAC.buf.backing.length
										- Class28.aClass124_Sub22_Sub21_311.aByte1650;
								var11 = 512 - Class92.anInt727;
								if (var11 > (var10 - ISAAC.buf.pos))
									var11 = var10 - ISAAC.buf.pos;

								if (var11 > var8)
									var11 = var8;

								Class92.aClass78_732.method320(ISAAC.buf.backing,
										ISAAC.buf.pos, var11);
								if (Class92.aByte733 != 0)
									for (var12 = 0; var12 < var11; ++var12)
										ISAAC.buf.backing[ISAAC.buf.pos
												+ var12] ^= Class92.aByte733;

								ISAAC.buf.pos += var11;
								Class92.anInt727 += var11;
								if (var10 == ISAAC.buf.pos) {
									if (16711935L == Class28.aClass124_Sub22_Sub21_311.aLong874) {
										Class124_Sub6.aClass124_Sub14_1007 = ISAAC.buf;

										for (var12 = 0; var12 < 256; ++var12) {
											final Class94_Sub1 var19 = Class92.aClass94_Sub1Array729[var12];
											if (var19 != null) {
												Class124_Sub6.aClass124_Sub14_1007.pos = 5 + (var12 * 8);
												var14 = Class124_Sub6.aClass124_Sub14_1007.readInt2(2103441446);
												final int var20 = Class124_Sub6.aClass124_Sub14_1007
														.readInt2(1026071084);
												var19.method617(var14, var20);
											}
										}
									} else {
										Class92.aCRC32_720.reset();
										Class92.aCRC32_720.update(ISAAC.buf.backing, 0, var10);
										var12 = (int) Class92.aCRC32_720.getValue();
										if (var12 != Class28.aClass124_Sub22_Sub21_311.anInt1648) {
											try {
												Class92.aClass78_732.method324();
											} catch (final Exception var23) {
												;
											}

											++Class92.anInt731;
											Class92.aClass78_732 = null;
											Class92.aByte733 = (byte) ((int) ((Math.random() * 255.0D) + 1.0D));
											var4 = false;
											break label205;
										}

										Class92.anInt731 = 0;
										Class92.anInt721 = 0;
										Class28.aClass124_Sub22_Sub21_311.aClass94_Sub1_1651.method618(
												(int) (Class28.aClass124_Sub22_Sub21_311.aLong874 & 65535L),
												ISAAC.buf.backing,
												16711680L == (Class28.aClass124_Sub22_Sub21_311.aLong874 & 16711680L),
												Class45.aBool447);
									}

									Class28.aClass124_Sub22_Sub21_311.method450();
									if (Class45.aBool447)
										--Class92.anInt716;
									else
										--Class92.anInt725;

									Class92.anInt727 = 0;
									Class28.aClass124_Sub22_Sub21_311 = null;
									ISAAC.buf = null;
								} else {
									if (Class92.anInt727 != 512)
										break;

									Class92.anInt727 = 0;
								}
							}
						}

						var4 = true;
					}
				} catch (final IOException var24) {
					try {
						Class92.aClass78_732.method324();
					} catch (final Exception var22) {
						;
					}

					++Class92.anInt721;
					Class92.aClass78_732 = null;
					var4 = false;
				}

			if (!var4)
				method1065();

		}
	}

	void method1065() {
		if (Class92.anInt731 >= 4) {
			method1058("js5crc");
			anInt1992 = 1000;
		} else {
			if (Class92.anInt721 >= 4) {
				if (anInt1992 <= 5) {
					method1058("js5io");
					anInt1992 = 1000;
					return;
				}

				anInt2014 = 3000;
				Class92.anInt721 = 3;
			}

			if ((--anInt2014 + 1) <= 0)
				try {
					if (anInt2013 == 0) {
						Class124_Sub7.aClass79_1010 = Class27.aClass82_303.method332(Def8.aString1452,
								Class124_Sub22_Sub5.anInt1381);
						++anInt2013;
					}

					if (anInt2013 == 1) {
						if (Class124_Sub7.aClass79_1010.anInt642 == 2) {
							method1066(-1);
							return;
						}

						if (Class124_Sub7.aClass79_1010.anInt642 == 1)
							++anInt2013;
					}

					if (anInt2013 == 2) {
						Class90.aClass78_708 = new Class78((Socket) Class124_Sub7.aClass79_1010.anObject638,
								Class27.aClass82_303);
						final RSBuf var1 = new RSBuf(5);
						var1.writeByte(15);
						var1.writeInt(88);
						Class90.aClass78_708.method323(var1.backing, 0, 5);
						++anInt2013;
						Class124_Sub22_Sub19_Sub1.aLong1658 = Class74.method316(277218670);
					}

					if (anInt2013 == 3)
						if ((anInt1992 > 5) && (Class90.aClass78_708.method322() <= 0)) {
							if ((Class74.method316(-820484053) - Class124_Sub22_Sub19_Sub1.aLong1658) > 30000L) {
								method1066(-2);
								return;
							}
						} else {
							final int var2 = Class90.aClass78_708.method319();
							if (var2 != 0) {
								method1066(var2);
								return;
							}

							++anInt2013;
						}

					if (anInt2013 == 4) {
						Class124_Sub22_Sub5.method673(Class90.aClass78_708, anInt1992 > 20);
						Class124_Sub7.aClass79_1010 = null;
						Class90.aClass78_708 = null;
						anInt2013 = 0;
						anInt2015 = 0;
					}
				} catch (final IOException var3) {
					method1066(-3);
				}
		}
	}

	void method1066(final int var1) {
		Class124_Sub7.aClass79_1010 = null;
		Class90.aClass78_708 = null;
		anInt2013 = 0;
		if (Class124_Sub22_Sub5.anInt1381 == anInt2020)
			Class124_Sub22_Sub5.anInt1381 = Class124_Sub15.anInt1106;
		else
			Class124_Sub22_Sub5.anInt1381 = anInt2020;

		++anInt2015;
		if ((anInt2015 < 2) || ((var1 != 7) && (var1 != 9))) {
			if ((anInt2015 >= 2) && (var1 == 6)) {
				method1058("js5connect_outofdate");
				anInt1992 = 1000;
			} else if (anInt2015 >= 4)
				if (anInt1992 <= 5) {
					method1058("js5connect");
					anInt1992 = 1000;
				} else
					anInt2014 = 3000;
		} else if (anInt1992 <= 5) {
			method1058("js5connect_full");
			anInt1992 = 1000;
		} else
			anInt2014 = 3000;

	}

	@Override
	public final void init() {
		if (method1051()) {
			final Class122[] var1 = Class85.method339();

			for (final Class122 var3 : var1) {
				final String var4 = getParameter(var3.aString857);
				if (var4 != null)
					switch (Integer.parseInt(var3.aString857)) {
					case 2:
						Class48.aString480 = var4;
						break;
					case 3:
						aClass88_1987 = (Class88) Class23.method158(Class51.method246(), Integer.parseInt(var4));
						if (Class88.aClass88_699 == aClass88_1987)
							Class49.aClass117_488 = Class117.aClass117_840;
						else
							Class49.aClass117_488 = Class117.aClass117_839;
					case 4:
					case 12:
					default:
						break;
					case 5:
						final int var5 = Integer.parseInt(var4);
						final Class71[] var6 = new Class71[] { Class71.aClass71_592, Class71.aClass71_586,
								Class71.aClass71_587, Class71.aClass71_590 };
						final Class71[] var7 = var6;
						int var8 = 0;

						Class71 var10;
						while (true) {
							if (var8 >= var7.length) {
								var10 = null;
								break;
							}

							final Class71 var9 = var7[var8];
							if (var9.anInt589 == var5) {
								var10 = var9;
								break;
							}

							++var8;
						}

						aClass71_2005 = var10;
						break;
					case 6:
						Class61.anInt546 = Integer.parseInt(var4);
						break;
					case 7:
						anInt2079 = Integer.parseInt(var4);
						break;
					case 8:
						if (var4.equalsIgnoreCase("true"))
							aBool1988 = true;
						else
							aBool1988 = false;
						break;
					case 9:
						aString1991 = var4;
						break;
					case 10:
						if (var4.equalsIgnoreCase("true"))
							;
						break;
					case 11:
						anInt2080 = Integer.parseInt(var4);
						break;
					case 13:
						anInt1984 = Integer.parseInt(var4);
						break;
					case 14:
						anInt2058 = Integer.parseInt(var4);
						break;
					case 15:
						Class76.anInt620 = Integer.parseInt(var4);
					}
			}

			Class27.method163();
			Def8.aString1452 = getCodeBase().getHost();
			final String var12 = aClass71_2005.aString588;
			final byte var13 = 0;

			try {
				Class43.method219("oldschool", var12, var13, 16);
			} catch (final Exception var11) {
				Class28.method166((String) null, var11);
			}

			Class80.aclient645 = this;
			method1049(765, 503, 88);
		}
	}

	static {
		aClass34_2011 = Class34.aClass34_368;
		anInt2012 = 0;
		anInt2013 = 0;
		anInt2014 = 0;
		anInt2015 = 0;
		anInt2016 = 0;
		anInt1999 = 0;
		anInt2018 = 0;
		anInt2019 = 0;
		aClass124_Sub22_Sub19_Sub3_Sub1Array2254 = new Class124_Sub22_Sub19_Sub3_Sub1['\u8000'];
		anInt2022 = 0;
		anIntArray2023 = new int['\u8000'];
		secbuf = new Outbuf(5000);
		loginbuf = new Outbuf(5000);
		aClass124_Sub14_Sub1_2026 = new Outbuf(5000);
		anInt2027 = 0;
		anInt2028 = 0;
		anInt2193 = 0;
		anInt2025 = 0;
		anInt2017 = 0;
		anInt2032 = 0;
		anInt2086 = 0;
		anInt2034 = 0;
		aBool2115 = false;
		anInt2006 = 0;
		anInt2037 = 0;
		anInt2038 = 1;
		anInt2039 = 0;
		anInt2040 = 1;
		anInt2113 = 0;
		aClass130Array2192 = new Class130[4];
		aBool2043 = false;
		anIntArrayArrayArray1994 = new int[4][13][13];
		anIntArray2045 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt2046 = 0;
		anInt2047 = 2;
		anInt2048 = 0;
		anInt2049 = 2;
		anInt2050 = 0;
		anInt2051 = 1;
		anInt2052 = 0;
		anInt2053 = 0;
		anInt2164 = 2;
		anInt2055 = 0;
		anInt2207 = 1;
		anInt2057 = 0;
		anInt2111 = 0;
		anInt2263 = 2301979;
		anInt2102 = 5063219;
		anInt2105 = 3353893;
		anInt2062 = 7759444;
		aBool2156 = false;
		anInt2064 = 0;
		anInt2076 = 128;
		anInt2255 = 0;
		anInt2197 = 0;
		anInt2068 = 0;
		anInt2069 = 0;
		anInt2070 = 0;
		anInt2101 = 0;
		aBool2044 = false;
		anInt2187 = 0;
		anInt2074 = 0;
		anInt2116 = 50;
		anIntArray2033 = new int[anInt2116];
		anIntArray2077 = new int[anInt2116];
		anIntArray2078 = new int[anInt2116];
		anIntArray2103 = new int[anInt2116];
		anIntArray2119 = new int[anInt2116];
		anIntArray2081 = new int[anInt2116];
		anIntArray1982 = new int[anInt2116];
		aStringArray2243 = new String[anInt2116];
		anIntArrayArray2083 = new int[104][104];
		anInt2084 = 0;
		anInt2085 = -1;
		anInt2152 = -1;
		anInt2087 = 0;
		anInt2088 = 0;
		anInt2089 = 0;
		anInt2141 = 0;
		anInt2010 = 0;
		anInt2092 = 0;
		anInt2093 = 0;
		anInt2094 = 0;
		anInt2095 = 0;
		anInt2075 = 0;
		aBool1985 = false;
		anInt2133 = 0;
		anInt2099 = 0;
		aClass124_Sub22_Sub19_Sub3_Sub2Array2100 = new Class124_Sub22_Sub19_Sub3_Sub2[2048];
		anInt2090 = 0;
		anIntArray2128 = new int[2048];
		anInt2029 = 0;
		anIntArray2104 = new int[2048];
		aClass124_Sub14Array2256 = new RSBuf[2048];
		anInt2106 = -1;
		anInt2107 = 0;
		anInt2108 = 0;
		anIntArray2109 = new int[1000];
		anIntArray2110 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		aStringArray2166 = new String[8];
		aBoolArray2112 = new boolean[8];
		anIntArray2168 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		anInt2114 = -1;
		aClass111ArrayArrayArray2073 = new Class111[4][104][104];
		aClass111_2262 = new Class111();
		aClass111_2117 = new Class111();
		aClass111_2118 = new Class111();
		anIntArray2126 = new int[25];
		anIntArray2030 = new int[25];
		anIntArray2121 = new int[25];
		anInt2122 = 0;
		aBool2240 = false;
		anInt2124 = 0;
		anIntArray2125 = new int[500];
		anIntArray2063 = new int[500];
		anIntArray2127 = new int[500];
		anIntArray2140 = new int[500];
		aStringArray2129 = new String[500];
		aStringArray2130 = new String[500];
		anInt2172 = -1;
		anInt2132 = -1;
		anInt2041 = 0;
		anInt2134 = 50;
		anInt2135 = 0;
		aString2136 = null;
		aBool2137 = false;
		anInt2138 = -1;
		anInt2082 = -1;
		aString1983 = null;
		aString2035 = null;
		anInt2142 = -1;
		aClass107_2143 = new Class107(8);
		anInt2131 = 0;
		anInt2036 = 0;
		aClass124_Sub17_2042 = null;
		anInt2147 = 0;
		anInt2148 = 0;
		anInt2149 = 0;
		anInt2150 = -1;
		aBool2151 = false;
		aBool2021 = false;
		aBool2153 = false;
		aClass124_Sub17_2154 = null;
		aClass124_Sub17_2155 = null;
		aClass124_Sub17_2199 = null;
		anInt2157 = 0;
		anInt2145 = 0;
		aClass124_Sub17_2159 = null;
		aBool2160 = false;
		anInt2161 = -1;
		anInt2162 = -1;
		aBool2163 = false;
		anInt2200 = -1;
		anInt2165 = -1;
		aBool2233 = false;
		anInt2067 = 1;
		anIntArray2246 = new int[32];
		anInt2169 = 0;
		anIntArray2170 = new int[32];
		anInt2060 = 0;
		anIntArray2072 = new int[32];
		anInt2173 = 0;
		anInt2097 = 0;
		anInt2175 = 0;
		anInt2176 = 0;
		anInt2177 = 0;
		anInt2178 = 0;
		anInt2179 = 0;
		anInt2183 = 0;
		aClass111_2181 = new Class111();
		aClass111_2182 = new Class111();
		aClass111_2139 = new Class111();
		aClass107_2184 = new Class107(512);
		anInt2185 = 0;
		anInt2216 = -2;
		aBoolArray2061 = new boolean[100];
		aBoolArray2188 = new boolean[100];
		aBoolArray2189 = new boolean[100];
		anIntArray2190 = new int[100];
		anIntArray2223 = new int[100];
		anIntArray2209 = new int[100];
		anIntArray2222 = new int[100];
		anInt1990 = 0;
		aLong2195 = 0L;
		aBool2196 = true;
		anInt2071 = 765;
		anInt2198 = 1;
		anIntArray2096 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
		anInt2066 = 0;
		anInt2201 = 0;
		aString2202 = "";
		aLongArray2203 = new long[100];
		anInt2204 = 0;
		anInt2205 = 0;
		anIntArray2059 = new int[128];
		anIntArray2241 = new int[128];
		aLong2208 = -1L;
		aString2120 = null;
		aString2210 = null;
		anInt2211 = -1;
		anInt2065 = 0;
		anIntArray2213 = new int[1000];
		anIntArray2214 = new int[1000];
		aClass124_Sub22_Sub16_Sub1Array2244 = new Class124_Sub22_Sub16_Sub1[1000];
		anInt2194 = 0;
		anInt2217 = 0;
		anInt2218 = 0;
		anInt2219 = 255;
		anInt2220 = -1;
		aBool2221 = false;
		anInt2239 = 127;
		anInt2206 = 127;
		anInt2225 = 0;
		anIntArray2226 = new int[50];
		anIntArray2227 = new int[50];
		anIntArray2228 = new int[50];
		anIntArray2229 = new int[50];
		aClass12Array2230 = new Class12[50];
		aBool2231 = false;
		aBoolArray2232 = new boolean[5];
		anIntArray2123 = new int[5];
		anIntArray2054 = new int[5];
		anIntArray2235 = new int[5];
		anIntArray2236 = new int[5];
		aShort2237 = 256;
		aShort2031 = 205;
		aShort2180 = 256;
		aShort2091 = 320;
		aShort2251 = 1;
		aShort2242 = 32767;
		aShort2234 = 1;
		aShort2007 = 32767;
		anInt2245 = 0;
		anInt2238 = 0;
		anInt2247 = 0;
		anInt2248 = 0;
		anInt2249 = 0;
		anInt2056 = 0;
		anInt2215 = 0;
		aClass32Array2098 = new Class32[400];
		aClass106_2253 = new Class106();
		anInt2252 = 0;
		aClass35Array1986 = new Class35[400];
		aClass100_2250 = new Class100();
		anInt2257 = -1;
		anInt2258 = 1;
		aClass125Array2259 = new Class125[8];
		aLong2260 = -1L;
		aLong2261 = -1L;
	}

	@Override
	protected final void method1062(final byte var1) {
		anInt2020 = anInt2080 == 0 ? '\uaa4a' : anInt2079 + '\u9c40';
		Class124_Sub15.anInt1106 = anInt2080 == 0 ? 443 : anInt2079 + '\uc350';
		Class124_Sub22_Sub5.anInt1381 = anInt2020;
		Class100.aShortArray782 = Class104.aShortArray800;
		Class100.aShortArrayArray783 = Class104.aShortArrayArray802;
		Class56_Sub2.aShortArray1085 = Class104.aShortArray801;
		Class100.aShortArrayArray784 = Class104.aShortArrayArray803;
		if (Class101.aString788.toLowerCase().indexOf("microsoft") != -1) {
			Class84.anIntArray686[186] = 57;
			Class84.anIntArray686[187] = 27;
			Class84.anIntArray686[188] = 71;
			Class84.anIntArray686[189] = 26;
			Class84.anIntArray686[190] = 72;
			Class84.anIntArray686[191] = 73;
			Class84.anIntArray686[192] = 58;
			Class84.anIntArray686[219] = 42;
			Class84.anIntArray686[220] = 74;
			Class84.anIntArray686[221] = 43;
			Class84.anIntArray686[222] = 59;
			Class84.anIntArray686[223] = 28;
		} else {
			Class84.anIntArray686[44] = 71;
			Class84.anIntArray686[45] = 26;
			Class84.anIntArray686[46] = 72;
			Class84.anIntArray686[47] = 73;
			Class84.anIntArray686[59] = 57;
			Class84.anIntArray686[61] = 27;
			Class84.anIntArray686[91] = 42;
			Class84.anIntArray686[92] = 74;
			Class84.anIntArray686[93] = 43;
			Class84.anIntArray686[192] = 28;
			Class84.anIntArray686[222] = 58;
			Class84.anIntArray686[520] = 59;
		}

		final Canvas var2 = Class124_Sub5.aCanvas990;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(Class84.aClass84_683);
		var2.addFocusListener(Class84.aClass84_683);
		Class82.method329(Class124_Sub5.aCanvas990);
		Class47.aClass66_473 = Def1.method665(1306502666);
		if (Class47.aClass66_473 != null)
			Class47.aClass66_473.method293(Class124_Sub5.aCanvas990, (byte) 107);

		Class124_Sub22_Sub20.aClass69_1642 = new Class69(255, Class73.aClass132_605, Class73.aClass132_601, 500000);
		Class57.aClass22_538 = Class62.method280();
		aClipboard2002 = getToolkit().getSystemClipboard();
		final String var3 = Class78.aString636;
		Class87.anApplet693 = this;
		Class87.aString690 = var3;
		if (anInt2080 != 0)
			aBool2000 = true;

		Def13.method735(Class57.aClass22_538.anInt250);
	}

	@Override
	protected final void method1061(final int var1) {
	}

	static boolean valid(final CacheArch var0) {
		if (!Somet4.aBool941) {
			final byte[] var1 = var0.decode(0, 0);
			if (var1 == null)
				return false;
	
			method503(var1);
			Somet4.aBool941 = true;
		}
	
		return true;
	}

	static int method496() {
		final int var0 = (Somet4.aByteArray932[Somet4.anInt933] >> Somet4.anInt934) & 1;
		++Somet4.anInt934;
		Somet4.anInt933 += Somet4.anInt934 >> 3;
		Somet4.anInt934 &= 7;
		return var0;
	}

	static void method495(final byte[] var0, final int var1) {
		Somet4.aByteArray932 = var0;
		Somet4.anInt933 = var1;
		Somet4.anInt934 = 0;
	}

	static float method501(final int var0) {
		int var1 = var0 & 2097151;
		final int var2 = var0 & Integer.MIN_VALUE;
		final int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0)
			var1 = -var1;
	
		return (float) (var1 * Math.pow(2.0D, var3 - 788));
	}

	static void method503(final byte[] var0) {
		client.method495(var0, 0);
		Somet4.anInt953 = 1 << method502(4);
		Somet4.anInt954 = 1 << method502(4);
		Somet4.aFloatArray946 = new float[Somet4.anInt954];
	
		int var1;
		int var2;
		int var3;
		int var5;
		int var7;
		for (var7 = 0; var7 < 2; ++var7) {
			var5 = var7 != 0 ? Somet4.anInt954 : Somet4.anInt953;
			var1 = var5 >> 1;
			var3 = var5 >> 2;
			var2 = var5 >> 3;
			final float[] var10 = new float[var1];
	
			for (int var9 = 0; var9 < var3; ++var9) {
				var10[2 * var9] = (float) Math.cos((4 * var9 * 3.141592653589793D) / var5);
				var10[(2 * var9) + 1] = -((float) Math.sin((4 * var9 * 3.141592653589793D) / var5));
			}
	
			final float[] var11 = new float[var1];
	
			for (int var12 = 0; var12 < var3; ++var12) {
				var11[2 * var12] = (float) Math.cos((((2 * var12) + 1) * 3.141592653589793D) / (2 * var5));
				var11[(2 * var12) + 1] = (float) Math.sin((((2 * var12) + 1) * 3.141592653589793D) / (2 * var5));
			}
	
			final float[] var13 = new float[var3];
	
			for (int var15 = 0; var15 < var2; ++var15) {
				var13[2 * var15] = (float) Math.cos((((4 * var15) + 2) * 3.141592653589793D) / var5);
				var13[(2 * var15) + 1] = -((float) Math.sin((((4 * var15) + 2) * 3.141592653589793D) / var5));
			}
	
			final int[] var4 = new int[var2];
			final int var16 = Class124_Sub22_Sub10.method714(var2 - 1);
	
			for (int var8 = 0; var8 < var2; ++var8) {
				int var18 = var8;
				int var14 = var16;
	
				int var6;
				for (var6 = 0; var14 > 0; --var14) {
					var6 = (var6 << 1) | (var18 & 1);
					var18 >>>= 1;
				}
	
				var4[var8] = var6;
			}
	
			if (var7 != 0) {
				Somet4.aFloatArray945 = var10;
				Somet4.aFloatArray931 = var11;
				Somet4.aFloatArray927 = var13;
				Somet4.anIntArray956 = var4;
			} else {
				Somet4.aFloatArray949 = var10;
				Somet4.aFloatArray935 = var11;
				Somet4.aFloatArray943 = var13;
				Somet4.anIntArray955 = var4;
			}
		}
	
		var7 = method502(8) + 1;
		Somet4.aClass6Array937 = new Class6[var7];
	
		for (var5 = 0; var5 < var7; ++var5)
			Somet4.aClass6Array937[var5] = new Class6();
	
		var5 = method502(6) + 1;
	
		for (var1 = 0; var1 < var5; ++var1)
			method502(16);
	
		var5 = method502(6) + 1;
		Somet4.aClass11Array938 = new Class11[var5];
	
		for (var1 = 0; var1 < var5; ++var1)
			Somet4.aClass11Array938[var1] = new Class11();
	
		var1 = method502(6) + 1;
		Somet4.aClass14Array939 = new Class14[var1];
	
		for (var3 = 0; var3 < var1; ++var3)
			Somet4.aClass14Array939[var3] = new Class14();
	
		var3 = method502(6) + 1;
		Somet4.aClass13Array940 = new Class13[var3];
	
		for (var2 = 0; var2 < var3; ++var2)
			Somet4.aClass13Array940[var2] = new Class13();
	
		var2 = method502(6) + 1;
		Somet4.aBoolArray928 = new boolean[var2];
		Somet4.anIntArray942 = new int[var2];
	
		for (int var20 = 0; var20 < var2; ++var20) {
			Somet4.aBoolArray928[var20] = client.method496() != 0;
			method502(16);
			method502(16);
			Somet4.anIntArray942[var20] = method502(8);
		}
	
	}

	static int method502(int var0) {
		int var1 = 0;
	
		int var2;
		int var4;
		for (var4 = 0; var0 >= (8 - Somet4.anInt934); var0 -= var2) {
			var2 = 8 - Somet4.anInt934;
			final int var3 = (1 << var2) - 1;
			var1 += ((Somet4.aByteArray932[Somet4.anInt933] >> Somet4.anInt934) & var3) << var4;
			Somet4.anInt934 = 0;
			++Somet4.anInt933;
			var4 += var2;
		}
	
		if (var0 > 0) {
			var2 = (1 << var0) - 1;
			var1 += ((Somet4.aByteArray932[Somet4.anInt933] >> Somet4.anInt934) & var2) << var4;
			Somet4.anInt934 += var0;
		}
	
		return var1;
	}

	static void method605(final int var0) {
		Class31.method182(Class124_Sub5.aCanvas990);
		final Canvas var2 = Class124_Sub5.aCanvas990;
		var2.removeMouseListener(Class81.aClass81_649);
		var2.removeMouseMotionListener(Class81.aClass81_649);
		var2.removeFocusListener(Class81.aClass81_649);
		Class81.anInt663 = 0;
		if (null != Class47.aClass66_473)
			Class47.aClass66_473.method290(Class124_Sub5.aCanvas990, (byte) -67);
	
		Class80.aclient645.method1050();
		Class124_Sub5.aCanvas990.setBackground(Color.black);
		final Canvas var1 = Class124_Sub5.aCanvas990;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(Class84.aClass84_683);
		var1.addFocusListener(Class84.aClass84_683);
		Class82.method329(Class124_Sub5.aCanvas990);
		if (null != Class47.aClass66_473)
			Class47.aClass66_473.method293(Class124_Sub5.aCanvas990, (byte) 123);
	
		if (anInt2142 != -1)
			Class122.method449(anInt2142, Class56_Sub2.anInt1083, Class81.anInt662, false);
	
		Applet_Sub1.aBool1976 = true;
	}

	static final void method606(final byte var0) {
		for (int var1 = 0; var1 < anInt2022; ++var1) {
			final int var2 = anIntArray2023[var1];
			final Class124_Sub22_Sub19_Sub3_Sub1 var3 = aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2];
			if (var3 != null) {
				Class53.method257(var3);
			}
		}
	
	}

	static Somet2 method574(final int var0) {
		Somet2 var1 = (Somet2) Somet2.aClass113_1600.forId(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var3 = Class88.aClass94_Sub1_695.decode(var0, 0);
			if (var3 == null)
				return null;
			else {
				var1 = new Somet2();
				final RSBuf var2 = new RSBuf(var3);
				var2.pos = var2.backing.length - 12;
				final int var5 = var2.readInt2(1291183748);
				var1.anInt1599 = var2.readShortU();
				var1.anInt1602 = var2.readShortU();
				var1.anInt1597 = var2.readShortU();
				var1.anInt1601 = var2.readShortU();
				var2.pos = 0;
				var2.readStr();
				var1.anIntArray1596 = new int[var5];
				var1.anIntArray1603 = new int[var5];
				var1.aStringArray1598 = new String[var5];
	
				int var4;
				for (int var6 = 0; var2.pos < (var2.backing.length
						- 12); var1.anIntArray1596[var6++] = var4) {
					var4 = var2.readShortU();
					if (var4 == 3)
						var1.aStringArray1598[var6] = var2.readStr2();
					else if ((var4 < 100) && (var4 != 21) && (var4 != 38) && (var4 != 39))
						var1.anIntArray1603[var6] = var2.readInt2(-1869568387);
					else
						var1.anIntArray1603[var6] = var2.readByteU();
				}
	
				Somet2.aClass113_1600.map(var1, var0);
				return var1;
			}
		}
	}

	public static final void sleep(final long var0) {
		if (var0 > 0L)
			if ((var0 % 10L) == 0L) {
				final long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (final InterruptedException var8) {
					;
				}

				try {
					Thread.sleep(1L);
				} catch (final InterruptedException var7) {
					;
				}
			} else
				try {
					Thread.sleep(var0);
				} catch (final InterruptedException var6) {
					;
				}
	}
}

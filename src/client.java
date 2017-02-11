import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;

import netscape.javascript.JSObject;

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
	static int loginStep;
	static int anInt1999;
	static int anInt2018;
	static int anInt2019;
	static Class124_Sub22_Sub19_Sub3_Sub1[] aClass124_Sub22_Sub19_Sub3_Sub1Array2254;
	static int anInt2022;
	static int[] anIntArray2023;
	static Outbuf secbuf;
	static Outbuf loginbuf;
	static Outbuf buf;
	static int expected;
	static int pktId;
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
	static boolean create;
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
	static int pid;
	static int members1;
	static int anInt2108;
	static int[] anIntArray2109;
	static int[] anIntArray2110;
	static String[] aStringArray2166;
	static boolean[] aBoolArray2112;
	static int[] anIntArray2168;
	static int anInt2114;
	static Class111[][][] clips;
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
	static int prights;
	static int anInt2150;
	static boolean flagged;
	static boolean aBool2021;
	static boolean aBool2153;
	static Widget aClass124_Sub17_2154;
	static Widget currentWid;
	static Widget aClass124_Sub17_2199;
	static int anInt2157;
	static int anInt2145;
	static Widget wid;
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
	static Somet3 aClass100_2250;
	static int anInt2257;
	static int anInt2258;
	static Class125[] aClass125Array2259;
	static long aLong2260;
	static long aLong2261;
	static int anInt2020;
	static Clipboard aClipboard2002;
	static Class124_Sub9[] aClass124_Sub9Array1609;
	public static Canvas aCanvas990;
	protected static int anInt989;
	static int[] anIntArray777 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	public static short[] aShortArray782;
	public static short[][] aShortArrayArray783;
	public static short[][] aShortArrayArray784;
	static Class113 aClass113_786 = new Class113(260);
	static Class124_Sub22_Sub16_Sub1 aClass124_Sub22_Sub16_Sub1_1954;

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
						Class9_Sub1.render();
				} else
					Class62.method279(this);

				if (anInt1992 == 30)
					client.readpackets();
				else if ((anInt1992 == 40) || (anInt1992 == 45))
					Class49.method235();

				return;
			}

			var3.aClass94_Sub1_1297.method614(var3.aClass69_1296, (int) var3.linkedhash, var3.aByteArray1298, false);
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
		if ((var3.width != client.anInt989) || (var3.height != Class124_Sub22_Sub19_Sub1.anInt1664)
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
				final Graphics var8 = client.aCanvas990.getGraphics();
				if (null == Class41.aFont406) {
					Class41.aFont406 = new Font("Helvetica", 1, 13);
					Class4.aFontMetrics53 = client.aCanvas990.getFontMetrics(Class41.aFont406);
				}

				if (var4) {
					var8.setColor(Color.black);
					var8.fillRect(0, 0, Class56_Sub2.anInt1083, Class81.anInt662);
				}

				if (null == var7)
					var7 = new Color(140, 17, 17);

				try {
					if (Class46.anImage456 == null)
						Class46.anImage456 = client.aCanvas990.createImage(304, 34);

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
				client.aCanvas990.repaint();
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
					InvIdk.method523("Loading - please wait." + "<br>" + " (" + var5 + "%" + ")", false);
				} else if (anInt2113 == 2) {
					if (anInt2039 > anInt2040)
						anInt2040 = anInt2039;

					var5 = 50 + (((anInt2040 * 50) - (anInt2039 * 50)) / anInt2040);
					InvIdk.method523("Loading - please wait." + "<br>" + " (" + var5 + "%" + ")", false);
				} else
					InvIdk.method523("Loading - please wait.", false);
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

				client.method1047(Class134.anInt906,
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690,
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697, anInt2111);
				anInt2111 = 0;
			} else if (anInt1992 == 40)
				InvIdk.method523("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			else if (anInt1992 == 45)
				InvIdk.method523("Please wait...", false);
		} else
			Class64.method287(Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407, Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260,
					Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714, var4);

		Graphics var14;
		if ((anInt1992 == 30) && (anInt1990 == 0) && !var4)
			try {
				var14 = client.aCanvas990.getGraphics();

				for (var12 = 0; var12 < anInt2185; ++var12)
					if (aBoolArray2188[var12]) {
						Class64.aClass9_558.method53(var14, anIntArray2190[var12], anIntArray2223[var12],
								anIntArray2209[var12], anIntArray2222[var12], 1687102755);
						aBoolArray2188[var12] = false;
					}
			} catch (final Exception var18) {
				client.aCanvas990.repaint();
			}
		else if (anInt1992 > 0)
			try {
				var14 = client.aCanvas990.getGraphics();
				Class64.aClass9_558.method52(var14, 0, 0, (byte) 7);

				for (var12 = 0; var12 < anInt2185; ++var12)
					aBoolArray2188[var12] = false;
			} catch (final Exception var17) {
				client.aCanvas990.repaint();
			}

	}

	@Override
	protected final void method1057(final int var1) {
		if (CSD.aClass41_1006.method210())
			CSD.aClass41_1006.method207();

		if (null != Class47.aClass29_467)
			Class47.aClass29_467.aBool317 = false;

		Class47.aClass29_467 = null;
		if (Class73.out != null) {
			Class73.out.method324();
			Class73.out = null;
		}

		if (Class84.aClass84_683 != null) {
			final Class84 var2 = Class84.aClass84_683;
			synchronized (var2) {
				Class84.aClass84_683 = null;
			}
		}

		client.method1045(-883692049);
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
							var6.writeTrib((int) var5.linkedhash);
							Class92.aClass78_732.write(var6.backing, 0, 4);
							Class92.aClass107_730.method412(var5, var5.linkedhash);
							--Class92.anInt719;
							++Class92.anInt716;
						}

						while ((Class92.anInt725 < 20) && (Class92.anInt723 > 0)) {
							var5 = (Class124_Sub22_Sub21) Class92.aClass108_722.method417();
							var6 = new RSBuf(4);
							var6.writeByte(0);
							var6.writeTrib((int) var5.linkedhash);
							Class92.aClass78_732.write(var6.backing, 0, 4);
							var5.method637();
							Class92.aClass107_724.method412(var5, var5.linkedhash);
							--Class92.anInt723;
							++Class92.anInt725;
						}

						for (int var7 = 0; var7 < 100; ++var7) {
							final int var8 = Class92.aClass78_732.avail();
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

								Class92.aClass78_732.readin(Class92.aClass124_Sub14_726.backing,
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

								Class92.aClass78_732.readin(ISAAC.buf.backing,
										ISAAC.buf.pos, var11);
								if (Class92.aByte733 != 0)
									for (var12 = 0; var12 < var11; ++var12)
										ISAAC.buf.backing[ISAAC.buf.pos
												+ var12] ^= Class92.aByte733;

								ISAAC.buf.pos += var11;
								Class92.anInt727 += var11;
								if (var10 == ISAAC.buf.pos) {
									if (16711935L == Class28.aClass124_Sub22_Sub21_311.linkedhash) {
										CSD.aClass124_Sub14_1007 = ISAAC.buf;

										for (var12 = 0; var12 < 256; ++var12) {
											final Class94_Sub1 var19 = Class92.aClass94_Sub1Array729[var12];
											if (var19 != null) {
												CSD.aClass124_Sub14_1007.pos = 5 + (var12 * 8);
												var14 = CSD.aClass124_Sub14_1007.readInt2(2103441446);
												final int var20 = CSD.aClass124_Sub14_1007
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
												(int) (Class28.aClass124_Sub22_Sub21_311.linkedhash & 65535L),
												ISAAC.buf.backing,
												16711680L == (Class28.aClass124_Sub22_Sub21_311.linkedhash & 16711680L),
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
						InvIdk.aClass79_1010 = Class27.aClass82_303.method332(Def8.aString1452,
								Class124_Sub22_Sub5.anInt1381);
						++anInt2013;
					}

					if (anInt2013 == 1) {
						if (InvIdk.aClass79_1010.anInt642 == 2) {
							method1066(-1);
							return;
						}

						if (InvIdk.aClass79_1010.anInt642 == 1)
							++anInt2013;
					}

					if (anInt2013 == 2) {
						Class90.aClass78_708 = new Class78((Socket) InvIdk.aClass79_1010.anObject638,
								Class27.aClass82_303);
						final RSBuf var1 = new RSBuf(5);
						var1.writeByte(15);
						var1.writeInt(88);
						Class90.aClass78_708.write(var1.backing, 0, 5);
						++anInt2013;
						Class124_Sub22_Sub19_Sub1.aLong1658 = Class74.method316(277218670);
					}

					if (anInt2013 == 3)
						if ((anInt1992 > 5) && (Class90.aClass78_708.avail() <= 0)) {
							if ((Class74.method316(-820484053) - Class124_Sub22_Sub19_Sub1.aLong1658) > 30000L) {
								method1066(-2);
								return;
							}
						} else {
							final int var2 = Class90.aClass78_708.read();
							if (var2 != 0) {
								method1066(var2);
								return;
							}

							++anInt2013;
						}

					if (anInt2013 == 4) {
						Class124_Sub22_Sub5.method673(Class90.aClass78_708, anInt1992 > 20);
						InvIdk.aClass79_1010 = null;
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
		InvIdk.aClass79_1010 = null;
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
		loginStep = 0;
		anInt1999 = 0;
		anInt2018 = 0;
		anInt2019 = 0;
		aClass124_Sub22_Sub19_Sub3_Sub1Array2254 = new Class124_Sub22_Sub19_Sub3_Sub1['\u8000'];
		anInt2022 = 0;
		anIntArray2023 = new int['\u8000'];
		secbuf = new Outbuf(5000);
		loginbuf = new Outbuf(5000);
		buf = new Outbuf(5000);
		expected = 0;
		pktId = 0;
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
		create = false;
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
		pid = -1;
		members1 = 0;
		anInt2108 = 0;
		anIntArray2109 = new int[1000];
		anIntArray2110 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		aStringArray2166 = new String[8];
		aBoolArray2112 = new boolean[8];
		anIntArray2168 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		anInt2114 = -1;
		clips = new Class111[4][104][104];
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
		prights = 0;
		anInt2150 = -1;
		flagged = false;
		aBool2021 = false;
		aBool2153 = false;
		aClass124_Sub17_2154 = null;
		currentWid = null;
		aClass124_Sub17_2199 = null;
		anInt2157 = 0;
		anInt2145 = 0;
		wid = null;
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
		aClass100_2250 = new Somet3();
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
		client.aShortArray782 = Class104.aShortArray800;
		client.aShortArrayArray783 = Class104.aShortArrayArray802;
		Class56_Sub2.aShortArray1085 = Class104.aShortArray801;
		client.aShortArrayArray784 = Class104.aShortArrayArray803;
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

		final Canvas var2 = client.aCanvas990;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(Class84.aClass84_683);
		var2.addFocusListener(Class84.aClass84_683);
		Class82.method329(client.aCanvas990);
		Class47.aClass66_473 = Def1.method665(1306502666);
		if (Class47.aClass66_473 != null)
			Class47.aClass66_473.method293(client.aCanvas990, (byte) 107);

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

	static final void method759() {
		final short var0 = 256;
		int var4;
		if (Class4.anInt23 > 0) {
			for (var4 = 0; var4 < 256; ++var4)
				if (Class4.anInt23 > 768)
					Class42.anIntArray427[var4] = Class8.method50(Class4.anIntArray46[var4],
							InvIdk.anIntArray1013[var4], 1024 - Class4.anInt23);
				else if (Class4.anInt23 > 256)
					Class42.anIntArray427[var4] = InvIdk.anIntArray1013[var4];
				else
					Class42.anIntArray427[var4] = Class8.method50(InvIdk.anIntArray1013[var4],
							Class4.anIntArray46[var4], 256 - Class4.anInt23);
		} else if (Class4.anInt26 > 0) {
			for (var4 = 0; var4 < 256; ++var4)
				if (Class4.anInt26 <= 768) {
					if (Class4.anInt26 > 256)
						Class42.anIntArray427[var4] = Def5.anIntArray1453[var4];
					else
						Class42.anIntArray427[var4] = Class8.method50(Def5.anIntArray1453[var4],
								Class4.anIntArray46[var4], 256 - Class4.anInt26);
				} else
					Class42.anIntArray427[var4] = Class8.method50(Class4.anIntArray46[var4],
							Def5.anIntArray1453[var4], 1024 - Class4.anInt26);
		} else
			for (var4 = 0; var4 < 256; ++var4)
				Class42.anIntArray427[var4] = Class4.anIntArray46[var4];
	
		Class124_Sub22_Sub16.method764(Class4.anInt22, 9, 128 + Class4.anInt22, var0 + 7);
		Class4.aClass124_Sub22_Sub16_Sub1_40.method917(Class4.anInt22, 0);
		Class124_Sub22_Sub16.method763();
		var4 = 0;
		int var1 = Class4.anInt22 + (Class64.aClass9_558.anInt96 * 9);
	
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var9 = 1; var9 < (var0 - 1); ++var9) {
			var3 = ((var0 - var9) * Class4.anIntArray31[var9]) / var0;
			var2 = 22 + var3;
			if (var2 < 0)
				var2 = 0;
	
			var4 += var2;
	
			for (var6 = var2; var6 < 128; ++var6) {
				var7 = Class124_Sub10.anIntArray1032[var4++];
				if (var7 != 0) {
					var8 = var7;
					var10 = 256 - var7;
					var7 = Class42.anIntArray427[var7];
					var5 = Class64.aClass9_558.anIntArray103[var1];
					Class64.aClass9_558.anIntArray103[var1++] = ((((var8 * (var7 & 16711935))
							+ ((var5 & 16711935) * var10)) & -16711936)
							+ (((var10 * (var5 & '\uff00')) + ((var7 & '\uff00') * var8)) & 16711680)) >> 8;
				} else
					++var1;
			}
	
			var1 += (Class64.aClass9_558.anInt96 + var2) - 128;
		}
	
		Class124_Sub22_Sub16.method764((765 + Class4.anInt22) - 128, 9, 765 + Class4.anInt22, 7 + var0);
		Class4.aClass124_Sub22_Sub16_Sub1_27.method917(Class4.anInt22 + 382, 0);
		Class124_Sub22_Sub16.method763();
		var4 = 0;
		var1 = 637 + (Class64.aClass9_558.anInt96 * 9) + 24 + Class4.anInt22;
	
		for (var9 = 1; var9 < (var0 - 1); ++var9) {
			var3 = ((var0 - var9) * Class4.anIntArray31[var9]) / var0;
			var2 = 103 - var3;
			var1 += var3;
	
			for (var6 = 0; var6 < var2; ++var6) {
				var7 = Class124_Sub10.anIntArray1032[var4++];
				if (var7 != 0) {
					var8 = var7;
					var10 = 256 - var7;
					var7 = Class42.anIntArray427[var7];
					var5 = Class64.aClass9_558.anIntArray103[var1];
					Class64.aClass9_558.anIntArray103[var1++] = ((((var8 * (var7 & '\uff00'))
							+ ((var5 & '\uff00') * var10)) & 16711680)
							+ ((((var7 & 16711935) * var8) + ((var5 & 16711935) * var10)) & -16711936)) >> 8;
				} else
					++var1;
			}
	
			var4 += 128 - var2;
			var1 += Class64.aClass9_558.anInt96 - var2 - var3;
		}
	
	}

	static boolean method762(final Widget var0) {
		if (aBool2021) {
			if (Class124_Sub22_Sub19_Sub6.method963(var0) != 0)
				return false;
	
			if (var0.anInt1191 == 0)
				return false;
		}
	
		return var0.aBool1173;
	}

	static final void method761(final Class124_Sub22_Sub16_Sub2 var0) {
		final short var1 = 256;
	
		int var3;
		for (var3 = 0; var3 < Class124_Sub22_Sub19_Sub1.anIntArray1661.length; ++var3)
			Class124_Sub22_Sub19_Sub1.anIntArray1661[var3] = 0;
	
		int var2;
		for (var3 = 0; var3 < 5000; ++var3) {
			var2 = (int) (Math.random() * 128.0D * var1);
			Class124_Sub22_Sub19_Sub1.anIntArray1661[var2] = (int) (Math.random() * 256.0D);
		}
	
		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var2 = 1; var2 < (var1 - 1); ++var2)
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var2 << 7) + var5;
					Class43.anIntArray432[var6] = (Class124_Sub22_Sub19_Sub1.anIntArray1661[128 + var6]
							+ Class124_Sub22_Sub19_Sub1.anIntArray1661[var6 - 128]
							+ Class124_Sub22_Sub19_Sub1.anIntArray1661[var6 - 1]
							+ Class124_Sub22_Sub19_Sub1.anIntArray1661[var6 + 1]) / 4;
				}
	
			final int[] var4 = Class124_Sub22_Sub19_Sub1.anIntArray1661;
			Class124_Sub22_Sub19_Sub1.anIntArray1661 = Class43.anIntArray432;
			Class43.anIntArray432 = var4;
		}
	
		if (var0 != null) {
			var3 = 0;
	
			for (var2 = 0; var2 < var0.anInt1736; ++var2)
				for (var5 = 0; var5 < var0.anInt1738; ++var5)
					if (var0.aByteArray1740[var3++] != 0) {
						var6 = var0.anInt1737 + 16 + var5;
						final int var7 = 16 + var2 + var0.anInt1739;
						final int var8 = (var7 << 7) + var6;
						Class124_Sub22_Sub19_Sub1.anIntArray1661[var8] = 0;
					}
		}
	
	}

	static final void method760(final InvIdk face, final boolean var1) {
		final int var2 = face.anInt1012;
		final int hash = (int) face.linkedhash;
		face.method450();
		if (var1)
			setNotLoaded(var2, -963844083);
	
		for (Class124_Sub21 var4 = (Class124_Sub21) aClass107_2184
				.method411(); var4 != null; var4 = (Class124_Sub21) aClass107_2184.method413())
			if (var2 == ((var4.linkedhash >> 48) & 65535L))
				var4.method450();
	
		final Widget var5 = Class10.getwidget(hash);
		if (var5 != null)
			Def10.settrue(var5);
	
		Class51.method247();
		if (anInt2142 != -1)
			Class3.widgetInvCS(anInt2142, 1);
	
	}

	public static void method1045(final int var0) {
		if (Class81.aClass81_649 != null) {
			final Class81 var1 = Class81.aClass81_649;
			synchronized (var1) {
				Class81.aClass81_649 = null;
			}
		}
	
	}

	static final void method1046(final Class124_Sub22_Sub19_Sub3 var0, final int var1, final int var2, final int var3) {
		if ((var0 != null) && var0.method895(1416020645)) {
			Def9 var4;
			if (var0 instanceof Class124_Sub22_Sub19_Sub3_Sub1) {
				var4 = ((Class124_Sub22_Sub19_Sub3_Sub1) var0).aClass124_Sub22_Sub1_1941;
				if (var4.anIntArray1342 != null)
					var4 = var4.method644();
	
				if (var4 == null)
					return;
			}
	
			int var7;
			if (var1 < anInt2090) {
				var7 = 30;
				final Class124_Sub22_Sub19_Sub3_Sub2 var6 = (Class124_Sub22_Sub19_Sub3_Sub2) var0;
				if (var6.aBool1960)
					return;
	
				if ((var6.anInt1944 != -1) || (var6.anInt1945 != -1)) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
					if (anInt2085 > -1) {
						if (var6.anInt1944 != -1) {
							Class9.aClass124_Sub22_Sub16_Sub1Array101[var6.anInt1944]
									.method907((var2 + anInt2085) - 12, (anInt2152 + var3) - var7);
							var7 += 25;
						}
	
						if (var6.anInt1945 != -1) {
							Def12.aClass124_Sub22_Sub16_Sub1Array1547[var6.anInt1945]
									.method907((var2 + anInt2085) - 12, (var3 + anInt2152) - var7);
							var7 += 25;
						}
					}
				}
	
				if ((var1 >= 0) && (anInt2171 == 10) && (anInt2004 == anIntArray2128[var1])) {
					Class124_Sub22_Sub19_Sub5.method954(var0, 15 + var0.anInt1717);
					if (anInt2085 > -1)
						Def3.aClass124_Sub22_Sub16_Sub1Array1364[1]
								.method907((var2 + anInt2085) - 12, (var3 + anInt2152) - var7);
				}
			} else {
				var4 = ((Class124_Sub22_Sub19_Sub3_Sub1) var0).aClass124_Sub22_Sub1_1941;
				if (null != var4.anIntArray1342)
					var4 = var4.method644();
	
				if ((var4.anInt1322 >= 0)
						&& (var4.anInt1322 < Def12.aClass124_Sub22_Sub16_Sub1Array1547.length)) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
					if (anInt2085 > -1)
						Def12.aClass124_Sub22_Sub16_Sub1Array1547[var4.anInt1322]
								.method907((var2 + anInt2085) - 12, (var3 + anInt2152) - 30);
				}
	
				if ((anInt2171 == 1) && (anIntArray2023[var1 - anInt2090] == anInt2003)
						&& ((anInt2158 % 20) < 10)) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
					if (anInt2085 > -1)
						Def3.aClass124_Sub22_Sub16_Sub1Array1364[0]
								.method907((var2 + anInt2085) - 12, (var3 + anInt2152) - 28);
				}
			}
	
			if ((null != var0.aString1683) && ((var1 >= anInt2090)
					|| (!var0.aBool1684 && ((anInt2066 == 4) || (!var0.aBool1670 && ((anInt2066 == 0)
							|| (anInt2066 == 3) || ((anInt2066 == 1) && Def6
									.method691(((Class124_Sub22_Sub19_Sub3_Sub2) var0).aString1956, false)))))))) {
				Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717);
				if ((anInt2085 > -1) && (anInt2074 < anInt2116)) {
					anIntArray2103[anInt2074] = Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407
							.method1018(var0.aString1683) / 2;
					anIntArray2078[anInt2074] = Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.anInt1934;
					anIntArray2033[anInt2074] = anInt2085;
					anIntArray2077[anInt2074] = anInt2152;
					anIntArray2119[anInt2074] = var0.anInt1686;
					anIntArray2081[anInt2074] = var0.anInt1696;
					anIntArray1982[anInt2074] = var0.anInt1685;
					aStringArray2243[anInt2074] = var0.aString1683;
					++anInt2074;
				}
			}
	
			if (var0.anInt1691 > anInt2158) {
				Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
				if (anInt2085 > -1) {
					if (var1 < anInt2090)
						var7 = 30;
					else {
						final Def9 var8 = ((Class124_Sub22_Sub19_Sub3_Sub1) var0).aClass124_Sub22_Sub1_1941;
						var7 = var8.anInt1349;
					}
	
					int var5 = (var0.anInt1692 * var7) / var0.anInt1693;
					if (var5 > var7)
						var5 = var7;
					else if ((var5 == 0) && (var0.anInt1692 > 0))
						var5 = 1;
	
					Class124_Sub22_Sub16.method768((var2 + anInt2085) - (var7 / 2),
							(anInt2152 + var3) - 3, var5, 5, '\uff00');
					Class124_Sub22_Sub16.method768(var5 + ((anInt2085 + var2) - (var7 / 2)),
							(anInt2152 + var3) - 3, var7 - var5, 5, 16711680);
				}
			}
	
			for (var7 = 0; var7 < 4; ++var7)
				if (var0.anIntArray1688[var7] > anInt2158) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 / 2);
					if (anInt2085 > -1) {
						if (var7 == 1)
							anInt2152 -= 20;
	
						if (var7 == 2) {
							anInt2085 -= 15;
							anInt2152 -= 10;
						}
	
						if (var7 == 3) {
							anInt2085 += 15;
							anInt2152 -= 10;
						}
	
						Class75.aClass124_Sub22_Sub16_Sub1Array619[var0.anIntArray1689[var7]]
								.method907((var2 + anInt2085) - 12, (anInt2152 + var3) - 12);
						Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260.method1021(
								Integer.toString(var0.anIntArray1727[var7]), (var2 + anInt2085) - 1,
								3 + var3 + anInt2152, 16777215, 0);
					}
				}
	
		}
	}

	static void method1047(final int var0, final int var1, final int var2, final int var3) {
		for (Class124_Sub13 var4 = (Class124_Sub13) Class124_Sub13.aClass111_1069
				.method428(); null != var4; var4 = (Class124_Sub13) Class124_Sub13.aClass111_1069.method430())
			if ((var4.anInt1060 != -1) || (var4.anIntArray1067 != null)) {
				int var5 = 0;
				if (var1 > var4.anInt1066)
					var5 += var1 - var4.anInt1066;
				else if (var1 < var4.anInt1058)
					var5 += var4.anInt1058 - var1;
	
				if (var2 > var4.anInt1063)
					var5 += var2 - var4.anInt1063;
				else if (var2 < var4.anInt1065)
					var5 += var4.anInt1065 - var2;
	
				if (((var5 - 64) <= var4.anInt1062) && (anInt2206 != 0) && (var0 == var4.anInt1057)) {
					var5 -= 64;
					if (var5 < 0)
						var5 = 0;
	
					final int var6 = (anInt2206 * (var4.anInt1062 - var5)) / var4.anInt1062;
					if (null != var4.aClass124_Sub4_Sub1_1064)
						var4.aClass124_Sub4_Sub1_1064.method785(var6);
					else if (var4.anInt1060 >= 0) {
						final Class12 var11 = Class12.method68(Class39.aClass94_Sub1_399, var4.anInt1060, 0);
						if (var11 != null) {
							final Class124_Sub2_Sub1 var10 = var11.method69().method821(Class27.aClass16_302);
							final Class124_Sub4_Sub1 var7 = Class124_Sub4_Sub1.method782(var10, 100, var6);
							var7.method812(-1);
							Class56_Sub2.aClass124_Sub4_Sub2_1078.method828(var7);
							var4.aClass124_Sub4_Sub1_1064 = var7;
						}
					}
	
					if (null == var4.aClass124_Sub4_Sub1_1056) {
						if ((null != var4.anIntArray1067) && ((var4.anInt1068 -= var3) <= 0)) {
							final int var9 = (int) (Math.random() * var4.anIntArray1067.length);
							final Class12 var13 = Class12.method68(Class39.aClass94_Sub1_399, var4.anIntArray1067[var9],
									0);
							if (null != var13) {
								final Class124_Sub2_Sub1 var12 = var13.method69().method821(Class27.aClass16_302);
								final Class124_Sub4_Sub1 var8 = Class124_Sub4_Sub1.method782(var12, 100, var6);
								var8.method812(0);
								Class56_Sub2.aClass124_Sub4_Sub2_1078.method828(var8);
								var4.aClass124_Sub4_Sub1_1056 = var8;
								var4.anInt1068 = var4.anInt1059
										+ (int) (Math.random() * (var4.anInt1061 - var4.anInt1059));
							}
						}
					} else {
						var4.aClass124_Sub4_Sub1_1056.method785(var6);
						if (!var4.aClass124_Sub4_Sub1_1056.method451())
							var4.aClass124_Sub4_Sub1_1056 = null;
					}
				} else {
					if (null != var4.aClass124_Sub4_Sub1_1064) {
						Class56_Sub2.aClass124_Sub4_Sub2_1078.method822(var4.aClass124_Sub4_Sub1_1064);
						var4.aClass124_Sub4_Sub1_1064 = null;
					}
	
					if (var4.aClass124_Sub4_Sub1_1056 != null) {
						Class56_Sub2.aClass124_Sub4_Sub2_1078.method822(var4.aClass124_Sub4_Sub1_1056);
						var4.aClass124_Sub4_Sub1_1056 = null;
					}
				}
			}
	
	}

	static void fullCS(final CSD var0) {
		Class124_Sub22_Sub5.doWidgetCS(var0, 200000);
	}

	static void doCS(final int var0, final String var1, final String var2) {
		Class49.method238(var0, var1, var2, (String) null);
	}

	public static String format(final String var0) {
		final int var1 = var0.length();
		final char[] var3 = new char[var1];
		byte var5 = 2;
	
		for (int var4 = 0; var4 < var1; ++var4) {
			char var2 = var0.charAt(var4);
			if (var5 != 0) {
				if ((var5 == 2) || Character.isUpperCase(var2)) {
					char var6;
					if ((var2 != 181) && (var2 != 402))
						var6 = Character.toTitleCase(var2);
					else
						var6 = var2;
	
					var2 = var6;
				}
			} else
				var2 = Character.toLowerCase(var2);
	
			if (Character.isLetter(var2))
				var5 = 0;
			else if ((var2 != 46) && (var2 != 63) && (var2 != 33)) {
				if (Character.isSpaceChar(var2)) {
					if (var5 != 2)
						var5 = 1;
				} else
					var5 = 1;
			} else
				var5 = 2;
	
			var3[var4] = var2;
		}
	
		return new String(var3);
	}

	public static String appendTags(final String var0) {
		final int var1 = var0.length();
		int var6 = 0;
	
		for (int var4 = 0; var4 < var1; ++var4) {
			final char var3 = var0.charAt(var4);
			if ((var3 == 60) || (var3 == 62))
				var6 += 3;
		}
	
		final StringBuilder var5 = new StringBuilder(var1 + var6);
	
		for (int var7 = 0; var7 < var1; ++var7) {
			final char var2 = var0.charAt(var7);
			if (var2 == 60)
				var5.append("<lt>");
			else if (var2 == 62)
				var5.append("<gt>");
			else
				var5.append(var2);
		}
	
		return var5.toString();
	}

	static final void readpackets() {
		if (anInt2001 > 1)
			--anInt2001;
	
		if (anInt2034 > 0)
			--anInt2034;
	
		if (aBool2115) {
			aBool2115 = false;
			Class10.method60();
		} else {
			if (!aBool2240) {
				aStringArray2129[0] = "Cancel";
				aStringArray2130[0] = "";
				anIntArray2127[0] = 1006;
				anInt2124 = 1;
			}
	
			int var0;
			int var2;
			int var4;
			int var5;
			int var6;
			int var7;
			int var9;
			int var10;
			int var11;
			Widget w2;
			Widget w4;
			int var33;
			int var35;
			long var38;
			int var41;
			int var43;
			Widget w3;
			boolean var76;
			CSD var91;
			int var107;
			for (var0 = 0; var0 < 100; ++var0) {
				boolean var1;
				if (null == Class73.out)
					var1 = false;
				else
					label2501: {
						String var3;
						try {
							var2 = Class73.out.avail();
							if (var2 == 0) {
								var1 = false;
								break label2501;
							}
	
							if (pktId == -1) {
								Class73.out.readin(buf.backing, 0, 1);
								buf.pos = 0;
								pktId = buf.readOpcode();
								expected = Class102.PACKET_SIZES[pktId];
								--var2;
							}
	
							if (expected == -1) {
								if (var2 <= 0) {
									var1 = false;
									break label2501;
								}
	
								Class73.out.readin(buf.backing, 0, 1);
								expected = buf.backing[0] & 255;
								--var2;
							}
	
							if (expected == -2) {
								if (var2 <= 1) {
									var1 = false;
									break label2501;
								}
	
								Class73.out.readin(buf.backing, 0, 2);
								buf.pos = 0;
								expected = buf.readShortU();
								var2 -= 2;
							}
	
							if (var2 < expected) {
								var1 = false;
								break label2501;
							}
	
							buf.pos = 0;
							Class73.out.readin(buf.backing, 0,
									expected);
							anInt2193 = 0;
							anInt2086 = anInt2032;
							anInt2032 = anInt2017 * -1;
							anInt2017 = pktId * -1;
							if (pktId == 63) {
								Def19.loyY = buf.readByteN();
								Def19.locX = buf.readByteN();
	
								while (buf.pos < expected) {
									pktId = buf.readByteU();
									Class124_Sub22_Sub19_Sub6.method966();
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							boolean var67;
							if (pktId == 41) {
								var3 = buf.readStr2();
								var4 = buf.readShortU();
								final byte var75 = buf.readByte();
								var67 = false;
								if (var75 == -128)
									var67 = true;
	
								if (var67) {
									if (Class103.anInt794 == 0) {
										pktId = -1;
										var1 = true;
										break label2501;
									}
	
									var76 = false;
	
									for (var7 = 0; (var7 < Class103.anInt794)
											&& (!aClass124_Sub9Array1609[var7].aString1029
													.equals(var3)
													|| (aClass124_Sub9Array1609[var7].anInt1027 != var4)); ++var7)
										;
	
									if (var7 < Class103.anInt794) {
										while (var7 < (Class103.anInt794 - 1)) {
											aClass124_Sub9Array1609[var7] = aClass124_Sub9Array1609[1
													+ var7];
											++var7;
										}
	
										--Class103.anInt794;
										aClass124_Sub9Array1609[Class103.anInt794] = null;
									}
								} else {
									buf.readStr2();
									final Class124_Sub9 var74 = new Class124_Sub9();
									var74.aString1029 = var3;
									var74.aString1026 = Class34.method186(var74.aString1029, Class49.aClass117_488);
									var74.anInt1027 = var4;
									var74.aByte1028 = var75;
	
									for (var9 = Class103.anInt794 - 1; var9 >= 0; --var9) {
										var10 = aClass124_Sub9Array1609[var9].aString1026
												.compareTo(var74.aString1026);
										if (var10 == 0) {
											aClass124_Sub9Array1609[var9].anInt1027 = var4;
											aClass124_Sub9Array1609[var9].aByte1028 = var75;
											if (var3.equals(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956))
												Class9.aByte97 = var75;
	
											anInt2176 = anInt2067;
											pktId = -1;
											var1 = true;
											break label2501;
										}
	
										if (var10 < 0)
											break;
									}
	
									if (Class103.anInt794 >= aClass124_Sub9Array1609.length) {
										pktId = -1;
										var1 = true;
										break label2501;
									}
	
									for (var10 = Class103.anInt794 - 1; var10 > var9; --var10)
										aClass124_Sub9Array1609[var10
												+ 1] = aClass124_Sub9Array1609[var10];
	
									if (Class103.anInt794 == 0)
										aClass124_Sub9Array1609 = new Class124_Sub9[100];
	
									aClass124_Sub9Array1609[var9 + 1] = var74;
									++Class103.anInt794;
									if (var3.equals(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956))
										Class9.aByte97 = var75;
								}
	
								anInt2176 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							Widget w1;
							if (pktId == 230) { // reset widget inv
								var11 = buf.readIntV2();
								w1 = Class10.getwidget(var11);
	
								for (var5 = 0; var5 < w1.anIntArray1269.length; ++var5) {
									w1.anIntArray1269[var5] = -1;
									w1.anIntArray1269[var5] = 0;
								}
	
								Def10.settrue(w1);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 146) { // reset something
								Widget.widgetCheck();
								anInt2147 = buf.readByteU();
								anInt2179 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							String var12;
							if (pktId == 6) { // set str?
								var3 = buf.readStr2();
								var12 = client.appendTags(client
										.format(RuntimeException_Sub1.decodeStr(buf)));
								client.doCS(6, var3, var12);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 52) { // run
								anInt2218 = buf.readByteU();
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 65) { // world hop
								final Class23 var64 = new Class23();
								var64.aString254 = buf.readStr2();
								var64.anInt262 = buf.readShortU();
								var4 = buf.readInt2(-902248709);
								var64.anInt255 = var4;
								forstep(45);
								Class73.out.method324();
								Class73.out = null;
								Class124_Sub22_Sub19.method835(var64);
								pktId = -1;
								var1 = false;
								break label2501;
							}
	
							if (pktId == 31) { // clear varps
								for (var11 = 0; var11 < Class91.anIntArray711.length; ++var11)
									if (Class91.anIntArray712[var11] != Class91.anIntArray711[var11]) {
										Class91.anIntArray711[var11] = Class91.anIntArray712[var11];
										Class124_Sub11.method539(var11);
										anIntArray2246[(++anInt2169 - 1) & 31] = var11;
									}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 58) { // settings
								anInt2194 = buf.readByteU();
								if (anInt2194 == 255)
									anInt2194 = 0;
	
								anInt2217 = buf.readByteU();
								if (anInt2217 == 255)
									anInt2217 = 0;
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 142) { // varp thing
								Widget.widgetCheck();
								var11 = buf.readInt2(1520126972);
								var4 = buf.readByteA();
								var5 = buf.readByteN();
								anIntArray2121[var5] = var11;
								anIntArray2126[var5] = var4;
								anIntArray2030[var5] = 1;
	
								for (var6 = 0; var6 < 98; ++var6)
									if (var11 >= Class89.anIntArray705[var6])
										anIntArray2030[var5] = 2 + var6;
	
								anIntArray2072[(++anInt2173 - 1) & 31] = var5;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 199) { // shake
								var11 = buf.readByteU();
								var4 = buf.readByteU();
								var5 = buf.readByteU();
								var6 = buf.readByteU();
								aBoolArray2232[var11] = true;
								anIntArray2123[var11] = var4;
								anIntArray2054[var11] = var5;
								anIntArray2235[var11] = var6;
								anIntArray2236[var11] = 0;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 50) {
								var11 = buf.getcompact();
								var4 = buf.getIntv1();
								var5 = buf.getcompact();
								w2 = Class10.getwidget(var4);
								if ((var11 != w2.anInt1216) || (w2.anInt1163 != var5) || (w2.anInt1158 != 0)
										|| (w2.anInt1148 != 0)) {
									w2.anInt1216 = var11;
									w2.anInt1163 = var5;
									w2.anInt1158 = 0;
									w2.anInt1148 = 0;
									Def10.settrue(w2);
									Class64.method286(w2);
									if (w2.anInt1191 == 0)
										Somet2.updateWidget(Def10.widgets[var4 >> 16], w2,
												false);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 138) { // pointer/hint
								anInt2171 = buf.readByteU();
								if (anInt2171 == 1)
									anInt2003 = buf.readShortU();
	
								if ((anInt2171 >= 2) && (anInt2171 <= 6)) {
									if (anInt2171 == 2) {
										anInt2008 = 64;
										anInt2009 = 64;
									}
	
									if (anInt2171 == 3) {
										anInt2008 = 0;
										anInt2009 = 64;
									}
	
									if (anInt2171 == 4) {
										anInt2008 = 128;
										anInt2009 = 64;
									}
	
									if (anInt2171 == 5) {
										anInt2008 = 64;
										anInt2009 = 0;
									}
	
									if (anInt2171 == 6) {
										anInt2008 = 64;
										anInt2009 = 128;
									}
	
									anInt2171 = 2;
									anInt2186 = buf.readShortU();
									anInt2144 = buf.readShortU();
									anInt2191 = buf.readByteU();
								}
	
								if (anInt2171 == 10)
									anInt2004 = buf.readShortU();
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 2) { // settings
								anInt2066 = buf.readByteU();
								anInt2201 = buf.readByteU();
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 161) { // set str
								var11 = buf.getIntV1();
								var12 = buf.readStr2();
								w4 = Class10.getwidget(var11);
								if (!var12.equals(w4.aString1185)) {
									w4.aString1185 = var12;
									Def10.settrue(w4);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 186) { // widget something
								var11 = buf.readIntV2();
								var4 = buf.readShortU();
								var5 = buf.readShortU();
								var6 = buf.readShortS();
								w3 = Class10.getwidget(var11);
								if ((w3.anInt1202 != var5) || (w3.anInt1203 != var6)
										|| (var4 != w3.anInt1205)) {
									w3.anInt1202 = var5;
									w3.anInt1203 = var6;
									w3.anInt1205 = var4;
									Def10.settrue(w3);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 177) { // map
								mapregion(true);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							long var15;
							if (pktId == 18) { // inter setting
								var11 = buf.readShortU();
								if (var11 == '\uffff')
									var11 = -1;
	
								var4 = buf.readIntV2();
								var5 = buf.readIntV2();
								var6 = buf.readShortS();
								if (var6 == '\uffff')
									var6 = -1;
	
								for (var7 = var11; var7 <= var6; ++var7) {
									var15 = var7 + ((long) var4 << 32);
									final Node var90 = aClass107_2184.method409(var15);
									if (var90 != null)
										var90.method450();
	
									aClass107_2184.method412(new Class124_Sub21(var5), var15);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							boolean var65;
							String var83;
							if (pktId == 201) { // friend myabe
								var11 = buf.getsmart((byte) -18);
								var65 = buf.readByteU() == 1;
								var83 = "";
								var67 = false;
								if (var65) {
									var83 = buf.readStr2();
									if (Class1.method12(var83))
										var67 = true;
								}
	
								final String var72 = buf.readStr2();
								if (!var67)
									client.doCS(var11, var83, var72);
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 206) { // inter related
								var11 = buf.readUShort();
								var4 = buf.readIntV2();
								System.err.printf("YO2 %d, %d,%D%n", var11, var4>>16, var4&0xffff);
								w4 = Class10.getwidget(var4);
								if ((var11 != w4.anInt1222) || (var11 == -1)) {
									w4.anInt1222 = var11;
									w4.anInt1273 = 0;
									w4.anInt1274 = 0;
									Def10.settrue(w4);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							long var20;
							long var22;
							if (pktId == 60) { // GC info
								var11 = buf.readInt2(1465196928);
								var4 = buf.readInt2(167904836);
								if ((null == Class62.aGarbageCollectorMXBean548)
										|| !Class62.aGarbageCollectorMXBean548.isValid())
									try {
										final Iterator var93 = ManagementFactory.getGarbageCollectorMXBeans()
												.iterator();
	
										while (var93.hasNext()) {
											final GarbageCollectorMXBean var88 = (GarbageCollectorMXBean) var93.next();
											if (var88.isValid()) {
												Class62.aGarbageCollectorMXBean548 = var88;
												aLong2261 = -1L;
												aLong2260 = -1L;
											}
										}
									} catch (final Throwable var59) {
										;
									}
	
								final long var18 = Class74.method316(1582820196);
								var7 = -1;
								if (null != Class62.aGarbageCollectorMXBean548) {
									var15 = Class62.aGarbageCollectorMXBean548.getCollectionTime();
									if (-1L != aLong2260) {
										var20 = var15 - aLong2260;
										var22 = var18 - aLong2261;
										if (var22 != 0L)
											var7 = (int) ((100L * var20) / var22);
									}
	
									aLong2260 = var15;
									aLong2261 = var18;
								}
	
								secbuf.writeOpcode(133);
								secbuf.readInt(var11);
								secbuf.readInt(var4);
								secbuf.writeByteS(var7);
								secbuf.writeByteS(Applet_Sub1.anInt1970);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 254) { // visiblity
								var11 = buf.readByteU();
								var4 = buf.readByteA();
								var5 = buf.readUByteS();
								Class134.anInt906 = var5 >> 1;
								Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.method893(var4, var11, (var5 & 1) == 1);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 170) { // settings
								Def19.loyY = buf.readByteU();
								Def19.locX = buf.readUByteS();
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 83) { //s ecret
								buf.pos += 28;
								if (buf.matches()) {
									final Outbuf var63 = buf;
									var4 = buf.pos - 28;
									if (Class73.aClass132_600 != null)
										try {
											Class73.aClass132_600.method474(0L);
											Class73.aClass132_600.method475(var63.backing, var4, 24);
										} catch (final Exception var57) {
											;
										}
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 67) { // npc update
								Class124_Sub22_Sub19_Sub5.method959(false);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							String var79;
							if (pktId == 185) { // ignores?
								while (buf.pos < expected) {
									var11 = buf.readByteU();
									var65 = (var11 & 1) == 1;
									var83 = buf.readStr2();
									var79 = buf.readStr2();
									buf.readStr2();
	
									for (var7 = 0; var7 < anInt2252; ++var7) {
										final Class35 var96 = aClass35Array1986[var7];
										if (var65) {
											if (var79.equals(var96.aString372)) {
												var96.aString372 = var83;
												var96.aString373 = var79;
												w4 = null;
												break;
											}
										} else if (var83.equals(var96.aString372)) {
											var96.aString372 = var83;
											var96.aString373 = var79;
											w4 = null;
											break;
										}
									}
								}
	
								anInt2175 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							long var27;
							boolean var105;
							if (pktId == 47) { // clanchat
								anInt2176 = anInt2067;
								if (expected == 0) {
									aString2120 = null;
									aString2210 = null;
									Class103.anInt794 = 0;
									aClass124_Sub9Array1609 = null;
									pktId = -1;
									var1 = true;
								} else {
									aString2210 = buf.readStr2();
									final long var25 = buf.readLong2();
									var27 = var25;
									if ((var25 > 0L) && (var25 < 6582952005840035281L)) {
										if ((var25 % 37L) == 0L)
											var83 = null;
										else {
											var9 = 0;
	
											for (long var29 = var25; var29 != 0L; var29 /= 37L)
												++var9;
	
											final StringBuilder var100 = new StringBuilder(var9);
	
											while (0L != var27) {
												var22 = var27;
												var27 /= 37L;
												var100.append(Class85.aCharArray688[(int) (var22 - (37L * var27))]);
											}
	
											var83 = var100.reverse().toString();
										}
									} else
										var83 = null;
	
									aString2120 = var83;
									Class124_Sub22_Sub19_Sub1.aByte1665 = buf.readByte();
									var9 = buf.readByteU();
									if (var9 == 255) {
										pktId = -1;
										var1 = true;
									} else {
										Class103.anInt794 = var9;
										final Class124_Sub9[] var106 = new Class124_Sub9[100];
	
										for (var33 = 0; var33 < Class103.anInt794; ++var33) {
											var106[var33] = new Class124_Sub9();
											var106[var33].aString1029 = buf.readStr2();
											var106[var33].aString1026 = Class34.method186(var106[var33].aString1029,
													Class49.aClass117_488);
											var106[var33].anInt1027 = buf.readShortU();
											var106[var33].aByte1028 = buf.readByte();
											buf.readStr2();
											if (var106[var33].aString1029
													.equals(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956))
												Class9.aByte97 = var106[var33].aByte1028;
										}
	
										var105 = false;
										var107 = Class103.anInt794;
	
										while (var107 > 0) {
											var105 = true;
											--var107;
	
											for (var35 = 0; var35 < var107; ++var35)
												if (var106[var35].aString1026
														.compareTo(var106[1 + var35].aString1026) > 0) {
													final Class124_Sub9 var101 = var106[var35];
													var106[var35] = var106[1 + var35];
													var106[1 + var35] = var101;
													var105 = false;
												}
	
											if (var105)
												break;
										}
	
										aClass124_Sub9Array1609 = var106;
										pktId = -1;
										var1 = true;
									}
								}
								break label2501;
							}
	
							if (pktId == 125) { // reset varp
								for (var11 = 0; var11 < Def16.anInt1372; ++var11) {
									final Def16 var87 = Def6.method690(var11);
									if (var87 != null) {
										Class91.anIntArray712[var11] = 0;
										Class91.anIntArray711[var11] = 0;
									}
								}
	
								Widget.widgetCheck();
								anInt2169 += 32;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 180) { // maybe set npc head
								var11 = buf.readIntV2();
								w1 = Class10.getwidget(var11);
								w1.anInt1229 = 3;
								w1.anInt1197 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.spomet3
										.npcThing();
								Def10.settrue(w1);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							boolean var86;
							if (pktId == 167) { // GE
								var86 = buf.readByteU() == 1;
								if (var86) {
									InvIdk.aLong1011 = Class74.method316(1420216945)
											- buf.readLong2();
									Class37.aClass134_389 = new Class134(buf, true);
								} else
									Class37.aClass134_389 = null;
	
								anInt2178 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 255) { // preload
								var11 = buf.readIntV2();
								Class78.aClass79_632 = Class27.aClass82_303.method333(var11);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 195) { // player op
								var11 = buf.readByteU();
								var12 = buf.readStr2();
								var5 = buf.readByteU();
								if ((var11 >= 1) && (var11 <= 8)) {
									if (var12.equalsIgnoreCase("null"))
										var12 = null;
	
									aStringArray2166[var11 - 1] = var12;
									aBoolArray2112[var11 - 1] = var5 == 0;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							InvIdk var78;
							if (pktId == 7) { // bulk inter-set
								var11 = expected + buf.pos;
								var4 = buf.readShortU();
								var5 = buf.readShortU();
								if (anInt2142 != var4) {
									anInt2142 = var4;
									Class122.method449(anInt2142, Class56_Sub2.anInt1083, Class81.anInt662,
											false);
									Class32.clearchilds(anInt2142);
									Class3.method20(anInt2142);
	
									for (var6 = 0; var6 < 100; ++var6)
										aBoolArray2061[var6] = true;
								}
	
								InvIdk var104;
								for (; var5-- > 0; var104.aBool1009 = true) {
									var6 = buf.readInt2(1809020370);
									var7 = buf.readShortU();
									var9 = buf.readByteU();
									var104 = (InvIdk) aClass107_2143.method409(var6);
									if ((null != var104) && (var7 != var104.anInt1012)) {
										client.method760(var104, true);
										var104 = null;
									}
	
									if (var104 == null)
										var104 = Class49.method240(var6, var7, var9);
								}
	
								for (var78 = (InvIdk) aClass107_2143
										.method411(); null != var78; var78 = (InvIdk) aClass107_2143
												.method413())
									if (var78.aBool1009)
										var78.aBool1009 = false;
									else
										client.method760(var78, true);
	
								aClass107_2184 = new Class107(512);
	
								while (buf.pos < var11) {
									var6 = buf.readInt2(-1661786170);
									var7 = buf.readShortU();
									var9 = buf.readShortU();
									var10 = buf.readInt2(999441199);
	
									for (var33 = var7; var33 <= var9; ++var33) {
										final long var36 = var33 + ((long) var6 << 32);
										aClass107_2184.method412(new Class124_Sub21(var10), var36);
									}
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 59) { // probs widget zoom?
								aBool2231 = true;
								Class73.anInt608 = buf.readByteU();
								Class124_Sub11.anInt1045 = buf.readByteU();
								Class124_Sub11.anInt1041 = buf.readShortU();
								Class70.anInt583 = buf.readByteU();
								Class49.anInt482 = buf.readByteU();
								if (Class49.anInt482 >= 100) {
									var11 = 64 + (Class73.anInt608 * 128);
									var4 = (Class124_Sub11.anInt1045 * 128) + 64;
									var5 = Class63.method285(var11, var4, Class134.anInt906) - Class124_Sub11.anInt1041;
									var6 = var11 - Class45.anInt445;
									var7 = var5 - Class2.anInt14;
									var9 = var4 - Class48.anInt479;
									var10 = (int) Math.sqrt((var6 * var6) + (var9 * var9));
									CSD.anInt1003 = (int) (Math.atan2(var7, var10) * 325.949D) & 2047;
									Class27.anInt301 = (int) (Math.atan2(var6, var9) * -325.949D) & 2047;
									if (CSD.anInt1003 < 128)
										CSD.anInt1003 = 128;
	
									if (CSD.anInt1003 > 383)
										CSD.anInt1003 = 383;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 132) { // idk
								Widget.widgetCheck();
								anInt2148 = buf.readShort();
								anInt2179 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 61) { // set somet
								var11 = buf.getIntV1();
								var4 = buf.readShortU();
								w4 = Class10.getwidget(var11);
								if ((w4.anInt1229 != 1) || (w4.anInt1197 != var4)) {
									w4.anInt1229 = 1;
									w4.anInt1197 = var4;
									Def10.settrue(w4);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 194) { // idk
								var11 = buf.readUShortLE();
								if (var11 == '\uffff')
									var11 = -1;
	
								if ((var11 == -1) && !aBool2221)
									Class38.method199();
								else if ((var11 != -1) && (anInt2220 != var11) && (anInt2219 != 0)
										&& !aBool2221)
									Class25.method159(2, Class5.aClass94_Sub1_58, var11, 0, anInt2219, false);
	
								anInt2220 = var11;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 99) { // idk
								var11 = buf.readTri();
								var4 = buf.readUShortLE();
								if (var4 == '\uffff')
									var4 = -1;
	
								if ((anInt2219 != 0) && (var4 != -1)) {
									Class2.method19(Class68.aClass94_Sub1_571, var4, 0, anInt2219, false);
									aBool2221 = true;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 242) { // guessing widget interface
								var11 = buf.getIntV1();
								var4 = buf.readUByteS();
								var5 = buf.readUShortS();
								var78 = (InvIdk) aClass107_2143.method409(var11);
								if (null != var78)
									client.method760(var78, var5 != var78.anInt1012);
	
								Class49.method240(var11, var5, var4);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 198) { // ge
								var11 = buf.readByteU();
								if (buf.readByteU() == 0) {
									aClass125Array2259[var11] = new Class125();
									buf.pos += 18;
								} else {
									--buf.pos;
									aClass125Array2259[var11] = new Class125(buf,
											false);
								}
	
								anInt2177 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 124) { // cs
								var3 = buf.readStr2();
								final Object[] var81 = new Object[var3.length() + 1];
	
								for (var5 = var3.length() - 1; var5 >= 0; --var5)
									if (var3.charAt(var5) == 115)
										var81[var5 + 1] = buf.readStr2();
									else
										var81[1 + var5] = new Integer(
												buf.readInt2(-816368087));
	
								var81[0] = new Integer(buf.readInt2(1703341761));
								var91 = new CSD();
								var91.anObjectArray995 = var81;
								client.fullCS(var91);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 54) { // no idea
								anInt2001 = buf.readUShortS() * 30;
								anInt2179 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 12) { // set items
								var11 = buf.readInt2(190203725);
								var4 = buf.readShortU();
								if (var11 < -70000)
									var4 += '\u8000';
	
								if (var11 >= 0)
									w4 = Class10.getwidget(var11);
								else
									w4 = null;
	
								Class124_Sub22_Sub19_Sub5.clear(var4);
								var6 = buf.readShortU();
	
								for (var7 = 0; var7 < var6; ++var7) {
									var9 = buf.readByteA();
									if (var9 == 255)
										var9 = buf.readIntV2();
	
									var10 = buf.readShortU();
									if ((null != w4) && (var7 < w4.anIntArray1269.length)) {
										w4.anIntArray1269[var7] = var10;
										w4.anIntArray1270[var7] = var9;
									}
	
									Class43.method218(var4, var7, var10 - 1, var9);
								}
	
								if (null != w4)
									Def10.settrue(w4);
	
								Widget.widgetCheck();
								anIntArray2170[(++anInt2060 - 1) & 31] = var4 & 32767;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 44) { // idk
								var11 = buf.readShortS();
								var4 = buf.getIntV1();
								var5 = (var11 >> 10) & 31;
								var6 = (var11 >> 5) & 31;
								var7 = var11 & 31;
								var9 = (var5 << 19) + (var6 << 11) + (var7 << 3);
								final Widget var103 = Class10.getwidget(var4);
								if (var103.anInt1178 != var9) {
									var103.anInt1178 = var9;
									Def10.settrue(var103);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 153) { // set area
								Def19.loyY = buf.readByteU();
								Def19.locX = buf.readByteU();
	
								for (var11 = Def19.locX; var11 < (8
										+ Def19.locX); ++var11)
									for (var4 = Def19.loyY; var4 < (Def19.loyY
											+ 8); ++var4)
										if (null != clips[Class134.anInt906][var11][var4]) {
											clips[Class134.anInt906][var11][var4] = null;
											Class48.method233(var11, var4);
										}
	
								for (Class124_Sub11 var62 = (Class124_Sub11) aClass111_2262
										.method428(); null != var62; var62 = (Class124_Sub11) aClass111_2262
												.method430())
									if ((var62.anInt1036 >= Def19.locX)
											&& (var62.anInt1036 < (Def19.locX + 8))
											&& (var62.anInt1037 >= Def19.loyY)
											&& (var62.anInt1037 < (8 + Def19.loyY))
											&& (var62.anInt1048 == Class134.anInt906))
										var62.anInt1050 = 0;
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 98) { // clear widget
								var11 = buf.readUShortLE();
								anInt2142 = var11;
								Class122.method449(anInt2142, Class56_Sub2.anInt1083, Class81.anInt662, false);
								Class32.clearchilds(var11);
								Class3.method20(anInt2142);
	
								for (var4 = 0; var4 < 100; ++var4)
									aBoolArray2061[var4] = true;
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 28) { // class check
								Class97.method390(buf);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 82) { // update items
								var11 = buf.readInt2(-734325398);
								var4 = buf.readShortU();
								if (var11 < -70000)
									var4 += '\u8000';
	
								if (var11 >= 0)
									w4 = Class10.getwidget(var11);
								else
									w4 = null;
	
								for (; buf.pos < expected; Class43
										.method218(var4, var6, var7 - 1, var9)) {
									var6 = buf.getsmart((byte) -75);
									var7 = buf.readShortU();
									var9 = 0;
									if (var7 != 0) {
										var9 = buf.readByteU();
										if (var9 == 255)
											var9 = buf.readInt2(1341173650);
									}
	
									if ((null != w4) && (var6 >= 0) && (var6 < w4.anIntArray1269.length)) {
										w4.anIntArray1269[var6] = var7;
										w4.anIntArray1270[var6] = var9;
									}
								}
	
								if (w4 != null)
									Def10.settrue(w4);
	
								Widget.widgetCheck();
								anIntArray2170[(++anInt2060 - 1) & 31] = var4 & 32767;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 30) { // visible
								var11 = buf.getIntv1();
								var65 = buf.readByteU() == 1;
								w4 = Class10.getwidget(var11);
								if (w4.aBool1173 != var65) {
									w4.aBool1173 = var65;
									Def10.settrue(w4);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 0) { // put on child
								var11 = buf.readUShortS();
								var4 = buf.readShortU();
								var5 = buf.readInt2(-415552865);
								w2 = Class10.getwidget(var5);
								w2.anInt1207 = var4 + (var11 << 16);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 14) { // large npc update
								Class124_Sub22_Sub19_Sub5.method959(true);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 157) { // varp
								var11 = buf.getIntV1();
								var4 = buf.readUShortLE();
								Class91.anIntArray712[var4] = var11;
								if (Class91.anIntArray711[var4] != var11) {
									Class91.anIntArray711[var4] = var11;
									Class124_Sub11.method539(var4);
								}
	
								anIntArray2246[(++anInt2169 - 1) & 31] = var4;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 115) { // reset
								aBool2231 = false;
	
								for (var11 = 0; var11 < 5; ++var11)
									aBoolArray2232[var11] = false;
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 190) { // logout
								Class30.method174();
								pktId = -1;
								var1 = false;
								break label2501;
							}
	
							if (pktId == 107) { // idk
								var3 = buf.readStr2();
								aString1991 = var3;
	
								try {
									var12 = Class80.aclient645.getParameter(Class122.aClass122_870.aString857);
									var83 = Class80.aclient645.getParameter(Class122.aClass122_867.aString857);
									var79 = var12 + "settings=" + var3 + "; version=1; path=/; domain=" + var83;
									if (var3.length() == 0)
										var79 = var79 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
									else
										var79 = var79 + "; Expires="
												+ Class31.method181(Class74.method316(975676565) + 94608000000L)
												+ "; Max-Age=" + 94608000L;
	
									final client var71 = Class80.aclient645;
									final String var95 = "document.cookie=\"" + var79 + "\"";
									JSObject.getWindow(var71).eval(var95);
								} catch (final Throwable var56) {
									;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 29) { // music
								var11 = buf.readShortU();
								var4 = buf.readByteU();
								var5 = buf.readShortU();
								if ((anInt2239 != 0) && (var4 != 0) && (anInt2225 < 50)) {
									anIntArray2226[anInt2225] = var11;
									anIntArray2227[anInt2225] = var4;
									anIntArray2228[anInt2225] = var5;
									aClass12Array2230[anInt2225] = null;
									anIntArray2229[anInt2225] = 0;
									++anInt2225;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 88) { // inven
								var11 = buf.readInt2(1334986033);
								final InvIdk inv = (InvIdk) aClass107_2143.method409(var11);
								if (null != inv)
									client.method760(inv, true);
	
								if (null != aClass124_Sub17_2042) {
									Def10.settrue(aClass124_Sub17_2042);
									aClass124_Sub17_2042 = null;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 229) { // varp
								var11 = buf.readUShortLE();
								final Class124_Sub10 var77 = (Class124_Sub10) Class124_Sub10.aClass107_1034
										.method409(var11);
								if (null != var77)
									var77.method450();
	
								anIntArray2170[(++anInt2060 - 1) & 31] = var11 & 32767;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 80) { // reset entities
								for (var11 = 0; var11 < aClass124_Sub22_Sub19_Sub3_Sub2Array2100.length; ++var11)
									if (null != aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11])
										aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11].anInt1699 = -1;
	
								for (var11 = 0; var11 < aClass124_Sub22_Sub19_Sub3_Sub1Array2254.length; ++var11)
									if (aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var11] != null)
										aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var11].anInt1699 = -1;
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 223) { // gamemode?
								var3 = buf.readStr2();
								var38 = buf.readLong2();
								var27 = buf.readShortU();
								var15 = buf.readTri();
								final Class74[] var17 = new Class74[] { Class74.aClass74_612, Class74.aClass74_613,
										Class74.aClass74_617, Class74.aClass74_616, Class74.aClass74_611 };
								final Class74 var99 = (Class74) Class23.method158(var17,
										buf.readByteU());
								var22 = (var27 << 32) + var15;
								boolean var109 = false;
	
								for (var41 = 0; var41 < 100; ++var41)
									if (aLongArray2203[var41] == var22) {
										var109 = true;
										break;
									}
	
								if (var99.aBool615 && Class1.method12(var3))
									var109 = true;
	
								if (!var109 && (anInt2099 == 0)) {
									aLongArray2203[anInt2204] = var22;
									anInt2204 = (1 + anInt2204) % 100;
									final String var42 = client
											.appendTags(client.format(RuntimeException_Sub1
													.decodeStr(buf)));
									if (var99.anInt614 != -1)
										Class49.method238(9, Class99.method391(var99.anInt614) + var3, var42,
												Class61.method273(var38));
									else
										Class49.method238(9, var3, var42, Class61.method273(var38));
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 116) { // idk
								aBool2231 = true;
								Class22.anInt251 = buf.readByteU();
								CSD.anInt992 = buf.readByteU();
								Class64.anInt560 = buf.readShortU();
								Class27.anInt305 = buf.readByteU();
								Class47.anInt468 = buf.readByteU();
								if (Class47.anInt468 >= 100) {
									Class45.anInt445 = 64 + (Class22.anInt251 * 128);
									Class48.anInt479 = 64 + (CSD.anInt992 * 128);
									Class2.anInt14 = Class63.method285(Class45.anInt445, Class48.anInt479,
											Class134.anInt906) - Class64.anInt560;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 166) { // update heirarchy
								var11 = buf.getIntv1();
								var4 = buf.getIntV1();
								final InvIdk var85 = (InvIdk) aClass107_2143.method409(var11);
								var78 = (InvIdk) aClass107_2143.method409(var4);
								if (var78 != null)
									client.method760(var78,
											(null == var85) || (var78.anInt1012 != var85.anInt1012));
	
								if (null != var85) {
									var85.method450();
									aClass107_2143.method412(var85, var4);
								}
	
								w3 = Class10.getwidget(var11);
								if (w3 != null)
									Def10.settrue(w3);
	
								w3 = Class10.getwidget(var4);
								if (null != w3) {
									Def10.settrue(w3);
									Somet2.updateWidget(
											Def10.widgets[w3.anInt1284 >>> 16],
											w3, true);
								}
	
								if (anInt2142 != -1)
									Class3.widgetInvCS(anInt2142, 1);
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 102) { // update widet inv vs
								if (anInt2142 != -1)
									Class3.widgetInvCS(anInt2142, 0);
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 112) { // idk
								anInt2215 = 1;
								anInt2175 = anInt2067;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 173) { // map
								mapregion(false);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 39) { // set game mode
								Class32.aClass53_337 = Class62.method278(buf.readByteU(),
										(short) 128);
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 51) { // cc members
								while (buf.pos < expected) {
									var86 = buf.readByteU() == 1;
									var12 = buf.readStr2();
									var83 = buf.readStr2();
									var6 = buf.readShortU();
									var7 = buf.readByteU();
									var9 = buf.readByteU();
									final boolean var73 = (var9 & 2) != 0;
									var105 = (var9 & 1) != 0;
									if (var6 > 0) {
										buf.readStr2();
										buf.readByteU();
										buf.readInt2(1008612400);
									}
	
									buf.readStr2();
	
									for (var43 = 0; var43 < anInt2056; ++var43) {
										final Class32 var44 = aClass32Array2098[var43];
										if (!var86) {
											if (var12.equals(var44.aString344)) {
												if (var44.anInt339 != var6) {
													boolean var108 = true;
	
													for (Class121_Sub1 var45 = (Class121_Sub1) aClass106_2253
															.method406(); var45 != null; var45 = (Class121_Sub1) aClass106_2253
																	.method407())
														if (var45.aString914.equals(var12))
															if ((var6 != 0) && (var45.aShort915 == 0)) {
																var45.method447();
																var108 = false;
															} else if ((var6 == 0) && (var45.aShort915 != 0)) {
																var45.method447();
																var108 = false;
															}
	
													if (var108)
														aClass106_2253.method408(new Class121_Sub1(var12, var6));
	
													var44.anInt339 = var6;
												}
	
												var44.aString338 = var83;
												var44.anInt340 = var7;
												var44.aBool341 = var73;
												var44.aBool342 = var105;
												var12 = null;
												break;
											}
										} else if (var83.equals(var44.aString344)) {
											var44.aString344 = var12;
											var44.aString338 = var83;
											var12 = null;
											break;
										}
									}
	
									if ((null != var12) && (anInt2056 < 400)) {
										final Class32 var31 = new Class32();
										aClass32Array2098[anInt2056] = var31;
										var31.aString344 = var12;
										var31.aString338 = var83;
										var31.anInt339 = var6;
										var31.anInt340 = var7;
										var31.aBool341 = var73;
										var31.aBool342 = var105;
										++anInt2056;
									}
								}
	
								anInt2215 = 2;
								anInt2175 = anInt2067;
								var86 = false;
								var4 = anInt2056;
	
								while (var4 > 0) {
									var86 = true;
									--var4;
	
									for (var5 = 0; var5 < var4; ++var5) {
										var67 = false;
										final Class32 var69 = aClass32Array2098[var5];
										final Class32 var94 = aClass32Array2098[1 + var5];
										if ((var69.anInt339 != anInt2079)
												&& (var94.anInt339 == anInt2079))
											var67 = true;
	
										if (!var67 && (var69.anInt339 == 0) && (var94.anInt339 != 0))
											var67 = true;
	
										if (!var67 && !var69.aBool341 && var94.aBool341)
											var67 = true;
	
										if (!var67 && !var69.aBool342 && var94.aBool342)
											var67 = true;
	
										if (var67) {
											final Class32 var102 = aClass32Array2098[var5];
											aClass32Array2098[var5] = aClass32Array2098[1 + var5];
											aClass32Array2098[1 + var5] = var102;
											var86 = false;
										}
									}
	
									if (var86)
										break;
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 187) { // varp
								var11 = buf.readShortS();
								final byte var68 = buf.readByteS();
								Class91.anIntArray712[var11] = var68;
								if (Class91.anIntArray711[var11] != var68) {
									Class91.anIntArray711[var11] = var68;
									Class124_Sub11.method539(var11);
								}
	
								anIntArray2246[(++anInt2169 - 1) & 31] = var11;
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if ((pktId == 118) || (pktId == 162) || (pktId == 205)
									|| (pktId == 131) || (pktId == 183)
									|| (pktId == 36) || (pktId == 240) || (pktId == 48)
									|| (pktId == 56) || (pktId == 234)) {
								Class124_Sub22_Sub19_Sub6.method966();
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 207) { // idk
								var11 = buf.readInt2(-543913852);
								var4 = buf.readUShortLE();
								w4 = Class10.getwidget(var11);
								if ((w4.anInt1229 != 2) || (var4 != w4.anInt1197)) {
									w4.anInt1229 = 2;
									w4.anInt1197 = var4;
									Def10.settrue(w4);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 40) { // idkl
								var11 = buf.readUShortS();
								if (var11 == '\uffff')
									var11 = -1;
	
								var4 = buf.readIntV2();
								var5 = buf.getIntv1();
								w2 = Class10.getwidget(var4);
								Def10 var8;
								if (!w2.aBool1152) {
									if (var11 == -1) {
										w2.anInt1229 = 0;
										pktId = -1;
										var1 = true;
										break label2501;
									}
	
									var8 = Def10.method724(var11);
									w2.anInt1229 = 4;
									w2.anInt1197 = var11;
									w2.anInt1202 = var8.anInt1500;
									w2.anInt1203 = var8.anInt1474;
									w2.anInt1205 = (var8.anInt1470 * 100) / var5;
									Def10.settrue(w2);
								} else {
									w2.anInt1271 = var11;
									w2.anInt1272 = var5;
									var8 = Def10.method724(var11);
									w2.anInt1202 = var8.anInt1500;
									w2.anInt1203 = var8.anInt1474;
									w2.anInt1204 = var8.anInt1473;
									w2.anInt1200 = var8.anInt1477;
									w2.anInt1201 = var8.anInt1475;
									w2.anInt1205 = var8.anInt1470;
									if (var8.anInt1480 == 1)
										w2.anInt1209 = 1;
									else
										w2.anInt1209 = 2;
	
									if (w2.anInt1206 > 0)
										w2.anInt1205 = (w2.anInt1205 * 32) / w2.anInt1206;
									else if (w2.anInt1257 > 0)
										w2.anInt1205 = (w2.anInt1205 * 32) / w2.anInt1257;
	
									Def10.settrue(w2);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 90) { // player upd
								anInt2108 = 0;
								anInt2029 = 0;
								CSD.method521();
								Def3.method656();
	
								Class124_Sub22_Sub19_Sub3_Sub2 var82;
								for (; buf.bitpos(expected) >= 11; var82
										.method893(
												Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0] + var33,
												var9 + Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0],
												var7 == 1)) {
									var11 = buf.clever(11);
									if (var11 == 2047)
										break;
	
									var65 = false;
									if (aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11] == null) {
										aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11] = new Class124_Sub22_Sub19_Sub3_Sub2();
										if (null != aClass124_Sub14Array2256[var11])
											aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11]
													.method1044(aClass124_Sub14Array2256[var11]);
	
										var65 = true;
									}
	
									anIntArray2128[++anInt2090 - 1] = var11;
									var82 = aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11];
									var82.anInt1716 = anInt2158;
									var6 = buf.clever(1);
									if (var6 == 1)
										anIntArray2104[++anInt2029 - 1] = var11;
	
									var7 = buf.clever(1);
									var9 = buf.clever(5);
									if (var9 > 15)
										var9 -= 32;
	
									var10 = anIntArray2168[buf.clever(3)];
									if (var65) {
										var82.anInt1672 = var10 * 1301162841;
										var82.anInt1718 = var10;
									}
	
									var33 = buf.clever(5);
									if (var33 > 15)
										var33 -= 32;
								}
	
								buf.bitinit();
	
								for (var11 = 0; var11 < anInt2029; ++var11) {
									var4 = anIntArray2104[var11];
									var82 = aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var4];
									var6 = buf.readByteU();
									if ((var6 & 4) != 0)
										var6 += buf.readByteU() << 8;
	
									Class35.method192(var4, var82, var6);
								}
	
								for (var11 = 0; var11 < anInt2108; ++var11) {
									var4 = anIntArray2109[var11];
									if (aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var4].anInt1716 != anInt2158)
										aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var4] = null;
								}
	
								if (buf.pos != expected)
									throw new RuntimeException(
											buf.pos + "," + expected);
	
								for (var11 = 0; var11 < anInt2090; ++var11)
									if (aClass124_Sub22_Sub19_Sub3_Sub2Array2100[anIntArray2128[var11]] == null)
										throw new RuntimeException(var11 + "," + anInt2090);
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 81) { // mode
								var3 = buf.readStr2();
								var38 = buf.readShortU();
								var27 = buf.readTri();
								final Class74[] var24 = new Class74[] { Class74.aClass74_612, Class74.aClass74_613,
										Class74.aClass74_617, Class74.aClass74_616, Class74.aClass74_611 };
								final Class74 var32 = (Class74) Class23.method158(var24,
										buf.readByteU());
								var20 = var27 + (var38 << 32);
								boolean var34 = false;
	
								for (var35 = 0; var35 < 100; ++var35)
									if (var20 == aLongArray2203[var35]) {
										var34 = true;
										break;
									}
	
								if (Class1.method12(var3))
									var34 = true;
	
								if (!var34 && (anInt2099 == 0)) {
									aLongArray2203[anInt2204] = var20;
									anInt2204 = (1 + anInt2204) % 100;
									final String var46 = client
											.appendTags(client.format(RuntimeException_Sub1
													.decodeStr(buf)));
									byte var40;
									if (var32.aBool618)
										var40 = 7;
									else
										var40 = 3;
	
									if (var32.anInt614 != -1)
										client.doCS(var40, Class99.method391(var32.anInt614) + var3, var46);
									else
										client.doCS(var40, var3, var46);
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							if (pktId == 24) { // idk
								var11 = buf.readIntV2();
								var4 = buf.readUShortS();
								w4 = Class10.getwidget(var11);
								if ((w4 != null) && (w4.anInt1191 == 0)) {
									if (var4 > (w4.anInt1177 - w4.anInt1169))
										var4 = w4.anInt1177 - w4.anInt1169;
	
									if (var4 < 0)
										var4 = 0;
	
									if (var4 != w4.anInt1175) {
										w4.anInt1175 = var4;
										Def10.settrue(w4);
									}
								}
	
								pktId = -1;
								var1 = true;
								break label2501;
							}
	
							Class28.method166("" + pktId + "," + anInt2032 + "," + anInt2086
									+ "," + expected, (Throwable) null);
							Class30.method174();
						} catch (final IOException var60) {
							Class10.method60();
						} catch (final Exception var61) {
							var3 = "" + pktId + "," + anInt2032 + "," + anInt2086 + ","
									+ expected + ","
									+ (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0] + Class9.anInt102)
									+ ","
									+ (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0] + Class95.anInt762)
									+ ",";
	
							for (var4 = 0; (var4 < expected) && (var4 < 50); ++var4)
								var3 = var3 + buf.backing[var4] + ",";
	
							Class28.method166(var3, var61);
							Class30.method174();
						}
	
						var1 = true;
					}
	
				if (!var1)
					break;
			}
	
			if (anInt1992 == 30) {
				while (Class30.method175()) {
					secbuf.writeOpcode(162);
					secbuf.writeByte(0);
					var0 = secbuf.pos;
					Def1.method667(secbuf);
					secbuf.endByteSize(secbuf.pos - var0);
				}
	
				final Object var48 = Class47.aClass29_467.anObject319;
				int var98;
				synchronized (var48) {
					if (!aBool2174)
						Class47.aClass29_467.anInt315 = 0;
					else if ((Class81.anInt650 != 0) || (Class47.aClass29_467.anInt315 >= 40)) {
						secbuf.writeOpcode(206);
						secbuf.writeByte(0);
						var98 = secbuf.pos;
						var2 = 0;
	
						for (var11 = 0; (var11 < Class47.aClass29_467.anInt315)
								&& ((secbuf.pos - var98) < 240); ++var11) {
							++var2;
							var4 = Class47.aClass29_467.anIntArray318[var11];
							if (var4 < 0)
								var4 = 0;
							else if (var4 > 502)
								var4 = 502;
	
							var5 = Class47.aClass29_467.anIntArray316[var11];
							if (var5 < 0)
								var5 = 0;
							else if (var5 > 764)
								var5 = 764;
	
							var6 = var5 + (var4 * 765);
							if ((Class47.aClass29_467.anIntArray318[var11] == -1)
									&& (Class47.aClass29_467.anIntArray316[var11] == -1)) {
								var5 = -1;
								var4 = -1;
								var6 = 524287;
							}
	
							if ((anInt1996 == var5) && (anInt1997 == var4)) {
								if (anInt1998 < 2047)
									++anInt1998;
							} else {
								var7 = var5 - anInt1996;
								anInt1996 = var5;
								var9 = var4 - anInt1997;
								anInt1997 = var4;
								if ((anInt1998 < 8) && (var7 >= -32) && (var7 <= 31) && (var9 >= -32)
										&& (var9 <= 31)) {
									var7 += 32;
									var9 += 32;
									secbuf
											.writeShort((anInt1998 << 12) + (var7 << 6) + var9);
									anInt1998 = 0;
								} else if (anInt1998 < 8) {
									secbuf
											.writeTrib((anInt1998 << 19) + 8388608 + var6);
									anInt1998 = 0;
								} else {
									secbuf
											.writeInt(-1073741824 + (anInt1998 << 19) + var6);
									anInt1998 = 0;
								}
							}
						}
	
						secbuf.endByteSize(secbuf.pos - var98);
						if (var2 >= Class47.aClass29_467.anInt315)
							Class47.aClass29_467.anInt315 = 0;
						else {
							Class47.aClass29_467.anInt315 -= var2;
	
							for (var11 = 0; var11 < Class47.aClass29_467.anInt315; ++var11) {
								Class47.aClass29_467.anIntArray316[var11] = Class47.aClass29_467.anIntArray316[var11
										+ var2];
								Class47.aClass29_467.anIntArray318[var11] = Class47.aClass29_467.anIntArray318[var2
										+ var11];
							}
						}
					}
				}
	
				if ((Class81.anInt650 == 1) || (!Class7.aBool71 && (Class81.anInt650 == 4))
						|| (Class81.anInt650 == 2)) {
					long var50 = (Class81.aLong660 - aLong1995) / 50L;
					if (var50 > 4095L)
						var50 = 4095L;
	
					aLong1995 = Class81.aLong660;
					var2 = Class81.anInt655;
					if (var2 < 0)
						var2 = 0;
					else if (var2 > Class81.anInt662)
						var2 = Class81.anInt662;
	
					var11 = Class81.anInt658;
					if (var11 < 0)
						var11 = 0;
					else if (var11 > Class56_Sub2.anInt1083)
						var11 = Class56_Sub2.anInt1083;
	
					var4 = (int) var50;
					secbuf.writeOpcode(32);
					secbuf.writeShort((Class81.anInt650 == 2 ? 1 : 0) + (var4 << 1));
					secbuf.writeShort(var11);
					secbuf.writeShort(var2);
				}
	
				if (Class84.anInt681 > 0) {
					secbuf.writeOpcode(156);
					secbuf.writeShort(0);
					var0 = secbuf.pos;
					final long var52 = Class74.method316(-183826630);
	
					for (var11 = 0; var11 < Class84.anInt681; ++var11) {
						var38 = var52 - aLong2208;
						if (var38 > 16777215L)
							var38 = 16777215L;
	
						aLong2208 = var52;
						secbuf.writeByteA(Class84.anIntArray687[var11]);
						secbuf.writeTrib((int) var38);
					}
	
					secbuf.endShortSize(secbuf.pos - var0);
				}
	
				if (anInt2101 > 0)
					--anInt2101;
	
				if (Class84.aBoolArray676[96] || Class84.aBoolArray676[97] || Class84.aBoolArray676[98]
						|| Class84.aBoolArray676[99])
					aBool2044 = true;
	
				if (aBool2044 && (anInt2101 <= 0)) {
					anInt2101 = 20;
					aBool2044 = false;
					secbuf.writeOpcode(238);
					secbuf.writeAShort(anInt2255);
					secbuf.writeShortA(anInt2076);
				}
	
				if (Class88.aBool702 && !aBool2212) {
					aBool2212 = true;
					secbuf.writeOpcode(93);
					secbuf.writeByte(1);
				}
	
				if (!Class88.aBool702 && aBool2212) {
					aBool2212 = false;
					secbuf.writeOpcode(93);
					secbuf.writeByte(0);
				}
	
				int var110;
				if (aBool1989 && (Class134.anInt906 != anInt2006))
					Class124_Sub22_Sub21.method882(Class124_Sub13.anInt1071, Class124_Sub22_Sub19_Sub6.anInt1824,
							Class134.anInt906, Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0],
							Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0]);
				else if (Class134.anInt906 != anInt2211) {
					anInt2211 = Class134.anInt906;
					var0 = Class134.anInt906;
					final int[] var54 = client.aClass124_Sub22_Sub16_Sub1_1954.anIntArray1735;
					var2 = var54.length;
	
					for (var11 = 0; var11 < var2; ++var11)
						var54[var11] = 0;
	
					for (var11 = 1; var11 < 103; ++var11) {
						var4 = 24628 + (2048 * (103 - var11));
	
						for (var5 = 1; var5 < 103; ++var5) {
							if ((Class27.aByteArrayArrayArray285[var0][var5][var11] & 24) == 0)
								Class36.aClass21_380.method142(var54, var4, 512, var0, var5, var11);
	
							if ((var0 < 3) && ((Class27.aByteArrayArrayArray285[var0 + 1][var5][var11] & 8) != 0))
								Class36.aClass21_380.method142(var54, var4, 512, 1 + var0, var5, var11);
	
							var4 += 4;
						}
					}
	
					var11 = (((238 + (int) (Math.random() * 20.0D)) - 10) << 16)
							+ (((238 + (int) (Math.random() * 20.0D)) - 10) << 8)
							+ ((238 + (int) (Math.random() * 20.0D)) - 10);
					var4 = ((238 + (int) (Math.random() * 20.0D)) - 10) << 16;
					client.aClass124_Sub22_Sub16_Sub1_1954.method900();
	
					for (var5 = 1; var5 < 103; ++var5)
						for (var6 = 1; var6 < 103; ++var6) {
							if ((Class27.aByteArrayArrayArray285[var0][var6][var5] & 24) == 0)
								Class29.method170(var0, var6, var5, var11, var4);
	
							if ((var0 < 3) && ((Class27.aByteArrayArrayArray285[1 + var0][var6][var5] & 8) != 0))
								Class29.method170(var0 + 1, var6, var5, var11, var4);
						}
	
					anInt2065 = 0;
	
					for (var5 = 0; var5 < 104; ++var5)
						for (var6 = 0; var6 < 104; ++var6) {
							var7 = Class36.aClass21_380.method126(Class134.anInt906, var5, var6);
							if (var7 != 0) {
								var7 = (var7 >> 14) & 32767;
								var9 = Def13.method736(var7).anInt1390;
								if (var9 >= 0) {
									var10 = var5;
									var33 = var6;
									if ((var9 != 22) && (var9 != 29) && (var9 != 34) && (var9 != 36) && (var9 != 46)
											&& (var9 != 47) && (var9 != 48)) {
										final int[][] var111 = aClass130Array2192[Class134.anInt906].anIntArrayArray894;
	
										for (var110 = 0; var110 < 10; ++var110) {
											var41 = (int) (Math.random() * 4.0D);
											if ((var41 == 0) && (var10 > 0) && (var10 > (var5 - 3))
													&& ((var111[var10 - 1][var33] & 19136776) == 0))
												--var10;
	
											if ((var41 == 1) && (var10 < 103) && (var10 < (3 + var5))
													&& ((var111[var10 + 1][var33] & 19136896) == 0))
												++var10;
	
											if ((var41 == 2) && (var33 > 0) && (var33 > (var6 - 3))
													&& ((var111[var10][var33 - 1] & 19136770) == 0))
												--var33;
	
											if ((var41 == 3) && (var33 < 103) && (var33 < (3 + var6))
													&& ((var111[var10][1 + var33] & 19136800) == 0))
												++var33;
										}
									}
	
									aClass124_Sub22_Sub16_Sub1Array2244[anInt2065] = Class98.aClass124_Sub22_Sub16_Sub1Array771[var9];
									anIntArray2213[anInt2065] = var10;
									anIntArray2214[anInt2065] = var33;
									++anInt2065;
								}
							}
						}
	
					Class64.aClass9_558.method54();
				}
	
				if (anInt1992 == 30) {
					Class50.method243();
	
					for (var0 = 0; var0 < anInt2225; ++var0) {
						--anIntArray2228[var0];
						if (anIntArray2228[var0] >= -10) {
							Class12 var115 = aClass12Array2230[var0];
							if (null == var115) {
								var115 = Class12.method68(Class39.aClass94_Sub1_399, anIntArray2226[var0], 0);
								if (var115 == null)
									continue;
	
								anIntArray2228[var0] += var115.method71();
								aClass12Array2230[var0] = var115;
							}
	
							if (anIntArray2228[var0] < 0) {
								if (anIntArray2229[var0] != 0) {
									var11 = (anIntArray2229[var0] & 255) * 128;
									var4 = (anIntArray2229[var0] >> 16) & 255;
									var5 = (64 + (var4 * 128)) - Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690;
									if (var5 < 0)
										var5 = -var5;
	
									var6 = (anIntArray2229[var0] >> 8) & 255;
									var7 = (64 + (128 * var6)) - Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697;
									if (var7 < 0)
										var7 = -var7;
	
									var9 = (var7 + var5) - 128;
									if (var9 > var11) {
										anIntArray2228[var0] = -100;
										continue;
									}
	
									if (var9 < 0)
										var9 = 0;
	
									var2 = ((var11 - var9) * anInt2206) / var11;
								} else
									var2 = anInt2239;
	
								if (var2 > 0) {
									final Class124_Sub2_Sub1 var66 = var115.method69().method821(Class27.aClass16_302);
									final Class124_Sub4_Sub1 var89 = Class124_Sub4_Sub1.method782(var66, 100, var2);
									var89.method812(anIntArray2227[var0] - 1);
									Class56_Sub2.aClass124_Sub4_Sub2_1078.method828(var89);
								}
	
								anIntArray2228[var0] = -100;
							}
						} else {
							--anInt2225;
	
							for (var98 = var0; var98 < anInt2225; ++var98) {
								anIntArray2226[var98] = anIntArray2226[1 + var98];
								aClass12Array2230[var98] = aClass12Array2230[var98 + 1];
								anIntArray2227[var98] = anIntArray2227[var98 + 1];
								anIntArray2228[var98] = anIntArray2228[var98 + 1];
								anIntArray2229[var98] = anIntArray2229[var98 + 1];
							}
	
							--var0;
						}
					}
	
					if (aBool2221 && !Class29.method169()) {
						if ((anInt2219 != 0) && (anInt2220 != -1))
							Class2.method19(Class5.aClass94_Sub1_58, anInt2220, 0, anInt2219, false);
	
						aBool2221 = false;
					}
	
					++anInt2193;
					if (anInt2193 > 750)
						Class10.method60();
					else {
						Class124_Sub22_Sub19_Sub3_Sub2 var47;
						for (var0 = -1; var0 < anInt2090; ++var0) {
							if (var0 == -1)
								var98 = 2047;
							else
								var98 = anIntArray2128[var0];
	
							var47 = aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var98];
							if (null != var47)
								Class53.method257(var47);
						}
	
						method606((byte) -63);
	
						for (var0 = -1; var0 < anInt2090; ++var0) {
							if (var0 == -1)
								var98 = 2047;
							else
								var98 = anIntArray2128[var0];
	
							var47 = aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var98];
							if ((var47 != null) && (var47.anInt1685 > 0)) {
								--var47.anInt1685;
								if (var47.anInt1685 == 0)
									var47.aString1683 = null;
							}
						}
	
						for (var0 = 0; var0 < anInt2022; ++var0) {
							var98 = anIntArray2023[var0];
							final Class124_Sub22_Sub19_Sub3_Sub1 var112 = aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var98];
							if ((var112 != null) && (var112.anInt1685 > 0)) {
								--var112.anInt1685;
								if (var112.anInt1685 == 0)
									var112.aString1683 = null;
							}
						}
	
						++anInt2111;
						if (anInt2141 != 0) {
							anInt2089 += 20;
							if (anInt2089 >= 400)
								anInt2141 = 0;
						}
	
						if (Class72.aClass124_Sub17_598 != null) {
							++anInt2010;
							if (anInt2010 >= 15) {
								Def10.settrue(Class72.aClass124_Sub17_598);
								Class72.aClass124_Sub17_598 = null;
							}
						}
	
						final Widget var114 = Class31.aClass124_Sub17_335;
						final Widget var116 = CSD.aClass124_Sub17_1005;
						Class31.aClass124_Sub17_335 = null;
						CSD.aClass124_Sub17_1005 = null;
						wid = null;
						aBool2163 = false;
						aBool2160 = false;
						anInt2205 = 0;
	
						while (Class136.method485() && (anInt2205 < 128))
							if ((prights >= 2) && Class84.aBoolArray676[82]
									&& (Class124_Sub13.anInt1072 == 66)) {
								final String var113 = Class86.method340();
								aClipboard2002.setContents(new StringSelection(var113), (ClipboardOwner) null);
							} else {
								anIntArray2241[anInt2205] = Class124_Sub13.anInt1072;
								anIntArray2059[anInt2205] = Def6.aChar1394;
								++anInt2205;
							}
	
						var2 = anInt2142;
						var11 = Class56_Sub2.anInt1083;
						var4 = Class81.anInt662;
						if (Class89.loadwidget(var2))
							Class42.method214(Def10.widgets[var2], -1, 0, 0, var11,
									var4, 0, 0);
	
						++anInt2067;
	
						while (true) {
							do {
								var91 = (CSD) aClass111_2182.method427();
								if (var91 == null)
									while (true) {
										do {
											var91 = (CSD) aClass111_2139.method427();
											if (null == var91)
												while (true) {
													do {
														var91 = (CSD) aClass111_2181.method427();
														if (null == var91) {
															Class83.method337();
															if (currentWid != null)
																Class20.method94();
	
															if (null != Class32.aClass124_Sub17_343) {
																Def10
																		.settrue(Class32.aClass124_Sub17_343);
																++anInt2133;
																if (Class81.anInt651 == 0) {
																	if (aBool1985) {
																		if ((Class32.aClass124_Sub17_343 == Def9.aClass124_Sub17_1352)
																				&& (anInt2075 != anInt2093)) {
																			w4 = Class32.aClass124_Sub17_343;
																			byte var92 = 0;
																			if ((anInt2036 == 1)
																					&& (w4.anInt1157 == 206))
																				var92 = 1;
	
																			if (w4.anIntArray1269[anInt2075] <= 0)
																				var92 = 0;
	
																			var9 = Class124_Sub22_Sub19_Sub6
																					.method963(w4);
																			var76 = ((var9 >> 29) & 1) != 0;
																			if (var76) {
																				var10 = anInt2093;
																				var33 = anInt2075;
																				w4.anIntArray1269[var33] = w4.anIntArray1269[var10];
																				w4.anIntArray1270[var33] = w4.anIntArray1270[var10];
																				w4.anIntArray1269[var10] = -1;
																				w4.anIntArray1270[var10] = 0;
																			} else if (var92 == 1) {
																				var10 = anInt2093;
																				var33 = anInt2075;
	
																				while (var33 != var10)
																					if (var10 > var33) {
																						w4.idk(var10 - 1,
																								var10);
																						--var10;
																					} else if (var10 < var33) {
																						w4.idk(1 + var10,
																								var10);
																						++var10;
																					}
																			} else
																				w4.idk(anInt2075,
																						anInt2093);
	
																			secbuf
																					.writeOpcode(212);
																			secbuf
																					.writeShortA(anInt2093);
																			secbuf
																					.writeShort(anInt2075);
																			secbuf.readInt(
																					Class32.aClass124_Sub17_343.anInt1284);
																			secbuf
																					.writeByte(var92);
																		}
																	} else if (((anInt2122 == 1)
																			|| Class53.method256(anInt2124 - 1))
																			&& (anInt2124 > 2))
																		Def13.method737(anInt2094,
																				anInt2095);
																	else if (anInt2124 > 0)
																		Class124_Sub13.packet(anInt2094,
																				anInt2095);
	
																	anInt2010 = 10;
																	Class81.anInt650 = 0;
																	Class32.aClass124_Sub17_343 = null;
																} else if ((anInt2133 >= 5)
																		&& ((Class81.anInt652 > (anInt2094 + 5))
																				|| (Class81.anInt652 < (anInt2094
																						- 5))
																				|| (Class81.anInt653 > (5
																						+ anInt2095))
																				|| (Class81.anInt653 < (anInt2095
																						- 5))))
																	aBool1985 = true;
															}
	
															if (Class21.anInt214 != -1) {
																var5 = Class21.anInt214;
																var6 = Class21.anInt222;
																secbuf.writeOpcode(28);
																secbuf.writeByte(5);
																secbuf
																		.writeAShort(var6 + Class95.anInt762);
																secbuf
																		.writeShortA(var5 + Class9.anInt102);
																secbuf
																		.writeByteS(Class84.aBoolArray676[82]
																				? (Class84.aBoolArray676[81] ? 2 : 1)
																				: 0);
																Class21.anInt214 = -1;
																anInt2087 = Class81.anInt658;
																anInt2088 = Class81.anInt655;
																anInt2141 = 1;
																anInt2089 = 0;
																anInt2194 = var5;
																anInt2217 = var6;
															}
	
															if (Class31.aClass124_Sub17_335 != var114) {
																if (null != var114)
																	Def10.settrue(var114);
	
																if (Class31.aClass124_Sub17_335 != null)
																	Def10
																			.settrue(Class31.aClass124_Sub17_335);
															}
	
															if ((var116 != CSD.aClass124_Sub17_1005)
																	&& (anInt2134 == anInt2041)) {
																if (var116 != null)
																	Def10.settrue(var116);
	
																if (null != CSD.aClass124_Sub17_1005)
																	Def10.settrue(
																			CSD.aClass124_Sub17_1005);
															}
	
															if (null != CSD.aClass124_Sub17_1005) {
																if (anInt2041 < anInt2134) {
																	++anInt2041;
																	if (anInt2041 == anInt2134)
																		Def10.settrue(
																				CSD.aClass124_Sub17_1005);
																}
															} else if (anInt2041 > 0)
																--anInt2041;
	
															var5 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690
																	+ anInt2046;
															var6 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697
																	+ anInt2048;
															if (((Class124_Sub11.anInt1046 - var5) < -500)
																	|| ((Class124_Sub11.anInt1046 - var5) > 500)
																	|| ((Class87.anInt689 - var6) < -500)
																	|| ((Class87.anInt689 - var6) > 500)) {
																Class124_Sub11.anInt1046 = var5;
																Class87.anInt689 = var6;
															}
	
															if (var5 != Class124_Sub11.anInt1046)
																Class124_Sub11.anInt1046 += (var5
																		- Class124_Sub11.anInt1046) / 16;
	
															if (var6 != Class87.anInt689)
																Class87.anInt689 += (var6 - Class87.anInt689) / 16;
	
															if ((Class81.anInt651 == 4) && Class7.aBool71) {
																var7 = Class81.anInt653 - anInt2070;
																anInt2068 = var7 * 2;
																anInt2070 = (var7 != -1) && (var7 != 1)
																		? (anInt2070 + Class81.anInt653) / 2
																		: Class81.anInt653;
																var9 = anInt2069 - Class81.anInt652;
																anInt2197 = var9 * 2;
																anInt2069 = (var9 != -1) && (var9 != 1)
																		? (Class81.anInt652 + anInt2069) / 2
																		: Class81.anInt652;
															} else {
																if (Class84.aBoolArray676[96])
																	anInt2197 += (-24 - anInt2197) / 2;
																else if (Class84.aBoolArray676[97])
																	anInt2197 += (24 - anInt2197) / 2;
																else
																	anInt2197 /= 2;
	
																if (Class84.aBoolArray676[98])
																	anInt2068 += (12 - anInt2068) / 2;
																else if (Class84.aBoolArray676[99])
																	anInt2068 += (-12 - anInt2068) / 2;
																else
																	anInt2068 /= 2;
	
																anInt2070 = Class81.anInt653;
																anInt2069 = Class81.anInt652;
															}
	
															anInt2255 = ((anInt2197 / 2)
																	+ anInt2255) & 2047;
															anInt2076 += anInt2068 / 2;
															if (anInt2076 < 128)
																anInt2076 = 128;
	
															if (anInt2076 > 383)
																anInt2076 = 383;
	
															var7 = Class124_Sub11.anInt1046 >> 7;
															var9 = Class87.anInt689 >> 7;
															var10 = Class63.method285(Class124_Sub11.anInt1046,
																	Class87.anInt689, Class134.anInt906);
															var33 = 0;
															if ((var7 > 3) && (var9 > 3) && (var7 < 100)
																	&& (var9 < 100))
																for (var43 = var7 - 4; var43 <= (var7 + 4); ++var43)
																	for (var107 = var9
																			- 4; var107 <= (var9 + 4); ++var107) {
																		var35 = Class134.anInt906;
																		if ((var35 < 3)
																				&& ((Class27.aByteArrayArrayArray285[1][var43][var107]
																						& 2) == 2))
																			++var35;
	
																		var110 = var10
																				- Class27.anIntArrayArrayArray284[var35][var43][var107];
																		if (var110 > var33)
																			var33 = var110;
																	}
	
															var43 = var33 * 192;
															if (var43 > 98048)
																var43 = 98048;
	
															if (var43 < '\u8000')
																var43 = '\u8000';
	
															if (var43 > anInt2187)
																anInt2187 += (var43 - anInt2187) / 24;
															else if (var43 < anInt2187)
																anInt2187 += (var43 - anInt2187) / 80;
	
															if (aBool2231)
																Class66.method294();
	
															for (var5 = 0; var5 < 5; ++var5)
																++anIntArray2236[var5];
	
															CSD.aClass41_1006.method205();
															var5 = ++Class81.anInt648 - 1;
															var7 = Class30.method173();
															if ((var5 > 15000) && (var7 > 15000)) {
																anInt2034 = 250;
																Class81.anInt648 = 14500;
																secbuf.writeOpcode(187);
															}
	
															++anInt2052;
															if (anInt2052 > 500) {
																anInt2052 = 0;
																var9 = (int) (Math.random() * 8.0D);
																if ((var9 & 1) == 1)
																	anInt2046 += anInt2047;
	
																if ((var9 & 2) == 2)
																	anInt2048 += anInt2049;
	
																if ((var9 & 4) == 4)
																	anInt2050 += anInt2051;
															}
	
															if (anInt2046 < -50)
																anInt2047 = 2;
	
															if (anInt2046 > 50)
																anInt2047 = -2;
	
															if (anInt2048 < -55)
																anInt2049 = 2;
	
															if (anInt2048 > 55)
																anInt2049 = -2;
	
															if (anInt2050 < -40)
																anInt2051 = 1;
	
															if (anInt2050 > 40)
																anInt2051 = -1;
	
															++anInt2057;
															if (anInt2057 > 500) {
																anInt2057 = 0;
																var9 = (int) (Math.random() * 8.0D);
																if ((var9 & 1) == 1)
																	anInt2053 += anInt2164;
	
																if ((var9 & 2) == 2)
																	anInt2055 += anInt2207;
															}
	
															if (anInt2053 < -60)
																anInt2164 = 2;
	
															if (anInt2053 > 60)
																anInt2164 = -2;
	
															if (anInt2055 < -20)
																anInt2207 = 1;
	
															if (anInt2055 > 10)
																anInt2207 = -1;
	
															for (Class121_Sub1 var97 = (Class121_Sub1) aClass106_2253
																	.method406(); var97 != null; var97 = (Class121_Sub1) aClass106_2253
																			.method407())
																if (var97.anInt916 < ((Class74.method316(301202106)
																		/ 1000L) - 5L)) {
																	if (var97.aShort915 > 0)
																		client.doCS(5, "",
																				var97.aString914 + " has logged in.");
	
																	if (var97.aShort915 == 0)
																		client.doCS(5, "",
																				var97.aString914 + " has logged out.");
	
																	var97.method447();
																}
	
															++anInt2025;
															if (anInt2025 > 50)
																secbuf.writeOpcode(250);
	
															try {
																if ((null != Class73.out)
																		&& (secbuf.pos > 0)) {
																	Class73.out.write(
																			secbuf.backing,
																			0,
																			secbuf.pos);
																	secbuf.pos = 0;
																	anInt2025 = 0;
																}
															} catch (final IOException var55) {
																Class10.method60();
															}
	
															return;
														}
	
														w2 = var91.aClass124_Sub17_994;
														if (w2.anInt1154 < 0)
															break;
	
														w3 = Class10.getwidget(w2.anInt1259);
													} while ((w3 == null) || (w3.aClass124_Sub17Array1263 == null)
															|| (w2.anInt1154 >= w3.aClass124_Sub17Array1263.length)
															|| (w2 != w3.aClass124_Sub17Array1263[w2.anInt1154]));
	
													client.fullCS(var91);
												}
	
											w2 = var91.aClass124_Sub17_994;
											if (w2.anInt1154 < 0)
												break;
	
											w3 = Class10.getwidget(w2.anInt1259);
										} while ((w3 == null) || (w3.aClass124_Sub17Array1263 == null)
												|| (w2.anInt1154 >= w3.aClass124_Sub17Array1263.length)
												|| (w2 != w3.aClass124_Sub17Array1263[w2.anInt1154]));
	
										client.fullCS(var91);
									}
	
								w2 = var91.aClass124_Sub17_994;
								if (w2.anInt1154 < 0)
									break;
	
								w3 = Class10.getwidget(w2.anInt1259);
							} while ((null == w3) || (null == w3.aClass124_Sub17Array1263)
									|| (w2.anInt1154 >= w3.aClass124_Sub17Array1263.length)
									|| (w2 != w3.aClass124_Sub17Array1263[w2.anInt1154]));
	
							client.fullCS(var91);
						}
					}
				}
			}
		}
	}

	static final byte[] unpackBlock(final byte[] block) {
		final RSBuf var1 = new RSBuf(block);
		final int header = var1.readByteU();
		final int decomsize = var1.readInt2(-1862637362);
		try {
			if ((decomsize >= 0) && ((CacheArch.expectS == 0) || (decomsize <= CacheArch.expectS))) {
				if (header == 0) {
					final byte[] de = new byte[decomsize];
					var1.readReverse(de, 0, decomsize);
					return de;
				} else {
					final int compressedSize = var1.readInt2(33253765);
					if (compressedSize < 0 || compressedSize > 1000000 || CacheArch.expectS != 0 && compressedSize > CacheArch.expectS) {
						System.err.printf("bad xtea decrypt %n");
						return new byte[100]; // MUST BE 100
					}
					if ((compressedSize >= 0) && ((CacheArch.expectS == 0) || (compressedSize <= CacheArch.expectS))) {
						final byte[] uncom = new byte[compressedSize];
						if (header == 1)
							Class52.bziprequest(uncom, compressedSize, block, decomsize, 9);
						else
							CacheArch.decompressor.decompress(var1, uncom);
						//System.out.println("unpack type "+header);
						return uncom;
					} else {
						System.err.printf("bad xtea decrypt %n");
						return null; // MUST BE NULL YOU SLUT
						//throw new RuntimeException();
					}
				}
			} else {
				//return new byte[100];
				throw new RuntimeException();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static void showMsg(final String var0, final String var1, final String var2) {
		Class4.aString41 = var0;
		Class4.aString32 = var1;
		Class4.aString47 = var2;
	}

	static final void mapregion(final boolean var0) {
		create = var0;
		int var1;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var12;
		if (!create) {
			var2 = buf.readUShortLE();
			var4 = buf.readUShortLE();
			var5 = (expected - buf.pos) / 16;
			Def10.anIntArrayArray1466 = new int[var5][4];
	
			for (var7 = 0; var7 < var5; ++var7)
				for (var8 = 0; var8 < 4; ++var8)
					Def10.anIntArrayArray1466[var7][var8] = buf
							.readInt2(-562334951);
	
			var7 = buf.readByteU();
			var8 = buf.readShortU();
			var6 = buf.readShortS();
			Class124_Sub22_Sub19_Sub6.anIntArray1822 = new int[var5];
			Class10.xteaM = new int[var5];
			Def9.xteaL = new int[var5];
			Class124_Sub18.xteaMdata = new byte[var5][];
			Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata = new byte[var5][];
			boolean var3 = false;
			if ((((var4 / 8) == 48) || ((var4 / 8) == 49)) && ((var6 / 8) == 48))
				var3 = true;
	
			if (((var4 / 8) == 48) && ((var6 / 8) == 148))
				var3 = true;
	
			var5 = 0;
	
			for (var12 = (var4 - 6) / 8; var12 <= ((var4 + 6) / 8); ++var12)
				for (var1 = (var6 - 6) / 8; var1 <= ((var6 + 6) / 8); ++var1) {
					var9 = (var12 << 8) + var1;
					if (!var3 || ((var1 != 49) && (var1 != 149) && (var1 != 147) && (var12 != 50)
							&& ((var12 != 49) || (var1 != 47)))) {
						Class124_Sub22_Sub19_Sub6.anIntArray1822[var5] = var9;
						Class10.xteaM[var5] = Class125.aClass94_Sub1_883.of("m" + var12 + "_" + var1);
						Def9.xteaL[var5] = Class125.aClass94_Sub1_883
								.of("l" + var12 + "_" + var1);
						++var5;
					}
				}
	
			Class124_Sub22_Sub21.method882(var4, var6, var7, var2, var8);
		} else {
			buf.tempbit();
	
			for (var2 = 0; var2 < 4; ++var2)
				for (var4 = 0; var4 < 13; ++var4)
					for (var5 = 0; var5 < 13; ++var5) {
						var7 = buf.clever(1);
						if (var7 == 1)
							anIntArrayArrayArray1994[var2][var4][var5] = buf
									.clever(26);
						else
							anIntArrayArrayArray1994[var2][var4][var5] = -1;
					}
	
			buf.bitinit();
			var2 = (expected - buf.pos) / 16;
			Def10.anIntArrayArray1466 = new int[var2][4];
	
			for (var4 = 0; var4 < var2; ++var4)
				for (var5 = 0; var5 < 4; ++var5)
					Def10.anIntArrayArray1466[var4][var5] = buf.readIntV2();
	
			var4 = buf.readShortS();
			var5 = buf.readShortU();
			var7 = buf.readByteU();
			var8 = buf.readShortS();
			var6 = buf.readShortU();
			Class124_Sub22_Sub19_Sub6.anIntArray1822 = new int[var2];
			Class10.xteaM = new int[var2];
			Def9.xteaL = new int[var2];
			Class124_Sub18.xteaMdata = new byte[var2][];
			Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata = new byte[var2][];
			var2 = 0;
	
			for (int var16 = 0; var16 < 4; ++var16)
				for (var12 = 0; var12 < 13; ++var12)
					for (var1 = 0; var1 < 13; ++var1) {
						var9 = anIntArrayArrayArray1994[var16][var12][var1];
						if (var9 != -1) {
							final int var14 = (var9 >> 14) & 1023;
							final int var15 = (var9 >> 3) & 2047;
							int var13 = ((var14 / 8) << 8) + (var15 / 8);
	
							int var10;
							for (var10 = 0; var10 < var2; ++var10)
								if (Class124_Sub22_Sub19_Sub6.anIntArray1822[var10] == var13) {
									var13 = -1;
									break;
								}
	
							if (var13 != -1) {
								Class124_Sub22_Sub19_Sub6.anIntArray1822[var2] = var13;
								var10 = (var13 >> 8) & 255;
								final int var11 = var13 & 255;
								Class10.xteaM[var2] = Class125.aClass94_Sub1_883
										.of("m" + var10 + "_" + var11);
								Def9.xteaL[var2] = Class125.aClass94_Sub1_883
										.of("l" + var10 + "_" + var11);
								++var2;
							}
						}
					}
	
			Class124_Sub22_Sub21.method882(var4, var6, var7, var8, var5);
		}
	
	}

	static final int method514(final Class117 var0) {
		if (var0 == null)
			return 12;
		else
			switch (var0.anInt842) {
			case 2:
				return 20;
			default:
				return 12;
			}
	}

	static int method513(final int var0, final byte var1) {
		final Class124_Sub22_Sub5 var2 = (Class124_Sub22_Sub5) Class47.aClass116_474.method438(var0);
		return var2 != null ? (Class47.aClass119_469.aClass124_Sub22_847 == var2.aClass124_Sub22_1303 ? -1
				: ((Class124_Sub22_Sub5) var2.aClass124_Sub22_1303).anInt1383) : -1;
	}

	public static void setNotLoaded(final int var0, final int var1) {
		if (var0 != -1)
			if (Widget.widgetLoaded[var0]) {
				Widget.aClass94_1145.method374(var0);
				if (Def10.widgets[var0] != null) {
					boolean var3 = true;
	
					for (int var2 = 0; var2 < Def10.widgets[var0].length; ++var2)
						if (null != Def10.widgets[var0][var2])
							if (Def10.widgets[var0][var2].anInt1191 != 2)
								Def10.widgets[var0][var2] = null;
							else
								var3 = false;
	
					if (var3)
						Def10.widgets[var0] = null;
	
					Widget.widgetLoaded[var0] = false;
				}
			}
	}

	static final String[] method517(final String[] var0) {
		final String[] var1 = new String[5];
	
		for (int var2 = 0; var2 < 5; ++var2) {
			var1[var2] = var2 + ": ";
			if ((null != var0) && (null != var0[var2]))
				var1[var2] = var1[var2] + var0[var2];
		}
	
		return var1;
	}

	static void forstep(final int var0) {
		if (anInt1992 != var0) {
			if (anInt1992 == 0) {
				Class46.anImage456 = null;
				Class41.aFont406 = null;
				Class4.aFontMetrics53 = null;
			}
	
			if ((var0 == 20) || (var0 == 40) || (var0 == 45)) {
				loginStep = 0;
				anInt1999 = 0;
				anInt2018 = 0;
			}
	
			if ((var0 != 20) && (var0 != 40) && (Class124_Sub22_Sub19_Sub1.aClass78_1662 != null)) {
				Class124_Sub22_Sub19_Sub1.aClass78_1662.method324();
				Class124_Sub22_Sub19_Sub1.aClass78_1662 = null;
			}
	
			if (anInt1992 == 25) {
				anInt2113 = 0;
				anInt2037 = 0;
				anInt2038 = 1;
				anInt2039 = 0;
				anInt2040 = 1;
			}
	
			if ((var0 != 5) && (var0 != 10)) {
				if (var0 == 20)
					Def3.method654(aCanvas990, Class124_Sub22_Sub20.aClass94_Sub1_1647,
							Class124_Sub11.aClass94_Sub1_1047, true, anInt1992 == 11 ? 4 : 0);
				else if (var0 == 11)
					Def3.method654(aCanvas990, Class124_Sub22_Sub20.aClass94_Sub1_1647,
							Class124_Sub11.aClass94_Sub1_1047, false, 4);
				else if (Class4.aBool55) {
					Class4.aClass124_Sub22_Sub16_Sub2_42 = null;
					Class4.aClass124_Sub22_Sub16_Sub2_24 = null;
					Class4.aClass124_Sub22_Sub16_Sub2Array25 = null;
					Class4.aClass124_Sub22_Sub16_Sub1_40 = null;
					Class4.aClass124_Sub22_Sub16_Sub1_27 = null;
					Class4.aClass124_Sub22_Sub16_Sub2_28 = null;
					Class5.aClass124_Sub22_Sub16_Sub2Array59 = null;
					Class89.aClass124_Sub22_Sub16_Sub2_706 = null;
					Class4.aClass124_Sub22_Sub16_Sub2_29 = null;
					Class45.aClass124_Sub22_Sub16_Sub1Array448 = null;
					Class4.aClass124_Sub22_Sub16_Sub2Array51 = null;
					Class78.aClass124_Sub22_Sub16_Sub2Array635 = null;
					Class10.aClass124_Sub22_Sub16_Sub2Array109 = null;
					CacheArch.aClass124_Sub22_Sub16_Sub2_759 = null;
					Class4.anIntArray46 = null;
					InvIdk.anIntArray1013 = null;
					Def5.anIntArray1453 = null;
					Class42.anIntArray427 = null;
					Class124_Sub22_Sub19_Sub1.anIntArray1661 = null;
					Class43.anIntArray432 = null;
					Class124_Sub10.anIntArray1032 = null;
					Class4.anIntArray34 = null;
					Class76.method318(2);
					Class81.method328(true);
					Class4.aBool55 = false;
				}
			} else
				Def3.method654(aCanvas990, Class124_Sub22_Sub20.aClass94_Sub1_1647,
						Class124_Sub11.aClass94_Sub1_1047, true, 0);
	
			anInt1992 = var0;
		}
	}

	static final void method844(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		final int var6 = (2048 - var3) & 2047;
		final int var13 = (2048 - var4) & 2047;
		int var12 = 0;
		int var9 = 0;
		int var7 = var5;
		int var8;
		int var10;
		int var11;
		if (var6 != 0) {
			var10 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var6];
			var8 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var6];
			var11 = ((var8 * var9) - (var5 * var10)) >> 16;
			var7 = ((var9 * var10) + (var5 * var8)) >> 16;
			var9 = var11;
		}
	
		if (var13 != 0) {
			var10 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var13];
			var8 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var13];
			var11 = ((var8 * var12) + (var10 * var7)) >> 16;
			var7 = ((var7 * var8) - (var10 * var12)) >> 16;
			var12 = var11;
		}
	
		Class45.anInt445 = var0 - var12;
		Class2.anInt14 = var1 - var9;
		Class48.anInt479 = var2 - var7;
		CSD.anInt1003 = var3;
		Class27.anInt301 = var4;
	}

	static final int method841() {
		if (Class57.aClass22_538.aBool248)
			return Class134.anInt906;
		else {
			final int var0 = Class63.method285(Class45.anInt445, Class48.anInt479, Class134.anInt906);
			return ((var0 - Class2.anInt14) < 800)
					&& ((Class27.aByteArrayArrayArray285[Class134.anInt906][Class45.anInt445 >> 7][Class48.anInt479 >> 7]
							& 4) != 0) ? Class134.anInt906 : 3;
		}
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
			final int var16 = Def10.method714(var2 - 1);
	
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
		Class31.method182(client.aCanvas990);
		final Canvas var2 = client.aCanvas990;
		var2.removeMouseListener(Class81.aClass81_649);
		var2.removeMouseMotionListener(Class81.aClass81_649);
		var2.removeFocusListener(Class81.aClass81_649);
		Class81.anInt663 = 0;
		if (null != Class47.aClass66_473)
			Class47.aClass66_473.method290(client.aCanvas990, (byte) -67);
	
		Class80.aclient645.method1050();
		client.aCanvas990.setBackground(Color.black);
		final Canvas var1 = client.aCanvas990;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(Class84.aClass84_683);
		var1.addFocusListener(Class84.aClass84_683);
		Class82.method329(client.aCanvas990);
		if (null != Class47.aClass66_473)
			Class47.aClass66_473.method293(client.aCanvas990, (byte) 123);
	
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

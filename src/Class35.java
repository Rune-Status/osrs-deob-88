public class Class35 {
	String aString372;
	String aString373;
	static int anInt374;
	static int anInt375;

	static final void method189(final Widget[] var0, final int var1) {
		for (final Widget var4 : var0) {
			if (var4 != null) {
				if (var4.anInt1191 == 0) {
					if (null != var4.aClass124_Sub17Array1263)
						method189(var4.aClass124_Sub17Array1263, var1);

					final Class124_Sub7 var3 = (Class124_Sub7) client.aClass107_2143.method409(var4.anInt1284);
					if (null != var3)
						Class3.method23(var3.anInt1012, var1);
				}

				Class124_Sub6 var5;
				if ((var1 == 0) && (var4.anObjectArray1258 != null)) {
					var5 = new Class124_Sub6();
					var5.aClass124_Sub17_994 = var4;
					var5.anObjectArray995 = var4.anObjectArray1258;
					Class124_Sub22_Sub19_Sub3_Sub2.method1048(var5);
				}

				if ((var1 == 1) && (var4.anObjectArray1247 != null)) {
					if (var4.anInt1154 >= 0) {
						final Widget var6 = Class10.method55(var4.anInt1284);
						if ((null == var6) || (null == var6.aClass124_Sub17Array1263)
								|| (var4.anInt1154 >= var6.aClass124_Sub17Array1263.length)
								|| (var6.aClass124_Sub17Array1263[var4.anInt1154] != var4))
							continue;
					}

					var5 = new Class124_Sub6();
					var5.aClass124_Sub17_994 = var4;
					var5.anObjectArray995 = var4.anObjectArray1247;
					Class124_Sub22_Sub19_Sub3_Sub2.method1048(var5);
				}
			}
		}

	}

	static final void method190(final String var0, final boolean var1) {
		if (var0 != null)
			if (((client.anInt2252 < 100) || (client.anInt2107 == 1)) && (client.anInt2252 < 400)) {
				final String var3 = Class34.method186(var0, Class49.aClass117_488);
				if (null != var3) {
					String var2;
					int var4;
					String var6;
					for (var4 = 0; var4 < client.anInt2252; ++var4) {
						final Class35 var5 = client.aClass35Array1986[var4];
						var2 = Class34.method186(var5.aString372, Class49.aClass117_488);
						if ((null != var2) && var2.equals(var3)) {
							Class20.method95(31, "", var0 + " is already on your ignore list");
							return;
						}

						if (var5.aString373 != null) {
							var6 = Class34.method186(var5.aString373, Class49.aClass117_488);
							if ((var6 != null) && var6.equals(var3)) {
								Class20.method95(31, "", var0 + " is already on your ignore list");
								return;
							}
						}
					}

					for (var4 = 0; var4 < client.anInt2056; ++var4) {
						final Class32 var7 = client.aClass32Array2098[var4];
						var2 = Class34.method186(var7.aString344, Class49.aClass117_488);
						if ((var2 != null) && var2.equals(var3)) {
							Class20.method95(31, "", "Please remove " + var0 + " from your friend list first");
							return;
						}

						if (null != var7.aString338) {
							var6 = Class34.method186(var7.aString338, Class49.aClass117_488);
							if ((null != var6) && var6.equals(var3)) {
								Class20.method95(31, "", "Please remove " + var0 + " from your friend list first");
								return;
							}
						}
					}

					if (Class34
							.method186(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956, Class49.aClass117_488)
							.equals(var3))
						Class20.method95(31, "", "You can\'t add yourself to your own ignore list");
					else {
						client.aClass124_Sub14_Sub1_2024.method837(67);
						client.aClass124_Sub14_Sub1_2024.writeByte(Class54.method258(var0));
						client.aClass124_Sub14_Sub1_2024.writestr(var0);
					}
				}
			} else
				Class20.method95(31, "", "Your ignore list is full. Max of 100 for free users, and 400 for members");
	}

	static final void method191(final Class124_Sub4 var0) {
		var0.aBool960 = false;
		if (var0.aClass124_Sub2_962 != null)
			var0.aClass124_Sub2_962.anInt925 = 0;

		for (Class124_Sub4 var1 = var0.method505(); null != var1; var1 = var0.method509())
			method191(var1);

	}

	static final void method192(final int var0, final Class124_Sub22_Sub19_Sub3_Sub2 var1, final int var2) {
		int var3;
		int var4;
		if ((var2 & 256) != 0) {
			var3 = client.aClass124_Sub14_Sub1_2026.readShortU();
			var4 = client.aClass124_Sub14_Sub1_2026.method604();
			var1.method894(var3, var4, client.anInt2158);
			var1.anInt1691 = 300 + client.anInt2158;
			var1.anInt1692 = client.aClass124_Sub14_Sub1_2026.readByteU();
			var1.anInt1693 = client.aClass124_Sub14_Sub1_2026.method594();
		}

		if ((var2 & 1) != 0) {
			var1.anInt1671 = client.aClass124_Sub14_Sub1_2026.method582();
			var1.anInt1728 = client.aClass124_Sub14_Sub1_2026.method583();
		}

		if ((var2 & 2) != 0) {
			var3 = client.aClass124_Sub14_Sub1_2026.method583();
			if (var3 == '\uffff')
				var3 = -1;

			var4 = client.aClass124_Sub14_Sub1_2026.method604();
			Class45.method226(var1, var3, var4);
		}

		if ((var2 & 512) != 0) {
			var1.anInt1709 = client.aClass124_Sub14_Sub1_2026.method604();
			var1.anInt1711 = client.aClass124_Sub14_Sub1_2026.readByteU();
			var1.anInt1720 = client.aClass124_Sub14_Sub1_2026.method594();
			var1.anInt1702 = client.aClass124_Sub14_Sub1_2026.readByteN();
			var1.anInt1713 = client.aClass124_Sub14_Sub1_2026.readShortU() + client.anInt2158;
			var1.anInt1714 = client.aClass124_Sub14_Sub1_2026.method583() + client.anInt2158;
			var1.anInt1715 = client.aClass124_Sub14_Sub1_2026.method594();
			var1.anInt1721 = 1;
			var1.anInt1726 = 0;
		}

		if ((var2 & 1024) != 0) {
			var1.anInt1710 = client.aClass124_Sub14_Sub1_2026.readShortU();
			var3 = client.aClass124_Sub14_Sub1_2026.getIntv1();
			var1.anInt1678 = var3 >> 16;
			var1.anInt1707 = (var3 & '\uffff') + client.anInt2158;
			var1.anInt1705 = 0;
			var1.anInt1706 = 0;
			if (var1.anInt1707 > client.anInt2158)
				var1.anInt1705 = -1;

			if (var1.anInt1710 == '\uffff')
				var1.anInt1710 = -1;
		}

		if ((var2 & 32) != 0) {
			var3 = client.aClass124_Sub14_Sub1_2026.method583();
			final Class74[] var10 = new Class74[] { Class74.aClass74_612, Class74.aClass74_613, Class74.aClass74_617,
					Class74.aClass74_616, Class74.aClass74_611 };
			final Class74 var7 = (Class74) Class23.method158(var10, client.aClass124_Sub14_Sub1_2026.method604());
			final boolean var11 = client.aClass124_Sub14_Sub1_2026.method604() == 1;
			final int var5 = client.aClass124_Sub14_Sub1_2026.readByteN();
			final int var6 = client.aClass124_Sub14_Sub1_2026.pos;
			if ((null != var1.aString1956) && (var1.aClass100_1943 != null)) {
				boolean var12 = false;
				if (var7.aBool615 && Class1.method12(var1.aString1956))
					var12 = true;

				if (!var12 && (client.anInt2099 == 0) && !var1.aBool1960) {
					client.aClass124_Sub14_2146.pos = 0;
					client.aClass124_Sub14_Sub1_2026.readReverse(client.aClass124_Sub14_2146.backing, 0, var5);
					client.aClass124_Sub14_2146.pos = 0;
					final String var9 = Class124_Sub22_Sub16_Sub4.method1031(Class124_Sub22_Sub19_Sub1
							.method886(RuntimeException_Sub1.method1013(client.aClass124_Sub14_2146)));
					var1.aString1683 = var9.trim();
					var1.anInt1686 = var3 >> 8;
					var1.anInt1696 = var3 & 255;
					var1.anInt1685 = 150;
					var1.aBool1670 = var11;
					var1.aBool1684 = (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246 != var1) && var7.aBool615
							&& ("" != client.aString2202) && (var9.toLowerCase().indexOf(client.aString2202) == -1);
					int var8;
					if (var7.aBool618)
						var8 = var11 ? 91 : 1;
					else
						var8 = var11 ? 90 : 2;

					if (var7.anInt614 != -1)
						Class20.method95(var8, Class99.method391(var7.anInt614) + var1.aString1956, var9);
					else
						Class20.method95(var8, var1.aString1956, var9);
				}
			}

			client.aClass124_Sub14_Sub1_2026.pos = var5 + var6;
		}

		if ((var2 & 64) != 0) {
			var1.aString1683 = client.aClass124_Sub14_Sub1_2026.readStr2();
			if (var1.aString1683.charAt(0) == 126) {
				var1.aString1683 = var1.aString1683.substring(1);
				Class20.method95(2, var1.aString1956, var1.aString1683);
			} else if (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246 == var1)
				Class20.method95(2, var1.aString1956, var1.aString1683);

			var1.aBool1670 = false;
			var1.anInt1686 = 0;
			var1.anInt1696 = 0;
			var1.anInt1685 = 150;
		}

		if ((var2 & 8) != 0) {
			var3 = client.aClass124_Sub14_Sub1_2026.method604();
			final byte[] var14 = new byte[var3];
			final RSBuf var13 = new RSBuf(var14);
			client.aClass124_Sub14_Sub1_2026.method591(var14, 0, var3);
			client.aClass124_Sub14Array2256[var0] = var13;
			var1.method1044(var13);
		}

		if ((var2 & 16) != 0) {
			var1.anInt1694 = client.aClass124_Sub14_Sub1_2026.readShortU();
			if (var1.anInt1694 == '\uffff')
				var1.anInt1694 = -1;
		}

		if ((var2 & 128) != 0) {
			var3 = client.aClass124_Sub14_Sub1_2026.method583();
			var4 = client.aClass124_Sub14_Sub1_2026.readByteU();
			var1.method894(var3, var4, client.anInt2158);
			var1.anInt1691 = client.anInt2158 + 300;
			var1.anInt1692 = client.aClass124_Sub14_Sub1_2026.method604();
			var1.anInt1693 = client.aClass124_Sub14_Sub1_2026.readByteU();
		}

	}

	static Class94_Sub1 method193(final int var0, final boolean var1, final boolean var2, final boolean var3) {
		Class69 var4 = null;
		if (null != Class73.aClass132_605)
			var4 = new Class69(var0, Class73.aClass132_605, Class73.aClass132Array604[var0], 1000000);

		return new Class94_Sub1(var4, Class124_Sub22_Sub20.aClass69_1642, var0, var1, var2, var3);
	}

	static final void method194(final Widget var0, final int var1, final int var2) {
		if ((client.aClass124_Sub17_2155 == null) && !client.aBool2240)
			if ((var0 != null) && (Class41.method212(var0) != null)) {
				client.aClass124_Sub17_2155 = var0;
				client.aClass124_Sub17_2199 = Class41.method212(var0);
				client.anInt2157 = var1;
				client.anInt2145 = var2;
				anInt375 = 0;
				client.aBool2233 = false;
				if (client.anInt2124 > 0)
					Class20.method93(client.anInt2124 - 1);

			}
	}
}

public final class Class124_Sub22_Sub19_Sub3_Sub2 extends Class124_Sub22_Sub19_Sub3 {
	int anInt1947;
	int anInt1948;
	int anInt1950;
	int anInt1952;
	static Class124_Sub22_Sub16_Sub1 aClass124_Sub22_Sub16_Sub1_1954;
	int anInt1955;
	int anInt1957;
	int anInt1961;
	int anInt1962;
	int anInt1944 = -1;
	int anInt1945 = -1;
	int anInt1959 = 0;
	String aString1956;
	int anInt1946 = 0;
	int anInt1951 = 0;
	boolean aBool1960 = false;
	Class100 aClass100_1943;
	Class124_Sub22_Sub19_Sub7 aClass124_Sub22_Sub19_Sub7_1953;
	int anInt1942 = 0;
	int anInt1949 = 0;
	boolean aBool1958 = false;

	final void method1044(final RSBuf var1) {
		var1.pos = 0;
		final int var9 = var1.readByteU();
		anInt1944 = var1.readByte();
		anInt1945 = var1.readByte();
		int var2 = -1;
		anInt1959 = 0;
		final int[] var3 = new int[12];

		int var5;
		int var6;
		for (int var4 = 0; var4 < 12; ++var4) {
			var5 = var1.readByteU();
			if (var5 == 0)
				var3[var4] = 0;
			else {
				var6 = var1.readByteU();
				var3[var4] = (var5 << 8) + var6;
				if ((var4 == 0) && (var3[0] == '\uffff')) {
					var2 = var1.readShortU();
					break;
				}

				if (var3[var4] >= 512) {
					final int var7 = Def10.method724(var3[var4] - 512).anInt1501;
					if (var7 != 0)
						anInt1959 = var7;
				}
			}
		}

		final int[] var8 = new int[5];

		for (var5 = 0; var5 < 5; ++var5) {
			var6 = var1.readByteU();
			if ((var6 < 0) || (var6 >= Class100.aShortArrayArray783[var5].length))
				var6 = 0;

			var8[var5] = var6;
		}

		anInt1719 = var1.readShortU();
		if (anInt1719 == '\uffff')
			anInt1719 = -1;

		anInt1676 = var1.readShortU();
		if (anInt1676 == '\uffff')
			anInt1676 = -1;

		anInt1677 = anInt1676;
		anInt1712 = var1.readShortU();
		if (anInt1712 == '\uffff')
			anInt1712 = -1;

		anInt1679 = var1.readShortU();
		if (anInt1679 == '\uffff')
			anInt1679 = -1;

		anInt1680 = var1.readShortU();
		if (anInt1680 == '\uffff')
			anInt1680 = -1;

		anInt1681 = var1.readShortU();
		if (anInt1681 == '\uffff')
			anInt1681 = -1;

		anInt1682 = var1.readShortU();
		if (anInt1682 == '\uffff')
			anInt1682 = -1;

		aString1956 = var1.readStr2();
		if (this == Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246)
			RuntimeException_Sub1.aString1911 = aString1956;

		anInt1946 = var1.readByteU();
		anInt1951 = var1.readShortU();
		aBool1960 = var1.readByteU() == 1;
		if ((client.anInt2080 == 0) && (client.anInt2149 >= 2))
			aBool1960 = false;

		if (aClass100_1943 == null)
			aClass100_1943 = new Class100();

		aClass100_1943.method394(var3, var8, var9 == 1, var2);
	}

	@Override
	protected final Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		if (aClass100_1943 == null)
			return null;
		else {
			final Def12 var3 = (anInt1699 != -1) && (anInt1673 == 0)
					? Def15.method750(anInt1699) : null;
			final Def12 var5 = (anInt1675 != -1) && !aBool1958
					&& ((anInt1719 != anInt1675) || (var3 == null)) ? Def15.method750(anInt1675) : null;
			Class124_Sub22_Sub19_Sub7 var2 = aClass100_1943.method399(var3, anInt1700, var5, anInt1695);
			if (null == var2)
				return null;
			else {
				var2.method989();
				anInt1717 = var2.anInt1605;
				Class124_Sub22_Sub19_Sub7 var4;
				Class124_Sub22_Sub19_Sub7[] var6;
				if (!aBool1958 && (anInt1710 != -1) && (anInt1705 != -1)) {
					var4 = Class43.method217(anInt1710).method733(anInt1705);
					if (var4 != null) {
						var4.method997(0, -anInt1678, 0);
						var6 = new Class124_Sub22_Sub19_Sub7[] { var2, var4 };
						var2 = new Class124_Sub22_Sub19_Sub7(var6, 2);
					}
				}

				if (!aBool1958 && (null != aClass124_Sub22_Sub19_Sub7_1953)) {
					if (client.anInt2158 >= anInt1949)
						aClass124_Sub22_Sub19_Sub7_1953 = null;

					if ((client.anInt2158 >= anInt1942) && (client.anInt2158 < anInt1949)) {
						var4 = aClass124_Sub22_Sub19_Sub7_1953;
						var4.method997(anInt1961 - anInt1690, anInt1950 - anInt1948, anInt1952 - anInt1697);
						if (anInt1718 == 512) {
							var4.method994();
							var4.method994();
							var4.method994();
						} else if (anInt1718 == 1024) {
							var4.method994();
							var4.method994();
						} else if (anInt1718 == 1536)
							var4.method994();

						var6 = new Class124_Sub22_Sub19_Sub7[] { var2, var4 };
						var2 = new Class124_Sub22_Sub19_Sub7(var6, 2);
						if (anInt1718 == 512)
							var4.method994();
						else if (anInt1718 == 1024) {
							var4.method994();
							var4.method994();
						} else if (anInt1718 == 1536) {
							var4.method994();
							var4.method994();
							var4.method994();
						}

						var4.method997(anInt1690 - anInt1961, anInt1948 - anInt1950, anInt1697 - anInt1952);
					}
				}

				var2.aBool1861 = true;
				return var2;
			}
		}
	}

	public static void method1045(final int var0) {
		if (Class81.aClass81_649 != null) {
			final Class81 var1 = Class81.aClass81_649;
			synchronized (var1) {
				Class81.aClass81_649 = null;
			}
		}

	}

	@Override
	final boolean method895(final int var1) {
		return aClass100_1943 != null;
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
			if (var1 < client.anInt2090) {
				var7 = 30;
				final Class124_Sub22_Sub19_Sub3_Sub2 var6 = (Class124_Sub22_Sub19_Sub3_Sub2) var0;
				if (var6.aBool1960)
					return;

				if ((var6.anInt1944 != -1) || (var6.anInt1945 != -1)) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
					if (client.anInt2085 > -1) {
						if (var6.anInt1944 != -1) {
							Class9.aClass124_Sub22_Sub16_Sub1Array101[var6.anInt1944]
									.method907((var2 + client.anInt2085) - 12, (client.anInt2152 + var3) - var7);
							var7 += 25;
						}

						if (var6.anInt1945 != -1) {
							Def12.aClass124_Sub22_Sub16_Sub1Array1547[var6.anInt1945]
									.method907((var2 + client.anInt2085) - 12, (var3 + client.anInt2152) - var7);
							var7 += 25;
						}
					}
				}

				if ((var1 >= 0) && (client.anInt2171 == 10) && (client.anInt2004 == client.anIntArray2128[var1])) {
					Class124_Sub22_Sub19_Sub5.method954(var0, 15 + var0.anInt1717);
					if (client.anInt2085 > -1)
						Def3.aClass124_Sub22_Sub16_Sub1Array1364[1]
								.method907((var2 + client.anInt2085) - 12, (var3 + client.anInt2152) - var7);
				}
			} else {
				var4 = ((Class124_Sub22_Sub19_Sub3_Sub1) var0).aClass124_Sub22_Sub1_1941;
				if (null != var4.anIntArray1342)
					var4 = var4.method644();

				if ((var4.anInt1322 >= 0)
						&& (var4.anInt1322 < Def12.aClass124_Sub22_Sub16_Sub1Array1547.length)) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
					if (client.anInt2085 > -1)
						Def12.aClass124_Sub22_Sub16_Sub1Array1547[var4.anInt1322]
								.method907((var2 + client.anInt2085) - 12, (var3 + client.anInt2152) - 30);
				}

				if ((client.anInt2171 == 1) && (client.anIntArray2023[var1 - client.anInt2090] == client.anInt2003)
						&& ((client.anInt2158 % 20) < 10)) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
					if (client.anInt2085 > -1)
						Def3.aClass124_Sub22_Sub16_Sub1Array1364[0]
								.method907((var2 + client.anInt2085) - 12, (var3 + client.anInt2152) - 28);
				}
			}

			if ((null != var0.aString1683) && ((var1 >= client.anInt2090)
					|| (!var0.aBool1684 && ((client.anInt2066 == 4) || (!var0.aBool1670 && ((client.anInt2066 == 0)
							|| (client.anInt2066 == 3) || ((client.anInt2066 == 1) && Def6
									.method691(((Class124_Sub22_Sub19_Sub3_Sub2) var0).aString1956, false)))))))) {
				Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717);
				if ((client.anInt2085 > -1) && (client.anInt2074 < client.anInt2116)) {
					client.anIntArray2103[client.anInt2074] = Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407
							.method1018(var0.aString1683) / 2;
					client.anIntArray2078[client.anInt2074] = Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.anInt1934;
					client.anIntArray2033[client.anInt2074] = client.anInt2085;
					client.anIntArray2077[client.anInt2074] = client.anInt2152;
					client.anIntArray2119[client.anInt2074] = var0.anInt1686;
					client.anIntArray2081[client.anInt2074] = var0.anInt1696;
					client.anIntArray1982[client.anInt2074] = var0.anInt1685;
					client.aStringArray2243[client.anInt2074] = var0.aString1683;
					++client.anInt2074;
				}
			}

			if (var0.anInt1691 > client.anInt2158) {
				Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 + 15);
				if (client.anInt2085 > -1) {
					if (var1 < client.anInt2090)
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

					Class124_Sub22_Sub16.method768((var2 + client.anInt2085) - (var7 / 2),
							(client.anInt2152 + var3) - 3, var5, 5, '\uff00');
					Class124_Sub22_Sub16.method768(var5 + ((client.anInt2085 + var2) - (var7 / 2)),
							(client.anInt2152 + var3) - 3, var7 - var5, 5, 16711680);
				}
			}

			for (var7 = 0; var7 < 4; ++var7)
				if (var0.anIntArray1688[var7] > client.anInt2158) {
					Class124_Sub22_Sub19_Sub5.method954(var0, var0.anInt1717 / 2);
					if (client.anInt2085 > -1) {
						if (var7 == 1)
							client.anInt2152 -= 20;

						if (var7 == 2) {
							client.anInt2085 -= 15;
							client.anInt2152 -= 10;
						}

						if (var7 == 3) {
							client.anInt2085 += 15;
							client.anInt2152 -= 10;
						}

						Class75.aClass124_Sub22_Sub16_Sub1Array619[var0.anIntArray1689[var7]]
								.method907((var2 + client.anInt2085) - 12, (client.anInt2152 + var3) - 12);
						Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260.method1021(
								Integer.toString(var0.anIntArray1727[var7]), (var2 + client.anInt2085) - 1,
								3 + var3 + client.anInt2152, 16777215, 0);
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

				if (((var5 - 64) <= var4.anInt1062) && (client.anInt2206 != 0) && (var0 == var4.anInt1057)) {
					var5 -= 64;
					if (var5 < 0)
						var5 = 0;

					final int var6 = (client.anInt2206 * (var4.anInt1062 - var5)) / var4.anInt1062;
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

	static void method1048(final Class124_Sub6 var0) {
		Class124_Sub22_Sub5.method676(var0, 200000);
	}
}

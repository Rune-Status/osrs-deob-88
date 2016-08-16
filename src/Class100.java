public class Class100 {
	public static short[] aShortArray782;
	public static short[][] aShortArrayArray783;
	public static short[][] aShortArrayArray784;
	int[] anIntArray785;
	int[] anIntArray778;
	public boolean aBool779;
	int anInt780;
	long aLong781;
	long aLong787;
	static int[] anIntArray777 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	static Class113 aClass113_786 = new Class113(260);

	public void method393(final boolean var1) {
		if (var1 != aBool779)
			method394((int[]) null, anIntArray778, var1, -1);
	}

	public void method394(int[] var1, final int[] var2, final boolean var3, final int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5)
				for (int var6 = 0; var6 < Applet_Sub1.anInt1980; ++var6) {
					final Def3 var7 = Class84.method338(var6);
					if ((var7 != null) && !var7.aBool1361 && (((var3 ? 7 : 0) + var5) == var7.anInt1362)) {
						var1[anIntArray777[var5]] = var6 + 256;
						break;
					}
				}
		}

		anIntArray785 = var1;
		anIntArray778 = var2;
		aBool779 = var3;
		anInt780 = var4;
		method398();
	}

	public void method395(final int var1, final boolean var2) {
		if ((var1 != 1) || !aBool779) {
			int var3 = anIntArray785[anIntArray777[var1]];
			if (var3 != 0) {
				var3 -= 256;

				Def3 var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0)
							var3 = Applet_Sub1.anInt1980 - 1;
					} else {
						++var3;
						if (var3 >= Applet_Sub1.anInt1980)
							var3 = 0;
					}

					var4 = Class84.method338(var3);
				} while ((var4 == null) || var4.aBool1361 || (var4.anInt1362 != (var1 + (aBool779 ? 7 : 0))));

				anIntArray785[anIntArray777[var1]] = var3 + 256;
				method398();
			}
		}
	}

	public void method396(final int var1, final boolean var2) {
		int var3 = anIntArray778[var1];
		boolean var4;
		if (!var2)
			do {
				--var3;
				if (var3 < 0)
					var3 = aShortArrayArray783[var1].length - 1;

				if ((var1 == 4) && (var3 == 8))
					var4 = false;
				else
					var4 = true;
			} while (!var4);
		else
			do {
				++var3;
				if (var3 >= aShortArrayArray783[var1].length)
					var3 = 0;

				if ((var1 == 4) && (var3 == 8))
					var4 = false;
				else
					var4 = true;
			} while (!var4);

		anIntArray778[var1] = var3;
		method398();
	}

	public void method397(final RSBuf var1) {
		var1.writeByte(aBool779 ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			final int var3 = anIntArray785[anIntArray777[var2]];
			if (var3 == 0)
				var1.writeByte(-1);
			else
				var1.writeByte(var3 - 256);
		}

		for (var2 = 0; var2 < 5; ++var2)
			var1.writeByte(anIntArray778[var2]);

	}

	void method398() {
		final long var1 = aLong781;
		final int var4 = anIntArray785[5];
		final int var3 = anIntArray785[9];
		anIntArray785[5] = var3;
		anIntArray785[9] = var4;
		aLong781 = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			aLong781 <<= 4;
			if (anIntArray785[var5] >= 256)
				aLong781 += anIntArray785[var5] - 256;
		}

		if (anIntArray785[0] >= 256)
			aLong781 += (anIntArray785[0] - 256) >> 4;

		if (anIntArray785[1] >= 256)
			aLong781 += (anIntArray785[1] - 256) >> 8;

		for (var5 = 0; var5 < 5; ++var5) {
			aLong781 <<= 3;
			aLong781 += anIntArray778[var5];
		}

		aLong781 <<= 1;
		aLong781 += aBool779 ? 1 : 0;
		anIntArray785[5] = var4;
		anIntArray785[9] = var3;
		if ((0L != var1) && (aLong781 != var1))
			aClass113_786.map(var1);

	}

	public Class124_Sub22_Sub19_Sub7 method399(final Def12 var1, final int var2,
			final Def12 var3, final int var4) {
		if (anInt780 != -1)
			return Class34.method188(anInt780, 1547564157).method645(var1, var2, var3, var4);
		else {
			long var6 = aLong781;
			int[] var8 = anIntArray785;
			if ((var1 != null) && ((var1.anInt1542 >= 0) || (var1.anInt1543 >= 0))) {
				var8 = new int[12];

				for (int var10 = 0; var10 < 12; ++var10)
					var8[var10] = anIntArray785[var10];

				if (var1.anInt1542 >= 0) {
					var6 += (var1.anInt1542 - anIntArray785[5]) << 8;
					var8[5] = var1.anInt1542;
				}

				if (var1.anInt1543 >= 0) {
					var6 += (var1.anInt1543 - anIntArray785[3]) << 16;
					var8[3] = var1.anInt1543;
				}
			}

			Class124_Sub22_Sub19_Sub7 var9 = (Class124_Sub22_Sub19_Sub7) aClass113_786.forId(var6);
			if (var9 == null) {
				boolean var15 = false;

				int var13;
				for (int var14 = 0; var14 < 12; ++var14) {
					var13 = var8[var14];
					if ((var13 >= 256) && (var13 < 512) && !Class84.method338(var13 - 256).method647())
						var15 = true;

					if ((var13 >= 512) && !Class124_Sub22_Sub10.method724(var13 - 512).method716(aBool779))
						var15 = true;
				}

				if (var15) {
					if (-1L != aLong787)
						var9 = (Class124_Sub22_Sub19_Sub7) aClass113_786.forId(aLong787);

					if (var9 == null)
						return null;
				}

				if (var9 == null) {
					final Model[] var11 = new Model[12];
					var13 = 0;

					int var5;
					for (int var16 = 0; var16 < 12; ++var16) {
						var5 = var8[var16];
						Model var17;
						if ((var5 >= 256) && (var5 < 512)) {
							var17 = Class84.method338(var5 - 256).method650();
							if (null != var17)
								var11[var13++] = var17;
						}

						if (var5 >= 512) {
							var17 = Class124_Sub22_Sub10.method724(var5 - 512).method710(aBool779);
							if (var17 != null)
								var11[var13++] = var17;
						}
					}

					final Model var18 = new Model(var11, var13);

					for (var5 = 0; var5 < 5; ++var5) {
						if (anIntArray778[var5] < aShortArrayArray783[var5].length)
							var18.method951(aShortArray782[var5], aShortArrayArray783[var5][anIntArray778[var5]]);

						if (anIntArray778[var5] < aShortArrayArray784[var5].length)
							var18.method951(Class56_Sub2.aShortArray1085[var5],
									aShortArrayArray784[var5][anIntArray778[var5]]);
					}

					var9 = var18.method945(64, 850, -30, -50, -30);
					aClass113_786.map(var9, var6);
					aLong787 = var6;
				}
			}

			if ((null == var1) && (var3 == null))
				return var9;
			else {
				Class124_Sub22_Sub19_Sub7 var12;
				if ((null != var1) && (null != var3))
					var12 = var1.method742(var9, var2, var3, var4);
				else if (null != var1)
					var12 = var1.method741(var9, var2);
				else
					var12 = var3.method741(var9, var4);

				return var12;
			}
		}
	}

	Model method400() {
		if (anInt780 != -1)
			return Class34.method188(anInt780, 1846943511).method641();
		else {
			boolean var8 = false;

			int var2;
			for (int var5 = 0; var5 < 12; ++var5) {
				var2 = anIntArray785[var5];
				if ((var2 >= 256) && (var2 < 512) && !Class84.method338(var2 - 256).method651())
					var8 = true;

				if ((var2 >= 512) && !Class124_Sub22_Sub10.method724(var2 - 512).method719(aBool779))
					var8 = true;
			}

			if (var8)
				return null;
			else {
				final Model[] var1 = new Model[12];
				var2 = 0;

				int var4;
				for (int var7 = 0; var7 < 12; ++var7) {
					var4 = anIntArray785[var7];
					Model var3;
					if ((var4 >= 256) && (var4 < 512)) {
						var3 = Class84.method338(var4 - 256).method652();
						if (var3 != null)
							var1[var2++] = var3;
					}

					if (var4 >= 512) {
						var3 = Class124_Sub22_Sub10.method724(var4 - 512).method718(aBool779);
						if (var3 != null)
							var1[var2++] = var3;
					}
				}

				final Model var6 = new Model(var1, var2);

				for (var4 = 0; var4 < 5; ++var4) {
					if (anIntArray778[var4] < aShortArrayArray783[var4].length)
						var6.method951(aShortArray782[var4], aShortArrayArray783[var4][anIntArray778[var4]]);

					if (anIntArray778[var4] < aShortArrayArray784[var4].length)
						var6.method951(Class56_Sub2.aShortArray1085[var4],
								aShortArrayArray784[var4][anIntArray778[var4]]);
				}

				return var6;
			}
		}
	}

	public int method401() {
		return anInt780 == -1
				? anIntArray785[1] + (anIntArray785[8] << 10) + (anIntArray778[0] << 25) + (anIntArray778[4] << 20)
						+ (anIntArray785[0] << 15) + (anIntArray785[11] << 5)
				: 305419896 + Class34.method188(anInt780, 1433944503).anInt1318;
	}
}

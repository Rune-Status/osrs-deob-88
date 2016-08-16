public abstract class CacheArch {
	static Class124_Sub22_Sub16_Sub2 aClass124_Sub22_Sub16_Sub2_759;
	public int anInt756;
	int anInt758;
	int[] anIntArray744;
	int[] anIntArray747;
	int[] anIntArray748;
	int[] anIntArray749;
	int[][] anIntArrayArray750;
	Object[] anObjectArray753;
	Object[][] anObjectArrayArray754;
	int[] anIntArray745;
	Class109 aClass109_746;
	int[][] anIntArrayArray751;
	Class109[] aClass109Array752;
	static Class64 aClass64_743 = new Class64();
	static int anInt755 = 0;
	boolean aBool757;
	boolean aBool760;

	void method363(final byte[] var1) {
		anInt756 = Def8.method700(var1, var1.length);
		final RSBuf var3 = new RSBuf(Def14.method729(var1));
		final int var4 = var3.readByteU();
		if ((var4 >= 5) && (var4 <= 7)) {
			if (var4 >= 6)
				var3.readInt2(-1711525829);

			final int var8 = var3.readByteU();
			if (var4 >= 7)
				anInt758 = var3.readUSmart();
			else
				anInt758 = var3.readShortU();

			int var5 = 0;
			int var2 = -1;
			anIntArray744 = new int[anInt758];
			int var9;
			if (var4 >= 7)
				for (var9 = 0; var9 < anInt758; ++var9) {
					anIntArray744[var9] = var5 += var3.readUSmart();
					if (anIntArray744[var9] > var2)
						var2 = anIntArray744[var9];
				}
			else
				for (var9 = 0; var9 < anInt758; ++var9) {
					anIntArray744[var9] = var5 += var3.readShortU();
					if (anIntArray744[var9] > var2)
						var2 = anIntArray744[var9];
				}

			anIntArray747 = new int[var2 + 1];
			anIntArray748 = new int[var2 + 1];
			anIntArray749 = new int[var2 + 1];
			anIntArrayArray750 = new int[var2 + 1][];
			anObjectArray753 = new Object[var2 + 1];
			anObjectArrayArray754 = new Object[1 + var2][];
			if (var8 != 0) {
				anIntArray745 = new int[1 + var2];

				for (var9 = 0; var9 < anInt758; ++var9)
					anIntArray745[anIntArray744[var9]] = var3.readInt2(1345754832);

				aClass109_746 = new Class109(anIntArray745);
			}

			for (var9 = 0; var9 < anInt758; ++var9)
				anIntArray747[anIntArray744[var9]] = var3.readInt2(-606760751);

			for (var9 = 0; var9 < anInt758; ++var9)
				anIntArray748[anIntArray744[var9]] = var3.readInt2(-488311715);

			for (var9 = 0; var9 < anInt758; ++var9)
				anIntArray749[anIntArray744[var9]] = var3.readShortU();

			int var6;
			int var7;
			int var10;
			int var11;
			int var12;
			if (var4 >= 7)
				for (var9 = 0; var9 < anInt758; ++var9) {
					var11 = anIntArray744[var9];
					var7 = anIntArray749[var11];
					var5 = 0;
					var10 = -1;
					anIntArrayArray750[var11] = new int[var7];

					for (var6 = 0; var6 < var7; ++var6) {
						var12 = anIntArrayArray750[var11][var6] = var5 += var3.readUSmart();
						if (var12 > var10)
							var10 = var12;
					}

					anObjectArrayArray754[var11] = new Object[var10 + 1];
				}
			else
				for (var9 = 0; var9 < anInt758; ++var9) {
					var11 = anIntArray744[var9];
					var7 = anIntArray749[var11];
					var5 = 0;
					var10 = -1;
					anIntArrayArray750[var11] = new int[var7];

					for (var6 = 0; var6 < var7; ++var6) {
						var12 = anIntArrayArray750[var11][var6] = var5 += var3.readShortU();
						if (var12 > var10)
							var10 = var12;
					}

					anObjectArrayArray754[var11] = new Object[1 + var10];
				}

			if (var8 != 0) {
				anIntArrayArray751 = new int[var2 + 1][];
				aClass109Array752 = new Class109[1 + var2];

				for (var9 = 0; var9 < anInt758; ++var9) {
					var11 = anIntArray744[var9];
					var7 = anIntArray749[var11];
					anIntArrayArray751[var11] = new int[anObjectArrayArray754[var11].length];

					for (var10 = 0; var10 < var7; ++var10)
						anIntArrayArray751[var11][anIntArrayArray750[var11][var10]] = var3.readInt2(1147111835);

					aClass109Array752[var11] = new Class109(anIntArrayArray751[var11]);
				}
			}

		} else
			throw new RuntimeException("");
	}

	void method364(final int var1, final int var2) {
	}

	public boolean valid(final String var1) {
		final int var2 = method376("");
		return var2 == -1 ? valid2(var1, "") : valid2("", var1);
	}

	public boolean valid(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray754.length) && (null != anObjectArrayArray754[var1]) && (var2 >= 0)
				&& (var2 < anObjectArrayArray754[var1].length)) {
			if (null != anObjectArrayArray754[var1][var2])
				return true;
			else if (null != anObjectArray753[var1])
				return true;
			else {
				method381(var1, (short) 11766);
				return null != anObjectArray753[var1];
			}
		} else
			return false;
	}

	public boolean valid() {
		boolean var1 = true;

		for (final int var2 : anIntArray744) {
			if (anObjectArray753[var2] == null) {
				method381(var2, (short) -5332);
				if (anObjectArray753[var2] == null)
					var1 = false;
			}
		}

		return var1;
	}

	public byte[] decode(final int var1) {
		if (anObjectArrayArray754.length != 1) {
			if (anObjectArrayArray754[var1].length == 1)
				return decode(var1, 0);
			else
				throw new RuntimeException();
		} else
			return decode(0, var1);
	}

	public void empty() {
		for (int var1 = 0; var1 < anObjectArrayArray754.length; ++var1)
			if (anObjectArrayArray754[var1] != null)
				for (int var2 = 0; var2 < anObjectArrayArray754[var1].length; ++var2)
					anObjectArrayArray754[var1][var2] = null;

	}

	public byte[] decdode(final int var1) {
		if (anObjectArrayArray754.length != 1) {
			if (anObjectArrayArray754[var1].length != 1)
				throw new RuntimeException();
			else
				return decode2(var1, 0);
		} else
			return decode2(0, var1);
	}

	public byte[] decode(final int var1, final int var2, final int[] var3) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray754.length) && (anObjectArrayArray754[var1] != null) && (var2 >= 0)
				&& (var2 < anObjectArrayArray754[var1].length)) {
			if (null == anObjectArrayArray754[var1][var2]) {
				boolean var4 = method385(var1, var3);
				if (!var4) {
					method381(var1, (short) -10924);
					var4 = method385(var1, var3);
					if (!var4)
						return null;
				}
			}

			final byte[] var5 = ISAAC.method299(anObjectArrayArray754[var1][var2], false);
			if (aBool760)
				anObjectArrayArray754[var1][var2] = null;

			return var5;
		} else
			return null;
	}

	public int[] method372(final int var1) {
		return anIntArrayArray750[var1];
	}

	public int method373() {
		return anObjectArrayArray754.length;
	}

	public void method374(final int var1) {
		for (int var2 = 0; var2 < anObjectArrayArray754[var1].length; ++var2)
			anObjectArrayArray754[var1][var2] = null;

	}

	public boolean validWidget(final int var1) {
		if (anObjectArray753[var1] == null) {
			method381(var1, (short) 6563);
			return anObjectArray753[var1] != null;
		} else
			return true;
	}

	public int method376(String var1) {
		var1 = var1.toLowerCase();
		return aClass109_746.method419(Def5.method708(var1));
	}

	public byte[] decode(final int var1, final int var2) {
		return decode(var1, var2, (int[]) null);
	}

	public byte[] decode3(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass109_746.method419(Def5.method708(var1));
		final int var4 = aClass109Array752[var3].method419(Def5.method708(var2));
		return decode(var3, var4);
	}

	public boolean valid2(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		final int var3 = aClass109_746.method419(Def5.method708(var1));
		final int var4 = aClass109Array752[var3].method419(Def5.method708(var2));
		return valid(var3, var4);
	}

	CacheArch(final boolean var1, final boolean var2) {
		aBool757 = var1;
		aBool760 = var2;
	}

	public byte[] decode2(final int var1, final int var2) {
		if ((var1 >= 0) && (var1 < anObjectArrayArray754.length) && (anObjectArrayArray754[var1] != null) && (var2 >= 0)
				&& (var2 < anObjectArrayArray754[var1].length)) {
			if (null == anObjectArrayArray754[var1][var2]) {
				boolean var3 = method385(var1, (int[]) null);
				if (!var3) {
					method381(var1, (short) 16821);
					var3 = method385(var1, (int[]) null);
					if (!var3)
						return null;
				}
			}

			final byte[] var4 = ISAAC.method299(anObjectArrayArray754[var1][var2], false);
			return var4;
		} else
			return null;
	}

	void method381(final int var1, final short var2) {
	}

	public int widgetLen(final int var1) {
		return anObjectArrayArray754[var1].length;
	}

	public int method383(final int var1, String var2) {
		var2 = var2.toLowerCase();
		return aClass109Array752[var1].method419(Def5.method708(var2));
	}

	public void method384(String var1) {
		var1 = var1.toLowerCase();
		final int var2 = aClass109_746.method419(Def5.method708(var1));
		if (var2 >= 0)
			method364(var2, -1484277722);
	}

	boolean method385(final int var1, final int[] var2) {
		if (null == anObjectArray753[var1])
			return false;
		else {
			final int var3 = anIntArray749[var1];
			final int[] var4 = anIntArrayArray750[var1];
			final Object[] var5 = anObjectArrayArray754[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7)
				if (null == var5[var4[var7]]) {
					var6 = false;
					break;
				}

			if (var6)
				return true;
			else {
				byte[] var8;
				if ((null != var2) && ((var2[0] != 0) || (var2[1] != 0) || (var2[2] != 0) || (var2[3] != 0))) {
					var8 = ISAAC.method299(anObjectArray753[var1], true);
					final RSBuf var9 = new RSBuf(var8);
					var9.xtea5(var2, 5, var9.backing.length);
				} else
					var8 = ISAAC.method299(anObjectArray753[var1], false);

				final byte[] var20 = Def14.method729(var8);
				if (aBool757)
					anObjectArray753[var1] = null;

				if (var3 > 1) {
					int var10 = var20.length;
					--var10;
					final int var11 = var20[var10] & 255;
					var10 -= var3 * var11 * 4;
					final RSBuf var12 = new RSBuf(var20);
					final int[] var13 = new int[var3];
					var12.pos = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var3; ++var16) {
							var15 += var12.readInt2(-1051485084);
							var13[var16] += var15;
						}
					}

					final byte[][] var17 = new byte[var3][];

					for (var15 = 0; var15 < var3; ++var15) {
						var17[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.pos = var10;
					var15 = 0;

					for (var16 = 0; var16 < var11; ++var16) {
						int var18 = 0;

						for (int var19 = 0; var19 < var3; ++var19) {
							var18 += var12.readInt2(-2033999182);
							System.arraycopy(var20, var15, var17[var19], var13[var19], var18);
							var13[var19] += var18;
							var15 += var18;
						}
					}

					for (var16 = 0; var16 < var3; ++var16)
						if (!aBool760)
							var5[var4[var16]] = Class9_Sub1.method493(var17[var16], false);
						else
							var5[var4[var16]] = var17[var16];
				} else if (!aBool760)
					var5[var4[0]] = Class9_Sub1.method493(var20, false);
				else
					var5[var4[0]] = var20;

				return true;
			}
		}
	}
}

public class Model extends Class124_Sub22_Sub19 {
	int anInt1756 = 0;
	int anInt1758 = 0;
	byte aByte1744 = 0;
	boolean aBool1788 = false;
	byte[] aByteArray1768;
	int anInt1759;
	int[] anIntArray1784;
	int[] anIntArray1746;
	int[] anIntArray1747;
	int[] anIntArray1749;
	int[] anIntArray1780;
	int[] anIntArray1751;
	int[] anIntArray1771;
	byte[] aByteArray1752;
	byte[] aByteArray1755;
	byte[] aByteArray1754;
	int[] anIntArray1772;
	short[] aShortArray1757;
	short[] aShortArray1750;
	byte[] aByteArray1790;
	short[] aShortArray1761;
	short[] aShortArray1762;
	short[] aShortArray1763;
	short[] aShortArray1753;
	short[] aShortArray1765;
	short[] aShortArray1766;
	short[] aShortArray1745;
	byte[] aByteArray1770;
	short[] aShortArray1789;
	short[] aShortArray1769;
	int[][] anIntArrayArray1773;
	int[][] anIntArrayArray1783;
	Class26[] aClass26Array1776;
	Class20[] aClass20Array1775;
	Class26[] aClass26Array1777;
	public short aShort1778;
	public short aShort1779;
	static int anInt1760 = 0;
	static int[] anIntArray1786 = new int[10000];
	static int[] anIntArray1787 = new int[10000];
	static int[] anIntArray1767;
	static int[] anIntArray1748;
	int anInt1781;
	int anInt1782;
	int anInt1774;
	int anInt1764;
	int anInt1785;

	Model(final byte[] var1) {
		if ((var1[var1.length - 1] == -1) && (var1[var1.length - 2] == -1))
			method929(var1);
		else
			method947(var1);

	}

	void method929(final byte[] var1) {
		final RSBuf var2 = new RSBuf(var1);
		final RSBuf var12 = new RSBuf(var1);
		final RSBuf var5 = new RSBuf(var1);
		final RSBuf var6 = new RSBuf(var1);
		final RSBuf var7 = new RSBuf(var1);
		final RSBuf var3 = new RSBuf(var1);
		final RSBuf var54 = new RSBuf(var1);
		var2.pos = var1.length - 23;
		final int var10 = var2.readShortU();
		final int var28 = var2.readShortU();
		final int var18 = var2.readByteU();
		final int var13 = var2.readByteU();
		final int var14 = var2.readByteU();
		final int var11 = var2.readByteU();
		final int var16 = var2.readByteU();
		final int var17 = var2.readByteU();
		final int var47 = var2.readByteU();
		final int var20 = var2.readShortU();
		final int var19 = var2.readShortU();
		final int var42 = var2.readShortU();
		final int var37 = var2.readShortU();
		final int var23 = var2.readShortU();
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var21;
		if (var18 > 0) {
			aByteArray1768 = new byte[var18];
			var2.pos = 0;

			for (var21 = 0; var21 < var18; ++var21) {
				final byte var29 = aByteArray1768[var21] = var2.readByte();
				if (var29 == 0)
					++var24;

				if ((var29 >= 1) && (var29 <= 3))
					++var25;

				if (var29 == 2)
					++var26;
			}
		}

		var21 = var18 + var10;
		final int var32 = var21;
		if (var13 == 1)
			var21 += var28;

		final int var33 = var21;
		var21 += var28;
		final int var27 = var21;
		if (var14 == 255)
			var21 += var28;

		final int var34 = var21;
		if (var16 == 1)
			var21 += var28;

		final int var50 = var21;
		if (var47 == 1)
			var21 += var10;

		final int var57 = var21;
		if (var11 == 1)
			var21 += var28;

		final int var36 = var21;
		var21 += var37;
		final int var4 = var21;
		if (var17 == 1)
			var21 += var28 * 2;

		final int var38 = var21;
		var21 += var23;
		final int var39 = var21;
		var21 += var28 * 2;
		final int var51 = var21;
		var21 += var20;
		final int var40 = var21;
		var21 += var19;
		final int var41 = var21;
		var21 += var42;
		final int var56 = var21;
		var21 += var24 * 6;
		final int var22 = var21;
		var21 += var25 * 6;
		final int var55 = var21;
		var21 += var25 * 6;
		final int var31 = var21;
		var21 += var25 * 2;
		final int var45 = var21;
		var21 += var25;
		final int var48 = var21;
		var21 += (var25 * 2) + (var26 * 2);
		anInt1756 = var10;
		anInt1758 = var28;
		anInt1759 = var18;
		anIntArray1784 = new int[var10];
		anIntArray1746 = new int[var10];
		anIntArray1747 = new int[var10];
		anIntArray1749 = new int[var28];
		anIntArray1780 = new int[var28];
		anIntArray1751 = new int[var28];
		if (var47 == 1)
			anIntArray1771 = new int[var10];

		if (var13 == 1)
			aByteArray1752 = new byte[var28];

		if (var14 == 255)
			aByteArray1755 = new byte[var28];
		else
			aByte1744 = (byte) var14;

		if (var11 == 1)
			aByteArray1754 = new byte[var28];

		if (var16 == 1)
			anIntArray1772 = new int[var28];

		if (var17 == 1)
			aShortArray1757 = new short[var28];

		if ((var17 == 1) && (var18 > 0))
			aByteArray1790 = new byte[var28];

		aShortArray1750 = new short[var28];
		if (var18 > 0) {
			aShortArray1761 = new short[var18];
			aShortArray1762 = new short[var18];
			aShortArray1763 = new short[var18];
			if (var25 > 0) {
				aShortArray1753 = new short[var25];
				aShortArray1765 = new short[var25];
				aShortArray1766 = new short[var25];
				aShortArray1745 = new short[var25];
				aByteArray1770 = new byte[var25];
				aShortArray1789 = new short[var25];
			}

			if (var26 > 0)
				aShortArray1769 = new short[var26];
		}

		var2.pos = var18;
		var12.pos = var51;
		var5.pos = var40;
		var6.pos = var41;
		var7.pos = var50;
		int var43 = 0;
		int var52 = 0;
		int var53 = 0;

		int var8;
		int var9;
		int var15;
		int var30;
		int var46;
		for (var8 = 0; var8 < var10; ++var8) {
			var30 = var2.readByteU();
			var15 = 0;
			if ((var30 & 1) != 0)
				var15 = var12.method601();

			var46 = 0;
			if ((var30 & 2) != 0)
				var46 = var5.method601();

			var9 = 0;
			if ((var30 & 4) != 0)
				var9 = var6.method601();

			anIntArray1784[var8] = var43 + var15;
			anIntArray1746[var8] = var52 + var46;
			anIntArray1747[var8] = var53 + var9;
			var43 = anIntArray1784[var8];
			var52 = anIntArray1746[var8];
			var53 = anIntArray1747[var8];
			if (var47 == 1)
				anIntArray1771[var8] = var7.readByteU();
		}

		var2.pos = var39;
		var12.pos = var32;
		var5.pos = var27;
		var6.pos = var57;
		var7.pos = var34;
		var3.pos = var4;
		var54.pos = var38;

		for (var8 = 0; var8 < var28; ++var8) {
			aShortArray1750[var8] = (short) var2.readShortU();
			if (var13 == 1)
				aByteArray1752[var8] = var12.readByte();

			if (var14 == 255)
				aByteArray1755[var8] = var5.readByte();

			if (var11 == 1)
				aByteArray1754[var8] = var6.readByte();

			if (var16 == 1)
				anIntArray1772[var8] = var7.readByteU();

			if (var17 == 1)
				aShortArray1757[var8] = (short) (var3.readShortU() - 1);

			if ((aByteArray1790 != null) && (aShortArray1757[var8] != -1))
				aByteArray1790[var8] = (byte) (var54.readByteU() - 1);
		}

		var2.pos = var36;
		var12.pos = var33;
		var8 = 0;
		var30 = 0;
		var15 = 0;
		var46 = 0;

		int var44;
		for (var9 = 0; var9 < var28; ++var9) {
			var44 = var12.readByteU();
			if (var44 == 1) {
				var8 = var2.method601() + var46;
				var30 = var2.method601() + var8;
				var15 = var2.method601() + var30;
				var46 = var15;
				anIntArray1749[var9] = var8;
				anIntArray1780[var9] = var30;
				anIntArray1751[var9] = var15;
			}

			if (var44 == 2) {
				var30 = var15;
				var15 = var2.method601() + var46;
				var46 = var15;
				anIntArray1749[var9] = var8;
				anIntArray1780[var9] = var30;
				anIntArray1751[var9] = var15;
			}

			if (var44 == 3) {
				var8 = var15;
				var15 = var2.method601() + var46;
				var46 = var15;
				anIntArray1749[var9] = var8;
				anIntArray1780[var9] = var30;
				anIntArray1751[var9] = var15;
			}

			if (var44 == 4) {
				final int var49 = var8;
				var8 = var30;
				var30 = var49;
				var15 = var2.method601() + var46;
				var46 = var15;
				anIntArray1749[var9] = var8;
				anIntArray1780[var9] = var49;
				anIntArray1751[var9] = var15;
			}
		}

		var2.pos = var56;
		var12.pos = var22;
		var5.pos = var55;
		var6.pos = var31;
		var7.pos = var45;
		var3.pos = var48;

		for (var9 = 0; var9 < var18; ++var9) {
			var44 = aByteArray1768[var9] & 255;
			if (var44 == 0) {
				aShortArray1761[var9] = (short) var2.readShortU();
				aShortArray1762[var9] = (short) var2.readShortU();
				aShortArray1763[var9] = (short) var2.readShortU();
			}

			if (var44 == 1) {
				aShortArray1761[var9] = (short) var12.readShortU();
				aShortArray1762[var9] = (short) var12.readShortU();
				aShortArray1763[var9] = (short) var12.readShortU();
				aShortArray1753[var9] = (short) var5.readShortU();
				aShortArray1765[var9] = (short) var5.readShortU();
				aShortArray1766[var9] = (short) var5.readShortU();
				aShortArray1745[var9] = (short) var6.readShortU();
				aByteArray1770[var9] = var7.readByte();
				aShortArray1789[var9] = (short) var3.readShortU();
			}

			if (var44 == 2) {
				aShortArray1761[var9] = (short) var12.readShortU();
				aShortArray1762[var9] = (short) var12.readShortU();
				aShortArray1763[var9] = (short) var12.readShortU();
				aShortArray1753[var9] = (short) var5.readShortU();
				aShortArray1765[var9] = (short) var5.readShortU();
				aShortArray1766[var9] = (short) var5.readShortU();
				aShortArray1745[var9] = (short) var6.readShortU();
				aByteArray1770[var9] = var7.readByte();
				aShortArray1789[var9] = (short) var3.readShortU();
				aShortArray1769[var9] = (short) var3.readShortU();
			}

			if (var44 == 3) {
				aShortArray1761[var9] = (short) var12.readShortU();
				aShortArray1762[var9] = (short) var12.readShortU();
				aShortArray1763[var9] = (short) var12.readShortU();
				aShortArray1753[var9] = (short) var5.readShortU();
				aShortArray1765[var9] = (short) var5.readShortU();
				aShortArray1766[var9] = (short) var5.readShortU();
				aShortArray1745[var9] = (short) var6.readShortU();
				aByteArray1770[var9] = var7.readByte();
				aShortArray1789[var9] = (short) var3.readShortU();
			}
		}

		var2.pos = var21;
		var9 = var2.readByteU();
		if (var9 != 0) {
			new Class40();
			var2.readShortU();
			var2.readShortU();
			var2.readShortU();
			var2.readInt2(-1329302449);
		}

	}

	public Model(final Model var1, final boolean var2, final boolean var3,
			final boolean var4, final boolean var5) {
		anInt1756 = var1.anInt1756;
		anInt1758 = var1.anInt1758;
		anInt1759 = var1.anInt1759;
		int var6;
		if (var2) {
			anIntArray1784 = var1.anIntArray1784;
			anIntArray1746 = var1.anIntArray1746;
			anIntArray1747 = var1.anIntArray1747;
		} else {
			anIntArray1784 = new int[anInt1756];
			anIntArray1746 = new int[anInt1756];
			anIntArray1747 = new int[anInt1756];

			for (var6 = 0; var6 < anInt1756; ++var6) {
				anIntArray1784[var6] = var1.anIntArray1784[var6];
				anIntArray1746[var6] = var1.anIntArray1746[var6];
				anIntArray1747[var6] = var1.anIntArray1747[var6];
			}
		}

		if (var3)
			aShortArray1750 = var1.aShortArray1750;
		else {
			aShortArray1750 = new short[anInt1758];

			for (var6 = 0; var6 < anInt1758; ++var6)
				aShortArray1750[var6] = var1.aShortArray1750[var6];
		}

		if (!var4 && (var1.aShortArray1757 != null)) {
			aShortArray1757 = new short[anInt1758];

			for (var6 = 0; var6 < anInt1758; ++var6)
				aShortArray1757[var6] = var1.aShortArray1757[var6];
		} else
			aShortArray1757 = var1.aShortArray1757;

		aByteArray1754 = var1.aByteArray1754;
		anIntArray1749 = var1.anIntArray1749;
		anIntArray1780 = var1.anIntArray1780;
		anIntArray1751 = var1.anIntArray1751;
		aByteArray1752 = var1.aByteArray1752;
		aByteArray1755 = var1.aByteArray1755;
		aByteArray1790 = var1.aByteArray1790;
		aByte1744 = var1.aByte1744;
		aByteArray1768 = var1.aByteArray1768;
		aShortArray1761 = var1.aShortArray1761;
		aShortArray1762 = var1.aShortArray1762;
		aShortArray1763 = var1.aShortArray1763;
		aShortArray1753 = var1.aShortArray1753;
		aShortArray1765 = var1.aShortArray1765;
		aShortArray1766 = var1.aShortArray1766;
		aShortArray1745 = var1.aShortArray1745;
		aByteArray1770 = var1.aByteArray1770;
		aShortArray1789 = var1.aShortArray1789;
		aShortArray1769 = var1.aShortArray1769;
		anIntArray1771 = var1.anIntArray1771;
		anIntArray1772 = var1.anIntArray1772;
		anIntArrayArray1773 = var1.anIntArrayArray1773;
		anIntArrayArray1783 = var1.anIntArrayArray1783;
		aClass26Array1776 = var1.aClass26Array1776;
		aClass20Array1775 = var1.aClass20Array1775;
		aClass26Array1777 = var1.aClass26Array1777;
		aShort1778 = var1.aShort1778;
		aShort1779 = var1.aShort1779;
	}

	public Model method930() {
		final Model var1 = new Model();
		if (aByteArray1752 != null) {
			var1.aByteArray1752 = new byte[anInt1758];

			for (int var2 = 0; var2 < anInt1758; ++var2)
				var1.aByteArray1752[var2] = aByteArray1752[var2];
		}

		var1.anInt1756 = anInt1756;
		var1.anInt1758 = anInt1758;
		var1.anInt1759 = anInt1759;
		var1.anIntArray1784 = anIntArray1784;
		var1.anIntArray1746 = anIntArray1746;
		var1.anIntArray1747 = anIntArray1747;
		var1.anIntArray1749 = anIntArray1749;
		var1.anIntArray1780 = anIntArray1780;
		var1.anIntArray1751 = anIntArray1751;
		var1.aByteArray1755 = aByteArray1755;
		var1.aByteArray1754 = aByteArray1754;
		var1.aByteArray1790 = aByteArray1790;
		var1.aShortArray1750 = aShortArray1750;
		var1.aShortArray1757 = aShortArray1757;
		var1.aByte1744 = aByte1744;
		var1.aByteArray1768 = aByteArray1768;
		var1.aShortArray1761 = aShortArray1761;
		var1.aShortArray1762 = aShortArray1762;
		var1.aShortArray1763 = aShortArray1763;
		var1.aShortArray1753 = aShortArray1753;
		var1.aShortArray1765 = aShortArray1765;
		var1.aShortArray1766 = aShortArray1766;
		var1.aShortArray1745 = aShortArray1745;
		var1.aByteArray1770 = aByteArray1770;
		var1.aShortArray1789 = aShortArray1789;
		var1.aShortArray1769 = aShortArray1769;
		var1.anIntArray1771 = anIntArray1771;
		var1.anIntArray1772 = anIntArray1772;
		var1.anIntArrayArray1773 = anIntArrayArray1773;
		var1.anIntArrayArray1783 = anIntArrayArray1783;
		var1.aClass26Array1776 = aClass26Array1776;
		var1.aClass20Array1775 = aClass20Array1775;
		var1.aShort1778 = aShort1778;
		var1.aShort1779 = aShort1779;
		return var1;
	}

	public Model method931(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method948();
		int var18 = var2 + anInt1782;
		int var17 = var2 + anInt1774;
		int var10 = var4 + anInt1785;
		int var19 = var4 + anInt1764;
		if ((var18 >= 0) && (((var17 + 128) >> 7) < var1.length) && (var10 >= 0)
				&& (((var19 + 128) >> 7) < var1[0].length)) {
			var18 >>= 7;
			var17 = (var17 + 127) >> 7;
			var10 >>= 7;
			var19 = (var19 + 127) >> 7;
			if ((var1[var18][var10] == var3) && (var1[var17][var10] == var3) && (var1[var18][var19] == var3)
					&& (var1[var17][var19] == var3))
				return this;
			else {
				final Model var7 = new Model();
				var7.anInt1756 = anInt1756;
				var7.anInt1758 = anInt1758;
				var7.anInt1759 = anInt1759;
				var7.anIntArray1784 = anIntArray1784;
				var7.anIntArray1747 = anIntArray1747;
				var7.anIntArray1749 = anIntArray1749;
				var7.anIntArray1780 = anIntArray1780;
				var7.anIntArray1751 = anIntArray1751;
				var7.aByteArray1752 = aByteArray1752;
				var7.aByteArray1755 = aByteArray1755;
				var7.aByteArray1754 = aByteArray1754;
				var7.aByteArray1790 = aByteArray1790;
				var7.aShortArray1750 = aShortArray1750;
				var7.aShortArray1757 = aShortArray1757;
				var7.aByte1744 = aByte1744;
				var7.aByteArray1768 = aByteArray1768;
				var7.aShortArray1761 = aShortArray1761;
				var7.aShortArray1762 = aShortArray1762;
				var7.aShortArray1763 = aShortArray1763;
				var7.aShortArray1753 = aShortArray1753;
				var7.aShortArray1765 = aShortArray1765;
				var7.aShortArray1766 = aShortArray1766;
				var7.aShortArray1745 = aShortArray1745;
				var7.aByteArray1770 = aByteArray1770;
				var7.aShortArray1789 = aShortArray1789;
				var7.aShortArray1769 = aShortArray1769;
				var7.anIntArray1771 = anIntArray1771;
				var7.anIntArray1772 = anIntArray1772;
				var7.anIntArrayArray1773 = anIntArrayArray1773;
				var7.anIntArrayArray1783 = anIntArrayArray1783;
				var7.aShort1778 = aShort1778;
				var7.aShort1779 = aShort1779;
				var7.anIntArray1746 = new int[var7.anInt1756];
				int var8;
				int var9;
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var20;
				int var21;
				if (var6 == 0)
					for (var8 = 0; var8 < var7.anInt1756; ++var8) {
						var11 = anIntArray1784[var8] + var2;
						var9 = anIntArray1747[var8] + var4;
						var20 = var11 & 127;
						var15 = var9 & 127;
						var12 = var11 >> 7;
						var13 = var9 >> 7;
						var14 = ((var1[var12][var13] * (128 - var20)) + (var1[var12 + 1][var13] * var20)) >> 7;
						var16 = ((var1[var12][var13 + 1] * (128 - var20)) + (var1[var12 + 1][var13 + 1] * var20)) >> 7;
						var21 = ((var14 * (128 - var15)) + (var16 * var15)) >> 7;
						var7.anIntArray1746[var8] = (anIntArray1746[var8] + var21) - var3;
					}
				else
					for (var8 = 0; var8 < var7.anInt1756; ++var8) {
						var11 = (-anIntArray1746[var8] << 16) / anInt1605;
						if (var11 < var6) {
							var9 = anIntArray1784[var8] + var2;
							var20 = anIntArray1747[var8] + var4;
							var15 = var9 & 127;
							var12 = var20 & 127;
							var13 = var9 >> 7;
							var14 = var20 >> 7;
							var16 = ((var1[var13][var14] * (128 - var15)) + (var1[var13 + 1][var14] * var15)) >> 7;
							var21 = ((var1[var13][var14 + 1] * (128 - var15))
									+ (var1[var13 + 1][var14 + 1] * var15)) >> 7;
							final int var22 = ((var16 * (128 - var12)) + (var21 * var12)) >> 7;
							var7.anIntArray1746[var8] = anIntArray1746[var8]
									+ (((var22 - var3) * (var6 - var11)) / var6);
						}
					}

				var7.method942();
				return var7;
			}
		} else
			return this;
	}

	void method932() {
		int[] var1;
		int var2;
		int var3;
		int var4;
		if (anIntArray1771 != null) {
			var1 = new int[256];
			var4 = 0;

			for (var3 = 0; var3 < anInt1756; ++var3) {
				var2 = anIntArray1771[var3];
				++var1[var2];
				if (var2 > var4)
					var4 = var2;
			}

			anIntArrayArray1773 = new int[var4 + 1][];

			for (var3 = 0; var3 <= var4; ++var3) {
				anIntArrayArray1773[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < anInt1756; anIntArrayArray1773[var2][var1[var2]++] = var3++)
				var2 = anIntArray1771[var3];

			anIntArray1771 = null;
		}

		if (anIntArray1772 != null) {
			var1 = new int[256];
			var4 = 0;

			for (var3 = 0; var3 < anInt1758; ++var3) {
				var2 = anIntArray1772[var3];
				++var1[var2];
				if (var2 > var4)
					var4 = var2;
			}

			anIntArrayArray1783 = new int[var4 + 1][];

			for (var3 = 0; var3 <= var4; ++var3) {
				anIntArrayArray1783[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < anInt1758; anIntArrayArray1783[var2][var1[var2]++] = var3++)
				var2 = anIntArray1772[var3];

			anIntArray1772 = null;
		}

	}

	public void method933() {
		for (int var1 = 0; var1 < anInt1756; ++var1) {
			final int var2 = anIntArray1784[var1];
			anIntArray1784[var1] = anIntArray1747[var1];
			anIntArray1747[var1] = -var2;
		}

		method942();
	}

	public void method934() {
		for (int var1 = 0; var1 < anInt1756; ++var1) {
			anIntArray1784[var1] = -anIntArray1784[var1];
			anIntArray1747[var1] = -anIntArray1747[var1];
		}

		method942();
	}

	public void method935() {
		for (int var1 = 0; var1 < anInt1756; ++var1) {
			final int var2 = anIntArray1747[var1];
			anIntArray1747[var1] = anIntArray1784[var1];
			anIntArray1784[var1] = -var2;
		}

		method942();
	}

	public void method936(final int var1) {
		final int var2 = anIntArray1767[var1];
		final int var4 = anIntArray1748[var1];

		for (int var3 = 0; var3 < anInt1756; ++var3) {
			final int var5 = ((anIntArray1747[var3] * var2) + (anIntArray1784[var3] * var4)) >> 16;
			anIntArray1747[var3] = ((anIntArray1747[var3] * var4) - (anIntArray1784[var3] * var2)) >> 16;
			anIntArray1784[var3] = var5;
		}

		method942();
	}

	public void method937(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1756; ++var4) {
			anIntArray1784[var4] += var1;
			anIntArray1746[var4] += var2;
			anIntArray1747[var4] += var3;
		}

		method942();
	}

	static final int method938(int var0) {
		if (var0 < 2)
			var0 = 2;
		else if (var0 > 126)
			var0 = 126;

		return var0;
	}

	public void method939(final short var1, final short var2) {
		if (aShortArray1757 != null)
			for (int var3 = 0; var3 < anInt1758; ++var3)
				if (aShortArray1757[var3] == var1)
					aShortArray1757[var3] = var2;
	}

	public void method940() {
		int var1;
		for (var1 = 0; var1 < anInt1756; ++var1)
			anIntArray1747[var1] = -anIntArray1747[var1];

		for (var1 = 0; var1 < anInt1758; ++var1) {
			final int var2 = anIntArray1749[var1];
			anIntArray1749[var1] = anIntArray1751[var1];
			anIntArray1751[var1] = var2;
		}

		method942();
	}

	public void method941(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1756; ++var4) {
			anIntArray1784[var4] = (anIntArray1784[var4] * var1) / 128;
			anIntArray1746[var4] = (anIntArray1746[var4] * var2) / 128;
			anIntArray1747[var4] = (anIntArray1747[var4] * var3) / 128;
		}

		method942();
	}

	void method942() {
		aClass26Array1776 = null;
		aClass26Array1777 = null;
		aClass20Array1775 = null;
		aBool1788 = false;
	}

	public static Model method943(final CacheArch var0, final int var1, final int var2) {
		final byte[] var3 = var0.decode(var1, var2);
		return var3 == null ? null : new Model(var3);
	}

	static void method944(final Model var0, final Model var1, final int var2,
			final int var3, final int var4, final boolean var5) {
		var0.method948();
		var0.method950();
		var1.method948();
		var1.method950();
		++anInt1760;
		int var7 = 0;
		final int[] var8 = var1.anIntArray1784;
		final int var15 = var1.anInt1756;

		int var6;
		for (var6 = 0; var6 < var0.anInt1756; ++var6) {
			final Class26 var11 = var0.aClass26Array1776[var6];
			if (var11.anInt283 != 0) {
				final int var9 = var0.anIntArray1746[var6] - var3;
				if (var9 <= var1.anInt1781) {
					final int var12 = var0.anIntArray1784[var6] - var2;
					if ((var12 >= var1.anInt1782) && (var12 <= var1.anInt1774)) {
						final int var13 = var0.anIntArray1747[var6] - var4;
						if ((var13 >= var1.anInt1785) && (var13 <= var1.anInt1764))
							for (int var10 = 0; var10 < var15; ++var10) {
								final Class26 var16 = var1.aClass26Array1776[var10];
								if ((var12 == var8[var10]) && (var13 == var1.anIntArray1747[var10])
										&& (var9 == var1.anIntArray1746[var10]) && (var16.anInt283 != 0)) {
									if (var0.aClass26Array1777 == null)
										var0.aClass26Array1777 = new Class26[var0.anInt1756];

									if (var1.aClass26Array1777 == null)
										var1.aClass26Array1777 = new Class26[var15];

									Class26 var17 = var0.aClass26Array1777[var6];
									if (var17 == null)
										var17 = var0.aClass26Array1777[var6] = new Class26(var11);

									Class26 var14 = var1.aClass26Array1777[var10];
									if (var14 == null)
										var14 = var1.aClass26Array1777[var10] = new Class26(var16);

									var17.anInt282 += var16.anInt282;
									var17.anInt280 += var16.anInt280;
									var17.anInt281 += var16.anInt281;
									var17.anInt283 += var16.anInt283;
									var14.anInt282 += var11.anInt282;
									var14.anInt280 += var11.anInt280;
									var14.anInt281 += var11.anInt281;
									var14.anInt283 += var11.anInt283;
									++var7;
									anIntArray1786[var6] = anInt1760;
									anIntArray1787[var10] = anInt1760;
								}
							}
					}
				}
			}
		}

		if ((var7 >= 3) && var5) {
			for (var6 = 0; var6 < var0.anInt1758; ++var6)
				if ((anIntArray1786[var0.anIntArray1749[var6]] == anInt1760)
						&& (anIntArray1786[var0.anIntArray1780[var6]] == anInt1760)
						&& (anIntArray1786[var0.anIntArray1751[var6]] == anInt1760)) {
					if (var0.aByteArray1752 == null)
						var0.aByteArray1752 = new byte[var0.anInt1758];

					var0.aByteArray1752[var6] = 2;
				}

			for (var6 = 0; var6 < var1.anInt1758; ++var6)
				if ((anIntArray1787[var1.anIntArray1749[var6]] == anInt1760)
						&& (anIntArray1787[var1.anIntArray1780[var6]] == anInt1760)
						&& (anIntArray1787[var1.anIntArray1751[var6]] == anInt1760)) {
					if (var1.aByteArray1752 == null)
						var1.aByteArray1752 = new byte[var1.anInt1758];

					var1.aByteArray1752[var6] = 2;
				}

		}
	}

	public final Class124_Sub22_Sub19_Sub7 method945(final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method950();
		final int var10 = (int) Math.sqrt((var3 * var3) + (var4 * var4) + (var5 * var5));
		final int var11 = (var2 * var10) >> 8;
		final Class124_Sub22_Sub19_Sub7 var6 = new Class124_Sub22_Sub19_Sub7();
		var6.anIntArray1882 = new int[anInt1758];
		var6.anIntArray1891 = new int[anInt1758];
		var6.anIntArray1863 = new int[anInt1758];
		if ((anInt1759 > 0) && (aByteArray1790 != null)) {
			final int[] var12 = new int[anInt1759];

			int var13;
			for (var13 = 0; var13 < anInt1758; ++var13)
				if (aByteArray1790[var13] != -1)
					++var12[aByteArray1790[var13] & 255];

			var6.anInt1876 = 0;

			for (var13 = 0; var13 < anInt1759; ++var13)
				if ((var12[var13] > 0) && (aByteArray1768[var13] == 0))
					++var6.anInt1876;

			var6.anIntArray1870 = new int[var6.anInt1876];
			var6.anIntArray1871 = new int[var6.anInt1876];
			var6.anIntArray1872 = new int[var6.anInt1876];
			var13 = 0;

			int var15;
			for (var15 = 0; var15 < anInt1759; ++var15)
				if ((var12[var15] > 0) && (aByteArray1768[var15] == 0)) {
					var6.anIntArray1870[var13] = aShortArray1761[var15] & '\uffff';
					var6.anIntArray1871[var13] = aShortArray1762[var15] & '\uffff';
					var6.anIntArray1872[var13] = aShortArray1763[var15] & '\uffff';
					var12[var15] = var13++;
				} else
					var12[var15] = -1;

			var6.aByteArray1866 = new byte[anInt1758];

			for (var15 = 0; var15 < anInt1758; ++var15)
				if (aByteArray1790[var15] != -1)
					var6.aByteArray1866[var15] = (byte) var12[aByteArray1790[var15] & 255];
				else
					var6.aByteArray1866[var15] = -1;
		}

		for (int var7 = 0; var7 < anInt1758; ++var7) {
			byte var17;
			if (aByteArray1752 == null)
				var17 = 0;
			else
				var17 = aByteArray1752[var7];

			byte var18;
			if (aByteArray1754 == null)
				var18 = 0;
			else
				var18 = aByteArray1754[var7];

			short var16;
			if (aShortArray1757 == null)
				var16 = -1;
			else
				var16 = aShortArray1757[var7];

			if (var18 == -2)
				var17 = 3;

			if (var18 == -1)
				var17 = 2;

			int var9;
			Class26 var14;
			Class20 var19;
			if (var16 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = aClass20Array1775[var7];
						var9 = var1 + (((var3 * var19.anInt189) + (var4 * var19.anInt188) + (var5 * var19.anInt187))
								/ (var11 + (var11 / 2)));
						var6.anIntArray1882[var7] = method949(aShortArray1750[var7] & '\uffff', var9);
						var6.anIntArray1863[var7] = -1;
					} else if (var17 == 3) {
						var6.anIntArray1882[var7] = 128;
						var6.anIntArray1863[var7] = -1;
					} else
						var6.anIntArray1863[var7] = -2;
				} else {
					final int var8 = aShortArray1750[var7] & '\uffff';
					if ((aClass26Array1777 != null) && (aClass26Array1777[anIntArray1749[var7]] != null))
						var14 = aClass26Array1777[anIntArray1749[var7]];
					else
						var14 = aClass26Array1776[anIntArray1749[var7]];

					var9 = var1 + (((var3 * var14.anInt282) + (var4 * var14.anInt280) + (var5 * var14.anInt281))
							/ (var11 * var14.anInt283));
					var6.anIntArray1882[var7] = method949(var8, var9);
					if ((aClass26Array1777 != null) && (aClass26Array1777[anIntArray1780[var7]] != null))
						var14 = aClass26Array1777[anIntArray1780[var7]];
					else
						var14 = aClass26Array1776[anIntArray1780[var7]];

					var9 = var1 + (((var3 * var14.anInt282) + (var4 * var14.anInt280) + (var5 * var14.anInt281))
							/ (var11 * var14.anInt283));
					var6.anIntArray1891[var7] = method949(var8, var9);
					if ((aClass26Array1777 != null) && (aClass26Array1777[anIntArray1751[var7]] != null))
						var14 = aClass26Array1777[anIntArray1751[var7]];
					else
						var14 = aClass26Array1776[anIntArray1751[var7]];

					var9 = var1 + (((var3 * var14.anInt282) + (var4 * var14.anInt280) + (var5 * var14.anInt281))
							/ (var11 * var14.anInt283));
					var6.anIntArray1863[var7] = method949(var8, var9);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = aClass20Array1775[var7];
					var9 = var1 + (((var3 * var19.anInt189) + (var4 * var19.anInt188) + (var5 * var19.anInt187))
							/ (var11 + (var11 / 2)));
					var6.anIntArray1882[var7] = method938(var9);
					var6.anIntArray1863[var7] = -1;
				} else
					var6.anIntArray1863[var7] = -2;
			} else {
				if ((aClass26Array1777 != null) && (aClass26Array1777[anIntArray1749[var7]] != null))
					var14 = aClass26Array1777[anIntArray1749[var7]];
				else
					var14 = aClass26Array1776[anIntArray1749[var7]];

				var9 = var1 + (((var3 * var14.anInt282) + (var4 * var14.anInt280) + (var5 * var14.anInt281))
						/ (var11 * var14.anInt283));
				var6.anIntArray1882[var7] = method938(var9);
				if ((aClass26Array1777 != null) && (aClass26Array1777[anIntArray1780[var7]] != null))
					var14 = aClass26Array1777[anIntArray1780[var7]];
				else
					var14 = aClass26Array1776[anIntArray1780[var7]];

				var9 = var1 + (((var3 * var14.anInt282) + (var4 * var14.anInt280) + (var5 * var14.anInt281))
						/ (var11 * var14.anInt283));
				var6.anIntArray1891[var7] = method938(var9);
				if ((aClass26Array1777 != null) && (aClass26Array1777[anIntArray1751[var7]] != null))
					var14 = aClass26Array1777[anIntArray1751[var7]];
				else
					var14 = aClass26Array1776[anIntArray1751[var7]];

				var9 = var1 + (((var3 * var14.anInt282) + (var4 * var14.anInt280) + (var5 * var14.anInt281))
						/ (var11 * var14.anInt283));
				var6.anIntArray1863[var7] = method938(var9);
			}
		}

		method932();
		var6.anInt1853 = anInt1756;
		var6.anIntArray1854 = anIntArray1784;
		var6.anIntArray1849 = anIntArray1746;
		var6.anIntArray1856 = anIntArray1747;
		var6.anInt1855 = anInt1758;
		var6.anIntArray1858 = anIntArray1749;
		var6.anIntArray1859 = anIntArray1780;
		var6.anIntArray1860 = anIntArray1751;
		var6.aByteArray1864 = aByteArray1755;
		var6.aByteArray1865 = aByteArray1754;
		var6.aByte1868 = aByte1744;
		var6.anIntArrayArray1862 = anIntArrayArray1773;
		var6.anIntArrayArray1874 = anIntArrayArray1783;
		var6.aShortArray1875 = aShortArray1757;
		return var6;
	}

	Model() {
	}

	static {
		anIntArray1767 = Class124_Sub22_Sub16_Sub3.anIntArray1847;
		anIntArray1748 = Class124_Sub22_Sub16_Sub3.anIntArray1848;
	}

	final int method946(final Model var1, final int var2) {
		int var3 = -1;
		final int var6 = var1.anIntArray1784[var2];
		final int var4 = var1.anIntArray1746[var2];
		final int var7 = var1.anIntArray1747[var2];

		for (int var5 = 0; var5 < anInt1756; ++var5)
			if ((var6 == anIntArray1784[var5]) && (var4 == anIntArray1746[var5]) && (var7 == anIntArray1747[var5])) {
				var3 = var5;
				break;
			}

		if (var3 == -1) {
			anIntArray1784[anInt1756] = var6;
			anIntArray1746[anInt1756] = var4;
			anIntArray1747[anInt1756] = var7;
			if (var1.anIntArray1771 != null)
				anIntArray1771[anInt1756] = var1.anIntArray1771[var2];

			var3 = anInt1756++;
		}

		return var3;
	}

	void method947(final byte[] var1) {
		boolean var2 = false;
		boolean var37 = false;
		final RSBuf var3 = new RSBuf(var1);
		final RSBuf var31 = new RSBuf(var1);
		final RSBuf var6 = new RSBuf(var1);
		final RSBuf var7 = new RSBuf(var1);
		final RSBuf var8 = new RSBuf(var1);
		var3.pos = var1.length - 18;
		final int var5 = var3.readShortU();
		final int var13 = var3.readShortU();
		final int var25 = var3.readByteU();
		final int var21 = var3.readByteU();
		final int var14 = var3.readByteU();
		final int var15 = var3.readByteU();
		final int var24 = var3.readByteU();
		final int var17 = var3.readByteU();
		final int var18 = var3.readShortU();
		final int var35 = var3.readShortU();
		final int var19 = var3.readShortU();
		final int var20 = var3.readShortU();
		final byte var9 = 0;
		int var45 = var9 + var5;
		final int var23 = var45;
		var45 += var13;
		final int var40 = var45;
		if (var14 == 255)
			var45 += var13;

		final int var26 = var45;
		if (var24 == 1)
			var45 += var13;

		final int var10 = var45;
		if (var21 == 1)
			var45 += var13;

		final int var32 = var45;
		if (var17 == 1)
			var45 += var5;

		final int var30 = var45;
		if (var15 == 1)
			var45 += var13;

		final int var22 = var45;
		var45 += var20;
		final int var28 = var45;
		var45 += var13 * 2;
		final int var27 = var45;
		var45 += var25 * 6;
		final int var34 = var45;
		var45 += var18;
		final int var44 = var45;
		var45 += var35;
		anInt1756 = var5;
		anInt1758 = var13;
		anInt1759 = var25;
		anIntArray1784 = new int[var5];
		anIntArray1746 = new int[var5];
		anIntArray1747 = new int[var5];
		anIntArray1749 = new int[var13];
		anIntArray1780 = new int[var13];
		anIntArray1751 = new int[var13];
		if (var25 > 0) {
			aByteArray1768 = new byte[var25];
			aShortArray1761 = new short[var25];
			aShortArray1762 = new short[var25];
			aShortArray1763 = new short[var25];
		}

		if (var17 == 1)
			anIntArray1771 = new int[var5];

		if (var21 == 1) {
			aByteArray1752 = new byte[var13];
			aByteArray1790 = new byte[var13];
			aShortArray1757 = new short[var13];
		}

		if (var14 == 255)
			aByteArray1755 = new byte[var13];
		else
			aByte1744 = (byte) var14;

		if (var15 == 1)
			aByteArray1754 = new byte[var13];

		if (var24 == 1)
			anIntArray1772 = new int[var13];

		aShortArray1750 = new short[var13];
		var3.pos = var9;
		var31.pos = var34;
		var6.pos = var44;
		var7.pos = var45;
		var8.pos = var32;
		int var38 = 0;
		int var42 = 0;
		int var43 = 0;

		int var4;
		int var11;
		int var16;
		int var29;
		int var33;
		for (var4 = 0; var4 < var5; ++var4) {
			var11 = var3.readByteU();
			var33 = 0;
			if ((var11 & 1) != 0)
				var33 = var31.method601();

			var16 = 0;
			if ((var11 & 2) != 0)
				var16 = var6.method601();

			var29 = 0;
			if ((var11 & 4) != 0)
				var29 = var7.method601();

			anIntArray1784[var4] = var38 + var33;
			anIntArray1746[var4] = var42 + var16;
			anIntArray1747[var4] = var43 + var29;
			var38 = anIntArray1784[var4];
			var42 = anIntArray1746[var4];
			var43 = anIntArray1747[var4];
			if (var17 == 1)
				anIntArray1771[var4] = var8.readByteU();
		}

		var3.pos = var28;
		var31.pos = var10;
		var6.pos = var40;
		var7.pos = var30;
		var8.pos = var26;

		for (var4 = 0; var4 < var13; ++var4) {
			aShortArray1750[var4] = (short) var3.readShortU();
			if (var21 == 1) {
				var11 = var31.readByteU();
				if ((var11 & 1) == 1) {
					aByteArray1752[var4] = 1;
					var2 = true;
				} else
					aByteArray1752[var4] = 0;

				if ((var11 & 2) == 2) {
					aByteArray1790[var4] = (byte) (var11 >> 2);
					aShortArray1757[var4] = aShortArray1750[var4];
					aShortArray1750[var4] = 127;
					if (aShortArray1757[var4] != -1)
						var37 = true;
				} else {
					aByteArray1790[var4] = -1;
					aShortArray1757[var4] = -1;
				}
			}

			if (var14 == 255)
				aByteArray1755[var4] = var6.readByte();

			if (var15 == 1)
				aByteArray1754[var4] = var7.readByte();

			if (var24 == 1)
				anIntArray1772[var4] = var8.readByteU();
		}

		var3.pos = var22;
		var31.pos = var23;
		var4 = 0;
		var11 = 0;
		var33 = 0;
		var16 = 0;

		int var12;
		int var41;
		for (var29 = 0; var29 < var13; ++var29) {
			var12 = var31.readByteU();
			if (var12 == 1) {
				var4 = var3.method601() + var16;
				var11 = var3.method601() + var4;
				var33 = var3.method601() + var11;
				var16 = var33;
				anIntArray1749[var29] = var4;
				anIntArray1780[var29] = var11;
				anIntArray1751[var29] = var33;
			}

			if (var12 == 2) {
				var11 = var33;
				var33 = var3.method601() + var16;
				var16 = var33;
				anIntArray1749[var29] = var4;
				anIntArray1780[var29] = var11;
				anIntArray1751[var29] = var33;
			}

			if (var12 == 3) {
				var4 = var33;
				var33 = var3.method601() + var16;
				var16 = var33;
				anIntArray1749[var29] = var4;
				anIntArray1780[var29] = var11;
				anIntArray1751[var29] = var33;
			}

			if (var12 == 4) {
				var41 = var4;
				var4 = var11;
				var11 = var41;
				var33 = var3.method601() + var16;
				var16 = var33;
				anIntArray1749[var29] = var4;
				anIntArray1780[var29] = var41;
				anIntArray1751[var29] = var33;
			}
		}

		var3.pos = var27;

		for (var29 = 0; var29 < var25; ++var29) {
			aByteArray1768[var29] = 0;
			aShortArray1761[var29] = (short) var3.readShortU();
			aShortArray1762[var29] = (short) var3.readShortU();
			aShortArray1763[var29] = (short) var3.readShortU();
		}

		if (aByteArray1790 != null) {
			boolean var46 = false;

			for (var12 = 0; var12 < var13; ++var12) {
				var41 = aByteArray1790[var12] & 255;
				if (var41 != 255)
					if (((aShortArray1761[var41] & '\uffff') == anIntArray1749[var12])
							&& ((aShortArray1762[var41] & '\uffff') == anIntArray1780[var12])
							&& ((aShortArray1763[var41] & '\uffff') == anIntArray1751[var12]))
						aByteArray1790[var12] = -1;
					else
						var46 = true;
			}

			if (!var46)
				aByteArray1790 = null;
		}

		if (!var37)
			aShortArray1757 = null;

		if (!var2)
			aByteArray1752 = null;

	}

	void method948() {
		if (!aBool1788) {
			anInt1605 = 0;
			anInt1781 = 0;
			anInt1782 = 999999;
			anInt1774 = -999999;
			anInt1764 = -99999;
			anInt1785 = 99999;

			for (int var4 = 0; var4 < anInt1756; ++var4) {
				final int var1 = anIntArray1784[var4];
				final int var2 = anIntArray1746[var4];
				final int var3 = anIntArray1747[var4];
				if (var1 < anInt1782)
					anInt1782 = var1;

				if (var1 > anInt1774)
					anInt1774 = var1;

				if (var3 < anInt1785)
					anInt1785 = var3;

				if (var3 > anInt1764)
					anInt1764 = var3;

				if (-var2 > anInt1605)
					anInt1605 = -var2;

				if (var2 > anInt1781)
					anInt1781 = var2;
			}

			aBool1788 = true;
		}
	}

	static final int method949(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	public Model(final Model[] var1, final int var2) {
		boolean var4 = false;
		boolean var12 = false;
		boolean var9 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		anInt1756 = 0;
		anInt1758 = 0;
		anInt1759 = 0;
		aByte1744 = -1;

		Model var3;
		int var10;
		for (var10 = 0; var10 < var2; ++var10) {
			var3 = var1[var10];
			if (var3 != null) {
				anInt1756 += var3.anInt1756;
				anInt1758 += var3.anInt1758;
				anInt1759 += var3.anInt1759;
				if (var3.aByteArray1755 != null)
					var12 = true;
				else {
					if (aByte1744 == -1)
						aByte1744 = var3.aByte1744;

					if (aByte1744 != var3.aByte1744)
						var12 = true;
				}

				var4 |= var3.aByteArray1752 != null;
				var9 |= var3.aByteArray1754 != null;
				var6 |= var3.anIntArray1772 != null;
				var7 |= var3.aShortArray1757 != null;
				var8 |= var3.aByteArray1790 != null;
			}
		}

		anIntArray1784 = new int[anInt1756];
		anIntArray1746 = new int[anInt1756];
		anIntArray1747 = new int[anInt1756];
		anIntArray1771 = new int[anInt1756];
		anIntArray1749 = new int[anInt1758];
		anIntArray1780 = new int[anInt1758];
		anIntArray1751 = new int[anInt1758];
		if (var4)
			aByteArray1752 = new byte[anInt1758];

		if (var12)
			aByteArray1755 = new byte[anInt1758];

		if (var9)
			aByteArray1754 = new byte[anInt1758];

		if (var6)
			anIntArray1772 = new int[anInt1758];

		if (var7)
			aShortArray1757 = new short[anInt1758];

		if (var8)
			aByteArray1790 = new byte[anInt1758];

		aShortArray1750 = new short[anInt1758];
		if (anInt1759 > 0) {
			aByteArray1768 = new byte[anInt1759];
			aShortArray1761 = new short[anInt1759];
			aShortArray1762 = new short[anInt1759];
			aShortArray1763 = new short[anInt1759];
			aShortArray1753 = new short[anInt1759];
			aShortArray1765 = new short[anInt1759];
			aShortArray1766 = new short[anInt1759];
			aShortArray1745 = new short[anInt1759];
			aByteArray1770 = new byte[anInt1759];
			aShortArray1789 = new short[anInt1759];
			aShortArray1769 = new short[anInt1759];
		}

		anInt1756 = 0;
		anInt1758 = 0;
		anInt1759 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var3 = var1[var10];
			if (var3 != null) {
				int var11;
				for (var11 = 0; var11 < var3.anInt1758; ++var11) {
					if (var4 && (var3.aByteArray1752 != null))
						aByteArray1752[anInt1758] = var3.aByteArray1752[var11];

					if (var12)
						if (var3.aByteArray1755 != null)
							aByteArray1755[anInt1758] = var3.aByteArray1755[var11];
						else
							aByteArray1755[anInt1758] = var3.aByte1744;

					if (var9 && (var3.aByteArray1754 != null))
						aByteArray1754[anInt1758] = var3.aByteArray1754[var11];

					if (var6 && (var3.anIntArray1772 != null))
						anIntArray1772[anInt1758] = var3.anIntArray1772[var11];

					if (var7)
						if (var3.aShortArray1757 != null)
							aShortArray1757[anInt1758] = var3.aShortArray1757[var11];
						else
							aShortArray1757[anInt1758] = -1;

					if (var8)
						if ((var3.aByteArray1790 != null) && (var3.aByteArray1790[var11] != -1))
							aByteArray1790[anInt1758] = (byte) (var3.aByteArray1790[var11] + anInt1759);
						else
							aByteArray1790[anInt1758] = -1;

					aShortArray1750[anInt1758] = var3.aShortArray1750[var11];
					anIntArray1749[anInt1758] = method946(var3, var3.anIntArray1749[var11]);
					anIntArray1780[anInt1758] = method946(var3, var3.anIntArray1780[var11]);
					anIntArray1751[anInt1758] = method946(var3, var3.anIntArray1751[var11]);
					++anInt1758;
				}

				for (var11 = 0; var11 < var3.anInt1759; ++var11) {
					final byte var5 = aByteArray1768[anInt1759] = var3.aByteArray1768[var11];
					if (var5 == 0) {
						aShortArray1761[anInt1759] = (short) method946(var3, var3.aShortArray1761[var11]);
						aShortArray1762[anInt1759] = (short) method946(var3, var3.aShortArray1762[var11]);
						aShortArray1763[anInt1759] = (short) method946(var3, var3.aShortArray1763[var11]);
					}

					if ((var5 >= 1) && (var5 <= 3)) {
						aShortArray1761[anInt1759] = var3.aShortArray1761[var11];
						aShortArray1762[anInt1759] = var3.aShortArray1762[var11];
						aShortArray1763[anInt1759] = var3.aShortArray1763[var11];
						aShortArray1753[anInt1759] = var3.aShortArray1753[var11];
						aShortArray1765[anInt1759] = var3.aShortArray1765[var11];
						aShortArray1766[anInt1759] = var3.aShortArray1766[var11];
						aShortArray1745[anInt1759] = var3.aShortArray1745[var11];
						aByteArray1770[anInt1759] = var3.aByteArray1770[var11];
						aShortArray1789[anInt1759] = var3.aShortArray1789[var11];
					}

					if (var5 == 2)
						aShortArray1769[anInt1759] = var3.aShortArray1769[var11];

					++anInt1759;
				}
			}
		}

	}

	public void method950() {
		if (aClass26Array1776 == null) {
			aClass26Array1776 = new Class26[anInt1756];

			int var8;
			for (var8 = 0; var8 < anInt1756; ++var8)
				aClass26Array1776[var8] = new Class26();

			for (var8 = 0; var8 < anInt1758; ++var8) {
				final int var1 = anIntArray1749[var8];
				final int var11 = anIntArray1780[var8];
				final int var10 = anIntArray1751[var8];
				final int var13 = anIntArray1784[var11] - anIntArray1784[var1];
				final int var3 = anIntArray1746[var11] - anIntArray1746[var1];
				final int var6 = anIntArray1747[var11] - anIntArray1747[var1];
				final int var12 = anIntArray1784[var10] - anIntArray1784[var1];
				final int var5 = anIntArray1746[var10] - anIntArray1746[var1];
				final int var4 = anIntArray1747[var10] - anIntArray1747[var1];
				int var7 = (var3 * var4) - (var5 * var6);
				int var14 = (var6 * var12) - (var4 * var13);

				int var15;
				for (var15 = (var13 * var5) - (var12 * var3); (var7 > 8192) || (var14 > 8192) || (var15 > 8192)
						|| (var7 < -8192) || (var14 < -8192) || (var15 < -8192); var15 >>= 1) {
					var7 >>= 1;
					var14 >>= 1;
				}

				int var9 = (int) Math.sqrt((var7 * var7) + (var14 * var14) + (var15 * var15));
				if (var9 <= 0)
					var9 = 1;

				var7 = (var7 * 256) / var9;
				var14 = (var14 * 256) / var9;
				var15 = (var15 * 256) / var9;
				byte var16;
				if (aByteArray1752 == null)
					var16 = 0;
				else
					var16 = aByteArray1752[var8];

				if (var16 == 0) {
					Class26 var2 = aClass26Array1776[var1];
					var2.anInt282 += var7;
					var2.anInt280 += var14;
					var2.anInt281 += var15;
					++var2.anInt283;
					var2 = aClass26Array1776[var11];
					var2.anInt282 += var7;
					var2.anInt280 += var14;
					var2.anInt281 += var15;
					++var2.anInt283;
					var2 = aClass26Array1776[var10];
					var2.anInt282 += var7;
					var2.anInt280 += var14;
					var2.anInt281 += var15;
					++var2.anInt283;
				} else if (var16 == 1) {
					if (aClass20Array1775 == null)
						aClass20Array1775 = new Class20[anInt1758];

					final Class20 var17 = aClass20Array1775[var8] = new Class20();
					var17.anInt189 = var7;
					var17.anInt188 = var14;
					var17.anInt187 = var15;
				}
			}

		}
	}

	public void method951(final short var1, final short var2) {
		for (int var3 = 0; var3 < anInt1758; ++var3)
			if (aShortArray1750[var3] == var1)
				aShortArray1750[var3] = var2;

	}
}

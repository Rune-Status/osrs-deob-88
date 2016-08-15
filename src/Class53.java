public class Class53 {
	public int anInt491;
	static Class53 aClass53_494 = new Class53(0);
	public static Class53 aClass53_492 = new Class53(1);
	static Class53 aClass53_493 = new Class53(2);

	Class53(final int var1) {
		anInt491 = var1;
	}

	static final boolean method256(final int var0) {
		if (var0 < 0)
			return false;
		else {
			int var1 = client.anIntArray2127[var0];
			if (var1 >= 2000)
				var1 -= 2000;

			return var1 == 1007;
		}
	}

	static final void method257(final Class124_Sub22_Sub19_Sub3 var0) {
		int var1;
		int var2;
		int var3;
		if (var0.anInt1713 > client.anInt2158) {
			var2 = var0.anInt1713 - client.anInt2158;
			var1 = (var0.anInt1674 * 64) + (var0.anInt1709 * 128);
			var3 = (var0.anInt1711 * 128) + (var0.anInt1674 * 64);
			var0.anInt1690 += (var1 - var0.anInt1690) / var2;
			var0.anInt1697 += (var3 - var0.anInt1697) / var2;
			var0.anInt1725 = 0;
			if (var0.anInt1715 == 0)
				var0.anInt1718 = 1024;

			if (var0.anInt1715 == 1)
				var0.anInt1718 = 1536;

			if (var0.anInt1715 == 2)
				var0.anInt1718 = 0;

			if (var0.anInt1715 == 3)
				var0.anInt1718 = 512;
		} else if (var0.anInt1714 >= client.anInt2158) {
			if ((client.anInt2158 == var0.anInt1714) || (var0.anInt1699 == -1) || (var0.anInt1673 != 0)
					|| ((1 + var0.anInt1687) > Class124_Sub22_Sub14
							.method750(var0.anInt1699).anIntArray1529[var0.anInt1700])) {
				var2 = var0.anInt1714 - var0.anInt1713;
				var1 = client.anInt2158 - var0.anInt1713;
				var3 = (var0.anInt1674 * 64) + (var0.anInt1709 * 128);
				final int var4 = (var0.anInt1674 * 64) + (var0.anInt1711 * 128);
				final int var6 = (var0.anInt1720 * 128) + (var0.anInt1674 * 64);
				final int var5 = (var0.anInt1702 * 128) + (var0.anInt1674 * 64);
				var0.anInt1690 = ((var1 * var6) + ((var2 - var1) * var3)) / var2;
				var0.anInt1697 = ((var1 * var5) + ((var2 - var1) * var4)) / var2;
			}

			var0.anInt1725 = 0;
			if (var0.anInt1715 == 0)
				var0.anInt1718 = 1024;

			if (var0.anInt1715 == 1)
				var0.anInt1718 = 1536;

			if (var0.anInt1715 == 2)
				var0.anInt1718 = 0;

			if (var0.anInt1715 == 3)
				var0.anInt1718 = 512;

			var0.anInt1672 = var0.anInt1718;
		} else
			Class72.method312(var0);

		if ((var0.anInt1690 < 128) || (var0.anInt1697 < 128) || (var0.anInt1690 >= 13184)
				|| (var0.anInt1697 >= 13184)) {
			var0.anInt1699 = -1;
			var0.anInt1710 = -1;
			var0.anInt1713 = 0;
			var0.anInt1714 = 0;
			var0.anInt1690 = (var0.anInt1674 * 64) + (var0.anIntArray1722[0] * 128);
			var0.anInt1697 = (128 * var0.anIntArray1723[0]) + (var0.anInt1674 * 64);
			var0.method890();
		}

		if ((var0 == Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246) && ((var0.anInt1690 < 1536) || (var0.anInt1697 < 1536)
				|| (var0.anInt1690 >= 11776) || (var0.anInt1697 >= 11776))) {
			var0.anInt1699 = -1;
			var0.anInt1710 = -1;
			var0.anInt1713 = 0;
			var0.anInt1714 = 0;
			var0.anInt1690 = (128 * var0.anIntArray1722[0]) + (var0.anInt1674 * 64);
			var0.anInt1697 = (128 * var0.anIntArray1723[0]) + (var0.anInt1674 * 64);
			var0.method890();
		}

		Class88.method344(var0);
		Class49.method236(var0);
	}
}

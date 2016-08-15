public abstract class Class124_Sub22_Sub19_Sub3 extends Class124_Sub22_Sub19 {
	boolean aBool1670;
	int anInt1672;
	int anInt1678;
	int anInt1692;
	int anInt1693;
	int anInt1702;
	int anInt1707;
	int anInt1709;
	int anInt1711;
	int anInt1713;
	int anInt1714;
	int anInt1715;
	int anInt1718;
	int anInt1720;
	int anInt1721 = 0;
	int anInt1726 = 0;
	int anInt1699 = -1;
	int anInt1725 = 0;
	int anInt1690;
	int anInt1697;
	boolean aBool1708 = false;
	int anInt1674 = 1;
	int anInt1719 = -1;
	int anInt1676 = -1;
	int anInt1677 = -1;
	int anInt1712 = -1;
	int anInt1679 = -1;
	int anInt1680 = -1;
	int anInt1681 = -1;
	int anInt1682 = -1;
	String aString1683 = null;
	boolean aBool1684 = false;
	int anInt1685 = 100;
	int anInt1686 = 0;
	int anInt1696 = 0;
	int[] anIntArray1727 = new int[4];
	int[] anIntArray1689 = new int[4];
	int[] anIntArray1688 = new int[4];
	int anInt1691 = -1000;
	int anInt1694 = -1;
	int anInt1671 = 0;
	int anInt1728 = 0;
	int anInt1675 = -1;
	int anInt1695 = 0;
	int anInt1698 = 0;
	int anInt1700 = 0;
	int anInt1687 = 0;
	int anInt1673 = 0;
	int anInt1703 = 0;
	int anInt1710 = -1;
	int anInt1705 = 0;
	int anInt1706 = 0;
	int anInt1716 = 0;
	int anInt1717 = 200;
	int anInt1704 = 0;
	int anInt1724 = 32;
	int[] anIntArray1722 = new int[10];
	int[] anIntArray1723 = new int[10];
	boolean[] aBoolArray1701 = new boolean[10];

	final void method890() {
		anInt1721 = 0;
		anInt1726 = 0;
	}

	static final void method891(final Class124_Sub11 var0) {
		int var1 = 0;
		int var2 = -1;
		int var3 = 0;
		int var4 = 0;
		if (var0.anInt1035 == 0)
			var1 = Class36.aClass21_380.method136(var0.anInt1048, var0.anInt1036, var0.anInt1037);

		if (var0.anInt1035 == 1)
			var1 = Class36.aClass21_380.method120(var0.anInt1048, var0.anInt1036, var0.anInt1037);

		if (var0.anInt1035 == 2)
			var1 = Class36.aClass21_380.method121(var0.anInt1048, var0.anInt1036, var0.anInt1037);

		if (var0.anInt1035 == 3)
			var1 = Class36.aClass21_380.method126(var0.anInt1048, var0.anInt1036, var0.anInt1037);

		if (var1 != 0) {
			final int var5 = Class36.aClass21_380.method141(var0.anInt1048, var0.anInt1036, var0.anInt1037, var1);
			var2 = (var1 >> 14) & 32767;
			var3 = var5 & 31;
			var4 = (var5 >> 6) & 3;
		}

		var0.anInt1038 = var2;
		var0.anInt1040 = var3;
		var0.anInt1039 = var4;
	}

	final void method892(final int var1, final boolean var2) {
		int var3 = anIntArray1722[0];
		int var5 = anIntArray1723[0];
		if (var1 == 0) {
			--var3;
			++var5;
		}

		if (var1 == 1)
			++var5;

		if (var1 == 2) {
			++var3;
			++var5;
		}

		if (var1 == 3)
			--var3;

		if (var1 == 4)
			++var3;

		if (var1 == 5) {
			--var3;
			--var5;
		}

		if (var1 == 6)
			--var5;

		if (var1 == 7) {
			++var3;
			--var5;
		}

		if ((anInt1699 != -1) && (Class124_Sub22_Sub14.method750(anInt1699).anInt1540 == 1))
			anInt1699 = -1;

		if (anInt1721 < 9)
			++anInt1721;

		for (int var4 = anInt1721; var4 > 0; --var4) {
			anIntArray1722[var4] = anIntArray1722[var4 - 1];
			anIntArray1723[var4] = anIntArray1723[var4 - 1];
			aBoolArray1701[var4] = aBoolArray1701[var4 - 1];
		}

		anIntArray1722[0] = var3;
		anIntArray1723[0] = var5;
		aBoolArray1701[0] = var2;
	}

	final void method893(final int var1, final int var2, final boolean var3) {
		if ((anInt1699 != -1) && (Class124_Sub22_Sub14.method750(anInt1699).anInt1540 == 1))
			anInt1699 = -1;

		if (!var3) {
			final int var4 = var1 - anIntArray1722[0];
			final int var6 = var2 - anIntArray1723[0];
			if ((var4 >= -8) && (var4 <= 8) && (var6 >= -8) && (var6 <= 8)) {
				if (anInt1721 < 9)
					++anInt1721;

				for (int var5 = anInt1721; var5 > 0; --var5) {
					anIntArray1722[var5] = anIntArray1722[var5 - 1];
					anIntArray1723[var5] = anIntArray1723[var5 - 1];
					aBoolArray1701[var5] = aBoolArray1701[var5 - 1];
				}

				anIntArray1722[0] = var1;
				anIntArray1723[0] = var2;
				aBoolArray1701[0] = false;
				return;
			}
		}

		anInt1721 = 0;
		anInt1726 = 0;
		anInt1725 = 0;
		anIntArray1722[0] = var1;
		anIntArray1723[0] = var2;
		anInt1690 = (anIntArray1722[0] * 128) + (anInt1674 * 64);
		anInt1697 = (128 * anIntArray1723[0]) + (anInt1674 * 64);
	}

	final void method894(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < 4; ++var4)
			if (anIntArray1688[var4] <= var3) {
				anIntArray1727[var4] = var1;
				anIntArray1689[var4] = var2;
				anIntArray1688[var4] = 70 + var3;
				return;
			}

	}

	boolean method895(final int var1) {
		return false;
	}

	static void method896(final int var0, final Class69 var1, final Class94_Sub1 var2) {
		byte[] var3 = null;
		final Class111 var4 = Class99.aClass111_776;
		synchronized (var4) {
			for (Class124_Sub19 var5 = (Class124_Sub19) Class99.aClass111_776
					.method428(); null != var5; var5 = (Class124_Sub19) Class99.aClass111_776.method430())
				if ((var5.aLong874 == var0) && (var5.aClass69_1296 == var1) && (var5.anInt1295 == 0)) {
					var3 = var5.aByteArray1298;
					break;
				}
		}

		if (null != var3)
			var2.method614(var1, var0, var3, true);
		else {
			final byte[] var8 = var1.method304(var0);
			var2.method614(var1, var0, var8, true);
		}
	}

	public static void method897() {
		Class100.aClass113_786.method436();
	}
}

public class Class88 implements Interface3 {
	static Class94_Sub1 aClass94_Sub1_695;
	protected static boolean aBool702;
	public String aString700;
	int anInt701;
	static Class88 aClass88_696 = new Class88("runescape", "RuneScape", 0);
	static Class88 aClass88_698 = new Class88("stellardawn", "Stellar Dawn", 1);
	static Class88 aClass88_703 = new Class88("game3", "Game 3", 2);
	static Class88 aClass88_697 = new Class88("game4", "Game 4", 3);
	static Class88 aClass88_694 = new Class88("game5", "Game 5", 4);
	public static Class88 aClass88_699 = new Class88("oldscape", "RuneScape 2007", 5);

	public static final void method343(final int var0, final boolean var1, final int var2) {
		if ((var0 >= 8000) && (var0 <= '\ubb80')) {
			Class8.anInt94 = var0;
			Class8.aBool77 = var1;
			Class8.anInt78 = var2;
		} else
			throw new IllegalArgumentException();
	}

	@Override
	public int method11(final int var1) {
		return anInt701;
	}

	static final void method344(final Class124_Sub22_Sub19_Sub3 var0) {
		if (var0.anInt1724 != 0) {
			int var4;
			int var5;
			if ((var0.anInt1694 != -1) && (var0.anInt1694 < '\u8000')) {
				final Class124_Sub22_Sub19_Sub3_Sub1 var3 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var0.anInt1694];
				if (var3 != null) {
					var4 = var0.anInt1690 - var3.anInt1690;
					var5 = var0.anInt1697 - var3.anInt1697;
					if ((var4 != 0) || (var5 != 0))
						var0.anInt1718 = (int) (Math.atan2(var4, var5) * 325.949D) & 2047;
				}
			}

			int var2;
			if (var0.anInt1694 >= '\u8000') {
				var2 = var0.anInt1694 - '\u8000';
				if (var2 == client.anInt2106)
					var2 = 2047;

				final Class124_Sub22_Sub19_Sub3_Sub2 var1 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var2];
				if (null != var1) {
					var5 = var0.anInt1690 - var1.anInt1690;
					final int var6 = var0.anInt1697 - var1.anInt1697;
					if ((var5 != 0) || (var6 != 0))
						var0.anInt1718 = (int) (Math.atan2(var5, var6) * 325.949D) & 2047;
				}
			}

			if (((var0.anInt1671 != 0) || (var0.anInt1728 != 0)) && ((var0.anInt1721 == 0) || (var0.anInt1725 > 0))) {
				var2 = var0.anInt1690 - ((var0.anInt1671 * 64) - (Class9.anInt102 * 64) - (Class9.anInt102 * 64));
				var4 = var0.anInt1697 - ((var0.anInt1728 * 64) - (Class95.anInt762 * 64) - (Class95.anInt762 * 64));
				if ((var2 != 0) || (var4 != 0))
					var0.anInt1718 = (int) (Math.atan2(var2, var4) * 325.949D) & 2047;

				var0.anInt1671 = 0;
				var0.anInt1728 = 0;
			}

			var2 = (var0.anInt1718 - var0.anInt1672) & 2047;
			if (var2 != 0) {
				++var0.anInt1704;
				boolean var7;
				if (var2 > 1024) {
					var0.anInt1672 -= var0.anInt1724;
					var7 = true;
					if ((var2 < var0.anInt1724) || (var2 > (2048 - var0.anInt1724))) {
						var0.anInt1672 = var0.anInt1718;
						var7 = false;
					}

					if ((var0.anInt1675 == var0.anInt1719) && ((var0.anInt1704 > 25) || var7))
						if (var0.anInt1676 != -1)
							var0.anInt1675 = var0.anInt1676;
						else
							var0.anInt1675 = var0.anInt1712;
				} else {
					var0.anInt1672 += var0.anInt1724;
					var7 = true;
					if ((var2 < var0.anInt1724) || (var2 > (2048 - var0.anInt1724))) {
						var0.anInt1672 = var0.anInt1718;
						var7 = false;
					}

					if ((var0.anInt1719 == var0.anInt1675) && ((var0.anInt1704 > 25) || var7))
						if (var0.anInt1677 != -1)
							var0.anInt1675 = var0.anInt1677;
						else
							var0.anInt1675 = var0.anInt1712;
				}

				var0.anInt1672 &= 2047;
			} else
				var0.anInt1704 = 0;

		}
	}

	Class88(final String var1, final String var2, final int var3) {
		aString700 = var1;
		anInt701 = var3;
	}
}

public final class Class124_Sub22_Sub19_Sub3_Sub1 extends Class124_Sub22_Sub19_Sub3 {
	static boolean aBool1938;
	static byte[][] aByteArrayArray1939;
	static int anInt1940;
	Class124_Sub22_Sub1 aClass124_Sub22_Sub1_1941;

	public static void method1041() {
		if (Class92.aClass78_732 != null)
			Class92.aClass78_732.method324();

	}

	@Override
	final boolean method895(final int var1) {
		return null != aClass124_Sub22_Sub1_1941;
	}

	static Class124_Sub18 method1042(final Class94 var0, final int var1) {
		final byte[] var2 = var0.method368(var1);
		return var2 == null ? null : new Class124_Sub18(var2);
	}

	@Override
	protected final Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		if (null == aClass124_Sub22_Sub1_1941)
			return null;
		else {
			final Class124_Sub22_Sub13 var3 = (anInt1699 != -1) && (anInt1673 == 0)
					? Class124_Sub22_Sub14.method750(anInt1699) : null;
			final Class124_Sub22_Sub13 var5 = (anInt1675 == -1) || ((anInt1719 == anInt1675) && (null != var3)) ? null
					: Class124_Sub22_Sub14.method750(anInt1675);
			Class124_Sub22_Sub19_Sub7 var4 = aClass124_Sub22_Sub1_1941.method645(var3, anInt1700, var5, anInt1695);
			if (var4 == null)
				return null;
			else {
				var4.method989();
				anInt1717 = var4.anInt1605;
				if ((anInt1710 != -1) && (anInt1705 != -1)) {
					final Class124_Sub22_Sub19_Sub7 var2 = Class43.method217(anInt1710).method733(anInt1705);
					if (null != var2) {
						var2.method997(0, -anInt1678, 0);
						final Class124_Sub22_Sub19_Sub7[] var6 = new Class124_Sub22_Sub19_Sub7[] { var4, var2 };
						var4 = new Class124_Sub22_Sub19_Sub7(var6, 2);
					}
				}

				if (aClass124_Sub22_Sub1_1941.anInt1320 == 1)
					var4.aBool1861 = true;

				return var4;
			}
		}
	}

	public static int method1043(final CharSequence var0, final int var1) {
		return Class124_Sub22_Sub19_Sub2.method889(var0, var1, true);
	}
}

public class Class23 {
	String aString254;
	int anInt255;
	static Class23[] aClass23Array256;
	static Class124_Sub22_Sub16_Sub4_Sub1 aClass124_Sub22_Sub16_Sub4_Sub1_260;
	int anInt261;
	int anInt262;
	String aString263;
	int anInt264;
	int anInt265;
	static int anInt257 = 0;
	static int anInt258 = 0;
	static int[] anIntArray266 = new int[] { 1, 1, 1, 1 };
	static int[] anIntArray259 = new int[] { 0, 1, 2, 3 };

	boolean method152() {
		return (1 & anInt255) != 0;
	}

	boolean method153() {
		return (2 & anInt255) != 0;
	}

	boolean method154() {
		return (4 & anInt255) != 0;
	}

	boolean method155() {
		return (8 & anInt255) != 0;
	}

	static final void method156(final String var0) {
		if (null != var0) {
			final String var1 = Class34.method186(var0, Class49.aClass117_488);
			if (null != var1)
				for (int var2 = 0; var2 < client.anInt2252; ++var2) {
					final Class35 var6 = client.aClass35Array1986[var2];
					final String var4 = var6.aString372;
					final String var5 = Class34.method186(var4, Class49.aClass117_488);
					boolean var7;
					if ((null != var0) && (var4 != null)) {
						if (!var0.startsWith("#") && !var4.startsWith("#"))
							var7 = var1.equals(var5);
						else
							var7 = var0.equals(var4);
					} else
						var7 = false;

					if (var7) {
						--client.anInt2252;

						for (int var3 = var2; var3 < client.anInt2252; ++var3)
							client.aClass35Array1986[var3] = client.aClass35Array1986[1 + var3];

						client.anInt2175 = client.anInt2067;
						client.aClass124_Sub14_Sub1_2024.method837(27);
						client.aClass124_Sub14_Sub1_2024.method545(Class54.method258(var0));
						client.aClass124_Sub14_Sub1_2024.method550(var0);
						break;
					}
				}
		}
	}

	static Class124_Sub22_Sub16_Sub2 method157(final Class94 var0, final int var1, final int var2) {
		if (!Class124_Sub22_Sub2.method653(var0, var1, var2))
			return null;
		else {
			final Class124_Sub22_Sub16_Sub2 var4 = new Class124_Sub22_Sub16_Sub2();
			var4.anInt1741 = Class7.anInt67;
			var4.anInt1743 = Class49.anInt486;
			var4.anInt1737 = Class7.anIntArray68[0];
			var4.anInt1739 = Class7.anIntArray74[0];
			var4.anInt1738 = Class7.anIntArray69[0];
			var4.anInt1736 = Class7.anIntArray70[0];
			var4.anIntArray1742 = Class7.anIntArray66;
			var4.aByteArray1740 = Class124_Sub22_Sub5.aByteArrayArray1384[0];
			Class124_Sub7.method522();
			return var4;
		}
	}

	public static Interface3 method158(final Interface3[] var0, final int var1) {
		final Interface3[] var2 = var0;

		for (final Interface3 var4 : var2) {
			if (var1 == var4.method11(-1304754156))
				return var4;
		}

		return null;
	}
}

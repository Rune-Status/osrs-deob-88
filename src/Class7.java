public class Class7 {
	static int[] anIntArray66;
	static int anInt67;
	static int[] anIntArray68;
	static int[] anIntArray69;
	static int[] anIntArray70;
	static boolean aBool71;
	static Class124_Sub22_Sub16_Sub1[] aClass124_Sub22_Sub16_Sub1Array72;
	static int anInt73;
	static int[] anIntArray74;
	public static String aString75;

	static final boolean method33(final Widget var0) {
		final int var1 = var0.anInt1157;
		if (var1 == 205) {
			client.anInt2034 = 250;
			return true;
		} else {
			int var2;
			int var3;
			if ((var1 >= 300) && (var1 <= 313)) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				client.aClass100_2250.method395(var2, var3 == 1);
			}

			if ((var1 >= 314) && (var1 <= 323)) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				client.aClass100_2250.method396(var2, var3 == 1);
			}

			if (var1 == 324)
				client.aClass100_2250.method393(false);

			if (var1 == 325)
				client.aClass100_2250.method393(true);

			if (var1 == 326) {
				client.aClass124_Sub14_Sub1_2024.method837(149);
				client.aClass100_2250.method397(client.aClass124_Sub14_Sub1_2024);
				return true;
			} else
				return false;
		}
	}

	static char method34(final char var0) {
		switch (var0) {
		case '\u0020':
		case '\u002d':
		case '\u005f':
		case '\u00a0':
			return '\u005f';
		case '\u0023':
		case '\u005b':
		case '\u005d':
			return var0;
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return '\u0061';
		case '\u00c7':
		case '\u00e7':
			return '\u0063';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return '\u0065';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return '\u0069';
		case '\u00d1':
		case '\u00f1':
			return '\u006e';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return '\u006f';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return '\u0075';
		case '\u00df':
			return '\u0062';
		case '\u00ff':
		case '\u0178':
			return '\u0079';
		default:
			return Character.toLowerCase(var0);
		}
	}

	static final void method35(final byte[] var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final Class130[] var8) {
		int var11;
		for (int var9 = 0; var9 < 8; ++var9)
			for (var11 = 0; var11 < 8; ++var11)
				if (((var2 + var9) > 0) && ((var9 + var2) < 103) && ((var11 + var3) > 0) && ((var11 + var3) < 103))
					var8[var1].anIntArrayArray894[var2 + var9][var3 + var11] &= -16777217;

		final RSBuf var13 = new RSBuf(var0);

		for (var11 = 0; var11 < 4; ++var11)
			for (int var10 = 0; var10 < 64; ++var10)
				for (int var12 = 0; var12 < 64; ++var12)
					if ((var11 == var4) && (var10 >= var5) && (var10 < (var5 + 8)) && (var12 >= var6)
							&& (var12 < (var6 + 8)))
						Class45.method223(var13, var1, var2 + Def6.method693(var10 & 7, var12 & 7, var7),
								var3 + Class99.method392(var10 & 7, var12 & 7, var7), 0, 0, var7);
					else
						Class45.method223(var13, 0, -1, -1, 0, 0, 0);

	}
}

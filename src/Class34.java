public class Class34 implements Interface3 {
	static Class34 aClass34_368 = new Class34(0);
	static Class34 aClass34_370 = new Class34(1);
	static Class34 aClass34_369 = new Class34(2);
	int anInt371;

	public static String method186(final CharSequence var0, final Class117 var1) {
		if (var0 == null)
			return null;
		else {
			int var4 = 0;

			int var2;
			char var3;
			boolean var5;
			for (var2 = var0.length(); var4 < var2; ++var4) {
				var3 = var0.charAt(var4);
				var5 = (var3 == 160) || (var3 == 32) || (var3 == 95) || (var3 == 45);
				if (!var5)
					break;
			}

			while (var2 > var4) {
				var3 = var0.charAt(var2 - 1);
				var5 = (var3 == 160) || (var3 == 32) || (var3 == 95) || (var3 == 45);
				if (!var5)
					break;

				--var2;
			}

			final int var10 = var2 - var4;
			if ((var10 >= 1) && (var10 <= client.method514(var1))) {
				final StringBuilder var7 = new StringBuilder(var10);

				for (int var6 = var4; var6 < var2; ++var6) {
					final char var8 = var0.charAt(var6);
					if (Class78.method321(var8)) {
						final char var9 = Class7.method34(var8);
						if (var9 != 0)
							var7.append(var9);
					}
				}

				if (var7.length() == 0)
					return null;
				else
					return var7.toString();
			} else
				return null;
		}
	}

	Class34(final int var1) {
		anInt371 = var1;
	}

	static int method187() {
		return client.aBool2196 ? 2 : 1;
	}

	public static Def9 getNpcDef(final int var0, final int var1) {
		Def9 var2 = (Def9) Def9.aClass113_1316.forId(var0);
		if (var2 != null)
			return var2;
		else {
			final byte[] var3 = Def9.aClass94_1328.decode(9, var0);
			var2 = new Def9();
			var2.npcidmaybe = var0;
			if (var3 != null)
				var2.method642(new RSBuf(var3));

			var2.method638();
			Def9.aClass113_1316.map(var2, var0);
			return var2;
		}
	}

	@Override
	public int type(final int var1) {
		return anInt371;
	}
}

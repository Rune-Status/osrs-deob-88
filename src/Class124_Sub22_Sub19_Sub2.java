public final class Class124_Sub22_Sub19_Sub2 extends Class124_Sub22_Sub19 {
	int anInt1667;
	static Class8 aClass8_1668;
	int anInt1669;

	@Override
	protected final Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		return Class124_Sub22_Sub10.method724(anInt1667).method720(anInt1669);
	}

	public static int method889(final CharSequence var0, final int var1, final boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			boolean var9 = false;
			boolean var6 = false;
			int var4 = 0;
			final int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				final char var5 = var0.charAt(var8);
				if (var8 == 0) {
					if (var5 == 45) {
						var9 = true;
						continue;
					}

					if (var5 == 43)
						continue;
				}

				int var10;
				if ((var5 >= 48) && (var5 <= 57))
					var10 = var5 - 48;
				else if ((var5 >= 65) && (var5 <= 90))
					var10 = var5 - 55;
				else {
					if ((var5 < 97) || (var5 > 122))
						throw new NumberFormatException();

					var10 = var5 - 87;
				}

				if (var10 >= var1)
					throw new NumberFormatException();

				if (var9)
					var10 = -var10;

				final int var3 = (var1 * var4) + var10;
				if ((var3 / var1) != var4)
					throw new NumberFormatException();

				var4 = var3;
				var6 = true;
			}

			if (!var6)
				throw new NumberFormatException();
			else
				return var4;
		} else
			throw new IllegalArgumentException("");
	}
}

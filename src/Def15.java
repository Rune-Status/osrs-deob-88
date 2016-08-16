import java.awt.Component;

public class Def15 extends Class124_Sub22 {
	static Class94 aClass94_1551;
	public boolean aBool1550 = false;
	static Class113 aClass113_1549 = new Class113(64);

	void method748(final RSBuf var1) {
		while (true) {
			final int var2 = var1.method558();
			if (var2 == 0)
				return;

			method749(var1, var2);
		}
	}

	void method749(final RSBuf var1, final int var2) {
		if (var2 == 2)
			aBool1550 = true;

	}

	public static Def12 method750(final int var0) {
		Def12 var1 = (Def12) Def12.aClass113_1532.method434(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Def12.aClass94_1545.decode(12, var0);
			var1 = new Def12();
			if (var2 != null)
				var1.method739(new RSBuf(var2));

			var1.method740();
			Def12.aClass113_1532.method435(var1, var0);
			return var1;
		}
	}

	static final void method751() {
		if (null != Class124_Sub22_Sub19_Sub2.aClass8_1668)
			Class124_Sub22_Sub19_Sub2.aClass8_1668.method46();

		if (client.aClass8_2224 != null)
			client.aClass8_2224.method46();

	}

	public static final Class8 method752(final Class82 var0, final Component var1, final int var2, int var3) {
		if (Class8.anInt94 == 0)
			throw new IllegalStateException();
		else if ((var2 >= 0) && (var2 < 2)) {
			if (var3 < 256)
				var3 = 256;

			try {
				final Class8_Sub1 var7 = new Class8_Sub1();
				var7.anIntArray91 = new int[256 * (Class8.aBool77 ? 2 : 1)];
				var7.anInt85 = var3;
				var7.method36(var1);
				var7.anInt84 = 1024 + (var3 & -1024);
				if (var7.anInt84 > 16384)
					var7.anInt84 = 16384;

				var7.method42(var7.anInt84);
				if ((Class8.anInt78 > 0) && (Class8.aClass18_79 == null)) {
					Class8.aClass18_79 = new Class18();
					Class8.aClass18_79.aClass82_158 = var0;
					var0.method334(Class8.aClass18_79, Class8.anInt78);
				}

				if (null != Class8.aClass18_79) {
					if (Class8.aClass18_79.aClass8Array159[var2] != null)
						throw new IllegalArgumentException();

					Class8.aClass18_79.aClass8Array159[var2] = var7;
				}

				return var7;
			} catch (final Throwable var6) {
				try {
					final Class8_Sub2 var4 = new Class8_Sub2(var0, var2);
					var4.anIntArray91 = new int[256 * (Class8.aBool77 ? 2 : 1)];
					var4.anInt85 = var3;
					var4.method36(var1);
					var4.anInt84 = 16384;
					var4.method42(var4.anInt84);
					if ((Class8.anInt78 > 0) && (null == Class8.aClass18_79)) {
						Class8.aClass18_79 = new Class18();
						Class8.aClass18_79.aClass82_158 = var0;
						var0.method334(Class8.aClass18_79, Class8.anInt78);
					}

					if (Class8.aClass18_79 != null) {
						if (Class8.aClass18_79.aClass8Array159[var2] != null)
							throw new IllegalArgumentException();

						Class8.aClass18_79.aClass8Array159[var2] = var4;
					}

					return var4;
				} catch (final Throwable var5) {
					return new Class8();
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	static int method753() {
		return 8;
	}

	static int method754(final int var0, final int var1, final int var2) {
		return (Class27.aByteArrayArrayArray285[var0][var1][var2] & 8) != 0 ? 0
				: ((var0 > 0) && ((Class27.aByteArrayArrayArray285[1][var1][var2] & 2) != 0) ? var0 - 1 : var0);
	}
}

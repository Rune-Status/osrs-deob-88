import java.awt.Frame;
import java.io.EOFException;
import java.io.IOException;

public final class Class69 {
	protected static Frame aFrame578;
	static int anInt580;
	public static CacheArch aClass94_581;
	static byte[] aByteArray575 = new byte[520];
	Class132 aClass132_579 = null;
	Class132 aClass132_576 = null;
	int anInt577 = '\ufde8';
	int anInt582;

	public boolean method302(final int var1, final byte[] var2, final int var3) {
		final Class132 var4 = aClass132_579;
		synchronized (var4) {
			if ((var3 >= 0) && (var3 <= anInt577)) {
				boolean var5 = method303(var1, var2, var3, true);
				if (!var5)
					var5 = method303(var1, var2, var3, false);

				return var5;
			} else
				throw new IllegalArgumentException();
		}
	}

	boolean method303(final int var1, final byte[] var2, final int var3, boolean var4) {
		final Class132 var5 = aClass132_579;
		synchronized (var5) {
			boolean var10000;
			try {
				int var6;
				if (var4) {
					if (aClass132_576.method481() < (var1 * 6) + 6)
						return false;

					aClass132_576.method474(6 * var1);
					aClass132_576.method477(aByteArray575, 0, 6);
					var6 = (aByteArray575[5] & 255) + ((aByteArray575[3] & 255) << 16)
							+ ((aByteArray575[4] & 255) << 8);
					if ((var6 <= 0) || (var6 > (aClass132_579.method481() / 520L)))
						return false;
				} else {
					var6 = (int) ((aClass132_579.method481() + 519L) / 520L);
					if (var6 == 0)
						var6 = 1;
				}

				aByteArray575[0] = (byte) (var3 >> 16);
				aByteArray575[1] = (byte) (var3 >> 8);
				aByteArray575[2] = (byte) var3;
				aByteArray575[3] = (byte) (var6 >> 16);
				aByteArray575[4] = (byte) (var6 >> 8);
				aByteArray575[5] = (byte) var6;
				aClass132_576.method474(var1 * 6);
				aClass132_576.method475(aByteArray575, 0, 6);
				int var7 = 0;

				for (int var8 = 0; var7 < var3; ++var8) {
					int var9 = 0;
					int var11;
					if (var4) {
						aClass132_579.method474(520 * var6);

						try {
							aClass132_579.method477(aByteArray575, 0, 8);
						} catch (final EOFException var16) {
							break;
						}

						var11 = (aByteArray575[1] & 255) + ((aByteArray575[0] & 255) << 8);
						final int var12 = (aByteArray575[3] & 255) + ((aByteArray575[2] & 255) << 8);
						var9 = (aByteArray575[6] & 255) + ((aByteArray575[4] & 255) << 16)
								+ ((aByteArray575[5] & 255) << 8);
						final int var13 = aByteArray575[7] & 255;
						if ((var11 != var1) || (var8 != var12) || (var13 != anInt582))
							return false;

						if ((var9 < 0) || (var9 > (aClass132_579.method481() / 520L)))
							return false;
					}

					if (var9 == 0) {
						var4 = false;
						var9 = (int) ((aClass132_579.method481() + 519L) / 520L);
						if (var9 == 0)
							++var9;

						if (var9 == var6)
							++var9;
					}

					if ((var3 - var7) <= 512)
						var9 = 0;

					aByteArray575[0] = (byte) (var1 >> 8);
					aByteArray575[1] = (byte) var1;
					aByteArray575[2] = (byte) (var8 >> 8);
					aByteArray575[3] = (byte) var8;
					aByteArray575[4] = (byte) (var9 >> 16);
					aByteArray575[5] = (byte) (var9 >> 8);
					aByteArray575[6] = (byte) var9;
					aByteArray575[7] = (byte) anInt582;
					aClass132_579.method474(var6 * 520);
					aClass132_579.method475(aByteArray575, 0, 8);
					var11 = var3 - var7;
					if (var11 > 512)
						var11 = 512;

					aClass132_579.method475(var2, var7, var11);
					var7 += var11;
					var6 = var9;
				}

				var10000 = true;
			} catch (final IOException var17) {
				return false;
			}

			return var10000;
		}
	}

	public byte[] method304(final int var1) {
		final Class132 var2 = aClass132_579;
		synchronized (var2) {
			try {
				if (aClass132_576.method481() < 6 + (6 * var1))
					return null;
				else {
					aClass132_576.method474(var1 * 6);
					aClass132_576.method477(aByteArray575, 0, 6);
					final int var3 = ((aByteArray575[1] & 255) << 8) + ((aByteArray575[0] & 255) << 16)
							+ (aByteArray575[2] & 255);
					int var4 = ((aByteArray575[4] & 255) << 8) + ((aByteArray575[3] & 255) << 16)
							+ (aByteArray575[5] & 255);
					if ((var3 < 0) || (var3 > anInt577))
						return null;
					else if ((var4 <= 0) || (var4 > (aClass132_579.method481() / 520L)))
						return null;
					else {
						final byte[] var5 = new byte[var3];
						int var6 = 0;

						for (int var7 = 0; var6 < var3; ++var7) {
							if (var4 == 0)
								return null;

							aClass132_579.method474(var4 * 520);
							int var8 = var3 - var6;
							if (var8 > 512)
								var8 = 512;

							aClass132_579.method477(aByteArray575, 0, 8 + var8);
							final int var9 = ((aByteArray575[0] & 255) << 8) + (aByteArray575[1] & 255);
							final int var10 = (aByteArray575[3] & 255) + ((aByteArray575[2] & 255) << 8);
							final int var11 = (aByteArray575[6] & 255) + ((aByteArray575[5] & 255) << 8)
									+ ((aByteArray575[4] & 255) << 16);
							final int var12 = aByteArray575[7] & 255;
							if ((var9 != var1) || (var10 != var7) || (var12 != anInt582))
								return null;

							if ((var11 < 0) || (var11 > (aClass132_579.method481() / 520L)))
								return null;

							for (int var13 = 0; var13 < var8; ++var13)
								var5[var6++] = aByteArray575[var13 + 8];

							var4 = var11;
						}

						final byte[] var10000 = var5;
						return var10000;
					}
				}
			} catch (final IOException var16) {
				return null;
			}
		}
	}

	public static void method305(final int var0) {
		if (Class96.anInt770 != 0)
			Class80.anInt644 = var0;
		else
			Class77.aClass124_Sub4_Sub3_624.method846(var0);

	}

	public Class69(final int var1, final Class132 var2, final Class132 var3, final int var4) {
		anInt582 = var1;
		aClass132_579 = var2;
		aClass132_576 = var3;
		anInt577 = var4;
	}
}

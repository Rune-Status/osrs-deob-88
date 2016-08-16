import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Def1 extends JagMap {
	static CacheArch aClass94_1365;
	int anInt1367 = 0;
	public int anInt1369;
	public int anInt1370;
	public int anInt1366;
	public int anInt1368;
	static Class113 aClass113_1371 = new Class113(64);

	static Class56 method657(final int var0) {
		try {
			return new Class56_Sub1();
		} catch (final Throwable var2) {
			return new Class56_Sub2();
		}
	}

	void method658() {
		method663(anInt1367);
	}

	void method659(final RSBuf var1, final int var2) {
		while (true) {
			final int var3 = var1.readByteU();
			if (var3 == 0)
				return;

			method666(var1, var3);
		}
	}

	public static Class124_Sub22_Sub16_Sub2 method660(final CacheArch var0, final int var1) {
		final byte[] var2 = var0.decode(var1);
		boolean var4;
		if (var2 == null)
			var4 = false;
		else {
			method661(var2);
			var4 = true;
		}

		if (!var4)
			return null;
		else {
			final Class124_Sub22_Sub16_Sub2 var3 = new Class124_Sub22_Sub16_Sub2();
			var3.anInt1741 = Class7.anInt67;
			var3.anInt1743 = Class49.anInt486;
			var3.anInt1737 = Class7.anIntArray68[0];
			var3.anInt1739 = Class7.anIntArray74[0];
			var3.anInt1738 = Class7.anIntArray69[0];
			var3.anInt1736 = Class7.anIntArray70[0];
			var3.anIntArray1742 = Class7.anIntArray66;
			var3.aByteArray1740 = Class124_Sub22_Sub5.aByteArrayArray1384[0];
			Class124_Sub7.method522();
			return var3;
		}
	}

	static void method661(final byte[] var0) {
		final RSBuf var1 = new RSBuf(var0);
		var1.pos = var0.length - 2;
		Class7.anInt73 = var1.readShortU();
		Class7.anIntArray68 = new int[Class7.anInt73];
		Class7.anIntArray74 = new int[Class7.anInt73];
		Class7.anIntArray69 = new int[Class7.anInt73];
		Class7.anIntArray70 = new int[Class7.anInt73];
		Class124_Sub22_Sub5.aByteArrayArray1384 = new byte[Class7.anInt73][];
		var1.pos = var0.length - 7 - (Class7.anInt73 * 8);
		Class7.anInt67 = var1.readShortU();
		Class49.anInt486 = var1.readShortU();
		final int var4 = (var1.readByteU() & 255) + 1;

		int var5;
		for (var5 = 0; var5 < Class7.anInt73; ++var5)
			Class7.anIntArray68[var5] = var1.readShortU();

		for (var5 = 0; var5 < Class7.anInt73; ++var5)
			Class7.anIntArray74[var5] = var1.readShortU();

		for (var5 = 0; var5 < Class7.anInt73; ++var5)
			Class7.anIntArray69[var5] = var1.readShortU();

		for (var5 = 0; var5 < Class7.anInt73; ++var5)
			Class7.anIntArray70[var5] = var1.readShortU();

		var1.pos = var0.length - 7 - (Class7.anInt73 * 8) - (3 * (var4 - 1));
		Class7.anIntArray66 = new int[var4];

		for (var5 = 1; var5 < var4; ++var5) {
			Class7.anIntArray66[var5] = var1.readTri();
			if (Class7.anIntArray66[var5] == 0)
				Class7.anIntArray66[var5] = 1;
		}

		var1.pos = 0;

		for (var5 = 0; var5 < Class7.anInt73; ++var5) {
			final int var9 = Class7.anIntArray69[var5];
			final int var10 = Class7.anIntArray70[var5];
			final int var6 = var9 * var10;
			final byte[] var7 = new byte[var6];
			Class124_Sub22_Sub5.aByteArrayArray1384[var5] = var7;
			final int var8 = var1.readByteU();
			int var3;
			if (var8 == 0)
				for (var3 = 0; var3 < var6; ++var3)
					var7[var3] = var1.readByte();
			else if (var8 == 1)
				for (var3 = 0; var3 < var9; ++var3)
					for (int var2 = 0; var2 < var10; ++var2)
						var7[(var9 * var2) + var3] = var1.readByte();
		}

	}

	public static void method662(final String[] var0, final short[] var1, final int var2, final int var3) {
		if (var2 < var3) {
			final int var6 = (var2 + var3) / 2;
			int var5 = var2;
			final String var7 = var0[var6];
			var0[var6] = var0[var3];
			var0[var3] = var7;
			final short var8 = var1[var6];
			var1[var6] = var1[var3];
			var1[var3] = var8;

			for (int var4 = var2; var4 < var3; ++var4)
				if ((var7 == null) || ((var0[var4] != null) && (var0[var4].compareTo(var7) < (var4 & 1)))) {
					final String var10 = var0[var4];
					var0[var4] = var0[var5];
					var0[var5] = var10;
					final short var9 = var1[var4];
					var1[var4] = var1[var5];
					var1[var5++] = var9;
				}

			var0[var3] = var0[var5];
			var0[var5] = var7;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method662(var0, var1, var2, var5 - 1);
			method662(var0, var1, 1 + var5, var3);
		}

	}

	void method663(final int var1) {
		final double var2 = ((var1 >> 16) & 255) / 256.0D;
		final double var10 = ((var1 >> 8) & 255) / 256.0D;
		final double var4 = (var1 & 255) / 256.0D;
		double var6 = var2;
		if (var10 < var2)
			var6 = var10;

		if (var4 < var6)
			var6 = var4;

		double var12 = var2;
		if (var10 > var2)
			var12 = var10;

		if (var4 > var12)
			var12 = var4;

		double var8 = 0.0D;
		double var14 = 0.0D;
		final double var16 = (var12 + var6) / 2.0D;
		if (var12 != var6) {
			if (var16 < 0.5D)
				var14 = (var12 - var6) / (var12 + var6);

			if (var16 >= 0.5D)
				var14 = (var12 - var6) / (2.0D - var12 - var6);

			if (var12 == var2)
				var8 = (var10 - var4) / (var12 - var6);
			else if (var12 == var10)
				var8 = ((var4 - var2) / (var12 - var6)) + 2.0D;
			else if (var4 == var12)
				var8 = 4.0D + ((var2 - var10) / (var12 - var6));
		}

		var8 /= 6.0D;
		anInt1369 = (int) (var14 * 256.0D);
		anInt1370 = (int) (256.0D * var16);
		if (anInt1369 < 0)
			anInt1369 = 0;
		else if (anInt1369 > 255)
			anInt1369 = 255;

		if (anInt1370 < 0)
			anInt1370 = 0;
		else if (anInt1370 > 255)
			anInt1370 = 255;

		if (var16 <= 0.5D)
			anInt1366 = (int) (512.0D * var14 * var16);
		else
			anInt1366 = (int) (512.0D * (1.0D - var16) * var14);

		if (anInt1366 < 1)
			anInt1366 = 1;

		anInt1368 = (int) (var8 * anInt1366);
	}

	static void method664(final int var0) {
		Class27.anInt290 = 99;
		Class27.aByteArrayArrayArray293 = new byte[4][104][104];
		Class57.aByteArrayArrayArray537 = new byte[4][104][104];
		Class27.aByteArrayArrayArray288 = new byte[4][104][104];
		Class3.aByteArrayArrayArray17 = new byte[4][104][104];
		Class27.anIntArrayArrayArray304 = new int[4][105][105];
		Class27.aByteArrayArrayArray289 = new byte[4][105][105];
		Class98.anIntArrayArray772 = new int[105][105];
		Class27.anIntArray287 = new int[104];
		Class64.anIntArray559 = new int[104];
		Def14.anIntArray1512 = new int[104];
		Class27.anIntArray291 = new int[104];
		Class27.anIntArray292 = new int[104];
	}

	public static Class66 method665(final int var0) {
		try {
			return new Class66_Sub1();
		} catch (final Throwable var2) {
			return null;
		}
	}

	void method666(final RSBuf var1, final int var2) {
		if (var2 == 1)
			anInt1367 = var1.readTri();

	}

	public static void method667(final Outbuf var0) {
		final Class124_Sub24 var1 = (Class124_Sub24) Class114.aClass110_824.method421();
		if (var1 != null) {
			final int var2 = var0.pos;
			var0.writeInt(var1.anInt1309);

			for (int var3 = 0; var3 < var1.anInt1307; ++var3)
				if (var1.anIntArray1314[var3] != 0)
					var0.writeByte(var1.anIntArray1314[var3]);
				else
					try {
						final int var4 = var1.anIntArray1308[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.aFieldArray1310[var3];
							var6 = var5.getInt((Object) null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.aFieldArray1310[var3];
							var5.setInt((Object) null, var1.anIntArray1306[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.aFieldArray1310[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.aMethodArray1312[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.aMethodArray1312[var3];
							final byte[][] var7 = var1.aByteArrayArrayArray1313[var3];
							final Object[] var8 = new Object[var7.length];

							for (int var9 = 0; var9 < var7.length; ++var9) {
								final ObjectInputStream var10 = new ObjectInputStream(
										new ByteArrayInputStream(var7[var9]));
								var8[var9] = var10.readObject();
							}

							final Object var11 = var25.invoke((Object) null, var8);
							if (null == var11)
								var0.writeByte(0);
							else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeULong(((Number) var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writestr((String) var11);
							} else
								var0.writeByte(4);
						}
					} catch (final ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (final InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (final StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (final OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (final IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (final IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (final InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (final SecurityException var20) {
						var0.writeByte(-17);
					} catch (final IOException var21) {
						var0.writeByte(-18);
					} catch (final NullPointerException var22) {
						var0.writeByte(-19);
					} catch (final Exception var23) {
						var0.writeByte(-20);
					} catch (final Throwable var24) {
						var0.writeByte(-21);
					}

			var0.writeclever(var2);
			var1.method450();
		}
	}

	static final void method668(final byte[] var0, final int var1, final int var2, final Class21 var3,
			final Class130[] var4) {
		final RSBuf var5 = new RSBuf(var0);
		int var9 = -1;

		while (true) {
			final int var6 = var5.getsmart((byte) 19);
			if (var6 == 0)
				return;

			var9 += var6;
			int var12 = 0;

			while (true) {
				final int var11 = var5.getsmart((byte) 18);
				if (var11 == 0)
					break;

				var12 += var11 - 1;
				final int var7 = var12 & 63;
				final int var13 = (var12 >> 6) & 63;
				final int var14 = var12 >> 12;
				final int var10 = var5.readByteU();
				final int var15 = var10 >> 2;
				final int var16 = var10 & 3;
				final int var18 = var13 + var1;
				final int var8 = var2 + var7;
				if ((var18 > 0) && (var8 > 0) && (var18 < 103) && (var8 < 103)) {
					int var17 = var14;
					if ((Class27.aByteArrayArrayArray285[1][var18][var8] & 2) == 2)
						var17 = var14 - 1;

					Class130 var19 = null;
					if (var17 >= 0)
						var19 = var4[var17];

					Class124_Sub9.method534(var14, var18, var8, var9, var16, var15, var3, var19);
				}
			}
		}
	}
}

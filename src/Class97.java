import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Class97 {
	static void method389(final int var0, final int var1) {
		final int[] var2 = new int[4];
		final int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var5 = 1;

		for (int var4 = 0; var4 < 4; ++var4)
			if (var0 != Class23.anIntArray259[var4]) {
				var2[var5] = Class23.anIntArray259[var4];
				var3[var5] = Class23.anIntArray266[var4];
				++var5;
			}

		Class23.anIntArray259 = var2;
		Class23.anIntArray266 = var3;
		Class40.method200(Class23.aClass23Array256, 0, Class23.aClass23Array256.length - 1, Class23.anIntArray259,
				Class23.anIntArray266);
	}

	public static void method390(final RSBuf var0) {
		final Class124_Sub24 var1 = new Class124_Sub24();
		var1.anInt1307 = var0.readByteU();
		var1.anInt1309 = var0.readInt2(-1089092006);
		var1.anIntArray1308 = new int[var1.anInt1307];
		var1.anIntArray1314 = new int[var1.anInt1307];
		var1.aFieldArray1310 = new Field[var1.anInt1307];
		var1.anIntArray1306 = new int[var1.anInt1307];
		var1.aMethodArray1312 = new Method[var1.anInt1307];
		var1.aByteArrayArrayArray1313 = new byte[var1.anInt1307][][];

		for (int var2 = 0; var2 < var1.anInt1307; ++var2)
			try {
				final int var3 = var0.readByteU();
				String var4;
				String var5;
				int var6;
				if ((var3 != 0) && (var3 != 1) && (var3 != 2)) {
					if ((var3 == 3) || (var3 == 4)) {
						var4 = var0.readStr2();
						var5 = var0.readStr2();
						var6 = var0.readByteU();
						final String[] var7 = new String[var6];

						for (int var8 = 0; var8 < var6; ++var8)
							var7[var8] = var0.readStr2();

						final String var9 = var0.readStr2();
						final byte[][] var10 = new byte[var6][];
						int var12;
						if (var3 == 3)
							for (int var11 = 0; var11 < var6; ++var11) {
								var12 = var0.readInt2(-213709922);
								var10[var11] = new byte[var12];
								var0.readReverse(var10[var11], 0, var12);
							}

						var1.anIntArray1308[var2] = var3;
						final Class[] var13 = new Class[var6];

						for (var12 = 0; var12 < var6; ++var12)
							var13[var12] = Class96.method388(var7[var12]);

						final Class var14 = Class96.method388(var9);
						if (Class96.method388(var4).getClassLoader() == null)
							throw new SecurityException();

						final Method[] var15 = Class96.method388(var4).getDeclaredMethods();
						final Method[] var16 = var15;

						for (final Method var18 : var16) {
							if (var18.getName().equals(var5)) {
								final Class[] var19 = var18.getParameterTypes();
								if (var19.length == var13.length) {
									boolean var20 = true;

									for (int var21 = 0; var21 < var13.length; ++var21)
										if (var13[var21] != var19[var21]) {
											var20 = false;
											break;
										}

									if (var20 && (var14 == var18.getReturnType()))
										var1.aMethodArray1312[var2] = var18;
								}
							}
						}

						var1.aByteArrayArrayArray1313[var2] = var10;
					}
				} else {
					var4 = var0.readStr2();
					var5 = var0.readStr2();
					var6 = 0;
					if (var3 == 1)
						var6 = var0.readInt2(-340697723);

					var1.anIntArray1308[var2] = var3;
					var1.anIntArray1306[var2] = var6;
					if (Class96.method388(var4).getClassLoader() == null)
						throw new SecurityException();

					var1.aFieldArray1310[var2] = Class96.method388(var4).getDeclaredField(var5);
				}
			} catch (final ClassNotFoundException var23) {
				var1.anIntArray1314[var2] = -1;
			} catch (final SecurityException var24) {
				var1.anIntArray1314[var2] = -2;
			} catch (final NullPointerException var25) {
				var1.anIntArray1314[var2] = -3;
			} catch (final Exception var26) {
				var1.anIntArray1314[var2] = -4;
			} catch (final Throwable var27) {
				var1.anIntArray1314[var2] = -5;
			}

		Class114.aClass110_824.method420(var1);
	}
}

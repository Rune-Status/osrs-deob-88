import java.applet.Applet;
import java.io.File;
import java.io.IOException;

public class RuntimeException_Sub1 extends RuntimeException {
	/**
	 *
	 */
	private static final long serialVersionUID = 7196089303439778452L;
	public static String aString1911;
	String aString1912;
	Throwable aThrowable1913;
	public static int anInt1914;
	static Applet anApplet1915;

	static File method1009(final String var0, final String var1, final int var2) {
		final String var3 = var2 == 0 ? "" : "" + var2;
		Class73.aFile603 = new File(Class73.aString606, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		RSBuf var8;
		File var23;
		if (Class73.aFile603.exists()) {
			try {
				final Class127 var7 = new Class127(Class73.aFile603, "rw", 10000L);

				int var9;
				for (var8 = new RSBuf(
						(int) var7.method460()); var8.pos < var8.backing.length; var8.pos += var9) {
					var9 = var7.method459(var8.backing, var8.pos,
							var8.backing.length - var8.pos);
					if (var9 == -1)
						throw new IOException();
				}

				var8.pos = 0;
				var9 = var8.readByteU();
				if ((var9 < 1) || (var9 > 3))
					throw new IOException("" + var9);

				int var10 = 0;
				if (var9 > 1)
					var10 = var8.readByteU();

				if (var9 <= 2) {
					var4 = var8.readStr3();
					if (var10 == 1)
						var5 = var8.readStr3();
				} else {
					var4 = var8.decodeStr();
					if (var10 == 1)
						var5 = var8.decodeStr();
				}

				var7.method461();
			} catch (final IOException var21) {
				var21.printStackTrace();
			}

			if (null != var4) {
				var23 = new File(var4);
				if (!var23.exists())
					var4 = null;
			}

			if (var4 != null) {
				var23 = new File(var4, "test.dat");
				if (!Class37.method197(var23, true))
					var4 = null;
			}
		}

		if ((null == var4) && (var2 == 0))
			label111: for (int var11 = 0; var11 < Class43.aStringArray430.length; ++var11)
				for (int var12 = 0; var12 < Class121_Sub1.aStringArray913.length; ++var12) {
					final File var13 = new File(Class121_Sub1.aStringArray913[var12] + Class43.aStringArray430[var11]
							+ File.separatorChar + var0 + File.separatorChar);
					if (var13.exists() && Class37.method197(new File(var13, "test.dat"), true)) {
						var4 = var13.toString();
						var6 = true;
						break label111;
					}
				}

		if (null == var4) {
			var4 = Class73.aString606 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0
					+ File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var22;
		if (null != var5) {
			var22 = new File(var5);
			var23 = new File(var4);

			try {
				final File[] var24 = var22.listFiles();
				final File[] var14 = var24;

				for (final File var16 : var14) {
					final File var17 = new File(var23, var16.getName());
					final boolean var18 = var16.renameTo(var17);
					if (!var18)
						throw new IOException();
				}
			} catch (final Exception var20) {
				var20.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var22 = new File(var4);
			var8 = null;

			try {
				final Class127 var25 = new Class127(Class73.aFile603, "rw", 10000L);
				final RSBuf var26 = new RSBuf(500);
				var26.writeByte(3);
				var26.writeByte(null != var8 ? 1 : 0);
				var26.method551(var22.getPath());
				var25.method458(var26.backing, 0, var26.pos);
				var25.method461();
			} catch (final IOException var19) {
				var19.printStackTrace();
			}
		}

		return new File(var4);
	}

	public static Widget method1010(final int var0, final int var1, final int var2) {
		final Widget var3 = Class10.getwidget(var0);
		return var1 != -1
				? ((null != var3) && (null != var3.aClass124_Sub17Array1263)
						&& (var1 < var3.aClass124_Sub17Array1263.length) ? var3.aClass124_Sub17Array1263[var1] : null)
				: var3;
	}

	public static void method1011() {
		Def9.aClass113_1316.map();
		Def9.aClass113_1317.map();
	}

	public static int method1012(final int var0, final int var1) {
		return (var0 >> 17) & 7;
	}

	public static String method1013(final RSBuf var0) {
		String var4;
		try {
			int var1 = var0.getsmart((byte) 68);
			if (var1 > 32767)
				var1 = 32767;

			final byte[] var2 = new byte[var1];
			var0.pos += Class129.aClass63_889.method282(var0.backing, var0.pos, var2, 0, var1);
			final String var3 = Class1.toString(var2, 0, var1);
			var4 = var3;
		} catch (final Exception var6) {
			var4 = "Cabbage";
		}

		return var4;
	}
}

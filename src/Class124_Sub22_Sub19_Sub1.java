import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public final class Class124_Sub22_Sub19_Sub1 extends Class124_Sub22_Sub19 {
	static long aLong1658;
	static int[] anIntArray1661;
	static Class78 aClass78_1662;
	protected static int anInt1664;
	static byte aByte1665;
	int anInt1660 = 0;
	int anInt1659 = 0;
	boolean aBool1657 = false;
	int anInt1666;
	int anInt1654;
	int anInt1655;
	int anInt1663;
	int anInt1656;
	int anInt1653;
	Def12 aClass124_Sub22_Sub13_1652;

	final void method884(final int var1, final byte var2) {
		if (!aBool1657) {
			anInt1660 += var1;

			while (anInt1660 > aClass124_Sub22_Sub13_1652.anIntArray1529[anInt1659]) {
				anInt1660 -= aClass124_Sub22_Sub13_1652.anIntArray1529[anInt1659];
				++anInt1659;
				if (anInt1659 >= aClass124_Sub22_Sub13_1652.anIntArray1536.length) {
					aBool1657 = true;
					break;
				}
			}

		}
	}

	@Override
	protected final Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		final Def13 var2 = Class43.method217(anInt1666);
		Class124_Sub22_Sub19_Sub7 var3;
		if (!aBool1657)
			var3 = var2.method733(anInt1659);
		else
			var3 = var2.method733(-1);

		return null == var3 ? null : var3;
	}

	static void method885() {
		final int var0 = Applet_Sub1.anInt1973;
		final int var1 = Applet_Sub1.anInt1974;
		final int var2 = client.anInt989 - Class56_Sub2.anInt1083 - var0;
		final int var3 = anInt1664 - Class81.anInt662 - var1;
		if ((var0 > 0) || (var2 > 0) || (var1 > 0) || (var3 > 0))
			try {
				final Container var4 = Class80.aclient645.method1059();
				int var5 = 0;
				int var6 = 0;
				if (Class69.aFrame578 == var4) {
					final Insets var7 = Class69.aFrame578.getInsets();
					var5 = var7.left;
					var6 = var7.top;
				}

				final Graphics var9 = var4.getGraphics();
				var9.setColor(Color.black);
				if (var0 > 0)
					var9.fillRect(var5, var6, var0, anInt1664);

				if (var1 > 0)
					var9.fillRect(var5, var6, client.anInt989, var1);

				if (var2 > 0)
					var9.fillRect((var5 + client.anInt989) - var2, var6, var2, anInt1664);

				if (var3 > 0)
					var9.fillRect(var5, (anInt1664 + var6) - var3, client.anInt989, var3);
			} catch (final Exception var8) {
				;
			}

	}

	Class124_Sub22_Sub19_Sub1(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anInt1666 = var1;
		anInt1654 = var2;
		anInt1655 = var3;
		anInt1663 = var4;
		anInt1656 = var5;
		anInt1653 = var6 + var7;
		final int var8 = Class43.method217(anInt1666).anInt1519;
		if (var8 != -1) {
			aBool1657 = false;
			aClass124_Sub22_Sub13_1652 = Def15.method750(var8);
		} else
			aBool1657 = true;

	}

	public static String method886(final String var0) {
		final int var1 = var0.length();
		final char[] var3 = new char[var1];
		byte var5 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var2 = var0.charAt(var4);
			if (var5 != 0) {
				if ((var5 == 2) || Character.isUpperCase(var2)) {
					char var6;
					if ((var2 != 181) && (var2 != 402))
						var6 = Character.toTitleCase(var2);
					else
						var6 = var2;

					var2 = var6;
				}
			} else
				var2 = Character.toLowerCase(var2);

			if (Character.isLetter(var2))
				var5 = 0;
			else if ((var2 != 46) && (var2 != 63) && (var2 != 33)) {
				if (Character.isSpaceChar(var2)) {
					if (var5 != 2)
						var5 = 1;
				} else
					var5 = 1;
			} else
				var5 = 2;

			var3[var4] = var2;
		}

		return new String(var3);
	}

	static void method887(final Def12 var0, final int var1, final int var2, final int var3) {
		if ((client.anInt2225 < 50) && (client.anInt2206 != 0))
			if ((var0.anIntArray1534 != null) && (var1 < var0.anIntArray1534.length)) {
				final int var5 = var0.anIntArray1534[var1];
				if (var5 != 0) {
					final int var7 = var5 >> 8;
					final int var8 = (var5 >> 4) & 7;
					final int var9 = var5 & 15;
					client.anIntArray2226[client.anInt2225] = var7;
					client.anIntArray2227[client.anInt2225] = var8;
					client.anIntArray2228[client.anInt2225] = 0;
					client.aClass12Array2230[client.anInt2225] = null;
					final int var6 = (var2 - 64) / 128;
					final int var4 = (var3 - 64) / 128;
					client.anIntArray2229[client.anInt2225] = var9 + (var6 << 16) + (var4 << 8);
					++client.anInt2225;
				}
			}
	}

	static long avail(final int var0) {
		try {
			final URL var1 = new URL(Class5.method28("services", false) + "m=accountappeal/login.ws");
			final URLConnection var2 = var1.openConnection();
			var2.setRequestProperty("connection", "close");
			var2.setDoInput(true);
			var2.setDoOutput(true);
			var2.setConnectTimeout(5000);
			final OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
			var3.write("data1=req");
			var3.flush();
			final InputStream var4 = var2.getInputStream();
			final RSBuf var5 = new RSBuf(new byte[1000]);

			do {
				final int var6 = var4.read(var5.backing, var5.pos, 1000 - var5.pos);
				if (var6 == -1) {
					var5.pos = 0;
					final long var7 = var5.readLong2();
					return var7;
				}

				var5.pos += var6;
			} while (var5.pos < 1000);

			return 0L;
		} catch (final Exception var9) {
			return 0L;
		}
	}
}

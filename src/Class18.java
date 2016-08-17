import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class18 implements Runnable {
	Class82 aClass82_158;
	volatile boolean aBool161 = false;
	volatile Class8[] aClass8Array159 = new Class8[2];
	volatile boolean aBool160 = false;

	public static int method85(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return 1 + var0;
	}

	@Override
	public void run() {
		aBool161 = true;

		try {
			try {
				while (!aBool160) {
					Class8 var2;
					for (int var1 = 0; var1 < 2; ++var1) {
						var2 = aClass8Array159[var1];
						if (var2 != null)
							var2.method46();
					}

					client.sleep(10L);
					final Class82 var3 = aClass82_158;
					var2 = null;
					if (null != var3.anEventQueue666) {
						for (int var4 = 0; (var4 < 50) && (var3.anEventQueue666.peekEvent() != null); ++var4)
							client.sleep(1L);

						if (null != var2)
							var3.anEventQueue666.postEvent(new ActionEvent(var2, 1001, "dummy"));
					}
				}
			} catch (final Exception var8) {
				Class28.method166((String) null, var8);
				aBool161 = false;
				return;
			}

			aBool161 = false;
		} finally {
			aBool161 = false;
		}
	}

	static String method86(Throwable var0) throws IOException {
		String var5;
		if (var0 instanceof RuntimeException_Sub1) {
			final RuntimeException_Sub1 var6 = (RuntimeException_Sub1) var0;
			var5 = var6.aString1912 + " | ";
			var0 = var6.aThrowable1913;
		} else
			var5 = "";

		final StringWriter var12 = new StringWriter();
		final PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		final String var8 = var12.toString();
		final BufferedReader var9 = new BufferedReader(new StringReader(var8));
		final String var10 = var9.readLine();

		while (true)
			while (true) {
				String var4 = var9.readLine();
				if (var4 == null) {
					var5 = var5 + "| " + var10;
					return var5;
				}

				final int var7 = var4.indexOf(40);
				final int var11 = var4.indexOf(41, 1 + var7);
				if ((var7 >= 0) && (var11 >= 0)) {
					String var1 = var4.substring(var7 + 1, var11);
					final int var2 = var1.indexOf(".java:");
					if (var2 >= 0) {
						var1 = var1.substring(0, var2) + var1.substring(var2 + 5);
						var5 = var5 + var1 + '\u0020';
						continue;
					}

					var4 = var4.substring(0, var7);
				}

				var4 = var4.trim();
				var4 = var4.substring(var4.lastIndexOf(32) + 1);
				var4 = var4.substring(var4.lastIndexOf(9) + 1);
				var5 = var5 + var4 + '\u0020';
			}
	}

	static final String method87(final int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3)
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);

		return var1.length() > 9
				? " " + Class124_Sub4_Sub3.method874('\uff80') + var1.substring(0, var1.length() - 8) + "M" + " " + " ("
						+ var1 + ")" + "</col>"
				: (var1.length() > 6
						? " " + Class124_Sub4_Sub3.method874(16777215) + var1.substring(0, var1.length() - 4) + "K"
								+ " " + " (" + var1 + ")" + "</col>"
						: " " + Class124_Sub4_Sub3.method874(16776960) + var1 + "</col>");
	}

	public static byte method88(final char var0) {
		byte var1;
		if (((var0 > 0) && (var0 < 128)) || ((var0 >= 160) && (var0 <= 255)))
			var1 = (byte) var0;
		else if (var0 == 8364)
			var1 = -128;
		else if (var0 == 8218)
			var1 = -126;
		else if (var0 == 402)
			var1 = -125;
		else if (var0 == 8222)
			var1 = -124;
		else if (var0 == 8230)
			var1 = -123;
		else if (var0 == 8224)
			var1 = -122;
		else if (var0 == 8225)
			var1 = -121;
		else if (var0 == 710)
			var1 = -120;
		else if (var0 == 8240)
			var1 = -119;
		else if (var0 == 352)
			var1 = -118;
		else if (var0 == 8249)
			var1 = -117;
		else if (var0 == 338)
			var1 = -116;
		else if (var0 == 381)
			var1 = -114;
		else if (var0 == 8216)
			var1 = -111;
		else if (var0 == 8217)
			var1 = -110;
		else if (var0 == 8220)
			var1 = -109;
		else if (var0 == 8221)
			var1 = -108;
		else if (var0 == 8226)
			var1 = -107;
		else if (var0 == 8211)
			var1 = -106;
		else if (var0 == 8212)
			var1 = -105;
		else if (var0 == 732)
			var1 = -104;
		else if (var0 == 8482)
			var1 = -103;
		else if (var0 == 353)
			var1 = -102;
		else if (var0 == 8250)
			var1 = -101;
		else if (var0 == 339)
			var1 = -100;
		else if (var0 == 382)
			var1 = -98;
		else if (var0 == 376)
			var1 = -97;
		else
			var1 = 63;

		return var1;
	}

	static final void method89(final String var0, final int var1) {
		client.secbuf.writeOpcode(21); // write some sort of string
		client.secbuf.writeByte(Class54.len(var0) + 1);
		client.secbuf.writeByte(var1);
		client.secbuf.writestr(var0);
	}
}

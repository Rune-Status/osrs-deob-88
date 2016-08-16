import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Class78 implements Runnable {
	static Class79 aClass79_632;
	static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array635;
	protected static String aString636;
	boolean aBool628 = false;
	int anInt625 = 0;
	int anInt633 = 0;
	boolean aBool627 = false;
	Class82 aClass82_629;
	Socket aSocket634;
	InputStream anInputStream626;
	OutputStream anOutputStream637;
	byte[] aByteArray631;
	Class79 aClass79_630;

	public Class78(final Socket var1, final Class82 var2) throws IOException {
		aClass82_629 = var2;
		aSocket634 = var1;
		aSocket634.setSoTimeout(30000);
		aSocket634.setTcpNoDelay(true);
		anInputStream626 = aSocket634.getInputStream();
		anOutputStream637 = aSocket634.getOutputStream();
	}

	public int method319() throws IOException {
		return !aBool628 ? anInputStream626.read() : 0;
	}

	public void method320(final byte[] var1, int var2, int var3) throws IOException {
		if (!aBool628)
			while (var3 > 0) {
				final int var4 = anInputStream626.read(var1, var2, var3);
				if (var4 <= 0)
					throw new EOFException();

				var2 += var4;
				var3 -= var4;
			}
	}

	static final boolean method321(final char var0) {
		if (Character.isISOControl(var0))
			return false;
		else if (Def16.method671(var0))
			return true;
		else {
			char[] var2 = Class95.aCharArray763;

			int var1;
			char var3;
			for (var1 = 0; var1 < var2.length; ++var1) {
				var3 = var2[var1];
				if (var3 == var0)
					return true;
			}

			var2 = Class95.aCharArray761;

			for (var1 = 0; var1 < var2.length; ++var1) {
				var3 = var2[var1];
				if (var0 == var3)
					return true;
			}

			return false;
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					int var3;
					int var4;
					synchronized (this) {
						if (anInt625 == anInt633) {
							if (aBool628)
								break label80;

							try {
								this.wait();
							} catch (final InterruptedException var10) {
								;
							}
						}

						var3 = anInt625;
						if (anInt633 >= anInt625)
							var4 = anInt633 - anInt625;
						else
							var4 = 5000 - anInt625;
					}

					if (var4 <= 0)
						continue;

					try {
						anOutputStream637.write(aByteArray631, var3, var4);
					} catch (final IOException var9) {
						aBool627 = true;
					}

					anInt625 = (anInt625 + var4) % 5000;

					try {
						if (anInt633 == anInt625)
							anOutputStream637.flush();
					} catch (final IOException var8) {
						aBool627 = true;
					}
					continue;
				}

				try {
					if (anInputStream626 != null)
						anInputStream626.close();

					if (anOutputStream637 != null)
						anOutputStream637.close();

					if (null != aSocket634)
						aSocket634.close();
				} catch (final IOException var7) {
					;
				}

				aByteArray631 = null;
				break;
			}
		} catch (final Exception var12) {
			Class28.method166((String) null, var12);
		}

	}

	public int method322() throws IOException {
		return aBool628 ? 0 : anInputStream626.available();
	}

	public void method323(final byte[] var1, final int var2, final int var3) throws IOException {
		if (!aBool628)
			if (aBool627) {
				aBool627 = false;
				throw new IOException();
			} else {
				if (null == aByteArray631)
					aByteArray631 = new byte[5000];

				synchronized (this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						aByteArray631[anInt633] = var1[var5 + var2];
						anInt633 = (1 + anInt633) % 5000;
						if (anInt633 == ((anInt625 + 4900) % 5000))
							throw new IOException();
					}

					if (aClass79_630 == null)
						aClass79_630 = aClass82_629.method334(this, 3);

					notifyAll();
				}
			}
	}

	public void method324() {
		if (!aBool628) {
			synchronized (this) {
				aBool628 = true;
				notifyAll();
			}

			if (null != aClass79_630) {
				while (aClass79_630.anInt642 == 0)
					client.sleep(1L);

				if (aClass79_630.anInt642 == 1)
					try {
						((Thread) aClass79_630.anObject638).join();
					} catch (final InterruptedException var3) {
						;
					}
			}

			aClass79_630 = null;
		}
	}

	static void method325(final Widget[] var0, final int var1, final int var2, final int var3,
			final boolean var4) {
		for (final Widget element : var0) {
			final Widget var6 = element;
			if ((var6 != null) && (var1 == var6.anInt1259)) {
				Class25.method161(var6, var2, var3, var4);
				Class43.method221(var6, var2, var3);
				if (var6.anInt1174 > (var6.anInt1176 - var6.anInt1168))
					var6.anInt1174 = var6.anInt1176 - var6.anInt1168;

				if (var6.anInt1174 < 0)
					var6.anInt1174 = 0;

				if (var6.anInt1175 > (var6.anInt1177 - var6.anInt1169))
					var6.anInt1175 = var6.anInt1177 - var6.anInt1169;

				if (var6.anInt1175 < 0)
					var6.anInt1175 = 0;

				if (var6.anInt1191 == 0)
					Somet2.method831(var0, var6, var4);
			}
		}

	}

	@Override
	protected void finalize() {
		method324();
	}

	public static int method326(final int var0, final int var1, int var2, int var3, int var4, final int var5) {
		if ((var5 & 1) == 1) {
			final int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 - (var3 - 1) : (var2 == 2 ? 7 - var1 - (var4 - 1) : var0));
	}
}

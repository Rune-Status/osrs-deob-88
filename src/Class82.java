import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class82 implements Runnable {
	Interface1 anInterface1_669;
	static Class94_Sub1 aClass94_Sub1_671;
	Class79 aClass79_665 = null;
	Class79 aClass79_664 = null;
	boolean aBool668 = false;
	static String aString670;
	public EventQueue anEventQueue666;
	Thread aThread667;

	public static void method329(final Component var0) {
		var0.addMouseListener(Class81.aClass81_649);
		var0.addMouseMotionListener(Class81.aClass81_649);
		var0.addFocusListener(Class81.aClass81_649);
	}

	public final Interface1 method330() {
		return anInterface1_669;
	}

	@Override
	public final void run() {
		while (true) {
			Class79 var2;
			synchronized (this) {
				while (true) {
					if (aBool668)
						return;

					if (null != aClass79_665) {
						var2 = aClass79_665;
						aClass79_665 = aClass79_665.aClass79_639;
						if (null == aClass79_665)
							aClass79_664 = null;
						break;
					}

					try {
						this.wait();
					} catch (final InterruptedException var8) {
						;
					}
				}
			}

			try {
				final int var5 = var2.anInt641;
				if (var5 == 1)
					var2.anObject638 = new Socket(InetAddress.getByName((String) var2.anObject643), var2.anInt640);
				else if (var5 == 2) {
					final Thread var3 = new Thread((Runnable) var2.anObject643);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.anInt640);
					var2.anObject638 = var3;
				} else if (var5 == 4)
					var2.anObject638 = new DataInputStream(((URL) var2.anObject643).openStream());
				else if (var5 == 3) {
					final String var10 = ((var2.anInt640 >> 24) & 255) + "." + ((var2.anInt640 >> 16) & 255) + "."
							+ ((var2.anInt640 >> 8) & 255) + "." + (var2.anInt640 & 255);
					var2.anObject638 = InetAddress.getByName(var10).getHostName();
				}

				var2.anInt642 = 1;
			} catch (final ThreadDeath var6) {
				throw var6;
			} catch (final Throwable var7) {
				var2.anInt642 = 2;
			}
		}
	}

	final Class79 method331(final int var1, final int var2, final int var3, final Object var4) {
		final Class79 var5 = new Class79();
		var5.anInt641 = var1;
		var5.anInt640 = var2;
		var5.anObject643 = var4;
		synchronized (this) {
			if (null != aClass79_664) {
				aClass79_664.aClass79_639 = var5;
				aClass79_664 = var5;
			} else
				aClass79_664 = aClass79_665 = var5;

			notify();
			return var5;
		}
	}

	public final Class79 method332(final String var1, final int var2) {
		return method331(1, var2, 0, var1);
	}

	Class82() {
		Class101.aString788 = "Unknown";
		aString670 = "1.1";

		try {
			Class101.aString788 = System.getProperty("java.vendor");
			aString670 = System.getProperty("java.version");
		} catch (final Exception var3) {
			;
		}

		try {
			anEventQueue666 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (final Throwable var2) {
			;
		}

		aBool668 = false;
		aThread667 = new Thread(this);
		aThread667.setPriority(10);
		aThread667.setDaemon(true);
		aThread667.start();
	}

	public final Class79 method333(final int var1) {
		return method331(3, var1, 0, (Object) null);
	}

	public final Class79 method334(final Runnable var1, final int var2) {
		return method331(2, var2, 0, var1);
	}

	public final Class79 method335(final URL var1) {
		return method331(4, 0, 0, var1);
	}

	final void method336() {
		synchronized (this) {
			aBool668 = true;
			notifyAll();
		}

		try {
			aThread667.join();
		} catch (final InterruptedException var3) {
			;
		}

	}
}

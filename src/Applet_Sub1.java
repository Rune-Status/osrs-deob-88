import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	/**
	 *
	 */
	private static final long serialVersionUID = -5454698893580807092L;
	public static int anInt1980;
	static int anInt1964 = 0;
	static Applet_Sub1 anApplet_Sub1_1977 = null;
	protected static volatile boolean aBool1968 = true;
	protected static volatile boolean aBool1963 = false;
	static volatile long aLong1978 = 0L;
	static volatile boolean aBool1979 = true;
	static boolean aBool1966 = false;
	static long aLong1965 = 0L;
	boolean aBool1981;
	static int anInt1967 = 20;
	static int anInt1969 = 1;
	protected static int anInt1970 = 0;
	static long[] aLongArray1971 = new long[32];
	static long[] aLongArray1972 = new long[32];
	protected static int anInt1973 = 0;
	protected static int anInt1974 = 0;
	static int anInt1975 = 500;
	protected static boolean aBool1976 = false;

	protected final void method1049(final int var1, final int var2, final int var3) {
		try {
			if (null != anApplet_Sub1_1977) {
				++anInt1964;
				if (anInt1964 >= 3) {
					method1058("alreadyloaded");
					return;
				}

				getAppletContext().showDocument(getDocumentBase(), "_self");
				return;
			}

			anApplet_Sub1_1977 = this;
			Class56_Sub2.anInt1083 = var1;
			Class81.anInt662 = var2;
			Class105.anInt804 = var3;
			RuntimeException_Sub1.anApplet1915 = this;
			if (Class27.aClass82_303 == null)
				Class27.aClass82_303 = new Class82();

			Class27.aClass82_303.method334(this, 1);
		} catch (final Exception var5) {
			Class28.method166((String) null, var5);
			method1058("crash");
		}

	}

	protected final synchronized void method1050() {
		final Container var1 = method1059();
		if (Class124_Sub5.aCanvas990 != null) {
			Class124_Sub5.aCanvas990.removeFocusListener(this);
			var1.remove(Class124_Sub5.aCanvas990);
		}

		Class56_Sub2.anInt1083 = Math.max(var1.getWidth(), Class51.anInt489);
		Class81.anInt662 = Math.max(var1.getHeight(), Class124_Sub22_Sub2.anInt1356);
		Insets var2;
		if (Class69.aFrame578 != null) {
			var2 = Class69.aFrame578.getInsets();
			Class56_Sub2.anInt1083 -= var2.left + var2.right;
			Class81.anInt662 -= var2.top + var2.bottom;
		}

		Class124_Sub5.aCanvas990 = new Canvas_Sub1(this);
		var1.add(Class124_Sub5.aCanvas990);
		Class124_Sub5.aCanvas990.setSize(Class56_Sub2.anInt1083, Class81.anInt662);
		Class124_Sub5.aCanvas990.setVisible(true);
		if (var1 == Class69.aFrame578) {
			var2 = Class69.aFrame578.getInsets();
			Class124_Sub5.aCanvas990.setLocation(anInt1973 + var2.left, var2.top + anInt1974);
		} else
			Class124_Sub5.aCanvas990.setLocation(anInt1973, anInt1974);

		Class124_Sub5.aCanvas990.addFocusListener(this);
		Class124_Sub5.aCanvas990.requestFocus();
		aBool1968 = true;
		final Class9 var3 = Class124_Sub22_Sub8.method701(Class56_Sub2.anInt1083, Class81.anInt662,
				Class124_Sub5.aCanvas990);
		if (null != Class64.aClass9_558)
			Class64.aClass9_558.method52(var3.anImage98.getGraphics(), 0, 0, (byte) 7);

		Class64.aClass9_558 = var3;
		aBool1963 = false;
		aLong1978 = Class74.method316(286032557);
	}

	protected final boolean method1051() {
		String var1 = getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (!var1.equals("mechscape.com") && !var1.endsWith(".mechscape.com")) {
					if (var1.endsWith("127.0.0.1"))
						return true;
					else {
						while ((var1.length() > 0) && (var1.charAt(var1.length() - 1) >= 48)
								&& (var1.charAt(var1.length() - 1) <= 57))
							var1 = var1.substring(0, var1.length() - 1);

						if (var1.endsWith("192.168.1."))
							return true;
						else {
							method1058("invalidhost");
							return false;
						}
					}
				} else
					return true;
			} else
				return true;
		} else
			return true;
	}

	@Override
	public final void focusLost(final FocusEvent var1) {
		aBool1979 = false;
	}

	void method1052() {
		final long var1 = Class74.method316(922956432);
		final long var3 = aLongArray1972[Class42.anInt426];
		aLongArray1972[Class42.anInt426] = var1;
		Class42.anInt426 = (1 + Class42.anInt426) & 31;
		if ((0L != var3) && (var1 > var3))
			;

		synchronized (this) {
			Class88.aBool702 = aBool1979;
		}

		method1055('\uff00');
	}

	final synchronized void method1053() {
		if (!aBool1966) {
			aBool1966 = true;

			try {
				Class124_Sub5.aCanvas990.removeFocusListener(this);
			} catch (final Exception var5) {
				;
			}

			try {
				method1057(781511512);
			} catch (final Exception var4) {
				;
			}

			if (Class69.aFrame578 != null)
				try {
					System.exit(0);
				} catch (final Throwable var3) {
					;
				}

			if (null != Class27.aClass82_303)
				try {
					Class27.aClass82_303.method336();
				} catch (final Exception var2) {
					;
				}

			method1061(2055029882);
		}
	}

	@Override
	public void start() {
		if ((anApplet_Sub1_1977 == this) && !aBool1966)
			aLong1965 = 0L;
	}

	@Override
	public final void update(final Graphics var1) {
		paint(var1);
	}

	@Override
	public final synchronized void paint(final Graphics var1) {
		if ((this == anApplet_Sub1_1977) && !aBool1966) {
			aBool1968 = true;
			if ((null != Class82.aString670) && Class82.aString670.startsWith("1.5")
					&& ((Class74.method316(-911525690) - aLong1978) > 1000L)) {
				final Rectangle var2 = var1.getClipBounds();
				if ((var2 == null) || ((var2.width >= Class56_Sub2.anInt1083) && (var2.height >= Class81.anInt662)))
					aBool1963 = true;
			}

		}
	}

	@Override
	public final void focusGained(final FocusEvent var1) {
		aBool1979 = true;
		aBool1968 = true;
	}

	static final void method1054(final boolean var0) {
		for (int var1 = 0; var1 < client.anInt2022; ++var1) {
			final Class124_Sub22_Sub19_Sub3_Sub1 var2 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[client.anIntArray2023[var1]];
			int var5 = (client.anIntArray2023[var1] << 14) + 536870912;
			if ((null != var2) && var2.method895(2056769871) && (var2.aClass124_Sub22_Sub1_1941.aBool1338 == var0)
					&& var2.aClass124_Sub22_Sub1_1941.method643()) {
				final int var4 = var2.anInt1690 >> 7;
				final int var3 = var2.anInt1697 >> 7;
				if ((var4 >= 0) && (var4 < 104) && (var3 >= 0) && (var3 < 104)) {
					if ((var2.anInt1674 == 1) && ((var2.anInt1690 & 127) == 64) && ((var2.anInt1697 & 127) == 64)) {
						if (client.anInt2084 == client.anIntArrayArray2083[var4][var3])
							continue;

						client.anIntArrayArray2083[var4][var3] = client.anInt2084;
					}

					if (!var2.aClass124_Sub22_Sub1_1941.aBool1346)
						var5 -= Integer.MIN_VALUE;

					Class36.aClass21_380.method144(Class134.anInt906, var2.anInt1690, var2.anInt1697,
							Class63.method285(var2.anInt1690 + ((var2.anInt1674 * 64) - 64),
									((var2.anInt1674 * 64) - 64) + var2.anInt1697, Class134.anInt906),
							((var2.anInt1674 * 64) - 64) + 60, var2, var2.anInt1672, var5, var2.aBool1708);
				}
			}
		}

	}

	@Override
	public void destroy() {
		if ((this == anApplet_Sub1_1977) && !aBool1966) {
			aLong1965 = Class74.method316(1271628832);
			client.method1067(5000L);
			method1053();
		}
	}

	@Override
	public final void windowActivated(final WindowEvent var1) {
	}

	@Override
	public final void windowDeactivated(final WindowEvent var1) {
	}

	@Override
	public final void windowIconified(final WindowEvent var1) {
	}

	@Override
	public final void windowOpened(final WindowEvent var1) {
	}

	@Override
	public abstract void init();

	protected abstract void method1055(int var1);

	protected abstract void method1056(byte var1);

	protected abstract void method1057(int var1);

	protected void method1058(final String var1) {
		if (!aBool1981) {
			aBool1981 = true;
			System.out.println("error_game_" + var1);

			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (final Exception var3) {
				;
			}

		}
	}

	protected Container method1059() {
		return null == Class69.aFrame578 ? this : Class69.aFrame578;
	}

	protected Dimension method1060() {
		final Container var1 = method1059();
		int var3 = Math.max(var1.getWidth(), Class51.anInt489);
		int var4 = Math.max(var1.getHeight(), Class124_Sub22_Sub2.anInt1356);
		if (Class69.aFrame578 != null) {
			final Insets var2 = Class69.aFrame578.getInsets();
			var3 -= var2.right + var2.left;
			var4 -= var2.top + var2.bottom;
		}

		return new Dimension(var3, var4);
	}

	@Override
	public final void windowClosing(final WindowEvent var1) {
		destroy();
	}

	@Override
	public final void windowClosed(final WindowEvent var1) {
	}

	protected abstract void method1061(int var1);

	@Override
	public void stop() {
		if ((this == anApplet_Sub1_1977) && !aBool1966)
			aLong1965 = Class74.method316(-729735646) + 4000L;
	}

	@Override
	public void run() {
		try {
			int var3;
			if (Class101.aString788 != null) {
				final String var1 = Class101.aString788.toLowerCase();
				if ((var1.indexOf("sun") != -1) || (var1.indexOf("apple") != -1)) {
					final String var2 = Class82.aString670;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")
							|| var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4")
							|| var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.")
							|| var2.equals("1.6.0")) {
						method1058("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						for (var3 = 6; (var3 < var2.length()) && Class55.method263(var2.charAt(var3)); ++var3)
							;

						final String var4 = var2.substring(6, var3);
						if (Class102.method404(var4)) {
							final int var5 = Class124_Sub22_Sub19_Sub2.method889(var4, 10, true);
							if (var5 < 10) {
								method1058("wrongjava");
								return;
							}
						}
					}

					anInt1969 = 5;
				}
			}

			setFocusCycleRoot(true);
			method1050();
			method1062((byte) -45);
			Class89.aClass56_704 = Class124_Sub22_Sub3.method657(-305588893);

			label72: while (true) {
				Class82 var8;
				Canvas var9;
				do {
					if ((aLong1965 != 0L) && (Class74.method316(1323274568) >= aLong1965))
						break label72;

					Class124_Sub22_Sub19_Sub3_Sub1.anInt1940 = Class89.aClass56_704.method265(anInt1967, anInt1969,
							1101748059);

					for (int var6 = 0; var6 < Class124_Sub22_Sub19_Sub3_Sub1.anInt1940; ++var6)
						method1052();

					method1063();
					var8 = Class27.aClass82_303;
					var9 = Class124_Sub5.aCanvas990;
				} while (null == var8.anEventQueue666);

				for (var3 = 0; (var3 < 50) && (var8.anEventQueue666.peekEvent() != null); ++var3)
					client.method1067(1L);

				if (null != var9)
					var8.anEventQueue666.postEvent(new ActionEvent(var9, 1001, "dummy"));
			}
		} catch (final Exception var7) {
			Class28.method166((String) null, var7);
			method1058("crash");
		}

		method1053();
	}

	protected abstract void method1062(byte var1);

	void method1063() {
		final Container var1 = method1059();
		final long var2 = Class74.method316(-169381905);
		final long var4 = aLongArray1971[Class70.anInt584];
		aLongArray1971[Class70.anInt584] = var2;
		Class70.anInt584 = (Class70.anInt584 + 1) & 31;
		if ((var4 != 0L) && (var2 > var4)) {
			final int var6 = (int) (var2 - var4);
			anInt1970 = (32000 + (var6 >> 1)) / var6;
		}

		if ((++anInt1975 - 1) > 50) {
			anInt1975 -= 50;
			aBool1968 = true;
			Class124_Sub5.aCanvas990.setSize(Class56_Sub2.anInt1083, Class81.anInt662);
			Class124_Sub5.aCanvas990.setVisible(true);
			if (Class69.aFrame578 == var1) {
				final Insets var7 = Class69.aFrame578.getInsets();
				Class124_Sub5.aCanvas990.setLocation(var7.left + anInt1973, var7.top + anInt1974);
			} else
				Class124_Sub5.aCanvas990.setLocation(anInt1973, anInt1974);
		}

		method1056((byte) 39);
	}

	@Override
	public final void windowDeiconified(final WindowEvent var1) {
	}
}

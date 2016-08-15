import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class84 implements KeyListener, FocusListener {
	static int anInt673;
	static Class3 aClass3_674;
	static volatile int anInt685 = 0;
	static int anInt682 = 0;
	static int anInt680 = 0;
	public static Class84 aClass84_683 = new Class84();
	public static boolean[] aBoolArray676 = new boolean[112];
	static int[] anIntArray677 = new int[128];
	static int anInt675 = 0;
	static char[] aCharArray678 = new char[128];
	static int[] anIntArray679 = new int[128];
	public static int[] anIntArray687 = new int[128];
	public static int anInt681 = 0;
	static int anInt672 = 0;
	static int anInt684 = 0;
	public static int[] anIntArray686 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81,
			82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1,
			-1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34,
			51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228,
			231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
			-1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@Override
	public final synchronized void keyPressed(final KeyEvent var1) {
		if (null != aClass84_683) {
			anInt685 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray686.length)) {
				var2 = anIntArray686[var2];
				if ((var2 & 128) != 0)
					var2 = -1;
			} else
				var2 = -1;

			if ((anInt682 >= 0) && (var2 >= 0)) {
				anIntArray677[anInt682] = var2;
				anInt682 = (1 + anInt682) & 127;
				if (anInt675 == anInt682)
					anInt682 = -1;
			}

			int var3;
			if (var2 >= 0) {
				var3 = (anInt680 + 1) & 127;
				if (anInt672 != var3) {
					anIntArray679[anInt680] = var2;
					aCharArray678[anInt680] = 0;
					anInt680 = var3;
				}
			}

			var3 = var1.getModifiers();
			if (((var3 & 10) != 0) || (var2 == 85) || (var2 == 10))
				var1.consume();
		}

	}

	@Override
	public final void keyTyped(final KeyEvent var1) {
		if (null != aClass84_683) {
			final char var3 = var1.getKeyChar();
			if ((var3 != 0) && (var3 != '\uffff')) {
				boolean var5;
				if (((var3 <= 0) || (var3 >= 128)) && ((var3 < 160) || (var3 > 255)))
					label64: {
						if (var3 != 0) {
							final char[] var7 = Class90.aCharArray710;

							for (int var6 = 0; var6 < var7.length; ++var6) {
								final char var4 = var7[var6];
								if (var3 == var4) {
									var5 = true;
									break label64;
								}
							}
						}

						var5 = false;
					}
				else
					var5 = true;

				if (var5) {
					final int var2 = (anInt680 + 1) & 127;
					if (var2 != anInt672) {
						anIntArray679[anInt680] = -1;
						aCharArray678[anInt680] = var3;
						anInt680 = var2;
					}
				}
			}
		}

		var1.consume();
	}

	@Override
	public final synchronized void keyReleased(final KeyEvent var1) {
		if (aClass84_683 != null) {
			anInt685 = 0;
			int var2 = var1.getKeyCode();
			if ((var2 >= 0) && (var2 < anIntArray686.length))
				var2 = anIntArray686[var2] & -129;
			else
				var2 = -1;

			if ((anInt682 >= 0) && (var2 >= 0)) {
				anIntArray677[anInt682] = ~var2;
				anInt682 = (1 + anInt682) & 127;
				if (anInt675 == anInt682)
					anInt682 = -1;
			}
		}

		var1.consume();
	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (null != aClass84_683)
			anInt682 = -1;

	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	public static Class124_Sub22_Sub2 method338(final int var0) {
		Class124_Sub22_Sub2 var1 = (Class124_Sub22_Sub2) Class124_Sub22_Sub2.aClass113_1354.method434(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class124_Sub22_Sub2.aClass94_1363.method377(3, var0);
			var1 = new Class124_Sub22_Sub2();
			if (null != var2)
				var1.method648(new Class124_Sub14(var2));

			Class124_Sub22_Sub2.aClass113_1354.method435(var1, var0);
			return var1;
		}
	}
}

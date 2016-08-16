public class Class99 implements Runnable {
	public static Class111 aClass111_776 = new Class111();
	public static Class111 aClass111_775 = new Class111();
	public static int anInt773 = 0;
	public static Object anObject774 = new Object();

	@Override
	public void run() {
		try {
			while (true) {
				Class111 var1 = aClass111_776;
				Class124_Sub19 var2;
				synchronized (var1) {
					var2 = (Class124_Sub19) aClass111_776.method428();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt1295 == 0) {
						var2.aClass69_1296.method302((int) var2.aLong874, var2.aByteArray1298,
								var2.aByteArray1298.length);
						var1 = aClass111_776;
						synchronized (var1) {
							var2.method450();
						}
					} else if (var2.anInt1295 == 1) {
						var2.aByteArray1298 = var2.aClass69_1296.method304((int) var2.aLong874);
						var1 = aClass111_776;
						synchronized (var1) {
							aClass111_775.method424(var2);
						}
					}

					var14 = anObject774;
					synchronized (var14) {
						if (anInt773 <= 1) {
							anInt773 = 0;
							anObject774.notifyAll();
							return;
						}

						anInt773 = 600;
					}
				} else {
					client.sleep(100L);
					var14 = anObject774;
					synchronized (var14) {
						if (anInt773 <= 1) {
							anInt773 = 0;
							anObject774.notifyAll();
							return;
						}

						--anInt773;
					}
				}
			}
		} catch (final Exception var13) {
			Class28.method166((String) null, var13);
		}
	}

	static String method391(final int var0) {
		return "<img=" + var0 + ">";
	}

	public static int method392(final int var0, final int var1, int var2) {
		var2 &= 3;
		return var2 != 0 ? (var2 == 1 ? 7 - var0 : (var2 == 2 ? 7 - var1 : var0)) : var1;
	}
}

import java.awt.Image;
import java.io.IOException;

public final class Class46 {
	int anInt452;
	int anInt453;
	int anInt454;
	public Class124_Sub22_Sub19 aClass124_Sub22_Sub19_455;
	protected static Image anImage456;
	int anInt457;
	int anInt458;
	int anInt459;
	int anInt460;
	int anInt461;
	int anInt462;
	int anInt465;
	int anInt466;
	public int anInt463 = 0;
	int anInt464 = 0;

	static final void method228(final int var0) {
		if (var0 >= 0) {
			final int var4 = client.anIntArray2125[var0];
			final int var1 = client.anIntArray2063[var0];
			final int var6 = client.anIntArray2127[var0];
			final int var2 = client.anIntArray2140[var0];
			final String var5 = client.aStringArray2129[var0];
			final String var3 = client.aStringArray2130[var0];
			Class57.packetFor(var4, var1, var6, var2, var5, var3, Class81.anInt658, Class81.anInt655);
		}
	}

	static final void method229(final boolean var0) {
		Def15.method751();
		++client.anInt2025;
		if ((client.anInt2025 >= 50) || var0) {
			client.anInt2025 = 0;
			if (!client.aBool2115 && (null != Class73.out)) {
				client.secbuf.writeOpcode(250); // ?

				try {
					Class73.out.write(client.secbuf.backing, 0,
							client.secbuf.pos);
					client.secbuf.pos = 0;
				} catch (final IOException var2) {
					client.aBool2115 = true;
				}
			}

		}
	}
}

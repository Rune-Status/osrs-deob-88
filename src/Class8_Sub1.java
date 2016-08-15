import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class8_Sub1 extends Class8 {
	AudioFormat anAudioFormat919;
	byte[] aByteArray920;
	SourceDataLine aSourceDataLine918;
	int anInt917;

	@Override
	void method36(final Component var1) {
		anAudioFormat919 = new AudioFormat(anInt94, 16, aBool77 ? 2 : 1, true, false);
		aByteArray920 = new byte[256 << (aBool77 ? 2 : 1)];
	}

	@Override
	void method42(final int var1) throws LineUnavailableException {
		try {
			final Info var2 = new Info(SourceDataLine.class, anAudioFormat919, var1 << (aBool77 ? 2 : 1));
			aSourceDataLine918 = (SourceDataLine) AudioSystem.getLine(var2);
			aSourceDataLine918.open();
			aSourceDataLine918.start();
			anInt917 = var1;
		} catch (final LineUnavailableException var3) {
			if (Class124_Sub22_Sub5.method675(var1) != 1)
				method42(Class18.method85(var1));
			else {
				aSourceDataLine918 = null;
				throw var3;
			}
		}
	}

	@Override
	int method45() {
		return anInt917 - (aSourceDataLine918.available() >> (aBool77 ? 2 : 1));
	}

	@Override
	void method49() {
		aSourceDataLine918.flush();
	}

	@Override
	void method44() {
		if (null != aSourceDataLine918) {
			aSourceDataLine918.close();
			aSourceDataLine918 = null;
		}

	}

	@Override
	void method43() {
		int var1 = 256;
		if (aBool77)
			var1 <<= 1;

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = anIntArray91[var2];
			if (((var3 + 8388608) & -16777216) != 0)
				var3 = 8388607 ^ (var3 >> 31);

			aByteArray920[var2 * 2] = (byte) (var3 >> 8);
			aByteArray920[(2 * var2) + 1] = (byte) (var3 >> 16);
		}

		aSourceDataLine918.write(aByteArray920, 0, var1 << 1);
	}
}

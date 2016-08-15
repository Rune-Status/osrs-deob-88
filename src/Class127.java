import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class127 {
	long aLong886;
	RandomAccessFile aRandomAccessFile885;
	long aLong884;

	final void method457(final long var1) throws IOException {
		aRandomAccessFile885.seek(var1);
		aLong886 = var1;
	}

	public final void method458(final byte[] var1, final int var2, final int var3) throws IOException {
		if ((var3 + aLong886) <= aLong884) {
			aRandomAccessFile885.write(var1, var2, var3);
			aLong886 += var3;
		} else {
			aRandomAccessFile885.seek(1L + aLong884);
			aRandomAccessFile885.write(1);
			throw new EOFException();
		}
	}

	public final int method459(final byte[] var1, final int var2, final int var3) throws IOException {
		final int var4 = aRandomAccessFile885.read(var1, var2, var3);
		if (var4 > 0)
			aLong886 += var4;

		return var4;
	}

	@Override
	protected void finalize() throws Throwable {
		if (aRandomAccessFile885 != null) {
			System.out.println("");
			method461();
		}

	}

	public final long method460() throws IOException {
		return aRandomAccessFile885.length();
	}

	public Class127(final File var1, final String var2, long var3) throws IOException {
		if (-1L == var3)
			var3 = Long.MAX_VALUE;

		if (var1.length() >= var3)
			var1.delete();

		aRandomAccessFile885 = new RandomAccessFile(var1, var2);
		System.out.printf("RAF @ %s %n", var1.getAbsolutePath());
		aLong884 = var3;
		aLong886 = 0L;
		final int var5 = aRandomAccessFile885.read();
		if ((var5 != -1) && !var2.equals("r")) {
			aRandomAccessFile885.seek(0L);
			aRandomAccessFile885.write(var5);
		}

		aRandomAccessFile885.seek(0L);
	}

	public final void method461() throws IOException {
		if (null != aRandomAccessFile885) {
			aRandomAccessFile885.close();
			aRandomAccessFile885 = null;
		}

	}
}

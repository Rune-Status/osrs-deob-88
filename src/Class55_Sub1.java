import java.nio.ByteBuffer;

public class Class55_Sub1 extends Class55 {
	ByteBuffer aByteBuffer1076;

	@Override
	byte[] method260(final int var1) {
		final byte[] var2 = new byte[aByteBuffer1076.capacity()];
		aByteBuffer1076.position(0);
		aByteBuffer1076.get(var2);
		return var2;
	}

	@Override
	void method261(final byte[] var1, final byte var2) {
		aByteBuffer1076 = ByteBuffer.allocateDirect(var1.length);
		aByteBuffer1076.position(0);
		aByteBuffer1076.put(var1);
	}
}

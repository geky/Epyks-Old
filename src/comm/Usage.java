package comm;

import java.nio.ByteBuffer;

import epyks.PeerPanel;

public interface Usage {
	public void pollData(ByteBuffer b);
	public void doData(Contact s, ByteBuffer b);
	public void doEvent(Contact s, Event e);
	public byte usage();
}

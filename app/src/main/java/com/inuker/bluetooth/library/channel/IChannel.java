package com.inuker.bluetooth.library.channel;

/**
 * Created by dingjikerbo on 17/4/19.
 */

public interface IChannel {

	/**
	 *
	 */
	void write(final byte[] bytes, ChannelCallback callback);

	/**
	 *
	 */
	void onRead(final byte[] bytes);

	/**
	 *
	 */
	void onRecv(byte[] bytes);

	/**
	 *
	 */
	void send(byte[] value, ChannelCallback callback);
}

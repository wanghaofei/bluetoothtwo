package com.inuker.bluetooth.library.channel;

/**
 * Created by dingjikerbo on 17/4/14.
 */

public enum ChannelState {

	IDLE,

	/**
	 *
	 */
	READY,

	/**
	 *
	 */
	WAIT_START_ACK,

	/**
	 *
	 */
	WRITING,

	/**
	 *
	 */
	SYNC,

	/**
	 *
	 */
	SYNC_ACK,

	/**
	 *
	 */
	SYNC_WAIT_PACKET,

	/**
	 *
	 */
	READING,
}

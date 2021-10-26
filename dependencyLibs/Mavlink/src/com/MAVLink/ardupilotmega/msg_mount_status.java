/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MOUNT_STATUS PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Message with some status from autopilot to GCS about camera or antenna mount.
 */
public class msg_mount_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MOUNT_STATUS = 158;
    public static final int MAVLINK_MSG_LENGTH = 14;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MOUNT_STATUS;

      
    /**
     * Pitch.
     */
    public int pointing_a;
      
    /**
     * Roll.
     */
    public int pointing_b;
      
    /**
     * Yaw.
     */
    public int pointing_c;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_MOUNT_STATUS;
        
        packet.payload.putInt(pointing_a);
        packet.payload.putInt(pointing_b);
        packet.payload.putInt(pointing_c);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a mount_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.pointing_a = payload.getInt();
        this.pointing_b = payload.getInt();
        this.pointing_c = payload.getInt();
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mount_status() {
        this.msgid = MAVLINK_MSG_ID_MOUNT_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_mount_status( int pointing_a, int pointing_b, int pointing_c, short target_system, short target_component) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_STATUS;

        this.pointing_a = pointing_a;
        this.pointing_b = pointing_b;
        this.pointing_c = pointing_c;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_mount_status( int pointing_a, int pointing_b, int pointing_c, short target_system, short target_component, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.pointing_a = pointing_a;
        this.pointing_b = pointing_b;
        this.pointing_c = pointing_c;
        this.target_system = target_system;
        this.target_component = target_component;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_mount_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_MOUNT_STATUS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_MOUNT_STATUS - sysid:"+sysid+" compid:"+compid+" pointing_a:"+pointing_a+" pointing_b:"+pointing_b+" pointing_c:"+pointing_c+" target_system:"+target_system+" target_component:"+target_component+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_MOUNT_STATUS";
    }
}
        